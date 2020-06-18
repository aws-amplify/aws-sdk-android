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

package com.amazonaws.services.metering.marketplace;

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

import com.amazonaws.services.metering.marketplace.model.*;
import com.amazonaws.services.metering.marketplace.model.transform.*;

/**
 * Client for accessing AWSMarketplace Metering. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>AWS Marketplace Metering Service</fullname>
 * <p>
 * This reference provides descriptions of the low-level AWS Marketplace
 * Metering Service API.
 * </p>
 * <p>
 * AWS Marketplace sellers can use this API to submit usage data for custom
 * usage dimensions.
 * </p>
 * <p>
 * For information on the permissions you need to use this API, see <a href=
 * "https://docs.aws.amazon.com/marketplace/latest/userguide/iam-user-policy-for-aws-marketplace-actions.html"
 * >AWS Marketing metering and entitlement API permissions</a> in the <i>AWS
 * Marketplace Seller Guide.</i>
 * </p>
 * <p>
 * <b>Submitting Metering Records</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>MeterUsage</i>- Submits the metering record for a Marketplace product.
 * MeterUsage is called from an EC2 instance or a container running on EKS or
 * ECS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchMeterUsage</i>- Submits the metering record for a set of customers.
 * BatchMeterUsage is called from a software-as-a-service (SaaS) application.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Accepting New Customers</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ResolveCustomer</i>- Called by a SaaS application during the registration
 * process. When a buyer visits your website during the registration process,
 * the buyer submits a Registration Token through the browser. The Registration
 * Token is resolved through this API to obtain a CustomerIdentifier and Product
 * Code.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Entitlement and Metering for Paid Container Products</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Paid container software products sold through AWS Marketplace must integrate
 * with the AWS Marketplace Metering Service and call the RegisterUsage
 * operation for software entitlement and metering. Free and BYOL products for
 * Amazon ECS or Amazon EKS aren't required to call RegisterUsage, but you can
 * do so if you want to receive usage data in your seller reports. For more
 * information on using the RegisterUsage operation, see <a href=
 * "https://docs.aws.amazon.com/marketplace/latest/userguide/container-based-products.html"
 * >Container-Based Products</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * BatchMeterUsage API calls are captured by AWS CloudTrail. You can use
 * Cloudtrail to verify that the SaaS metering records that you sent are
 * accurate by searching for records with the eventName of BatchMeterUsage. You
 * can also use CloudTrail to audit records over time. For more information, see
 * the <i> <a href=
 * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html"
 * >AWS CloudTrail User Guide</a> </i>.
 * </p>
 */
public class AWSMarketplaceMeteringClient extends AmazonWebServiceClient implements
        AWSMarketplaceMetering {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWSMarketplace Metering
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AWSMarketplaceMeteringClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *            how this client connects to AWSMarketplaceMetering (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering using the specified AWS account credentials.
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
     *         AWSMarketplaceMeteringClient client = new AWSMarketplaceMeteringClient(AWSMobileClient
     *                 .getInstance());
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
    public AWSMarketplaceMeteringClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering using the specified AWS account credentials and
     * client configuration options.
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
     *         AWSMarketplaceMeteringClient client = new AWSMarketplaceMeteringClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSMarketplaceMetering (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSMarketplaceMeteringClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering using the specified AWS account credentials
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
     *         AWSMarketplaceMeteringClient client = new AWSMarketplaceMeteringClient(AWSMobileClient
     *                 .getInstance());
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
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering using the specified AWS account credentials
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
     *         AWSMarketplaceMeteringClient client = new AWSMarketplaceMeteringClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSMarketplaceMetering (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSMarketplaceMetering (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSMarketplaceMetering using the specified AWS account credentials
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
     *         AWSMarketplaceMeteringClient client = new AWSMarketplaceMeteringClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSMarketplaceMetering (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new CustomerNotEntitledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DisabledApiExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExpiredTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServiceErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCustomerIdentifierExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEndpointRegionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidProductCodeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPublicKeyVersionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRegionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidUsageDimensionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PlatformNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TimestampOutOfBoundsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("metering.marketplace.us-east-1.amazonaws.com");
        this.endpointPrefix = "metering.marketplace";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/metering.marketplace/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/metering.marketplace/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * BatchMeterUsage is called from a SaaS application listed on the AWS
     * Marketplace to post metering records for a set of customers.
     * </p>
     * <p>
     * For identical requests, the API is idempotent; requests can be retried
     * with the same records or a subset of the input records.
     * </p>
     * <p>
     * Every request to BatchMeterUsage is for one product. If you need to meter
     * usage for multiple products, you must make multiple calls to
     * BatchMeterUsage.
     * </p>
     * <p>
     * BatchMeterUsage can process up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param batchMeterUsageRequest <p>
     *            A BatchMeterUsageRequest contains UsageRecords, which indicate
     *            quantities of usage within your application.
     *            </p>
     * @return batchMeterUsageResult The response from the BatchMeterUsage
     *         service method, as returned by AWSMarketplace Metering.
     * @throws InternalServiceErrorException
     * @throws InvalidProductCodeException
     * @throws InvalidUsageDimensionException
     * @throws InvalidCustomerIdentifierException
     * @throws TimestampOutOfBoundsException
     * @throws ThrottlingException
     * @throws DisabledApiException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public BatchMeterUsageResult batchMeterUsage(BatchMeterUsageRequest batchMeterUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchMeterUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchMeterUsageRequest> request = null;
        Response<BatchMeterUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchMeterUsageRequestMarshaller().marshall(batchMeterUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchMeterUsageResult, JsonUnmarshallerContext> unmarshaller = new BatchMeterUsageResultJsonUnmarshaller();
            JsonResponseHandler<BatchMeterUsageResult> responseHandler = new JsonResponseHandler<BatchMeterUsageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is
     * idempotent. It simply returns the metering record ID.
     * </p>
     * <p>
     * MeterUsage is authenticated on the buyer's AWS account using credentials
     * from the EC2 instance, ECS task, or EKS pod.
     * </p>
     * 
     * @param meterUsageRequest
     * @return meterUsageResult The response from the MeterUsage service method,
     *         as returned by AWSMarketplace Metering.
     * @throws InternalServiceErrorException
     * @throws InvalidProductCodeException
     * @throws InvalidUsageDimensionException
     * @throws InvalidEndpointRegionException
     * @throws TimestampOutOfBoundsException
     * @throws DuplicateRequestException
     * @throws ThrottlingException
     * @throws CustomerNotEntitledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public MeterUsageResult meterUsage(MeterUsageRequest meterUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(meterUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MeterUsageRequest> request = null;
        Response<MeterUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MeterUsageRequestMarshaller().marshall(meterUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MeterUsageResult, JsonUnmarshallerContext> unmarshaller = new MeterUsageResultJsonUnmarshaller();
            JsonResponseHandler<MeterUsageResult> responseHandler = new JsonResponseHandler<MeterUsageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Paid container software products sold through AWS Marketplace must
     * integrate with the AWS Marketplace Metering Service and call the
     * RegisterUsage operation for software entitlement and metering. Free and
     * BYOL products for Amazon ECS or Amazon EKS aren't required to call
     * RegisterUsage, but you may choose to do so if you would like to receive
     * usage data in your seller reports. The sections below explain the
     * behavior of RegisterUsage. RegisterUsage performs two primary functions:
     * metering and entitlement.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Entitlement</i>: RegisterUsage allows you to verify that the customer
     * running your paid software is subscribed to your product on AWS
     * Marketplace, enabling you to guard against unauthorized use. Your
     * container image that integrates with RegisterUsage is only required to
     * guard against unauthorized use at container startup, as such a
     * CustomerNotSubscribedException/PlatformNotSupportedException will only be
     * thrown on the initial call to RegisterUsage. Subsequent calls from the
     * same Amazon ECS task instance (e.g. task-id) or Amazon EKS pod will not
     * throw a CustomerNotSubscribedException, even if the customer unsubscribes
     * while the Amazon ECS task or Amazon EKS pod is still running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Metering</i>: RegisterUsage meters software use per ECS task, per
     * hour, or per pod for Amazon EKS with usage prorated to the second. A
     * minimum of 1 minute of usage applies to tasks that are short lived. For
     * example, if a customer has a 10 node Amazon ECS or Amazon EKS cluster and
     * a service configured as a Daemon Set, then Amazon ECS or Amazon EKS will
     * launch a task on all 10 cluster nodes and the customer will be charged:
     * (10 * hourly_rate). Metering for software use is automatically handled by
     * the AWS Marketplace Metering Control Plane -- your software is not
     * required to perform any metering specific actions, other than call
     * RegisterUsage once for metering of software use to commence. The AWS
     * Marketplace Metering Control Plane will also continue to bill customers
     * for running ECS tasks and Amazon EKS pods, regardless of the customers
     * subscription state, removing the need for your software to perform
     * entitlement checks at runtime.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerUsageRequest
     * @return registerUsageResult The response from the RegisterUsage service
     *         method, as returned by AWSMarketplace Metering.
     * @throws InvalidProductCodeException
     * @throws InvalidRegionException
     * @throws InvalidPublicKeyVersionException
     * @throws PlatformNotSupportedException
     * @throws CustomerNotEntitledException
     * @throws ThrottlingException
     * @throws InternalServiceErrorException
     * @throws DisabledApiException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public RegisterUsageResult registerUsage(RegisterUsageRequest registerUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterUsageRequest> request = null;
        Response<RegisterUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterUsageRequestMarshaller().marshall(registerUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterUsageResult, JsonUnmarshallerContext> unmarshaller = new RegisterUsageResultJsonUnmarshaller();
            JsonResponseHandler<RegisterUsageResult> responseHandler = new JsonResponseHandler<RegisterUsageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * ResolveCustomer is called by a SaaS application during the registration
     * process. When a buyer visits your website during the registration
     * process, the buyer submits a registration token through their browser.
     * The registration token is resolved through this API to obtain a
     * CustomerIdentifier and product code.
     * </p>
     * 
     * @param resolveCustomerRequest <p>
     *            Contains input to the ResolveCustomer operation.
     *            </p>
     * @return resolveCustomerResult The response from the ResolveCustomer
     *         service method, as returned by AWSMarketplace Metering.
     * @throws InvalidTokenException
     * @throws ExpiredTokenException
     * @throws ThrottlingException
     * @throws InternalServiceErrorException
     * @throws DisabledApiException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ResolveCustomerResult resolveCustomer(ResolveCustomerRequest resolveCustomerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resolveCustomerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveCustomerRequest> request = null;
        Response<ResolveCustomerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveCustomerRequestMarshaller().marshall(resolveCustomerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResolveCustomerResult, JsonUnmarshallerContext> unmarshaller = new ResolveCustomerResultJsonUnmarshaller();
            JsonResponseHandler<ResolveCustomerResult> responseHandler = new JsonResponseHandler<ResolveCustomerResult>(
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
