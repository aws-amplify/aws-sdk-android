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

package com.amazonaws.services.lightsail;

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

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.services.lightsail.model.transform.*;

/**
 * Client for accessing Amazon Lightsail. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers
 * who just need virtual private servers. Lightsail includes everything you need
 * to launch your project quickly - a virtual machine, a managed database,
 * SSD-based storage, data transfer, DNS management, and a static IP - for a
 * low, predictable price. You manage those Lightsail servers through the
 * Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="https://lightsail.aws.amazon.com/ls/docs/all">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and
 * Access Management (IAM) to generate access keys. For details about how to set
 * this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/article/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class AmazonLightsailClient extends AmazonWebServiceClient implements AmazonLightsail {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Lightsail exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail. A
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
    public AmazonLightsailClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail. A
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
     *            how this client connects to AmazonLightsail (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonLightsailClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail
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
     *         AmazonLightsailClient client = new AmazonLightsailClient(AWSMobileClient.getInstance());
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
    public AmazonLightsailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail
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
     *         AmazonLightsailClient client = new AmazonLightsailClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonLightsail (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonLightsailClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail
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
     *         AmazonLightsailClient client = new AmazonLightsailClient(AWSMobileClient.getInstance());
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
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail
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
     *         AmazonLightsailClient client = new AmazonLightsailClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonLightsail (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail
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
     *            how this client connects to AmazonLightsail (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLightsail
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
     *         AmazonLightsailClient client = new AmazonLightsailClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonLightsail (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccountSetupInProgressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthenticatedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("lightsail.us-east-1.amazonaws.com");
        this.endpointPrefix = "lightsail";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/lightsail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/lightsail/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return allocateStaticIpResult The response from the AllocateStaticIp
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest allocateStaticIpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(allocateStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateStaticIpRequest> request = null;
        Response<AllocateStaticIpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateStaticIpRequestMarshaller().marshall(allocateStaticIpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AllocateStaticIpResult, JsonUnmarshallerContext> unmarshaller = new AllocateStaticIpResultJsonUnmarshaller();
            JsonResponseHandler<AllocateStaticIpResult> responseHandler = new JsonResponseHandler<AllocateStaticIpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches a block storage disk to a running or stopped Lightsail instance
     * and exposes it to the instance with the specified disk name.
     * </p>
     * <p>
     * The <code>attach disk</code> operation supports tag-based access control
     * via resource tags applied to the resource identified by
     * <code>disk name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachDiskRequest
     * @return attachDiskResult The response from the AttachDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachDiskResult attachDisk(AttachDiskRequest attachDiskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachDiskRequest> request = null;
        Response<AttachDiskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachDiskRequestMarshaller().marshall(attachDiskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachDiskResult, JsonUnmarshallerContext> unmarshaller = new AttachDiskResultJsonUnmarshaller();
            JsonResponseHandler<AttachDiskResult> responseHandler = new JsonResponseHandler<AttachDiskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches one or more Lightsail instances to a load balancer.
     * </p>
     * <p>
     * After some time, the instances are attached to the load balancer and the
     * health check status is available.
     * </p>
     * <p>
     * The <code>attach instances to load balancer</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachInstancesToLoadBalancerRequest
     * @return attachInstancesToLoadBalancerResult The response from the
     *         AttachInstancesToLoadBalancer service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachInstancesToLoadBalancerResult attachInstancesToLoadBalancer(
            AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachInstancesToLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachInstancesToLoadBalancerRequest> request = null;
        Response<AttachInstancesToLoadBalancerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachInstancesToLoadBalancerRequestMarshaller()
                        .marshall(attachInstancesToLoadBalancerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachInstancesToLoadBalancerResult, JsonUnmarshallerContext> unmarshaller = new AttachInstancesToLoadBalancerResultJsonUnmarshaller();
            JsonResponseHandler<AttachInstancesToLoadBalancerResult> responseHandler = new JsonResponseHandler<AttachInstancesToLoadBalancerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches a Transport Layer Security (TLS) certificate to your load
     * balancer. TLS is just an updated, more secure version of Secure Socket
     * Layer (SSL).
     * </p>
     * <p>
     * Once you create and validate your certificate, you can attach it to your
     * load balancer. You can also use this API to rotate the certificates on
     * your account. Use the <code>AttachLoadBalancerTlsCertificate</code>
     * action with the non-attached certificate, and it will replace the
     * existing one and become the attached certificate.
     * </p>
     * <p>
     * The <code>AttachLoadBalancerTlsCertificate</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachLoadBalancerTlsCertificateRequest
     * @return attachLoadBalancerTlsCertificateResult The response from the
     *         AttachLoadBalancerTlsCertificate service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachLoadBalancerTlsCertificateResult attachLoadBalancerTlsCertificate(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerTlsCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancerTlsCertificateRequest> request = null;
        Response<AttachLoadBalancerTlsCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachLoadBalancerTlsCertificateRequestMarshaller()
                        .marshall(attachLoadBalancerTlsCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachLoadBalancerTlsCertificateResult, JsonUnmarshallerContext> unmarshaller = new AttachLoadBalancerTlsCertificateResultJsonUnmarshaller();
            JsonResponseHandler<AttachLoadBalancerTlsCertificateResult> responseHandler = new JsonResponseHandler<AttachLoadBalancerTlsCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return attachStaticIpResult The response from the AttachStaticIp service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest attachStaticIpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachStaticIpRequest> request = null;
        Response<AttachStaticIpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachStaticIpRequestMarshaller().marshall(attachStaticIpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachStaticIpResult, JsonUnmarshallerContext> unmarshaller = new AttachStaticIpResultJsonUnmarshaller();
            JsonResponseHandler<AttachStaticIpResult> responseHandler = new JsonResponseHandler<AttachStaticIpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Closes ports for a specific Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>CloseInstancePublicPorts</code> action supports tag-based
     * access control via resource tags applied to the resource identified by
     * <code>instanceName</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return closeInstancePublicPortsResult The response from the
     *         CloseInstancePublicPorts service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CloseInstancePublicPortsResult closeInstancePublicPorts(
            CloseInstancePublicPortsRequest closeInstancePublicPortsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(closeInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloseInstancePublicPortsRequest> request = null;
        Response<CloseInstancePublicPortsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloseInstancePublicPortsRequestMarshaller()
                        .marshall(closeInstancePublicPortsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CloseInstancePublicPortsResult, JsonUnmarshallerContext> unmarshaller = new CloseInstancePublicPortsResultJsonUnmarshaller();
            JsonResponseHandler<CloseInstancePublicPortsResult> responseHandler = new JsonResponseHandler<CloseInstancePublicPortsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Copies a manual snapshot of an instance or disk as another manual
     * snapshot, or copies an automatic snapshot of an instance or disk as a
     * manual snapshot. This operation can also be used to copy a manual or
     * automatic snapshot of an instance or a disk from one AWS Region to
     * another in Amazon Lightsail.
     * </p>
     * <p>
     * When copying a <i>manual snapshot</i>, be sure to define the
     * <code>source region</code>, <code>source snapshot name</code>, and
     * <code>target snapshot name</code> parameters.
     * </p>
     * <p>
     * When copying an <i>automatic snapshot</i>, be sure to define the
     * <code>source region</code>, <code>source resource name</code>,
     * <code>target snapshot name</code>, and either the
     * <code>restore date</code> or the
     * <code>use latest restorable auto snapshot</code> parameters.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return copySnapshotResult The response from the CopySnapshot service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<CopySnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestMarshaller().marshall(copySnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CopySnapshotResult, JsonUnmarshallerContext> unmarshaller = new CopySnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CopySnapshotResult> responseHandler = new JsonResponseHandler<CopySnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an AWS CloudFormation stack, which creates a new Amazon EC2
     * instance from an exported Amazon Lightsail snapshot. This operation
     * results in a CloudFormation stack record that can be used to track the
     * AWS CloudFormation stack created. Use the
     * <code>get cloud formation stack records</code> operation to get a list of
     * the CloudFormation stacks created.
     * </p>
     * <important>
     * <p>
     * Wait until after your new Amazon EC2 instance is created before running
     * the <code>create cloud formation stack</code> operation again with the
     * same export snapshot record.
     * </p>
     * </important>
     * 
     * @param createCloudFormationStackRequest
     * @return createCloudFormationStackResult The response from the
     *         CreateCloudFormationStack service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCloudFormationStackResult createCloudFormationStack(
            CreateCloudFormationStackRequest createCloudFormationStackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCloudFormationStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCloudFormationStackRequest> request = null;
        Response<CreateCloudFormationStackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCloudFormationStackRequestMarshaller()
                        .marshall(createCloudFormationStackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCloudFormationStackResult, JsonUnmarshallerContext> unmarshaller = new CreateCloudFormationStackResultJsonUnmarshaller();
            JsonResponseHandler<CreateCloudFormationStackResult> responseHandler = new JsonResponseHandler<CreateCloudFormationStackResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an email or SMS text message contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * 
     * @param createContactMethodRequest
     * @return createContactMethodResult The response from the
     *         CreateContactMethod service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateContactMethodResult createContactMethod(
            CreateContactMethodRequest createContactMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createContactMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactMethodRequest> request = null;
        Response<CreateContactMethodResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactMethodRequestMarshaller()
                        .marshall(createContactMethodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateContactMethodResult, JsonUnmarshallerContext> unmarshaller = new CreateContactMethodResultJsonUnmarshaller();
            JsonResponseHandler<CreateContactMethodResult> responseHandler = new JsonResponseHandler<CreateContactMethodResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a block storage disk that can be attached to an Amazon Lightsail
     * instance in the same Availability Zone (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk</code> operation supports tag-based access control
     * via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskRequest
     * @return createDiskResult The response from the CreateDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDiskResult createDisk(CreateDiskRequest createDiskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiskRequest> request = null;
        Response<CreateDiskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiskRequestMarshaller().marshall(createDiskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDiskResult, JsonUnmarshallerContext> unmarshaller = new CreateDiskResultJsonUnmarshaller();
            JsonResponseHandler<CreateDiskResult> responseHandler = new JsonResponseHandler<CreateDiskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a block storage disk from a manual or automatic snapshot of a
     * disk. The resulting disk can be attached to an Amazon Lightsail instance
     * in the same Availability Zone (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk from snapshot</code> operation supports tag-based
     * access control via request tags and resource tags applied to the resource
     * identified by <code>disk snapshot name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskFromSnapshotRequest
     * @return createDiskFromSnapshotResult The response from the
     *         CreateDiskFromSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDiskFromSnapshotResult createDiskFromSnapshot(
            CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDiskFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiskFromSnapshotRequest> request = null;
        Response<CreateDiskFromSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiskFromSnapshotRequestMarshaller()
                        .marshall(createDiskFromSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDiskFromSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateDiskFromSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateDiskFromSnapshotResult> responseHandler = new JsonResponseHandler<CreateDiskFromSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a block storage disk. You can use snapshots for
     * backups, to make copies of disks, and to save data before shutting down a
     * Lightsail instance.
     * </p>
     * <p>
     * You can take a snapshot of an attached disk that is in use; however,
     * snapshots only capture data that has been written to your disk at the
     * time the snapshot command is issued. This may exclude any data that has
     * been cached by any applications or the operating system. If you can pause
     * any file systems on the disk long enough to take a snapshot, your
     * snapshot should be complete. Nevertheless, if you cannot pause all file
     * writes to the disk, you should unmount the disk from within the Lightsail
     * instance, issue the create disk snapshot command, and then remount the
     * disk to ensure a consistent and complete snapshot. You may remount and
     * use your disk while the snapshot status is pending.
     * </p>
     * <p>
     * You can also use this operation to create a snapshot of an instance's
     * system volume. You might want to do this, for example, to recover data
     * from the system volume of a botched instance or to create a backup of the
     * system volume like you would for a block storage disk. To create a
     * snapshot of a system volume, just define the <code>instance name</code>
     * parameter when issuing the snapshot command, and a snapshot of the
     * defined instance's system volume will be created. After the snapshot is
     * available, you can create a block storage disk from the snapshot and
     * attach it to a running instance to access the data on the disk.
     * </p>
     * <p>
     * The <code>create disk snapshot</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskSnapshotRequest
     * @return createDiskSnapshotResult The response from the CreateDiskSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDiskSnapshotResult createDiskSnapshot(
            CreateDiskSnapshotRequest createDiskSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDiskSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiskSnapshotRequest> request = null;
        Response<CreateDiskSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiskSnapshotRequestMarshaller()
                        .marshall(createDiskSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDiskSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateDiskSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateDiskSnapshotResult> responseHandler = new JsonResponseHandler<CreateDiskSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * <p>
     * The <code>create domain</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return createDomainResult The response from the CreateDomain service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestMarshaller().marshall(createDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDomainResult, JsonUnmarshallerContext> unmarshaller = new CreateDomainResultJsonUnmarshaller();
            JsonResponseHandler<CreateDomainResult> responseHandler = new JsonResponseHandler<CreateDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates one of the following entry records associated with the domain:
     * Address (A), canonical name (CNAME), mail exchanger (MX), name server
     * (NS), start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The <code>create domain entry</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return createDomainEntryResult The response from the CreateDomainEntry
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDomainEntryResult createDomainEntry(
            CreateDomainEntryRequest createDomainEntryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainEntryRequest> request = null;
        Response<CreateDomainEntryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainEntryRequestMarshaller()
                        .marshall(createDomainEntryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDomainEntryResult, JsonUnmarshallerContext> unmarshaller = new CreateDomainEntryResultJsonUnmarshaller();
            JsonResponseHandler<CreateDomainEntryResult> responseHandler = new JsonResponseHandler<CreateDomainEntryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or
     * <i>instance</i>. You can use a snapshot to create a new instance that is
     * based on that snapshot.
     * </p>
     * <p>
     * The <code>create instance snapshot</code> operation supports tag-based
     * access control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return createInstanceSnapshotResult The response from the
     *         CreateInstanceSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateInstanceSnapshotResult createInstanceSnapshot(
            CreateInstanceSnapshotRequest createInstanceSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceSnapshotRequest> request = null;
        Response<CreateInstanceSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceSnapshotRequestMarshaller()
                        .marshall(createInstanceSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInstanceSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateInstanceSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateInstanceSnapshotResult> responseHandler = new JsonResponseHandler<CreateInstanceSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates one or more Amazon Lightsail instances.
     * </p>
     * <p>
     * The <code>create instances</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return createInstancesResult The response from the CreateInstances
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateInstancesResult createInstances(CreateInstancesRequest createInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstancesRequest> request = null;
        Response<CreateInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstancesRequestMarshaller().marshall(createInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInstancesResult, JsonUnmarshallerContext> unmarshaller = new CreateInstancesResultJsonUnmarshaller();
            JsonResponseHandler<CreateInstancesResult> responseHandler = new JsonResponseHandler<CreateInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates one or more new instances from a manual or automatic snapshot of
     * an instance.
     * </p>
     * <p>
     * The <code>create instances from snapshot</code> operation supports
     * tag-based access control via request tags and resource tags applied to
     * the resource identified by <code>instance snapshot name</code>. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return createInstancesFromSnapshotResult The response from the
     *         CreateInstancesFromSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateInstancesFromSnapshotResult createInstancesFromSnapshot(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInstancesFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstancesFromSnapshotRequest> request = null;
        Response<CreateInstancesFromSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstancesFromSnapshotRequestMarshaller()
                        .marshall(createInstancesFromSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInstancesFromSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateInstancesFromSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateInstancesFromSnapshotResult> responseHandler = new JsonResponseHandler<CreateInstancesFromSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an SSH key pair.
     * </p>
     * <p>
     * The <code>create key pair</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return createKeyPairResult The response from the CreateKeyPair service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyPairRequest> request = null;
        Response<CreateKeyPairResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyPairRequestMarshaller().marshall(createKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateKeyPairResult, JsonUnmarshallerContext> unmarshaller = new CreateKeyPairResultJsonUnmarshaller();
            JsonResponseHandler<CreateKeyPairResult> responseHandler = new JsonResponseHandler<CreateKeyPairResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Lightsail load balancer. To learn more about deciding whether
     * to load balance your application, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/how-to/article/configure-lightsail-instances-for-load-balancing"
     * >Configure your Lightsail instances for load balancing</a>. You can
     * create up to 5 load balancers per AWS Region in your account.
     * </p>
     * <p>
     * When you create a load balancer, you can specify a unique name and port
     * settings. To change additional load balancer settings, use the
     * <code>UpdateLoadBalancerAttribute</code> operation.
     * </p>
     * <p>
     * The <code>create load balancer</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return createLoadBalancerResult The response from the CreateLoadBalancer
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateLoadBalancerResult createLoadBalancer(
            CreateLoadBalancerRequest createLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerRequest> request = null;
        Response<CreateLoadBalancerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerRequestMarshaller()
                        .marshall(createLoadBalancerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLoadBalancerResult, JsonUnmarshallerContext> unmarshaller = new CreateLoadBalancerResultJsonUnmarshaller();
            JsonResponseHandler<CreateLoadBalancerResult> responseHandler = new JsonResponseHandler<CreateLoadBalancerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Lightsail load balancer TLS certificate.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * The <code>CreateLoadBalancerTlsCertificate</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerTlsCertificateRequest
     * @return createLoadBalancerTlsCertificateResult The response from the
     *         CreateLoadBalancerTlsCertificate service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateLoadBalancerTlsCertificateResult createLoadBalancerTlsCertificate(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerTlsCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerTlsCertificateRequest> request = null;
        Response<CreateLoadBalancerTlsCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerTlsCertificateRequestMarshaller()
                        .marshall(createLoadBalancerTlsCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLoadBalancerTlsCertificateResult, JsonUnmarshallerContext> unmarshaller = new CreateLoadBalancerTlsCertificateResultJsonUnmarshaller();
            JsonResponseHandler<CreateLoadBalancerTlsCertificateResult> responseHandler = new JsonResponseHandler<CreateLoadBalancerTlsCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>create relational database</code> operation supports tag-based
     * access control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseRequest
     * @return createRelationalDatabaseResult The response from the
     *         CreateRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRelationalDatabaseResult createRelationalDatabase(
            CreateRelationalDatabaseRequest createRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelationalDatabaseRequest> request = null;
        Response<CreateRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelationalDatabaseRequestMarshaller()
                        .marshall(createRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new CreateRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<CreateRelationalDatabaseResult> responseHandler = new JsonResponseHandler<CreateRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new database from an existing database snapshot in Amazon
     * Lightsail.
     * </p>
     * <p>
     * You can create a new database from a snapshot in if something goes wrong
     * with your original database, or to change it to a different plan, such as
     * a high availability or standard plan.
     * </p>
     * <p>
     * The <code>create relational database from snapshot</code> operation
     * supports tag-based access control via request tags and resource tags
     * applied to the resource identified by relationalDatabaseSnapshotName. For
     * more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseFromSnapshotRequest
     * @return createRelationalDatabaseFromSnapshotResult The response from the
     *         CreateRelationalDatabaseFromSnapshot service method, as returned
     *         by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRelationalDatabaseFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelationalDatabaseFromSnapshotRequest> request = null;
        Response<CreateRelationalDatabaseFromSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelationalDatabaseFromSnapshotRequestMarshaller()
                        .marshall(createRelationalDatabaseFromSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRelationalDatabaseFromSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateRelationalDatabaseFromSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateRelationalDatabaseFromSnapshotResult> responseHandler = new JsonResponseHandler<CreateRelationalDatabaseFromSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a snapshot of your database in Amazon Lightsail. You can use
     * snapshots for backups, to make copies of a database, and to save data
     * before deleting a database.
     * </p>
     * <p>
     * The <code>create relational database snapshot</code> operation supports
     * tag-based access control via request tags. For more information, see the
     * <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseSnapshotRequest
     * @return createRelationalDatabaseSnapshotResult The response from the
     *         CreateRelationalDatabaseSnapshot service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRelationalDatabaseSnapshotResult createRelationalDatabaseSnapshot(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRelationalDatabaseSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelationalDatabaseSnapshotRequest> request = null;
        Response<CreateRelationalDatabaseSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelationalDatabaseSnapshotRequestMarshaller()
                        .marshall(createRelationalDatabaseSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRelationalDatabaseSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateRelationalDatabaseSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateRelationalDatabaseSnapshotResult> responseHandler = new JsonResponseHandler<CreateRelationalDatabaseSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteAlarmRequest
     * @return deleteAlarmResult The response from the DeleteAlarm service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest deleteAlarmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlarmRequest> request = null;
        Response<DeleteAlarmResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlarmRequestMarshaller().marshall(deleteAlarmRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAlarmResult, JsonUnmarshallerContext> unmarshaller = new DeleteAlarmResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAlarmResult> responseHandler = new JsonResponseHandler<DeleteAlarmResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an automatic snapshot of an instance or disk. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteAutoSnapshotRequest
     * @return deleteAutoSnapshotResult The response from the DeleteAutoSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAutoSnapshotResult deleteAutoSnapshot(
            DeleteAutoSnapshotRequest deleteAutoSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAutoSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAutoSnapshotRequest> request = null;
        Response<DeleteAutoSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAutoSnapshotRequestMarshaller()
                        .marshall(deleteAutoSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAutoSnapshotResult, JsonUnmarshallerContext> unmarshaller = new DeleteAutoSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAutoSnapshotResult> responseHandler = new JsonResponseHandler<DeleteAutoSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteContactMethodRequest
     * @return deleteContactMethodResult The response from the
     *         DeleteContactMethod service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteContactMethodResult deleteContactMethod(
            DeleteContactMethodRequest deleteContactMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteContactMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactMethodRequest> request = null;
        Response<DeleteContactMethodResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactMethodRequestMarshaller()
                        .marshall(deleteContactMethodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteContactMethodResult, JsonUnmarshallerContext> unmarshaller = new DeleteContactMethodResultJsonUnmarshaller();
            JsonResponseHandler<DeleteContactMethodResult> responseHandler = new JsonResponseHandler<DeleteContactMethodResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified block storage disk. The disk must be in the
     * <code>available</code> state (not attached to a Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several
     * minutes.
     * </p>
     * </note>
     * <p>
     * The <code>delete disk</code> operation supports tag-based access control
     * via resource tags applied to the resource identified by
     * <code>disk name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskRequest
     * @return deleteDiskResult The response from the DeleteDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDiskResult deleteDisk(DeleteDiskRequest deleteDiskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDiskRequest> request = null;
        Response<DeleteDiskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDiskRequestMarshaller().marshall(deleteDiskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDiskResult, JsonUnmarshallerContext> unmarshaller = new DeleteDiskResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDiskResult> responseHandler = new JsonResponseHandler<DeleteDiskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified disk snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a disk, the snapshots are
     * incremental, and only the blocks on the device that have changed since
     * your last snapshot are saved in the new snapshot. When you delete a
     * snapshot, only the data not needed for any other snapshot is removed. So
     * regardless of which prior snapshots have been deleted, all active
     * snapshots will have access to all the information needed to restore the
     * disk.
     * </p>
     * <p>
     * The <code>delete disk snapshot</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>disk snapshot name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskSnapshotRequest
     * @return deleteDiskSnapshotResult The response from the DeleteDiskSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDiskSnapshotResult deleteDiskSnapshot(
            DeleteDiskSnapshotRequest deleteDiskSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDiskSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDiskSnapshotRequest> request = null;
        Response<DeleteDiskSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDiskSnapshotRequestMarshaller()
                        .marshall(deleteDiskSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDiskSnapshotResult, JsonUnmarshallerContext> unmarshaller = new DeleteDiskSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDiskSnapshotResult> responseHandler = new JsonResponseHandler<DeleteDiskSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * <p>
     * The <code>delete domain</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return deleteDomainResult The response from the DeleteDomain service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestMarshaller().marshall(deleteDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDomainResult, JsonUnmarshallerContext> unmarshaller = new DeleteDomainResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDomainResult> responseHandler = new JsonResponseHandler<DeleteDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * <p>
     * The <code>delete domain entry</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return deleteDomainEntryResult The response from the DeleteDomainEntry
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDomainEntryResult deleteDomainEntry(
            DeleteDomainEntryRequest deleteDomainEntryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainEntryRequest> request = null;
        Response<DeleteDomainEntryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainEntryRequestMarshaller()
                        .marshall(deleteDomainEntryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDomainEntryResult, JsonUnmarshallerContext> unmarshaller = new DeleteDomainEntryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDomainEntryResult> responseHandler = new JsonResponseHandler<DeleteDomainEntryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>delete instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return deleteInstanceResult The response from the DeleteInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceRequest> request = null;
        Response<DeleteInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceRequestMarshaller().marshall(deleteInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInstanceResult, JsonUnmarshallerContext> unmarshaller = new DeleteInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInstanceResult> responseHandler = new JsonResponseHandler<DeleteInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or
     * <i>instance</i>).
     * </p>
     * <p>
     * The <code>delete instance snapshot</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * <code>instance snapshot name</code>. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return deleteInstanceSnapshotResult The response from the
     *         DeleteInstanceSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteInstanceSnapshotResult deleteInstanceSnapshot(
            DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceSnapshotRequest> request = null;
        Response<DeleteInstanceSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceSnapshotRequestMarshaller()
                        .marshall(deleteInstanceSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInstanceSnapshotResult, JsonUnmarshallerContext> unmarshaller = new DeleteInstanceSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInstanceSnapshotResult> responseHandler = new JsonResponseHandler<DeleteInstanceSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * <p>
     * The <code>delete key pair</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>key pair name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return deleteKeyPairResult The response from the DeleteKeyPair service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeyPairRequest> request = null;
        Response<DeleteKeyPairResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeyPairRequestMarshaller().marshall(deleteKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteKeyPairResult, JsonUnmarshallerContext> unmarshaller = new DeleteKeyPairResultJsonUnmarshaller();
            JsonResponseHandler<DeleteKeyPairResult> responseHandler = new JsonResponseHandler<DeleteKeyPairResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the known host key or certificate used by the Amazon Lightsail
     * browser-based SSH or RDP clients to authenticate an instance. This
     * operation enables the Lightsail browser-based SSH or RDP clients to
     * connect to the instance after a host key mismatch.
     * </p>
     * <important>
     * <p>
     * Perform this operation only if you were expecting the host key or
     * certificate mismatch or if you are familiar with the new host key or
     * certificate on the instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-troubleshooting-browser-based-ssh-rdp-client-connection"
     * >Troubleshooting connection issues when using the Amazon Lightsail
     * browser-based SSH or RDP client</a>.
     * </p>
     * </important>
     * 
     * @param deleteKnownHostKeysRequest
     * @return deleteKnownHostKeysResult The response from the
     *         DeleteKnownHostKeys service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteKnownHostKeysResult deleteKnownHostKeys(
            DeleteKnownHostKeysRequest deleteKnownHostKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteKnownHostKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKnownHostKeysRequest> request = null;
        Response<DeleteKnownHostKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKnownHostKeysRequestMarshaller()
                        .marshall(deleteKnownHostKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteKnownHostKeysResult, JsonUnmarshallerContext> unmarshaller = new DeleteKnownHostKeysResultJsonUnmarshaller();
            JsonResponseHandler<DeleteKnownHostKeysResult> responseHandler = new JsonResponseHandler<DeleteKnownHostKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a Lightsail load balancer and all its associated SSL/TLS
     * certificates. Once the load balancer is deleted, you will need to create
     * a new load balancer, create a new certificate, and verify domain
     * ownership again.
     * </p>
     * <p>
     * The <code>delete load balancer</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>load balancer name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return deleteLoadBalancerResult The response from the DeleteLoadBalancer
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteLoadBalancerResult deleteLoadBalancer(
            DeleteLoadBalancerRequest deleteLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerRequest> request = null;
        Response<DeleteLoadBalancerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerRequestMarshaller()
                        .marshall(deleteLoadBalancerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteLoadBalancerResult, JsonUnmarshallerContext> unmarshaller = new DeleteLoadBalancerResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLoadBalancerResult> responseHandler = new JsonResponseHandler<DeleteLoadBalancerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
     * </p>
     * <p>
     * The <code>DeleteLoadBalancerTlsCertificate</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerTlsCertificateRequest
     * @return deleteLoadBalancerTlsCertificateResult The response from the
     *         DeleteLoadBalancerTlsCertificate service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteLoadBalancerTlsCertificateResult deleteLoadBalancerTlsCertificate(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerTlsCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerTlsCertificateRequest> request = null;
        Response<DeleteLoadBalancerTlsCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerTlsCertificateRequestMarshaller()
                        .marshall(deleteLoadBalancerTlsCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteLoadBalancerTlsCertificateResult, JsonUnmarshallerContext> unmarshaller = new DeleteLoadBalancerTlsCertificateResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLoadBalancerTlsCertificateResult> responseHandler = new JsonResponseHandler<DeleteLoadBalancerTlsCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseRequest
     * @return deleteRelationalDatabaseResult The response from the
     *         DeleteRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRelationalDatabaseResult deleteRelationalDatabase(
            DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRelationalDatabaseRequest> request = null;
        Response<DeleteRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRelationalDatabaseRequestMarshaller()
                        .marshall(deleteRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new DeleteRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRelationalDatabaseResult> responseHandler = new JsonResponseHandler<DeleteRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database snapshot</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by relationalDatabaseName. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseSnapshotRequest
     * @return deleteRelationalDatabaseSnapshotResult The response from the
     *         DeleteRelationalDatabaseSnapshot service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRelationalDatabaseSnapshotResult deleteRelationalDatabaseSnapshot(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRelationalDatabaseSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRelationalDatabaseSnapshotRequest> request = null;
        Response<DeleteRelationalDatabaseSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRelationalDatabaseSnapshotRequestMarshaller()
                        .marshall(deleteRelationalDatabaseSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRelationalDatabaseSnapshotResult, JsonUnmarshallerContext> unmarshaller = new DeleteRelationalDatabaseSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRelationalDatabaseSnapshotResult> responseHandler = new JsonResponseHandler<DeleteRelationalDatabaseSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detaches a stopped block storage disk from a Lightsail instance. Make
     * sure to unmount any file systems on the device within your operating
     * system before stopping the instance and detaching the disk.
     * </p>
     * <p>
     * The <code>detach disk</code> operation supports tag-based access control
     * via resource tags applied to the resource identified by
     * <code>disk name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachDiskRequest
     * @return detachDiskResult The response from the DetachDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachDiskResult detachDisk(DetachDiskRequest detachDiskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachDiskRequest> request = null;
        Response<DetachDiskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachDiskRequestMarshaller().marshall(detachDiskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetachDiskResult, JsonUnmarshallerContext> unmarshaller = new DetachDiskResultJsonUnmarshaller();
            JsonResponseHandler<DetachDiskResult> responseHandler = new JsonResponseHandler<DetachDiskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detaches the specified instances from a Lightsail load balancer.
     * </p>
     * <p>
     * This operation waits until the instances are no longer needed before they
     * are detached from the load balancer.
     * </p>
     * <p>
     * The <code>detach instances from load balancer</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachInstancesFromLoadBalancerRequest
     * @return detachInstancesFromLoadBalancerResult The response from the
     *         DetachInstancesFromLoadBalancer service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachInstancesFromLoadBalancerResult detachInstancesFromLoadBalancer(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachInstancesFromLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachInstancesFromLoadBalancerRequest> request = null;
        Response<DetachInstancesFromLoadBalancerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachInstancesFromLoadBalancerRequestMarshaller()
                        .marshall(detachInstancesFromLoadBalancerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetachInstancesFromLoadBalancerResult, JsonUnmarshallerContext> unmarshaller = new DetachInstancesFromLoadBalancerResultJsonUnmarshaller();
            JsonResponseHandler<DetachInstancesFromLoadBalancerResult> responseHandler = new JsonResponseHandler<DetachInstancesFromLoadBalancerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is
     * attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return detachStaticIpResult The response from the DetachStaticIp service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachStaticIpResult detachStaticIp(DetachStaticIpRequest detachStaticIpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachStaticIpRequest> request = null;
        Response<DetachStaticIpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachStaticIpRequestMarshaller().marshall(detachStaticIpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetachStaticIpResult, JsonUnmarshallerContext> unmarshaller = new DetachStaticIpResultJsonUnmarshaller();
            JsonResponseHandler<DetachStaticIpResult> responseHandler = new JsonResponseHandler<DetachStaticIpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables an add-on for an Amazon Lightsail resource. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param disableAddOnRequest
     * @return disableAddOnResult The response from the DisableAddOn service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableAddOnResult disableAddOn(DisableAddOnRequest disableAddOnRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableAddOnRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAddOnRequest> request = null;
        Response<DisableAddOnResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAddOnRequestMarshaller().marshall(disableAddOnRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableAddOnResult, JsonUnmarshallerContext> unmarshaller = new DisableAddOnResultJsonUnmarshaller();
            JsonResponseHandler<DisableAddOnResult> responseHandler = new JsonResponseHandler<DisableAddOnResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return downloadDefaultKeyPairResult The response from the
     *         DownloadDefaultKeyPair service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DownloadDefaultKeyPairResult downloadDefaultKeyPair(
            DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(downloadDefaultKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DownloadDefaultKeyPairRequest> request = null;
        Response<DownloadDefaultKeyPairResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DownloadDefaultKeyPairRequestMarshaller()
                        .marshall(downloadDefaultKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DownloadDefaultKeyPairResult, JsonUnmarshallerContext> unmarshaller = new DownloadDefaultKeyPairResultJsonUnmarshaller();
            JsonResponseHandler<DownloadDefaultKeyPairResult> responseHandler = new JsonResponseHandler<DownloadDefaultKeyPairResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables or modifies an add-on for an Amazon Lightsail resource. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param enableAddOnRequest
     * @return enableAddOnResult The response from the EnableAddOn service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableAddOnResult enableAddOn(EnableAddOnRequest enableAddOnRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableAddOnRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAddOnRequest> request = null;
        Response<EnableAddOnResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAddOnRequestMarshaller().marshall(enableAddOnRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableAddOnResult, JsonUnmarshallerContext> unmarshaller = new EnableAddOnResultJsonUnmarshaller();
            JsonResponseHandler<EnableAddOnResult> responseHandler = new JsonResponseHandler<EnableAddOnResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Exports an Amazon Lightsail instance or block storage disk snapshot to
     * Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an
     * export snapshot record that can be used with the
     * <code>create cloud formation stack</code> operation to create new Amazon
     * EC2 instances.
     * </p>
     * <p>
     * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images
     * (AMIs), and the instance system disk appears as an Amazon Elastic Block
     * Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2
     * as Amazon EBS volumes. Snapshots are exported to the same Amazon Web
     * Services Region in Amazon EC2 as the source Lightsail snapshot.
     * </p>
     * <p/>
     * <p>
     * The <code>export snapshot</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>source snapshot name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <note>
     * <p>
     * Use the <code>get instance snapshots</code> or
     * <code>get disk snapshots</code> operations to get a list of snapshots
     * that you can export to Amazon EC2.
     * </p>
     * </note>
     * 
     * @param exportSnapshotRequest
     * @return exportSnapshotResult The response from the ExportSnapshot service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ExportSnapshotResult exportSnapshot(ExportSnapshotRequest exportSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exportSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportSnapshotRequest> request = null;
        Response<ExportSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportSnapshotRequestMarshaller().marshall(exportSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExportSnapshotResult, JsonUnmarshallerContext> unmarshaller = new ExportSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<ExportSnapshotResult> responseHandler = new JsonResponseHandler<ExportSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return getActiveNamesResult The response from the GetActiveNames service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetActiveNamesResult getActiveNames(GetActiveNamesRequest getActiveNamesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getActiveNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetActiveNamesRequest> request = null;
        Response<GetActiveNamesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetActiveNamesRequestMarshaller().marshall(getActiveNamesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetActiveNamesResult, JsonUnmarshallerContext> unmarshaller = new GetActiveNamesResultJsonUnmarshaller();
            JsonResponseHandler<GetActiveNamesResult> responseHandler = new JsonResponseHandler<GetActiveNamesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the configured alarms. Specify an alarm name in
     * your request to return information about a specific alarm, or specify a
     * monitored resource name to return information about all alarms for a
     * specific resource.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * 
     * @param getAlarmsRequest
     * @return getAlarmsResult The response from the GetAlarms service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAlarmsResult getAlarms(GetAlarmsRequest getAlarmsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAlarmsRequest> request = null;
        Response<GetAlarmsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAlarmsRequestMarshaller().marshall(getAlarmsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAlarmsResult, JsonUnmarshallerContext> unmarshaller = new GetAlarmsResultJsonUnmarshaller();
            JsonResponseHandler<GetAlarmsResult> responseHandler = new JsonResponseHandler<GetAlarmsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the available automatic snapshots for an instance or disk. For
     * more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param getAutoSnapshotsRequest
     * @return getAutoSnapshotsResult The response from the GetAutoSnapshots
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAutoSnapshotsResult getAutoSnapshots(GetAutoSnapshotsRequest getAutoSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAutoSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAutoSnapshotsRequest> request = null;
        Response<GetAutoSnapshotsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAutoSnapshotsRequestMarshaller().marshall(getAutoSnapshotsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAutoSnapshotsResult, JsonUnmarshallerContext> unmarshaller = new GetAutoSnapshotsResultJsonUnmarshaller();
            JsonResponseHandler<GetAutoSnapshotsResult> responseHandler = new JsonResponseHandler<GetAutoSnapshotsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You
     * can use a blueprint to create a new instance already running a specific
     * operating system, as well as a preinstalled app or development stack. The
     * software each instance is running depends on the blueprint image you
     * choose.
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints
     * are listed to support customers with existing instances and are not
     * necessarily available to create new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new
     * application releases.
     * </p>
     * </note>
     * 
     * @param getBlueprintsRequest
     * @return getBlueprintsResult The response from the GetBlueprints service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBlueprintsResult getBlueprints(GetBlueprintsRequest getBlueprintsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlueprintsRequest> request = null;
        Response<GetBlueprintsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlueprintsRequestMarshaller().marshall(getBlueprintsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBlueprintsResult, JsonUnmarshallerContext> unmarshaller = new GetBlueprintsResultJsonUnmarshaller();
            JsonResponseHandler<GetBlueprintsResult> responseHandler = new JsonResponseHandler<GetBlueprintsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle
     * describes the specs for your virtual private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return getBundlesResult The response from the GetBundles service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBundlesResult getBundles(GetBundlesRequest getBundlesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBundlesRequest> request = null;
        Response<GetBundlesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBundlesRequestMarshaller().marshall(getBundlesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBundlesResult, JsonUnmarshallerContext> unmarshaller = new GetBundlesResultJsonUnmarshaller();
            JsonResponseHandler<GetBundlesResult> responseHandler = new JsonResponseHandler<GetBundlesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the CloudFormation stack record created as a result of the
     * <code>create cloud formation stack</code> operation.
     * </p>
     * <p>
     * An AWS CloudFormation stack is used to create a new Amazon EC2 instance
     * from an exported Lightsail snapshot.
     * </p>
     * 
     * @param getCloudFormationStackRecordsRequest
     * @return getCloudFormationStackRecordsResult The response from the
     *         GetCloudFormationStackRecords service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCloudFormationStackRecordsResult getCloudFormationStackRecords(
            GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCloudFormationStackRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFormationStackRecordsRequest> request = null;
        Response<GetCloudFormationStackRecordsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCloudFormationStackRecordsRequestMarshaller()
                        .marshall(getCloudFormationStackRecordsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCloudFormationStackRecordsResult, JsonUnmarshallerContext> unmarshaller = new GetCloudFormationStackRecordsResultJsonUnmarshaller();
            JsonResponseHandler<GetCloudFormationStackRecordsResult> responseHandler = new JsonResponseHandler<GetCloudFormationStackRecordsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the configured contact methods. Specify a
     * protocol in your request to return information about a specific contact
     * method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * 
     * @param getContactMethodsRequest
     * @return getContactMethodsResult The response from the GetContactMethods
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetContactMethodsResult getContactMethods(
            GetContactMethodsRequest getContactMethodsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getContactMethodsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactMethodsRequest> request = null;
        Response<GetContactMethodsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactMethodsRequestMarshaller()
                        .marshall(getContactMethodsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetContactMethodsResult, JsonUnmarshallerContext> unmarshaller = new GetContactMethodsResultJsonUnmarshaller();
            JsonResponseHandler<GetContactMethodsResult> responseHandler = new JsonResponseHandler<GetContactMethodsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @return getDiskResult The response from the GetDisk service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDiskResult getDisk(GetDiskRequest getDiskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiskRequest> request = null;
        Response<GetDiskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiskRequestMarshaller().marshall(getDiskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDiskResult, JsonUnmarshallerContext> unmarshaller = new GetDiskResultJsonUnmarshaller();
            JsonResponseHandler<GetDiskResult> responseHandler = new JsonResponseHandler<GetDiskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @return getDiskSnapshotResult The response from the GetDiskSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDiskSnapshotResult getDiskSnapshot(GetDiskSnapshotRequest getDiskSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDiskSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiskSnapshotRequest> request = null;
        Response<GetDiskSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiskSnapshotRequestMarshaller().marshall(getDiskSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDiskSnapshotResult, JsonUnmarshallerContext> unmarshaller = new GetDiskSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<GetDiskSnapshotResult> responseHandler = new JsonResponseHandler<GetDiskSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS
     * account and region.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @return getDiskSnapshotsResult The response from the GetDiskSnapshots
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDiskSnapshotsResult getDiskSnapshots(GetDiskSnapshotsRequest getDiskSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDiskSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiskSnapshotsRequest> request = null;
        Response<GetDiskSnapshotsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiskSnapshotsRequestMarshaller().marshall(getDiskSnapshotsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDiskSnapshotsResult, JsonUnmarshallerContext> unmarshaller = new GetDiskSnapshotsResultJsonUnmarshaller();
            JsonResponseHandler<GetDiskSnapshotsResult> responseHandler = new JsonResponseHandler<GetDiskSnapshotsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and
     * region.
     * </p>
     * 
     * @param getDisksRequest
     * @return getDisksResult The response from the GetDisks service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDisksResult getDisks(GetDisksRequest getDisksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDisksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDisksRequest> request = null;
        Response<GetDisksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDisksRequestMarshaller().marshall(getDisksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDisksResult, JsonUnmarshallerContext> unmarshaller = new GetDisksResultJsonUnmarshaller();
            JsonResponseHandler<GetDisksResult> responseHandler = new JsonResponseHandler<GetDisksResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return getDomainResult The response from the GetDomain service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDomainResult getDomain(GetDomainRequest getDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainRequest> request = null;
        Response<GetDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainRequestMarshaller().marshall(getDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainResult, JsonUnmarshallerContext> unmarshaller = new GetDomainResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainResult> responseHandler = new JsonResponseHandler<GetDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return getDomainsResult The response from the GetDomains service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDomainsResult getDomains(GetDomainsRequest getDomainsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainsRequest> request = null;
        Response<GetDomainsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainsRequestMarshaller().marshall(getDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainsResult, JsonUnmarshallerContext> unmarshaller = new GetDomainsResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainsResult> responseHandler = new JsonResponseHandler<GetDomainsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the export snapshot record created as a result of the
     * <code>export snapshot</code> operation.
     * </p>
     * <p>
     * An export snapshot record can be used to create a new Amazon EC2 instance
     * and its related resources with the
     * <code>create cloud formation stack</code> operation.
     * </p>
     * 
     * @param getExportSnapshotRecordsRequest
     * @return getExportSnapshotRecordsResult The response from the
     *         GetExportSnapshotRecords service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetExportSnapshotRecordsResult getExportSnapshotRecords(
            GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getExportSnapshotRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportSnapshotRecordsRequest> request = null;
        Response<GetExportSnapshotRecordsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportSnapshotRecordsRequestMarshaller()
                        .marshall(getExportSnapshotRecordsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetExportSnapshotRecordsResult, JsonUnmarshallerContext> unmarshaller = new GetExportSnapshotRecordsResultJsonUnmarshaller();
            JsonResponseHandler<GetExportSnapshotRecordsResult> responseHandler = new JsonResponseHandler<GetExportSnapshotRecordsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is
     * a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return getInstanceResult The response from the GetInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceRequest> request = null;
        Response<GetInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceRequestMarshaller().marshall(getInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceResult> responseHandler = new JsonResponseHandler<GetInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual
     * private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>get instance access details</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return getInstanceAccessDetailsResult The response from the
     *         GetInstanceAccessDetails service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstanceAccessDetailsResult getInstanceAccessDetails(
            GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceAccessDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceAccessDetailsRequest> request = null;
        Response<GetInstanceAccessDetailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceAccessDetailsRequestMarshaller()
                        .marshall(getInstanceAccessDetailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceAccessDetailsResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceAccessDetailsResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceAccessDetailsResult> responseHandler = new JsonResponseHandler<GetInstanceAccessDetailsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance
     * metric, given an instance name.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts
     * generated by them. Monitor and collect metric data regularly to maintain
     * the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return getInstanceMetricDataResult The response from the
     *         GetInstanceMetricData service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstanceMetricDataResult getInstanceMetricData(
            GetInstanceMetricDataRequest getInstanceMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceMetricDataRequest> request = null;
        Response<GetInstanceMetricDataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceMetricDataRequestMarshaller()
                        .marshall(getInstanceMetricDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceMetricDataResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceMetricDataResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceMetricDataResult> responseHandler = new JsonResponseHandler<GetInstanceMetricDataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the firewall port states for a specific Amazon Lightsail
     * instance, the IP addresses allowed to connect to the instance through the
     * ports, and the protocol.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return getInstancePortStatesResult The response from the
     *         GetInstancePortStates service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstancePortStatesResult getInstancePortStates(
            GetInstancePortStatesRequest getInstancePortStatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstancePortStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancePortStatesRequest> request = null;
        Response<GetInstancePortStatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancePortStatesRequestMarshaller()
                        .marshall(getInstancePortStatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstancePortStatesResult, JsonUnmarshallerContext> unmarshaller = new GetInstancePortStatesResultJsonUnmarshaller();
            JsonResponseHandler<GetInstancePortStatesResult> responseHandler = new JsonResponseHandler<GetInstancePortStatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return getInstanceSnapshotResult The response from the
     *         GetInstanceSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstanceSnapshotResult getInstanceSnapshot(
            GetInstanceSnapshotRequest getInstanceSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceSnapshotRequest> request = null;
        Response<GetInstanceSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceSnapshotRequestMarshaller()
                        .marshall(getInstanceSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceSnapshotResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceSnapshotResult> responseHandler = new JsonResponseHandler<GetInstanceSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return getInstanceSnapshotsResult The response from the
     *         GetInstanceSnapshots service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstanceSnapshotsResult getInstanceSnapshots(
            GetInstanceSnapshotsRequest getInstanceSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceSnapshotsRequest> request = null;
        Response<GetInstanceSnapshotsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceSnapshotsRequestMarshaller()
                        .marshall(getInstanceSnapshotsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceSnapshotsResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceSnapshotsResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceSnapshotsResult> responseHandler = new JsonResponseHandler<GetInstanceSnapshotsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a
     * time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return getInstanceStateResult The response from the GetInstanceState
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstanceStateResult getInstanceState(GetInstanceStateRequest getInstanceStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceStateRequest> request = null;
        Response<GetInstanceStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceStateRequestMarshaller().marshall(getInstanceStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceStateResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceStateResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceStateResult> responseHandler = new JsonResponseHandler<GetInstanceStateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers,
     * or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return getInstancesResult The response from the GetInstances service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInstancesResult getInstances(GetInstancesRequest getInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancesRequest> request = null;
        Response<GetInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancesRequestMarshaller().marshall(getInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstancesResult, JsonUnmarshallerContext> unmarshaller = new GetInstancesResultJsonUnmarshaller();
            JsonResponseHandler<GetInstancesResult> responseHandler = new JsonResponseHandler<GetInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return getKeyPairResult The response from the GetKeyPair service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetKeyPairResult getKeyPair(GetKeyPairRequest getKeyPairRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPairRequest> request = null;
        Response<GetKeyPairResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPairRequestMarshaller().marshall(getKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetKeyPairResult, JsonUnmarshallerContext> unmarshaller = new GetKeyPairResultJsonUnmarshaller();
            JsonResponseHandler<GetKeyPairResult> responseHandler = new JsonResponseHandler<GetKeyPairResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return getKeyPairsResult The response from the GetKeyPairs service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetKeyPairsResult getKeyPairs(GetKeyPairsRequest getKeyPairsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getKeyPairsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPairsRequest> request = null;
        Response<GetKeyPairsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPairsRequestMarshaller().marshall(getKeyPairsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetKeyPairsResult, JsonUnmarshallerContext> unmarshaller = new GetKeyPairsResultJsonUnmarshaller();
            JsonResponseHandler<GetKeyPairsResult> responseHandler = new JsonResponseHandler<GetKeyPairsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @return getLoadBalancerResult The response from the GetLoadBalancer
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLoadBalancerResult getLoadBalancer(GetLoadBalancerRequest getLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancerRequest> request = null;
        Response<GetLoadBalancerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancerRequestMarshaller().marshall(getLoadBalancerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoadBalancerResult, JsonUnmarshallerContext> unmarshaller = new GetLoadBalancerResultJsonUnmarshaller();
            JsonResponseHandler<GetLoadBalancerResult> responseHandler = new JsonResponseHandler<GetLoadBalancerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about health metrics for your Lightsail load
     * balancer.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts
     * generated by them. Monitor and collect metric data regularly to maintain
     * the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getLoadBalancerMetricDataRequest
     * @return getLoadBalancerMetricDataResult The response from the
     *         GetLoadBalancerMetricData service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLoadBalancerMetricDataResult getLoadBalancerMetricData(
            GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLoadBalancerMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancerMetricDataRequest> request = null;
        Response<GetLoadBalancerMetricDataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancerMetricDataRequestMarshaller()
                        .marshall(getLoadBalancerMetricDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoadBalancerMetricDataResult, JsonUnmarshallerContext> unmarshaller = new GetLoadBalancerMetricDataResultJsonUnmarshaller();
            JsonResponseHandler<GetLoadBalancerMetricDataResult> responseHandler = new JsonResponseHandler<GetLoadBalancerMetricDataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the TLS certificates that are associated with
     * the specified Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * You can have a maximum of 2 certificates associated with a Lightsail load
     * balancer. One is active and the other is inactive.
     * </p>
     * 
     * @param getLoadBalancerTlsCertificatesRequest
     * @return getLoadBalancerTlsCertificatesResult The response from the
     *         GetLoadBalancerTlsCertificates service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLoadBalancerTlsCertificatesResult getLoadBalancerTlsCertificates(
            GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLoadBalancerTlsCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancerTlsCertificatesRequest> request = null;
        Response<GetLoadBalancerTlsCertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancerTlsCertificatesRequestMarshaller()
                        .marshall(getLoadBalancerTlsCertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoadBalancerTlsCertificatesResult, JsonUnmarshallerContext> unmarshaller = new GetLoadBalancerTlsCertificatesResultJsonUnmarshaller();
            JsonResponseHandler<GetLoadBalancerTlsCertificatesResult> responseHandler = new JsonResponseHandler<GetLoadBalancerTlsCertificatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @return getLoadBalancersResult The response from the GetLoadBalancers
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLoadBalancersResult getLoadBalancers(GetLoadBalancersRequest getLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancersRequest> request = null;
        Response<GetLoadBalancersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancersRequestMarshaller().marshall(getLoadBalancersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoadBalancersResult, JsonUnmarshallerContext> unmarshaller = new GetLoadBalancersResultJsonUnmarshaller();
            JsonResponseHandler<GetLoadBalancersResult> responseHandler = new JsonResponseHandler<GetLoadBalancersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific operation. Operations include events
     * such as when you create an instance, allocate a static IP, attach a
     * static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return getOperationResult The response from the GetOperation service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetOperationResult getOperation(GetOperationRequest getOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationRequest> request = null;
        Response<GetOperationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationRequestMarshaller().marshall(getOperationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOperationResult, JsonUnmarshallerContext> unmarshaller = new GetOperationResultJsonUnmarshaller();
            JsonResponseHandler<GetOperationResult> responseHandler = new JsonResponseHandler<GetOperationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200.
     * Results can be paged by making each subsequent call to
     * <code>GetOperations</code> use the maximum (last)
     * <code>statusChangedAt</code> value from the previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return getOperationsResult The response from the GetOperations service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetOperationsResult getOperations(GetOperationsRequest getOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationsRequest> request = null;
        Response<GetOperationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationsRequestMarshaller().marshall(getOperationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOperationsResult, JsonUnmarshallerContext> unmarshaller = new GetOperationsResultJsonUnmarshaller();
            JsonResponseHandler<GetOperationsResult> responseHandler = new JsonResponseHandler<GetOperationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static
     * IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return getOperationsForResourceResult The response from the
     *         GetOperationsForResource service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetOperationsForResourceResult getOperationsForResource(
            GetOperationsForResourceRequest getOperationsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOperationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationsForResourceRequest> request = null;
        Response<GetOperationsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationsForResourceRequestMarshaller()
                        .marshall(getOperationsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOperationsForResourceResult, JsonUnmarshallerContext> unmarshaller = new GetOperationsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<GetOperationsForResourceResult> responseHandler = new JsonResponseHandler<GetOperationsForResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the
     * <code>include availability zones</code> parameter to also return the
     * Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return getRegionsResult The response from the GetRegions service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRegionsResult getRegions(GetRegionsRequest getRegionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegionsRequest> request = null;
        Response<GetRegionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegionsRequestMarshaller().marshall(getRegionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRegionsResult, JsonUnmarshallerContext> unmarshaller = new GetRegionsResultJsonUnmarshaller();
            JsonResponseHandler<GetRegionsResult> responseHandler = new JsonResponseHandler<GetRegionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @return getRelationalDatabaseResult The response from the
     *         GetRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseResult getRelationalDatabase(
            GetRelationalDatabaseRequest getRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseRequest> request = null;
        Response<GetRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseRequestMarshaller()
                        .marshall(getRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of available database blueprints in Amazon Lightsail. A
     * blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * You can use a blueprint ID to create a new database that runs a specific
     * database engine.
     * </p>
     * 
     * @param getRelationalDatabaseBlueprintsRequest
     * @return getRelationalDatabaseBlueprintsResult The response from the
     *         GetRelationalDatabaseBlueprints service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseBlueprintsResult getRelationalDatabaseBlueprints(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseBlueprintsRequest> request = null;
        Response<GetRelationalDatabaseBlueprintsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseBlueprintsRequestMarshaller()
                        .marshall(getRelationalDatabaseBlueprintsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseBlueprintsResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseBlueprintsResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseBlueprintsResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseBlueprintsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of bundles that are available in Amazon Lightsail. A
     * bundle describes the performance specifications for a database.
     * </p>
     * <p>
     * You can use a bundle ID to create a new database with explicit
     * performance specifications.
     * </p>
     * 
     * @param getRelationalDatabaseBundlesRequest
     * @return getRelationalDatabaseBundlesResult The response from the
     *         GetRelationalDatabaseBundles service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseBundlesResult getRelationalDatabaseBundles(
            GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseBundlesRequest> request = null;
        Response<GetRelationalDatabaseBundlesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseBundlesRequestMarshaller()
                        .marshall(getRelationalDatabaseBundlesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseBundlesResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseBundlesResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseBundlesResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseBundlesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @return getRelationalDatabaseEventsResult The response from the
     *         GetRelationalDatabaseEvents service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseEventsResult getRelationalDatabaseEvents(
            GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseEventsRequest> request = null;
        Response<GetRelationalDatabaseEventsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseEventsRequestMarshaller()
                        .marshall(getRelationalDatabaseEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseEventsResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseEventsResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseEventsResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseEventsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @return getRelationalDatabaseLogEventsResult The response from the
     *         GetRelationalDatabaseLogEvents service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseLogEventsResult getRelationalDatabaseLogEvents(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseLogEventsRequest> request = null;
        Response<GetRelationalDatabaseLogEventsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseLogEventsRequestMarshaller()
                        .marshall(getRelationalDatabaseLogEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseLogEventsResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseLogEventsResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseLogEventsResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseLogEventsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @return getRelationalDatabaseLogStreamsResult The response from the
     *         GetRelationalDatabaseLogStreams service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseLogStreamsResult getRelationalDatabaseLogStreams(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseLogStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseLogStreamsRequest> request = null;
        Response<GetRelationalDatabaseLogStreamsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseLogStreamsRequestMarshaller()
                        .marshall(getRelationalDatabaseLogStreamsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseLogStreamsResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseLogStreamsResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseLogStreamsResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseLogStreamsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the current, previous, or pending versions of the master user
     * password for a Lightsail database.
     * </p>
     * <p>
     * The <code>GetRelationalDatabaseMasterUserPassword</code> operation
     * supports tag-based access control via resource tags applied to the
     * resource identified by relationalDatabaseName.
     * </p>
     * 
     * @param getRelationalDatabaseMasterUserPasswordRequest
     * @return getRelationalDatabaseMasterUserPasswordResult The response from
     *         the GetRelationalDatabaseMasterUserPassword service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseMasterUserPasswordResult getRelationalDatabaseMasterUserPassword(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseMasterUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseMasterUserPasswordRequest> request = null;
        Response<GetRelationalDatabaseMasterUserPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseMasterUserPasswordRequestMarshaller()
                        .marshall(getRelationalDatabaseMasterUserPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseMasterUserPasswordResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseMasterUserPasswordResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseMasterUserPasswordResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseMasterUserPasswordResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the data points of the specified metric for a database in Amazon
     * Lightsail.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts
     * generated by them. Monitor and collect metric data regularly to maintain
     * the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getRelationalDatabaseMetricDataRequest
     * @return getRelationalDatabaseMetricDataResult The response from the
     *         GetRelationalDatabaseMetricData service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseMetricDataResult getRelationalDatabaseMetricData(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseMetricDataRequest> request = null;
        Response<GetRelationalDatabaseMetricDataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseMetricDataRequestMarshaller()
                        .marshall(getRelationalDatabaseMetricDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseMetricDataResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseMetricDataResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseMetricDataResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseMetricDataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all of the runtime parameters offered by the underlying database
     * software, or engine, for a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * In addition to the parameter names and values, this operation returns
     * other information about each parameter. This information includes whether
     * changes require a reboot, whether the parameter is modifiable, the
     * allowed values, and the data types.
     * </p>
     * 
     * @param getRelationalDatabaseParametersRequest
     * @return getRelationalDatabaseParametersResult The response from the
     *         GetRelationalDatabaseParameters service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseParametersResult getRelationalDatabaseParameters(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseParametersRequest> request = null;
        Response<GetRelationalDatabaseParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseParametersRequestMarshaller()
                        .marshall(getRelationalDatabaseParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseParametersResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseParametersResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseParametersResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseParametersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @return getRelationalDatabaseSnapshotResult The response from the
     *         GetRelationalDatabaseSnapshot service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseSnapshotResult getRelationalDatabaseSnapshot(
            GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseSnapshotRequest> request = null;
        Response<GetRelationalDatabaseSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseSnapshotRequestMarshaller()
                        .marshall(getRelationalDatabaseSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseSnapshotResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseSnapshotResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseSnapshotResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @return getRelationalDatabaseSnapshotsResult The response from the
     *         GetRelationalDatabaseSnapshots service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabaseSnapshotsResult getRelationalDatabaseSnapshots(
            GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseSnapshotsRequest> request = null;
        Response<GetRelationalDatabaseSnapshotsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseSnapshotsRequestMarshaller()
                        .marshall(getRelationalDatabaseSnapshotsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabaseSnapshotsResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabaseSnapshotsResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabaseSnapshotsResult> responseHandler = new JsonResponseHandler<GetRelationalDatabaseSnapshotsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @return getRelationalDatabasesResult The response from the
     *         GetRelationalDatabases service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRelationalDatabasesResult getRelationalDatabases(
            GetRelationalDatabasesRequest getRelationalDatabasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRelationalDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabasesRequest> request = null;
        Response<GetRelationalDatabasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabasesRequestMarshaller()
                        .marshall(getRelationalDatabasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRelationalDatabasesResult, JsonUnmarshallerContext> unmarshaller = new GetRelationalDatabasesResultJsonUnmarshaller();
            JsonResponseHandler<GetRelationalDatabasesResult> responseHandler = new JsonResponseHandler<GetRelationalDatabasesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return getStaticIpResult The response from the GetStaticIp service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetStaticIpResult getStaticIp(GetStaticIpRequest getStaticIpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStaticIpRequest> request = null;
        Response<GetStaticIpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStaticIpRequestMarshaller().marshall(getStaticIpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetStaticIpResult, JsonUnmarshallerContext> unmarshaller = new GetStaticIpResultJsonUnmarshaller();
            JsonResponseHandler<GetStaticIpResult> responseHandler = new JsonResponseHandler<GetStaticIpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return getStaticIpsResult The response from the GetStaticIps service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetStaticIpsResult getStaticIps(GetStaticIpsRequest getStaticIpsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStaticIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStaticIpsRequest> request = null;
        Response<GetStaticIpsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStaticIpsRequestMarshaller().marshall(getStaticIpsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetStaticIpsResult, JsonUnmarshallerContext> unmarshaller = new GetStaticIpsResultJsonUnmarshaller();
            JsonResponseHandler<GetStaticIpsResult> responseHandler = new JsonResponseHandler<GetStaticIpsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return importKeyPairResult The response from the ImportKeyPair service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportKeyPairRequest> request = null;
        Response<ImportKeyPairResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportKeyPairRequestMarshaller().marshall(importKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportKeyPairResult, JsonUnmarshallerContext> unmarshaller = new ImportKeyPairResultJsonUnmarshaller();
            JsonResponseHandler<ImportKeyPairResult> responseHandler = new JsonResponseHandler<ImportKeyPairResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return isVpcPeeredResult The response from the IsVpcPeered service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest isVpcPeeredRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(isVpcPeeredRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IsVpcPeeredRequest> request = null;
        Response<IsVpcPeeredResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IsVpcPeeredRequestMarshaller().marshall(isVpcPeeredRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<IsVpcPeeredResult, JsonUnmarshallerContext> unmarshaller = new IsVpcPeeredResultJsonUnmarshaller();
            JsonResponseHandler<IsVpcPeeredResult> responseHandler = new JsonResponseHandler<IsVpcPeeredResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the
     * IP addresses allowed to connect to the instance through the ports, and
     * the protocol.
     * </p>
     * <p>
     * The <code>OpenInstancePublicPorts</code> action supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instanceName</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return openInstancePublicPortsResult The response from the
     *         OpenInstancePublicPorts service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public OpenInstancePublicPortsResult openInstancePublicPorts(
            OpenInstancePublicPortsRequest openInstancePublicPortsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(openInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OpenInstancePublicPortsRequest> request = null;
        Response<OpenInstancePublicPortsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new OpenInstancePublicPortsRequestMarshaller()
                        .marshall(openInstancePublicPortsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<OpenInstancePublicPortsResult, JsonUnmarshallerContext> unmarshaller = new OpenInstancePublicPortsResultJsonUnmarshaller();
            JsonResponseHandler<OpenInstancePublicPortsResult> responseHandler = new JsonResponseHandler<OpenInstancePublicPortsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return peerVpcResult The response from the PeerVpc service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PeerVpcResult peerVpc(PeerVpcRequest peerVpcRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(peerVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PeerVpcRequest> request = null;
        Response<PeerVpcResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PeerVpcRequestMarshaller().marshall(peerVpcRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PeerVpcResult, JsonUnmarshallerContext> unmarshaller = new PeerVpcResultJsonUnmarshaller();
            JsonResponseHandler<PeerVpcResult> responseHandler = new JsonResponseHandler<PeerVpcResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates an alarm, and associates it with the specified metric.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * <p>
     * When this action creates an alarm, the alarm state is immediately set to
     * <code>INSUFFICIENT_DATA</code>. The alarm is then evaluated and its state
     * is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the
     * update completely overwrites the previous configuration of the alarm. The
     * alarm is then evaluated with the updated configuration.
     * </p>
     * 
     * @param putAlarmRequest
     * @return putAlarmResult The response from the PutAlarm service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutAlarmResult putAlarm(PutAlarmRequest putAlarmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAlarmRequest> request = null;
        Response<PutAlarmResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAlarmRequestMarshaller().marshall(putAlarmRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAlarmResult, JsonUnmarshallerContext> unmarshaller = new PutAlarmResultJsonUnmarshaller();
            JsonResponseHandler<PutAlarmResult> responseHandler = new JsonResponseHandler<PutAlarmResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the
     * IP addresses allowed to connect to the instance through the ports, and
     * the protocol. This action also closes all currently open ports that are
     * not included in the request. Include all of the ports and the protocols
     * you want to open in your <code>PutInstancePublicPorts</code>request. Or
     * use the <code>OpenInstancePublicPorts</code> action to open ports without
     * closing currently open ports.
     * </p>
     * <p>
     * The <code>PutInstancePublicPorts</code> action supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instanceName</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @return putInstancePublicPortsResult The response from the
     *         PutInstancePublicPorts service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutInstancePublicPortsResult putInstancePublicPorts(
            PutInstancePublicPortsRequest putInstancePublicPortsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInstancePublicPortsRequest> request = null;
        Response<PutInstancePublicPortsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInstancePublicPortsRequestMarshaller()
                        .marshall(putInstancePublicPortsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutInstancePublicPortsResult, JsonUnmarshallerContext> unmarshaller = new PutInstancePublicPortsResultJsonUnmarshaller();
            JsonResponseHandler<PutInstancePublicPortsResult> responseHandler = new JsonResponseHandler<PutInstancePublicPortsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Restarts a specific instance.
     * </p>
     * <p>
     * The <code>reboot instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return rebootInstanceResult The response from the RebootInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RebootInstanceResult rebootInstance(RebootInstanceRequest rebootInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebootInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootInstanceRequest> request = null;
        Response<RebootInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootInstanceRequestMarshaller().marshall(rebootInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RebootInstanceResult, JsonUnmarshallerContext> unmarshaller = new RebootInstanceResultJsonUnmarshaller();
            JsonResponseHandler<RebootInstanceResult> responseHandler = new JsonResponseHandler<RebootInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Restarts a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>reboot relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootRelationalDatabaseRequest
     * @return rebootRelationalDatabaseResult The response from the
     *         RebootRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RebootRelationalDatabaseResult rebootRelationalDatabase(
            RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebootRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootRelationalDatabaseRequest> request = null;
        Response<RebootRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootRelationalDatabaseRequestMarshaller()
                        .marshall(rebootRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RebootRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new RebootRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<RebootRelationalDatabaseResult> responseHandler = new JsonResponseHandler<RebootRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return releaseStaticIpResult The response from the ReleaseStaticIp
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest releaseStaticIpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(releaseStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReleaseStaticIpRequest> request = null;
        Response<ReleaseStaticIpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReleaseStaticIpRequestMarshaller().marshall(releaseStaticIpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ReleaseStaticIpResult, JsonUnmarshallerContext> unmarshaller = new ReleaseStaticIpResultJsonUnmarshaller();
            JsonResponseHandler<ReleaseStaticIpResult> responseHandler = new JsonResponseHandler<ReleaseStaticIpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sends a verification request to an email contact method to ensure it's
     * owned by the requester. SMS contact methods don't need to be verified.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * A verification request is sent to the contact method when you initially
     * create it. Use this action to send another verification request if a
     * previous verification request was deleted, or has expired.
     * </p>
     * <important>
     * <p>
     * Notifications are not sent to an email contact method until after it is
     * verified, and confirmed as valid.
     * </p>
     * </important>
     * 
     * @param sendContactMethodVerificationRequest
     * @return sendContactMethodVerificationResult The response from the
     *         SendContactMethodVerification service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SendContactMethodVerificationResult sendContactMethodVerification(
            SendContactMethodVerificationRequest sendContactMethodVerificationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendContactMethodVerificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendContactMethodVerificationRequest> request = null;
        Response<SendContactMethodVerificationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendContactMethodVerificationRequestMarshaller()
                        .marshall(sendContactMethodVerificationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendContactMethodVerificationResult, JsonUnmarshallerContext> unmarshaller = new SendContactMethodVerificationResultJsonUnmarshaller();
            JsonResponseHandler<SendContactMethodVerificationResult> responseHandler = new JsonResponseHandler<SendContactMethodVerificationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To
     * restart an instance, use the <code>reboot instance</code> operation.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP
     * address to the instance. To use the same IP address after stopping and
     * starting an instance, create a static IP address and attach it to the
     * instance. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>start instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return startInstanceResult The response from the StartInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartInstanceResult startInstance(StartInstanceRequest startInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstanceRequest> request = null;
        Response<StartInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstanceRequestMarshaller().marshall(startInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartInstanceResult, JsonUnmarshallerContext> unmarshaller = new StartInstanceResultJsonUnmarshaller();
            JsonResponseHandler<StartInstanceResult> responseHandler = new JsonResponseHandler<StartInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a specific database from a stopped state in Amazon Lightsail. To
     * restart a database, use the <code>reboot relational database</code>
     * operation.
     * </p>
     * <p>
     * The <code>start relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startRelationalDatabaseRequest
     * @return startRelationalDatabaseResult The response from the
     *         StartRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartRelationalDatabaseResult startRelationalDatabase(
            StartRelationalDatabaseRequest startRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRelationalDatabaseRequest> request = null;
        Response<StartRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRelationalDatabaseRequestMarshaller()
                        .marshall(startRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new StartRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<StartRelationalDatabaseResult> responseHandler = new JsonResponseHandler<StartRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP
     * address to the instance. To use the same IP address after stopping and
     * starting an instance, create a static IP address and attach it to the
     * instance. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>stop instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return stopInstanceResult The response from the StopInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopInstanceResult stopInstance(StopInstanceRequest stopInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInstanceRequest> request = null;
        Response<StopInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInstanceRequestMarshaller().marshall(stopInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopInstanceResult, JsonUnmarshallerContext> unmarshaller = new StopInstanceResultJsonUnmarshaller();
            JsonResponseHandler<StopInstanceResult> responseHandler = new JsonResponseHandler<StopInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a specific database that is currently running in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>stop relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopRelationalDatabaseRequest
     * @return stopRelationalDatabaseResult The response from the
     *         StopRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopRelationalDatabaseResult stopRelationalDatabase(
            StopRelationalDatabaseRequest stopRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopRelationalDatabaseRequest> request = null;
        Response<StopRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopRelationalDatabaseRequestMarshaller()
                        .marshall(stopRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new StopRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<StopRelationalDatabaseResult> responseHandler = new JsonResponseHandler<StopRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds one or more tags to the specified Amazon Lightsail resource. Each
     * resource can have a maximum of 50 tags. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. For more
     * information about tags, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * The <code>tag resource</code> operation supports tag-based access control
     * via request tags and resource tags applied to the resource identified by
     * <code>resource name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
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
     * Tests an alarm by displaying a banner on the Amazon Lightsail console. If
     * a notification trigger is configured for the specified alarm, the test
     * also sends a notification to the notification protocol (
     * <code>Email</code> and/or <code>SMS</code>) configured for the alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * 
     * @param testAlarmRequest
     * @return testAlarmResult The response from the TestAlarm service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TestAlarmResult testAlarm(TestAlarmRequest testAlarmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestAlarmRequest> request = null;
        Response<TestAlarmResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestAlarmRequestMarshaller().marshall(testAlarmRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TestAlarmResult, JsonUnmarshallerContext> unmarshaller = new TestAlarmResultJsonUnmarshaller();
            JsonResponseHandler<TestAlarmResult> responseHandler = new JsonResponseHandler<TestAlarmResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return unpeerVpcResult The response from the UnpeerVpc service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UnpeerVpcResult unpeerVpc(UnpeerVpcRequest unpeerVpcRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(unpeerVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnpeerVpcRequest> request = null;
        Response<UnpeerVpcResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnpeerVpcRequestMarshaller().marshall(unpeerVpcRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UnpeerVpcResult, JsonUnmarshallerContext> unmarshaller = new UnpeerVpcResultJsonUnmarshaller();
            JsonResponseHandler<UnpeerVpcResult> responseHandler = new JsonResponseHandler<UnpeerVpcResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified set of tag keys and their values from the specified
     * Amazon Lightsail resource.
     * </p>
     * <p>
     * The <code>untag resource</code> operation supports tag-based access
     * control via request tags and resource tags applied to the resource
     * identified by <code>resource name</code>. For more information, see the
     * <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
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
     * Updates a domain recordset after it is created.
     * </p>
     * <p>
     * The <code>update domain entry</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return updateDomainEntryResult The response from the UpdateDomainEntry
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDomainEntryResult updateDomainEntry(
            UpdateDomainEntryRequest updateDomainEntryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainEntryRequest> request = null;
        Response<UpdateDomainEntryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainEntryRequestMarshaller()
                        .marshall(updateDomainEntryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainEntryResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainEntryResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainEntryResult> responseHandler = new JsonResponseHandler<UpdateDomainEntryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the specified attribute for a load balancer. You can only update
     * one attribute at a time.
     * </p>
     * <p>
     * The <code>update load balancer attribute</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateLoadBalancerAttributeRequest
     * @return updateLoadBalancerAttributeResult The response from the
     *         UpdateLoadBalancerAttribute service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateLoadBalancerAttributeResult updateLoadBalancerAttribute(
            UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateLoadBalancerAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLoadBalancerAttributeRequest> request = null;
        Response<UpdateLoadBalancerAttributeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoadBalancerAttributeRequestMarshaller()
                        .marshall(updateLoadBalancerAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateLoadBalancerAttributeResult, JsonUnmarshallerContext> unmarshaller = new UpdateLoadBalancerAttributeResultJsonUnmarshaller();
            JsonResponseHandler<UpdateLoadBalancerAttributeResult> responseHandler = new JsonResponseHandler<UpdateLoadBalancerAttributeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows the update of one or more attributes of a database in Amazon
     * Lightsail.
     * </p>
     * <p>
     * Updates are applied immediately, or in cases where the updates could
     * result in an outage, are applied during the database's predefined
     * maintenance window.
     * </p>
     * <p>
     * The <code>update relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseRequest
     * @return updateRelationalDatabaseResult The response from the
     *         UpdateRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRelationalDatabaseResult updateRelationalDatabase(
            UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRelationalDatabaseRequest> request = null;
        Response<UpdateRelationalDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRelationalDatabaseRequestMarshaller()
                        .marshall(updateRelationalDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRelationalDatabaseResult, JsonUnmarshallerContext> unmarshaller = new UpdateRelationalDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRelationalDatabaseResult> responseHandler = new JsonResponseHandler<UpdateRelationalDatabaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows the update of one or more parameters of a database in Amazon
     * Lightsail.
     * </p>
     * <p>
     * Parameter updates don't cause outages; therefore, their application is
     * not subject to the preferred maintenance window. However, there are two
     * ways in which parameter updates are applied: <code>dynamic</code> or
     * <code>pending-reboot</code>. Parameters marked with a
     * <code>dynamic</code> apply type are applied immediately. Parameters
     * marked with a <code>pending-reboot</code> apply type are applied only
     * after the database is rebooted using the
     * <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>update relational database parameters</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by relationalDatabaseName. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseParametersRequest
     * @return updateRelationalDatabaseParametersResult The response from the
     *         UpdateRelationalDatabaseParameters service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRelationalDatabaseParametersResult updateRelationalDatabaseParameters(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRelationalDatabaseParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRelationalDatabaseParametersRequest> request = null;
        Response<UpdateRelationalDatabaseParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRelationalDatabaseParametersRequestMarshaller()
                        .marshall(updateRelationalDatabaseParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRelationalDatabaseParametersResult, JsonUnmarshallerContext> unmarshaller = new UpdateRelationalDatabaseParametersResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRelationalDatabaseParametersResult> responseHandler = new JsonResponseHandler<UpdateRelationalDatabaseParametersResult>(
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
