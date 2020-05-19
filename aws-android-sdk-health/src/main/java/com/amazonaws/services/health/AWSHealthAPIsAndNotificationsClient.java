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

package com.amazonaws.services.health;

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

import com.amazonaws.services.health.model.*;
import com.amazonaws.services.health.model.transform.*;

/**
 * Client for accessing AWS Health APIs and Notifications. All service calls
 * made using this client are blocking, and will not return until the service
 * call completes.
 * <p>
 * <fullname>AWS Health</fullname>
 * <p>
 * The AWS Health API provides programmatic access to the AWS Health information
 * that is presented in the <a href="https://phd.aws.amazon.com/phd/home#/">AWS
 * Personal Health Dashboard</a>. You can get information about events that
 * affect your AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEvents</a>: Summary information about events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetails</a>: Detailed information about one or more events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntities</a>: Information about AWS resources that are
 * affected by one or more events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, these operations provide information about event types and
 * summary counts of events or affected entities:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventTypes</a>: Information about the kinds of events that AWS
 * Health tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventAggregates</a>: A count of the number of events that meet
 * specified criteria.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEntityAggregates</a>: A count of the number of affected entities
 * that meet specified criteria.
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS Health integrates with AWS Organizations to provide a centralized view of
 * AWS Health events across all accounts in your organization.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventsForOrganization</a>: Summary information about events across
 * the organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedAccountsForOrganization</a>: List of accounts in your
 * organization impacted by an event.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetailsForOrganization</a>: Detailed information about events
 * in your organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntitiesForOrganization</a>: Information about AWS
 * resources in your organization that are affected by events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use the following operations to enable or disable AWS Health from
 * working with AWS Organizations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>EnableHealthServiceAccessForOrganization</a>: Enables AWS Health to work
 * with AWS Organizations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisableHealthServiceAccessForOrganization</a>: Disables AWS Health from
 * working with AWS Organizations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeHealthServiceStatusForOrganization</a>: Status information about
 * enabling or disabling AWS Health from working with AWS Organizations.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Health API requires a Business or Enterprise support plan from <a
 * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>. Calling the
 * Health API from an account that does not have a Business or Enterprise
 * support plan causes a <code>SubscriptionRequiredException</code>.
 * </p>
 * <p>
 * For authentication of requests, AWS Health uses the <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See the <a
 * href="https://docs.aws.amazon.com/health/latest/ug/what-is-aws-health.html"
 * >AWS Health User Guide</a> for information about how to use the API.
 * </p>
 * <p>
 * <b>Service Endpoint</b>
 * </p>
 * <p>
 * The HTTP endpoint for the AWS Health API is:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://health.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
public class AWSHealthAPIsAndNotificationsClient extends AmazonWebServiceClient implements
        AWSHealthAPIsAndNotifications {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Health APIs and Notifications
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications. A credentials provider chain will be used
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
    public AWSHealthAPIsAndNotificationsClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications. A credentials provider chain will be used
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
     *            how this client connects to AWSHealthAPIsAndNotifications (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSHealthAPIsAndNotificationsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications using the specified AWS account
     * credentials.
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
     *         AWSHealthAPIsAndNotificationsClient client = new AWSHealthAPIsAndNotificationsClient(
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
    public AWSHealthAPIsAndNotificationsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications using the specified AWS account credentials
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
     *         AWSHealthAPIsAndNotificationsClient client = new AWSHealthAPIsAndNotificationsClient(
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
     *            how this client connects to AWSHealthAPIsAndNotifications (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSHealthAPIsAndNotificationsClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications using the specified AWS account credentials
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
     *         AWSHealthAPIsAndNotificationsClient client = new AWSHealthAPIsAndNotificationsClient(
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
    public AWSHealthAPIsAndNotificationsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications using the specified AWS account credentials
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
     *         AWSHealthAPIsAndNotificationsClient client = new AWSHealthAPIsAndNotificationsClient(
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
     *            how this client connects to AWSHealthAPIsAndNotifications (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSHealthAPIsAndNotificationsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSHealthAPIsAndNotifications (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSHealthAPIsAndNotificationsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSHealthAPIsAndNotifications using the specified AWS account credentials
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
     *         AWSHealthAPIsAndNotificationsClient client = new AWSHealthAPIsAndNotificationsClient(
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
     *            how this client connects to AWSHealthAPIsAndNotifications (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSHealthAPIsAndNotificationsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPaginationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedLocaleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("health.us-east-1.amazonaws.com");
        this.endpointPrefix = "health";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/health/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/health/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Returns a list of accounts in the organization from AWS Organizations
     * that are affected by the provided event.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to
     * work with AWS Organizations. To do this, call the
     * <a>EnableHealthServiceAccessForOrganization</a> operation from your
     * organization's master account.
     * </p>
     * 
     * @param describeAffectedAccountsForOrganizationRequest
     * @return describeAffectedAccountsForOrganizationResult The response from
     *         the DescribeAffectedAccountsForOrganization service method, as
     *         returned by AWS Health APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeAffectedAccountsForOrganizationResult describeAffectedAccountsForOrganization(
            DescribeAffectedAccountsForOrganizationRequest describeAffectedAccountsForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAffectedAccountsForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAffectedAccountsForOrganizationRequest> request = null;
        Response<DescribeAffectedAccountsForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAffectedAccountsForOrganizationRequestMarshaller()
                        .marshall(describeAffectedAccountsForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAffectedAccountsForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeAffectedAccountsForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAffectedAccountsForOrganizationResult> responseHandler = new JsonResponseHandler<DescribeAffectedAccountsForOrganizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of entities that have been affected by the specified
     * events, based on the specified filter criteria. Entities can refer to
     * individual customer resources, groups of customer resources, or any other
     * construct, depending on the AWS service. Events that have impact beyond
     * that of the affected entities, or where the extent of impact is unknown,
     * include at least one entity indicating this.
     * </p>
     * <p>
     * At least one event ARN is required. Results are sorted by the
     * <code>lastUpdatedTime</code> of the entity, starting with the most
     * recent.
     * </p>
     * 
     * @param describeAffectedEntitiesRequest
     * @return describeAffectedEntitiesResult The response from the
     *         DescribeAffectedEntities service method, as returned by AWS
     *         Health APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeAffectedEntitiesResult describeAffectedEntities(
            DescribeAffectedEntitiesRequest describeAffectedEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAffectedEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAffectedEntitiesRequest> request = null;
        Response<DescribeAffectedEntitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAffectedEntitiesRequestMarshaller()
                        .marshall(describeAffectedEntitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAffectedEntitiesResult, JsonUnmarshallerContext> unmarshaller = new DescribeAffectedEntitiesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAffectedEntitiesResult> responseHandler = new JsonResponseHandler<DescribeAffectedEntitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of entities that have been affected by one or more events
     * for one or more accounts in your organization in AWS Organizations, based
     * on the filter criteria. Entities can refer to individual customer
     * resources, groups of customer resources, or any other construct,
     * depending on the AWS service.
     * </p>
     * <p>
     * At least one event ARN and account ID are required. Results are sorted by
     * the <code>lastUpdatedTime</code> of the entity, starting with the most
     * recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to
     * work with AWS Organizations. To do this, call the
     * <a>EnableHealthServiceAccessForOrganization</a> operation from your
     * organization's master account.
     * </p>
     * 
     * @param describeAffectedEntitiesForOrganizationRequest
     * @return describeAffectedEntitiesForOrganizationResult The response from
     *         the DescribeAffectedEntitiesForOrganization service method, as
     *         returned by AWS Health APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeAffectedEntitiesForOrganizationResult describeAffectedEntitiesForOrganization(
            DescribeAffectedEntitiesForOrganizationRequest describeAffectedEntitiesForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAffectedEntitiesForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAffectedEntitiesForOrganizationRequest> request = null;
        Response<DescribeAffectedEntitiesForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAffectedEntitiesForOrganizationRequestMarshaller()
                        .marshall(describeAffectedEntitiesForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAffectedEntitiesForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeAffectedEntitiesForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAffectedEntitiesForOrganizationResult> responseHandler = new JsonResponseHandler<DescribeAffectedEntitiesForOrganizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the number of entities that are affected by each of the specified
     * events. If no events are specified, the counts of all affected entities
     * are returned.
     * </p>
     * 
     * @param describeEntityAggregatesRequest
     * @return describeEntityAggregatesResult The response from the
     *         DescribeEntityAggregates service method, as returned by AWS
     *         Health APIs and Notifications.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEntityAggregatesResult describeEntityAggregates(
            DescribeEntityAggregatesRequest describeEntityAggregatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEntityAggregatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntityAggregatesRequest> request = null;
        Response<DescribeEntityAggregatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntityAggregatesRequestMarshaller()
                        .marshall(describeEntityAggregatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEntityAggregatesResult, JsonUnmarshallerContext> unmarshaller = new DescribeEntityAggregatesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEntityAggregatesResult> responseHandler = new JsonResponseHandler<DescribeEntityAggregatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the number of events of each event type (issue, scheduled change,
     * and account notification). If no filter is specified, the counts of all
     * events in each category are returned.
     * </p>
     * 
     * @param describeEventAggregatesRequest
     * @return describeEventAggregatesResult The response from the
     *         DescribeEventAggregates service method, as returned by AWS Health
     *         APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEventAggregatesResult describeEventAggregates(
            DescribeEventAggregatesRequest describeEventAggregatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventAggregatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventAggregatesRequest> request = null;
        Response<DescribeEventAggregatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventAggregatesRequestMarshaller()
                        .marshall(describeEventAggregatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventAggregatesResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventAggregatesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventAggregatesResult> responseHandler = new JsonResponseHandler<DescribeEventAggregatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns detailed information about one or more specified events.
     * Information includes standard event data (region, service, and so on, as
     * returned by <a>DescribeEvents</a>), a detailed event description, and
     * possible additional metadata that depends upon the nature of the event.
     * Affected entities are not included; to retrieve those, use the
     * <a>DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event cannot be retrieved, an error message is returned
     * for that event.
     * </p>
     * 
     * @param describeEventDetailsRequest
     * @return describeEventDetailsResult The response from the
     *         DescribeEventDetails service method, as returned by AWS Health
     *         APIs and Notifications.
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEventDetailsResult describeEventDetails(
            DescribeEventDetailsRequest describeEventDetailsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventDetailsRequest> request = null;
        Response<DescribeEventDetailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventDetailsRequestMarshaller()
                        .marshall(describeEventDetailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventDetailsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventDetailsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventDetailsResult> responseHandler = new JsonResponseHandler<DescribeEventDetailsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns detailed information about one or more specified events for one
     * or more accounts in your organization. Information includes standard
     * event data (Region, service, and so on, as returned by
     * <a>DescribeEventsForOrganization</a>, a detailed event description, and
     * possible additional metadata that depends upon the nature of the event.
     * Affected entities are not included; to retrieve those, use the
     * <a>DescribeAffectedEntitiesForOrganization</a> operation.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to
     * work with AWS Organizations. To do this, call the
     * <a>EnableHealthServiceAccessForOrganization</a> operation from your
     * organization's master account.
     * </p>
     * 
     * @param describeEventDetailsForOrganizationRequest
     * @return describeEventDetailsForOrganizationResult The response from the
     *         DescribeEventDetailsForOrganization service method, as returned
     *         by AWS Health APIs and Notifications.
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEventDetailsForOrganizationResult describeEventDetailsForOrganization(
            DescribeEventDetailsForOrganizationRequest describeEventDetailsForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventDetailsForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventDetailsForOrganizationRequest> request = null;
        Response<DescribeEventDetailsForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventDetailsForOrganizationRequestMarshaller()
                        .marshall(describeEventDetailsForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventDetailsForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventDetailsForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventDetailsForOrganizationResult> responseHandler = new JsonResponseHandler<DescribeEventDetailsForOrganizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the event types that meet the specified filter criteria. If no
     * filter criteria are specified, all event types are returned, in no
     * particular order.
     * </p>
     * 
     * @param describeEventTypesRequest
     * @return describeEventTypesResult The response from the DescribeEventTypes
     *         service method, as returned by AWS Health APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEventTypesResult describeEventTypes(
            DescribeEventTypesRequest describeEventTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTypesRequest> request = null;
        Response<DescribeEventTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTypesRequestMarshaller()
                        .marshall(describeEventTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventTypesResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventTypesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventTypesResult> responseHandler = new JsonResponseHandler<DescribeEventTypesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about events that meet the specified filter criteria.
     * Events are returned in a summary form and do not include the detailed
     * description, any additional metadata that depends on the event type, or
     * any affected resources. To retrieve that information, use the
     * <a>DescribeEventDetails</a> and <a>DescribeAffectedEntities</a>
     * operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are
     * sorted by <code>lastModifiedTime</code>, starting with the most recent.
     * </p>
     * 
     * @param describeEventsRequest
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by AWS Health APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventsResult> responseHandler = new JsonResponseHandler<DescribeEventsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about events across your organization in AWS
     * Organizations, meeting the specified filter criteria. Events are returned
     * in a summary form and do not include the accounts impacted, detailed
     * description, any additional metadata that depends on the event type, or
     * any affected resources. To retrieve that information, use the
     * <a>DescribeAffectedAccountsForOrganization</a>,
     * <a>DescribeEventDetailsForOrganization</a>, and
     * <a>DescribeAffectedEntitiesForOrganization</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events across your organization
     * are returned. Results are sorted by <code>lastModifiedTime</code>,
     * starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable Health to work
     * with AWS Organizations. To do this, call the
     * <a>EnableHealthServiceAccessForOrganization</a> operation from your
     * organization's master account.
     * </p>
     * 
     * @param describeEventsForOrganizationRequest
     * @return describeEventsForOrganizationResult The response from the
     *         DescribeEventsForOrganization service method, as returned by AWS
     *         Health APIs and Notifications.
     * @throws InvalidPaginationTokenException
     * @throws UnsupportedLocaleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeEventsForOrganizationResult describeEventsForOrganization(
            DescribeEventsForOrganizationRequest describeEventsForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventsForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsForOrganizationRequest> request = null;
        Response<DescribeEventsForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsForOrganizationRequestMarshaller()
                        .marshall(describeEventsForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventsForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventsForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventsForOrganizationResult> responseHandler = new JsonResponseHandler<DescribeEventsForOrganizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation provides status information on enabling or disabling AWS
     * Health to work with your organization. To call this operation, you must
     * sign in as an IAM user, assume an IAM role, or sign in as the root user
     * (not recommended) in the organization's master account.
     * </p>
     * 
     * @param describeHealthServiceStatusForOrganizationRequest
     * @return describeHealthServiceStatusForOrganizationResult The response
     *         from the DescribeHealthServiceStatusForOrganization service
     *         method, as returned by AWS Health APIs and Notifications.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public DescribeHealthServiceStatusForOrganizationResult describeHealthServiceStatusForOrganization(
            DescribeHealthServiceStatusForOrganizationRequest describeHealthServiceStatusForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHealthServiceStatusForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHealthServiceStatusForOrganizationRequest> request = null;
        Response<DescribeHealthServiceStatusForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHealthServiceStatusForOrganizationRequestMarshaller()
                        .marshall(describeHealthServiceStatusForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeHealthServiceStatusForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeHealthServiceStatusForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHealthServiceStatusForOrganizationResult> responseHandler = new JsonResponseHandler<DescribeHealthServiceStatusForOrganizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Calling this operation disables Health from working with AWS
     * Organizations. This does not remove the Service Linked Role (SLR) from
     * the the master account in your organization. Use the IAM console, API, or
     * AWS CLI to remove the SLR if desired. To call this operation, you must
     * sign in as an IAM user, assume an IAM role, or sign in as the root user
     * (not recommended) in the organization's master account.
     * </p>
     * 
     * @param disableHealthServiceAccessForOrganizationRequest
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public void disableHealthServiceAccessForOrganization(
            DisableHealthServiceAccessForOrganizationRequest disableHealthServiceAccessForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableHealthServiceAccessForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableHealthServiceAccessForOrganizationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableHealthServiceAccessForOrganizationRequestMarshaller()
                        .marshall(disableHealthServiceAccessForOrganizationRequest);
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
     * Calling this operation enables AWS Health to work with AWS Organizations.
     * This applies a Service Linked Role (SLR) to the master account in the
     * organization. To learn more about the steps in this process, visit
     * enabling service access for AWS Health in AWS Organizations. To call this
     * operation, you must sign in as an IAM user, assume an IAM role, or sign
     * in as the root user (not recommended) in the organization's master
     * account.
     * </p>
     * 
     * @param enableHealthServiceAccessForOrganizationRequest
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Health APIs and Notifications indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    public void enableHealthServiceAccessForOrganization(
            EnableHealthServiceAccessForOrganizationRequest enableHealthServiceAccessForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableHealthServiceAccessForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableHealthServiceAccessForOrganizationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableHealthServiceAccessForOrganizationRequestMarshaller()
                        .marshall(enableHealthServiceAccessForOrganizationRequest);
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
