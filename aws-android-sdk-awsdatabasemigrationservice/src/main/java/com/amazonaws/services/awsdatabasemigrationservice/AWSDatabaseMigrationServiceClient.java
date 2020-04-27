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

package com.amazonaws.services.awsdatabasemigrationservice;

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

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.services.awsdatabasemigrationservice.model.transform.*;

/**
 * Client for accessing AWS Database Migration Service. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>AWS Database Migration Service</fullname>
 * <p>
 * AWS Database Migration Service (AWS DMS) can migrate your data to and from
 * the most widely used commercial and open-source databases such as Oracle,
 * PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
 * MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports
 * homogeneous migrations such as Oracle to Oracle, as well as heterogeneous
 * migrations between different database platforms, such as Oracle to MySQL or
 * SQL Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about AWS DMS, see <a
 * href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What Is
 * AWS Database Migration Service?</a> in the <i>AWS Database Migration User
 * Guide.</i>
 * </p>
 */
public class AWSDatabaseMigrationServiceClient extends AmazonWebServiceClient implements
        AWSDatabaseMigrationService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Database Migration Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService. A credentials provider chain will be used
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
    public AWSDatabaseMigrationServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService. A credentials provider chain will be used
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
     *            how this client connects to AWSDatabaseMigrationService (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService using the specified AWS account credentials.
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
     *         AWSDatabaseMigrationServiceClient client = new AWSDatabaseMigrationServiceClient(
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
    public AWSDatabaseMigrationServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService using the specified AWS account credentials
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
     *         AWSDatabaseMigrationServiceClient client = new AWSDatabaseMigrationServiceClient(
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
     *            how this client connects to AWSDatabaseMigrationService (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSDatabaseMigrationServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService using the specified AWS account credentials
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
     *         AWSDatabaseMigrationServiceClient client = new AWSDatabaseMigrationServiceClient(
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
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService using the specified AWS account credentials
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
     *         AWSDatabaseMigrationServiceClient client = new AWSDatabaseMigrationServiceClient(
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
     *            how this client connects to AWSDatabaseMigrationService (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSDatabaseMigrationService (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDatabaseMigrationService using the specified AWS account credentials
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
     *         AWSDatabaseMigrationServiceClient client = new AWSDatabaseMigrationServiceClient(
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
     *            how this client connects to AWSDatabaseMigrationService (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InsufficientResourceCapacityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCertificateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSAccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSDisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSKeyNotAccessibleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new ReplicationSubnetGroupDoesNotCoverEnoughAZsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SNSInvalidTopicExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SNSNoAuthorizationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new StorageQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UpgradeDependencyFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("dms.us-east-1.amazonaws.com");
        this.endpointPrefix = "dms";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awsdatabasemigrationservice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awsdatabasemigrationservice/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds metadata tags to an AWS DMS resource, including replication
     * instance, endpoint, security group, and migration task. These tags can
     * also be used with cost allocation reporting to track cost associated with
     * DMS resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest <p>
     *            Associates a set of tags with an AWS DMS resource.
     *            </p>
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
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
     * Applies a pending maintenance action to a resource (for example, to a
     * replication instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest <p/>
     * @return applyPendingMaintenanceActionResult The response from the
     *         ApplyPendingMaintenanceAction service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ApplyPendingMaintenanceActionResult applyPendingMaintenanceAction(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(applyPendingMaintenanceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplyPendingMaintenanceActionRequest> request = null;
        Response<ApplyPendingMaintenanceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApplyPendingMaintenanceActionRequestMarshaller()
                        .marshall(applyPendingMaintenanceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ApplyPendingMaintenanceActionResult, JsonUnmarshallerContext> unmarshaller = new ApplyPendingMaintenanceActionResultJsonUnmarshaller();
            JsonResponseHandler<ApplyPendingMaintenanceActionResult> responseHandler = new JsonResponseHandler<ApplyPendingMaintenanceActionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest <p/>
     * @return createEndpointResult The response from the CreateEndpoint service
     *         method, as returned by AWS Database Migration Service.
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceQuotaExceededException
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointRequest> request = null;
        Response<CreateEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointRequestMarshaller().marshall(createEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEndpointResult, JsonUnmarshallerContext> unmarshaller = new CreateEndpointResultJsonUnmarshaller();
            JsonResponseHandler<CreateEndpointResult> responseHandler = new JsonResponseHandler<CreateEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an AWS DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to
     * be notified of, provide a list of AWS DMS source IDs (
     * <code>SourceIds</code>) that triggers the events, and provide a list of
     * event categories (<code>EventCategories</code>) for events you want to be
     * notified of. If you specify both the <code>SourceType</code> and
     * <code>SourceIds</code>, such as
     * <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of
     * all the replication instance events for the specified source. If you
     * specify a <code>SourceType</code> but don't specify a
     * <code>SourceIdentifier</code>, you receive notice of the events for that
     * source type for all your AWS DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be
     * notified of events generated from all AWS DMS sources belonging to your
     * customer account.
     * </p>
     * <p>
     * For more information about AWS DMS events, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
     * >Working with Events and Notifications</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     * 
     * @param createEventSubscriptionRequest <p/>
     * @return createEventSubscriptionResult The response from the
     *         CreateEventSubscription service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceQuotaExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws KMSAccessDeniedException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateEventSubscriptionResult createEventSubscription(
            CreateEventSubscriptionRequest createEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSubscriptionRequest> request = null;
        Response<CreateEventSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSubscriptionRequestMarshaller()
                        .marshall(createEventSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEventSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new CreateEventSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<CreateEventSubscriptionResult> responseHandler = new JsonResponseHandler<CreateEventSubscriptionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * <p>
     * AWS DMS requires that your account have certain roles with appropriate
     * permissions before you can create a replication instance. For information
     * on the required roles, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.APIRole.html"
     * >Creating the IAM Roles to Use With the AWS CLI and AWS DMS API</a>. For
     * information on the required permissions, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.IAMPermissions.html"
     * >IAM Permissions Needed to Use AWS DMS</a>.
     * </p>
     * 
     * @param createReplicationInstanceRequest <p/>
     * @return createReplicationInstanceResult The response from the
     *         CreateReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceAlreadyExistsException
     * @throws InsufficientResourceCapacityException
     * @throws ResourceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws ResourceNotFoundException
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidResourceStateException
     * @throws InvalidSubnetException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateReplicationInstanceResult createReplicationInstance(
            CreateReplicationInstanceRequest createReplicationInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationInstanceRequest> request = null;
        Response<CreateReplicationInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationInstanceRequestMarshaller()
                        .marshall(createReplicationInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateReplicationInstanceResult, JsonUnmarshallerContext> unmarshaller = new CreateReplicationInstanceResultJsonUnmarshaller();
            JsonResponseHandler<CreateReplicationInstanceResult> responseHandler = new JsonResponseHandler<CreateReplicationInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a replication subnet group given a list of the subnet IDs in a
     * VPC.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest <p/>
     * @return createReplicationSubnetGroupResult The response from the
     *         CreateReplicationSubnetGroup service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws ResourceQuotaExceededException
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateReplicationSubnetGroupResult createReplicationSubnetGroup(
            CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationSubnetGroupRequest> request = null;
        Response<CreateReplicationSubnetGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationSubnetGroupRequestMarshaller()
                        .marshall(createReplicationSubnetGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateReplicationSubnetGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateReplicationSubnetGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateReplicationSubnetGroupResult> responseHandler = new JsonResponseHandler<CreateReplicationSubnetGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest <p/>
     * @return createReplicationTaskResult The response from the
     *         CreateReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws AccessDeniedException
     * @throws InvalidResourceStateException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateReplicationTaskResult createReplicationTask(
            CreateReplicationTaskRequest createReplicationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationTaskRequest> request = null;
        Response<CreateReplicationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationTaskRequestMarshaller()
                        .marshall(createReplicationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateReplicationTaskResult, JsonUnmarshallerContext> unmarshaller = new CreateReplicationTaskResultJsonUnmarshaller();
            JsonResponseHandler<CreateReplicationTaskResult> responseHandler = new JsonResponseHandler<CreateReplicationTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return deleteCertificateResult The response from the DeleteCertificate
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteCertificateResult deleteCertificate(
            DeleteCertificateRequest deleteCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<DeleteCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestMarshaller()
                        .marshall(deleteCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCertificateResult, JsonUnmarshallerContext> unmarshaller = new DeleteCertificateResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCertificateResult> responseHandler = new JsonResponseHandler<DeleteCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the connection between a replication instance and an endpoint.
     * </p>
     * 
     * @param deleteConnectionRequest <p/>
     * @return deleteConnectionResult The response from the DeleteConnection
     *         service method, as returned by AWS Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestMarshaller().marshall(deleteConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteConnectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteConnectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteConnectionResult> responseHandler = new JsonResponseHandler<DeleteConnectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified endpoint.
     * </p>
     * <note>
     * <p>
     * All tasks associated with the endpoint must be deleted before you can
     * delete the endpoint.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteEndpointRequest <p/>
     * @return deleteEndpointResult The response from the DeleteEndpoint service
     *         method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestMarshaller().marshall(deleteEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEndpointResult, JsonUnmarshallerContext> unmarshaller = new DeleteEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEndpointResult> responseHandler = new JsonResponseHandler<DeleteEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an AWS DMS event subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest <p/>
     * @return deleteEventSubscriptionResult The response from the
     *         DeleteEventSubscription service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteEventSubscriptionResult deleteEventSubscription(
            DeleteEventSubscriptionRequest deleteEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSubscriptionRequest> request = null;
        Response<DeleteEventSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSubscriptionRequestMarshaller()
                        .marshall(deleteEventSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEventSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new DeleteEventSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEventSubscriptionResult> responseHandler = new JsonResponseHandler<DeleteEventSubscriptionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified replication instance.
     * </p>
     * <note>
     * <p>
     * You must delete any migration tasks that are associated with the
     * replication instance before you can delete it.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteReplicationInstanceRequest <p/>
     * @return deleteReplicationInstanceResult The response from the
     *         DeleteReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteReplicationInstanceResult deleteReplicationInstance(
            DeleteReplicationInstanceRequest deleteReplicationInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationInstanceRequest> request = null;
        Response<DeleteReplicationInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationInstanceRequestMarshaller()
                        .marshall(deleteReplicationInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteReplicationInstanceResult, JsonUnmarshallerContext> unmarshaller = new DeleteReplicationInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteReplicationInstanceResult> responseHandler = new JsonResponseHandler<DeleteReplicationInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * 
     * @param deleteReplicationSubnetGroupRequest <p/>
     * @return deleteReplicationSubnetGroupResult The response from the
     *         DeleteReplicationSubnetGroup service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteReplicationSubnetGroupResult deleteReplicationSubnetGroup(
            DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationSubnetGroupRequest> request = null;
        Response<DeleteReplicationSubnetGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationSubnetGroupRequestMarshaller()
                        .marshall(deleteReplicationSubnetGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteReplicationSubnetGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteReplicationSubnetGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteReplicationSubnetGroupResult> responseHandler = new JsonResponseHandler<DeleteReplicationSubnetGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified replication task.
     * </p>
     * 
     * @param deleteReplicationTaskRequest <p/>
     * @return deleteReplicationTaskResult The response from the
     *         DeleteReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteReplicationTaskResult deleteReplicationTask(
            DeleteReplicationTaskRequest deleteReplicationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationTaskRequest> request = null;
        Response<DeleteReplicationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationTaskRequestMarshaller()
                        .marshall(deleteReplicationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteReplicationTaskResult, JsonUnmarshallerContext> unmarshaller = new DeleteReplicationTaskResultJsonUnmarshaller();
            JsonResponseHandler<DeleteReplicationTaskResult> responseHandler = new JsonResponseHandler<DeleteReplicationTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all of the AWS DMS attributes for a customer account. These
     * attributes include AWS DMS quotas for the account and a unique account
     * identifier in a particular DMS region. DMS quotas include a list of
     * resource quotas supported by the account, such as the number of
     * replication instances allowed. The description for each resource quota,
     * includes the quota name, current usage toward that quota, and the quota's
     * maximum value. DMS uses the unique account identifier to name each
     * artifact used by DMS in the given region.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest <p/>
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by AWS
     *         Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestMarshaller()
                        .marshall(describeAccountAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAccountAttributesResult, JsonUnmarshallerContext> unmarshaller = new DescribeAccountAttributesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAccountAttributesResult> responseHandler = new JsonResponseHandler<DescribeAccountAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a description of the certificate.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return describeCertificatesResult The response from the
     *         DescribeCertificates service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeCertificatesResult describeCertificates(
            DescribeCertificatesRequest describeCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificatesRequest> request = null;
        Response<DescribeCertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificatesRequestMarshaller()
                        .marshall(describeCertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCertificatesResult, JsonUnmarshallerContext> unmarshaller = new DescribeCertificatesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCertificatesResult> responseHandler = new JsonResponseHandler<DescribeCertificatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the status of the connections that have been made between the
     * replication instance and an endpoint. Connections are created when you
     * test an endpoint.
     * </p>
     * 
     * @param describeConnectionsRequest <p/>
     * @return describeConnectionsResult The response from the
     *         DescribeConnections service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest describeConnectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsRequest> request = null;
        Response<DescribeConnectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsRequestMarshaller()
                        .marshall(describeConnectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConnectionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConnectionsResult> responseHandler = new JsonResponseHandler<DescribeConnectionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the type of endpoints available.
     * </p>
     * 
     * @param describeEndpointTypesRequest <p/>
     * @return describeEndpointTypesResult The response from the
     *         DescribeEndpointTypes service method, as returned by AWS Database
     *         Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEndpointTypesResult describeEndpointTypes(
            DescribeEndpointTypesRequest describeEndpointTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointTypesRequest> request = null;
        Response<DescribeEndpointTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointTypesRequestMarshaller()
                        .marshall(describeEndpointTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointTypesResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointTypesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointTypesResult> responseHandler = new JsonResponseHandler<DescribeEndpointTypesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the endpoints for your account in the current
     * region.
     * </p>
     * 
     * @param describeEndpointsRequest <p/>
     * @return describeEndpointsResult The response from the DescribeEndpoints
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEndpointsResult describeEndpoints(
            DescribeEndpointsRequest describeEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestMarshaller()
                        .marshall(describeEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointsResult> responseHandler = new JsonResponseHandler<DescribeEndpointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists categories for all event source types, or, if specified, for a
     * specified source type. You can see a list of the event categories and
     * source types in <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
     * >Working with Events and Notifications</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest <p/>
     * @return describeEventCategoriesResult The response from the
     *         DescribeEventCategories service method, as returned by AWS
     *         Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories(
            DescribeEventCategoriesRequest describeEventCategoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventCategoriesRequest> request = null;
        Response<DescribeEventCategoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventCategoriesRequestMarshaller()
                        .marshall(describeEventCategoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventCategoriesResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventCategoriesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventCategoriesResult> responseHandler = new JsonResponseHandler<DescribeEventCategoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all the event subscriptions for a customer account. The description
     * of a subscription includes <code>SubscriptionName</code>,
     * <code>SNSTopicARN</code>, <code>CustomerID</code>,
     * <code>SourceType</code>, <code>SourceID</code>, <code>CreationTime</code>
     * , and <code>Status</code>.
     * </p>
     * <p>
     * If you specify <code>SubscriptionName</code>, this action lists the
     * description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest <p/>
     * @return describeEventSubscriptionsResult The response from the
     *         DescribeEventSubscriptions service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventSubscriptionsRequest> request = null;
        Response<DescribeEventSubscriptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventSubscriptionsRequestMarshaller()
                        .marshall(describeEventSubscriptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventSubscriptionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventSubscriptionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventSubscriptionsResult> responseHandler = new JsonResponseHandler<DescribeEventSubscriptionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists events for a given source identifier and source type. You can also
     * specify a start and end time. For more information on AWS DMS events, see
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
     * >Working with Events and Notifications</a> in the <i>AWS Database
     * Migration User Guide.</i>
     * </p>
     * 
     * @param describeEventsRequest <p/>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by AWS Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
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
     * Returns information about the replication instance types that can be
     * created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest <p/>
     * @return describeOrderableReplicationInstancesResult The response from the
     *         DescribeOrderableReplicationInstances service method, as returned
     *         by AWS Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrderableReplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableReplicationInstancesRequest> request = null;
        Response<DescribeOrderableReplicationInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrderableReplicationInstancesRequestMarshaller()
                        .marshall(describeOrderableReplicationInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOrderableReplicationInstancesResult, JsonUnmarshallerContext> unmarshaller = new DescribeOrderableReplicationInstancesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOrderableReplicationInstancesResult> responseHandler = new JsonResponseHandler<DescribeOrderableReplicationInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * For internal use only
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest <p/>
     * @return describePendingMaintenanceActionsResult The response from the
     *         DescribePendingMaintenanceActions service method, as returned by
     *         AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePendingMaintenanceActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePendingMaintenanceActionsRequest> request = null;
        Response<DescribePendingMaintenanceActionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePendingMaintenanceActionsRequestMarshaller()
                        .marshall(describePendingMaintenanceActionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePendingMaintenanceActionsResult, JsonUnmarshallerContext> unmarshaller = new DescribePendingMaintenanceActionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribePendingMaintenanceActionsResult> responseHandler = new JsonResponseHandler<DescribePendingMaintenanceActionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest <p/>
     * @return describeRefreshSchemasStatusResult The response from the
     *         DescribeRefreshSchemasStatus service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(
            DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRefreshSchemasStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRefreshSchemasStatusRequest> request = null;
        Response<DescribeRefreshSchemasStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRefreshSchemasStatusRequestMarshaller()
                        .marshall(describeRefreshSchemasStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRefreshSchemasStatusResult, JsonUnmarshallerContext> unmarshaller = new DescribeRefreshSchemasStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRefreshSchemasStatusResult> responseHandler = new JsonResponseHandler<DescribeRefreshSchemasStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the task logs for the specified task.
     * </p>
     * 
     * @param describeReplicationInstanceTaskLogsRequest
     * @return describeReplicationInstanceTaskLogsResult The response from the
     *         DescribeReplicationInstanceTaskLogs service method, as returned
     *         by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReplicationInstanceTaskLogsResult describeReplicationInstanceTaskLogs(
            DescribeReplicationInstanceTaskLogsRequest describeReplicationInstanceTaskLogsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReplicationInstanceTaskLogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationInstanceTaskLogsRequest> request = null;
        Response<DescribeReplicationInstanceTaskLogsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationInstanceTaskLogsRequestMarshaller()
                        .marshall(describeReplicationInstanceTaskLogsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReplicationInstanceTaskLogsResult, JsonUnmarshallerContext> unmarshaller = new DescribeReplicationInstanceTaskLogsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReplicationInstanceTaskLogsResult> responseHandler = new JsonResponseHandler<DescribeReplicationInstanceTaskLogsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about replication instances for your account in the
     * current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest <p/>
     * @return describeReplicationInstancesResult The response from the
     *         DescribeReplicationInstances service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReplicationInstancesResult describeReplicationInstances(
            DescribeReplicationInstancesRequest describeReplicationInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationInstancesRequest> request = null;
        Response<DescribeReplicationInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationInstancesRequestMarshaller()
                        .marshall(describeReplicationInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReplicationInstancesResult, JsonUnmarshallerContext> unmarshaller = new DescribeReplicationInstancesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReplicationInstancesResult> responseHandler = new JsonResponseHandler<DescribeReplicationInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the replication subnet groups.
     * </p>
     * 
     * @param describeReplicationSubnetGroupsRequest <p/>
     * @return describeReplicationSubnetGroupsResult The response from the
     *         DescribeReplicationSubnetGroups service method, as returned by
     *         AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReplicationSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationSubnetGroupsRequest> request = null;
        Response<DescribeReplicationSubnetGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationSubnetGroupsRequestMarshaller()
                        .marshall(describeReplicationSubnetGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReplicationSubnetGroupsResult, JsonUnmarshallerContext> unmarshaller = new DescribeReplicationSubnetGroupsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReplicationSubnetGroupsResult> responseHandler = new JsonResponseHandler<DescribeReplicationSubnetGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the task assessment results from Amazon S3. This action always
     * returns the latest results.
     * </p>
     * 
     * @param describeReplicationTaskAssessmentResultsRequest <p/>
     * @return describeReplicationTaskAssessmentResultsResult The response from
     *         the DescribeReplicationTaskAssessmentResults service method, as
     *         returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReplicationTaskAssessmentResultsResult describeReplicationTaskAssessmentResults(
            DescribeReplicationTaskAssessmentResultsRequest describeReplicationTaskAssessmentResultsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReplicationTaskAssessmentResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTaskAssessmentResultsRequest> request = null;
        Response<DescribeReplicationTaskAssessmentResultsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTaskAssessmentResultsRequestMarshaller()
                        .marshall(describeReplicationTaskAssessmentResultsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReplicationTaskAssessmentResultsResult, JsonUnmarshallerContext> unmarshaller = new DescribeReplicationTaskAssessmentResultsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReplicationTaskAssessmentResultsResult> responseHandler = new JsonResponseHandler<DescribeReplicationTaskAssessmentResultsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about replication tasks for your account in the
     * current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest <p/>
     * @return describeReplicationTasksResult The response from the
     *         DescribeReplicationTasks service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReplicationTasksResult describeReplicationTasks(
            DescribeReplicationTasksRequest describeReplicationTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReplicationTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTasksRequest> request = null;
        Response<DescribeReplicationTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTasksRequestMarshaller()
                        .marshall(describeReplicationTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReplicationTasksResult, JsonUnmarshallerContext> unmarshaller = new DescribeReplicationTasksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReplicationTasksResult> responseHandler = new JsonResponseHandler<DescribeReplicationTasksResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <p/>
     * 
     * @param describeSchemasRequest <p/>
     * @return describeSchemasResult The response from the DescribeSchemas
     *         service method, as returned by AWS Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeSchemasResult describeSchemas(DescribeSchemasRequest describeSchemasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemasRequest> request = null;
        Response<DescribeSchemasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemasRequestMarshaller().marshall(describeSchemasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSchemasResult, JsonUnmarshallerContext> unmarshaller = new DescribeSchemasResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSchemasResult> responseHandler = new JsonResponseHandler<DescribeSchemasResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns table statistics on the database migration task, including table
     * name, rows inserted, rows updated, and rows deleted.
     * </p>
     * <p>
     * Note that the "last updated" column the DMS console only indicates the
     * time that AWS DMS last updated the table statistics record for a table.
     * It does not indicate the time of the last update to the table.
     * </p>
     * 
     * @param describeTableStatisticsRequest <p/>
     * @return describeTableStatisticsResult The response from the
     *         DescribeTableStatistics service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeTableStatisticsResult describeTableStatistics(
            DescribeTableStatisticsRequest describeTableStatisticsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTableStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableStatisticsRequest> request = null;
        Response<DescribeTableStatisticsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableStatisticsRequestMarshaller()
                        .marshall(describeTableStatisticsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTableStatisticsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTableStatisticsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTableStatisticsResult> responseHandler = new JsonResponseHandler<DescribeTableStatisticsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Uploads the specified certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return importCertificateResult The response from the ImportCertificate
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceAlreadyExistsException
     * @throws InvalidCertificateException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ImportCertificateResult importCertificate(
            ImportCertificateRequest importCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCertificateRequest> request = null;
        Response<ImportCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCertificateRequestMarshaller()
                        .marshall(importCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportCertificateResult, JsonUnmarshallerContext> unmarshaller = new ImportCertificateResultJsonUnmarshaller();
            JsonResponseHandler<ImportCertificateResult> responseHandler = new JsonResponseHandler<ImportCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all tags for an AWS DMS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest <p/>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
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
     * Modifies the specified endpoint.
     * </p>
     * 
     * @param modifyEndpointRequest <p/>
     * @return modifyEndpointResult The response from the ModifyEndpoint service
     *         method, as returned by AWS Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws KMSKeyNotAccessibleException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyEndpointResult modifyEndpoint(ModifyEndpointRequest modifyEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEndpointRequest> request = null;
        Response<ModifyEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEndpointRequestMarshaller().marshall(modifyEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyEndpointResult, JsonUnmarshallerContext> unmarshaller = new ModifyEndpointResultJsonUnmarshaller();
            JsonResponseHandler<ModifyEndpointResult> responseHandler = new JsonResponseHandler<ModifyEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies an existing AWS DMS event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest <p/>
     * @return modifyEventSubscriptionResult The response from the
     *         ModifyEventSubscription service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceQuotaExceededException
     * @throws ResourceNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws KMSAccessDeniedException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyEventSubscriptionResult modifyEventSubscription(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEventSubscriptionRequest> request = null;
        Response<ModifyEventSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEventSubscriptionRequestMarshaller()
                        .marshall(modifyEventSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyEventSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new ModifyEventSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<ModifyEventSubscriptionResult> responseHandler = new JsonResponseHandler<ModifyEventSubscriptionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the replication instance to apply new settings. You can change
     * one or more parameters by specifying these parameters and the new values
     * in the request.
     * </p>
     * <p>
     * Some settings are applied during the maintenance window.
     * </p>
     * <p/>
     * 
     * @param modifyReplicationInstanceRequest <p/>
     * @return modifyReplicationInstanceResult The response from the
     *         ModifyReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws InvalidResourceStateException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InsufficientResourceCapacityException
     * @throws StorageQuotaExceededException
     * @throws UpgradeDependencyFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyReplicationInstanceResult modifyReplicationInstance(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationInstanceRequest> request = null;
        Response<ModifyReplicationInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationInstanceRequestMarshaller()
                        .marshall(modifyReplicationInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyReplicationInstanceResult, JsonUnmarshallerContext> unmarshaller = new ModifyReplicationInstanceResultJsonUnmarshaller();
            JsonResponseHandler<ModifyReplicationInstanceResult> responseHandler = new JsonResponseHandler<ModifyReplicationInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * 
     * @param modifyReplicationSubnetGroupRequest <p/>
     * @return modifyReplicationSubnetGroupResult The response from the
     *         ModifyReplicationSubnetGroup service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceQuotaExceededException
     * @throws SubnetAlreadyInUseException
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(
            ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationSubnetGroupRequest> request = null;
        Response<ModifyReplicationSubnetGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationSubnetGroupRequestMarshaller()
                        .marshall(modifyReplicationSubnetGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyReplicationSubnetGroupResult, JsonUnmarshallerContext> unmarshaller = new ModifyReplicationSubnetGroupResultJsonUnmarshaller();
            JsonResponseHandler<ModifyReplicationSubnetGroupResult> responseHandler = new JsonResponseHandler<ModifyReplicationSubnetGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the specified replication task.
     * </p>
     * <p>
     * You can't modify the task endpoints. The task must be stopped before you
     * can modify it.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html"
     * >Working with Migration Tasks</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @param modifyReplicationTaskRequest <p/>
     * @return modifyReplicationTaskResult The response from the
     *         ModifyReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyReplicationTaskResult modifyReplicationTask(
            ModifyReplicationTaskRequest modifyReplicationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationTaskRequest> request = null;
        Response<ModifyReplicationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationTaskRequestMarshaller()
                        .marshall(modifyReplicationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyReplicationTaskResult, JsonUnmarshallerContext> unmarshaller = new ModifyReplicationTaskResultJsonUnmarshaller();
            JsonResponseHandler<ModifyReplicationTaskResult> responseHandler = new JsonResponseHandler<ModifyReplicationTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Reboots a replication instance. Rebooting results in a momentary outage,
     * until the replication instance becomes available again.
     * </p>
     * 
     * @param rebootReplicationInstanceRequest
     * @return rebootReplicationInstanceResult The response from the
     *         RebootReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RebootReplicationInstanceResult rebootReplicationInstance(
            RebootReplicationInstanceRequest rebootReplicationInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebootReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootReplicationInstanceRequest> request = null;
        Response<RebootReplicationInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootReplicationInstanceRequestMarshaller()
                        .marshall(rebootReplicationInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RebootReplicationInstanceResult, JsonUnmarshallerContext> unmarshaller = new RebootReplicationInstanceResultJsonUnmarshaller();
            JsonResponseHandler<RebootReplicationInstanceResult> responseHandler = new JsonResponseHandler<RebootReplicationInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous
     * operation and can take several minutes. You can check the status of this
     * operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest <p/>
     * @return refreshSchemasResult The response from the RefreshSchemas service
     *         method, as returned by AWS Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RefreshSchemasResult refreshSchemas(RefreshSchemasRequest refreshSchemasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(refreshSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshSchemasRequest> request = null;
        Response<RefreshSchemasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshSchemasRequestMarshaller().marshall(refreshSchemasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RefreshSchemasResult, JsonUnmarshallerContext> unmarshaller = new RefreshSchemasResultJsonUnmarshaller();
            JsonResponseHandler<RefreshSchemasResult> responseHandler = new JsonResponseHandler<RefreshSchemasResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Reloads the target database table with the source data.
     * </p>
     * 
     * @param reloadTablesRequest
     * @return reloadTablesResult The response from the ReloadTables service
     *         method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ReloadTablesResult reloadTables(ReloadTablesRequest reloadTablesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(reloadTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReloadTablesRequest> request = null;
        Response<ReloadTablesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReloadTablesRequestMarshaller().marshall(reloadTablesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ReloadTablesResult, JsonUnmarshallerContext> unmarshaller = new ReloadTablesResultJsonUnmarshaller();
            JsonResponseHandler<ReloadTablesResult> responseHandler = new JsonResponseHandler<ReloadTablesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p>
     *            Removes one or more tags from an AWS DMS resource.
     *            </p>
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
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
     * Starts the replication task.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html"
     * >Working with Migration Tasks </a> in the <i>AWS Database Migration
     * Service User Guide.</i>
     * </p>
     * 
     * @param startReplicationTaskRequest <p/>
     * @return startReplicationTaskResult The response from the
     *         StartReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartReplicationTaskResult startReplicationTask(
            StartReplicationTaskRequest startReplicationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationTaskRequest> request = null;
        Response<StartReplicationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationTaskRequestMarshaller()
                        .marshall(startReplicationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartReplicationTaskResult, JsonUnmarshallerContext> unmarshaller = new StartReplicationTaskResultJsonUnmarshaller();
            JsonResponseHandler<StartReplicationTaskResult> responseHandler = new JsonResponseHandler<StartReplicationTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts the replication task assessment for unsupported data types in the
     * source database.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRequest <p/>
     * @return startReplicationTaskAssessmentResult The response from the
     *         StartReplicationTaskAssessment service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartReplicationTaskAssessmentResult startReplicationTaskAssessment(
            StartReplicationTaskAssessmentRequest startReplicationTaskAssessmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startReplicationTaskAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationTaskAssessmentRequest> request = null;
        Response<StartReplicationTaskAssessmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationTaskAssessmentRequestMarshaller()
                        .marshall(startReplicationTaskAssessmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartReplicationTaskAssessmentResult, JsonUnmarshallerContext> unmarshaller = new StartReplicationTaskAssessmentResultJsonUnmarshaller();
            JsonResponseHandler<StartReplicationTaskAssessmentResult> responseHandler = new JsonResponseHandler<StartReplicationTaskAssessmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest <p/>
     * @return stopReplicationTaskResult The response from the
     *         StopReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StopReplicationTaskResult stopReplicationTask(
            StopReplicationTaskRequest stopReplicationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopReplicationTaskRequest> request = null;
        Response<StopReplicationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopReplicationTaskRequestMarshaller()
                        .marshall(stopReplicationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopReplicationTaskResult, JsonUnmarshallerContext> unmarshaller = new StopReplicationTaskResultJsonUnmarshaller();
            JsonResponseHandler<StopReplicationTaskResult> responseHandler = new JsonResponseHandler<StopReplicationTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * 
     * @param testConnectionRequest <p/>
     * @return testConnectionResult The response from the TestConnection service
     *         method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public TestConnectionResult testConnection(TestConnectionRequest testConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestConnectionRequest> request = null;
        Response<TestConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestConnectionRequestMarshaller().marshall(testConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TestConnectionResult, JsonUnmarshallerContext> unmarshaller = new TestConnectionResultJsonUnmarshaller();
            JsonResponseHandler<TestConnectionResult> responseHandler = new JsonResponseHandler<TestConnectionResult>(
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
