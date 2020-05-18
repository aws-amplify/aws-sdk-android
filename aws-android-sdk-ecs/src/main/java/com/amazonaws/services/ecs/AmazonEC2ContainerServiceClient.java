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

package com.amazonaws.services.ecs;

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

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.services.ecs.model.transform.*;

/**
 * Client for accessing Amazon EC2 Container Service. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Elastic Container Service</fullname>
 * <p>
 * Amazon Elastic Container Service (Amazon ECS) is a highly scalable, fast,
 * container management service that makes it easy to run, stop, and manage
 * Docker containers on a cluster. You can host your cluster on a serverless
 * infrastructure that is managed by Amazon ECS by launching your services or
 * tasks using the Fargate launch type. For more control, you can host your
 * tasks on a cluster of Amazon Elastic Compute Cloud (Amazon EC2) instances
 * that you manage by using the EC2 launch type. For more information about
 * launch types, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
 * >Amazon ECS Launch Types</a>.
 * </p>
 * <p>
 * Amazon ECS lets you launch and stop container-based applications with simple
 * API calls, allows you to get the state of your cluster from a centralized
 * service, and gives you access to many familiar Amazon EC2 features.
 * </p>
 * <p>
 * You can use Amazon ECS to schedule the placement of containers across your
 * cluster based on your resource needs, isolation policies, and availability
 * requirements. Amazon ECS eliminates the need for you to operate your own
 * cluster management and configuration management systems or worry about
 * scaling your management infrastructure.
 * </p>
 */
public class AmazonEC2ContainerServiceClient extends AmazonWebServiceClient implements
        AmazonEC2ContainerService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon EC2 Container Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService. A credentials provider chain will be used that
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
    public AmazonEC2ContainerServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService. A credentials provider chain will be used that
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
     *            how this client connects to AmazonEC2ContainerService (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonEC2ContainerServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService using the specified AWS account credentials.
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
     *         AmazonEC2ContainerServiceClient client = new AmazonEC2ContainerServiceClient(
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
    public AmazonEC2ContainerServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService using the specified AWS account credentials and
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
     *         AmazonEC2ContainerServiceClient client = new AmazonEC2ContainerServiceClient(
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
     *            how this client connects to AmazonEC2ContainerService (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonEC2ContainerServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService using the specified AWS account credentials
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
     *         AmazonEC2ContainerServiceClient client = new AmazonEC2ContainerServiceClient(
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
    public AmazonEC2ContainerServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService using the specified AWS account credentials
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
     *         AmazonEC2ContainerServiceClient client = new AmazonEC2ContainerServiceClient(
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
     *            how this client connects to AmazonEC2ContainerService (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonEC2ContainerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonEC2ContainerService (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonEC2ContainerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerService using the specified AWS account credentials
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
     *         AmazonEC2ContainerServiceClient client = new AmazonEC2ContainerServiceClient(
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
     *            how this client connects to AmazonEC2ContainerService (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonEC2ContainerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AttributeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BlockedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClusterContainsContainerInstancesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClusterContainsServicesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClusterContainsTasksExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClusterNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MissingVersionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoUpdateAvailableExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new PlatformTaskDefinitionIncompatibilityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PlatformUnknownExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceNotActiveExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TargetNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TaskSetNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedFeatureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UpdateInProgressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ecs.us-east-1.amazonaws.com");
        this.endpointPrefix = "ecs";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/ecs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/ecs/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a new capacity provider. Capacity providers are associated with
     * an Amazon ECS cluster and are used in capacity provider strategies to
     * facilitate cluster auto scaling.
     * </p>
     * <p>
     * Only capacity providers using an Auto Scaling group can be created.
     * Amazon ECS tasks on AWS Fargate use the <code>FARGATE</code> and
     * <code>FARGATE_SPOT</code> capacity providers which are already created
     * and available to all accounts in Regions supported by AWS Fargate.
     * </p>
     * 
     * @param createCapacityProviderRequest
     * @return createCapacityProviderResult The response from the
     *         CreateCapacityProvider service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateCapacityProviderResult createCapacityProvider(
            CreateCapacityProviderRequest createCapacityProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCapacityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCapacityProviderRequest> request = null;
        Response<CreateCapacityProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCapacityProviderRequestMarshaller()
                        .marshall(createCapacityProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCapacityProviderResult, JsonUnmarshallerContext> unmarshaller = new CreateCapacityProviderResultJsonUnmarshaller();
            JsonResponseHandler<CreateCapacityProviderResult> responseHandler = new JsonResponseHandler<CreateCapacityProviderResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account receives a
     * <code>default</code> cluster when you launch your first container
     * instance. However, you can create your own cluster with a unique name
     * with the <code>CreateCluster</code> action.
     * </p>
     * <note>
     * <p>
     * When you call the <a>CreateCluster</a> API operation, Amazon ECS attempts
     * to create the Amazon ECS service-linked role for your account so that
     * required resources in other AWS services can be managed on your behalf.
     * However, if the IAM user that makes the call does not have permissions to
     * create the service-linked role, it is not created. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param createClusterRequest
     * @return createClusterResult The response from the CreateCluster service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateClusterResult createCluster(CreateClusterRequest createClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestMarshaller().marshall(createClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateClusterResult, JsonUnmarshallerContext> unmarshaller = new CreateClusterResultJsonUnmarshaller();
            JsonResponseHandler<CreateClusterResult> responseHandler = new JsonResponseHandler<CreateClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Runs and maintains a desired number of tasks from a specified task
     * definition. If the number of tasks running in a service drops below the
     * <code>desiredCount</code>, Amazon ECS runs another copy of the task in
     * the specified cluster. To update an existing service, see the
     * UpdateService action.
     * </p>
     * <p>
     * In addition to maintaining the desired count of tasks in your service,
     * you can optionally run your service behind one or more load balancers.
     * The load balancers distribute traffic across the tasks that are
     * associated with the service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Tasks for services that <i>do not</i> use a load balancer are considered
     * healthy if they're in the <code>RUNNING</code> state. Tasks for services
     * that <i>do</i> use a load balancer are considered healthy if they're in
     * the <code>RUNNING</code> state and the container instance that they're
     * hosted on is reported as healthy by the load balancer.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code> - The replica scheduling strategy places and
     * maintains the desired number of tasks across your cluster. By default,
     * the service scheduler spreads tasks across Availability Zones. You can
     * use task placement strategies and constraints to customize task placement
     * decisions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Service Scheduler Concepts</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code> - The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * using this strategy, you don't need to specify a desired number of tasks,
     * a task placement strategy, or use Service Auto Scaling policies. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Service Scheduler Concepts</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can optionally specify a deployment configuration for your service.
     * The deployment is triggered by changing properties, such as the task
     * definition or the desired count of a service, with an
     * <a>UpdateService</a> operation. The default value for a replica service
     * for <code>minimumHealthyPercent</code> is 100%. The default value for a
     * daemon service for <code>minimumHealthyPercent</code> is 0%.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the
     * minimum healthy percent represents a lower limit on the number of tasks
     * in a service that must remain in the <code>RUNNING</code> state during a
     * deployment, as a percentage of the desired number of tasks (rounded up to
     * the nearest integer), and while any container instances are in the
     * <code>DRAINING</code> state if the service contains tasks using the EC2
     * launch type. This parameter enables you to deploy without using
     * additional cluster capacity. For example, if your service has a desired
     * number of four tasks and a minimum healthy percent of 50%, the scheduler
     * might stop two existing tasks to free up cluster capacity before starting
     * two new tasks. Tasks for services that <i>do not</i> use a load balancer
     * are considered healthy if they're in the <code>RUNNING</code> state.
     * Tasks for services that <i>do</i> use a load balancer are considered
     * healthy if they're in the <code>RUNNING</code> state and they're reported
     * as healthy by the load balancer. The default value for minimum healthy
     * percent is 100%.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the
     * <b>maximum percent</b> parameter represents an upper limit on the number
     * of tasks in a service that are allowed in the <code>RUNNING</code> or
     * <code>PENDING</code> state during a deployment, as a percentage of the
     * desired number of tasks (rounded down to the nearest integer), and while
     * any container instances are in the <code>DRAINING</code> state if the
     * service contains tasks using the EC2 launch type. This parameter enables
     * you to define the deployment batch size. For example, if your service has
     * a desired number of four tasks and a maximum percent value of 200%, the
     * scheduler may start four new tasks before stopping the four older tasks
     * (provided that the cluster resources required to do this are available).
     * The default value for maximum percent is 200%.
     * </p>
     * <p>
     * If a service is using either the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types and tasks that use the
     * EC2 launch type, the <b>minimum healthy percent</b> and <b>maximum
     * percent</b> values are used only to define the lower and upper limit on
     * the number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the
     * <code>DRAINING</code> state. If the tasks in the service use the Fargate
     * launch type, the minimum healthy percent and maximum percent values
     * aren't used, although they're currently visible when describing your
     * service.
     * </p>
     * <p>
     * When creating a service that uses the <code>EXTERNAL</code> deployment
     * controller, you can specify only parameters that aren't controlled at the
     * task set level. The only required parameter is the service name. You
     * control your services using the <a>CreateTaskSet</a> operation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
     * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * When the service scheduler launches new tasks, it determines task
     * placement in your cluster using the following logic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Determine which of the container instances in your cluster can support
     * your service's task definition (for example, they have the required CPU,
     * memory, ports, and container instance attributes).
     * </p>
     * </li>
     * <li>
     * <p>
     * By default, the service scheduler attempts to balance tasks across
     * Availability Zones in this manner (although you can choose a different
     * placement strategy) with the <code>placementStrategy</code> parameter):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sort the valid container instances, giving priority to instances that
     * have the fewest number of running tasks for this service in their
     * respective Availability Zone. For example, if zone A has one running
     * service task and zones B and C each have zero, valid container instances
     * in either zone B or C are considered optimal for placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * Place the new service task on a valid container instance in an optimal
     * Availability Zone (based on the previous steps), favoring container
     * instances with the fewest number of running tasks for this service.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createServiceRequest
     * @return createServiceResult The response from the CreateService service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws PlatformUnknownException
     * @throws PlatformTaskDefinitionIncompatibilityException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateServiceResult createService(CreateServiceRequest createServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestMarshaller().marshall(createServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateServiceResult, JsonUnmarshallerContext> unmarshaller = new CreateServiceResultJsonUnmarshaller();
            JsonResponseHandler<CreateServiceResult> responseHandler = new JsonResponseHandler<CreateServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Create a task set in the specified cluster and service. This is used when
     * a service uses the <code>EXTERNAL</code> deployment controller type. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
     * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param createTaskSetRequest
     * @return createTaskSetResult The response from the CreateTaskSet service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws PlatformUnknownException
     * @throws PlatformTaskDefinitionIncompatibilityException
     * @throws AccessDeniedException
     * @throws ServiceNotFoundException
     * @throws ServiceNotActiveException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateTaskSetResult createTaskSet(CreateTaskSetRequest createTaskSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTaskSetRequest> request = null;
        Response<CreateTaskSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTaskSetRequestMarshaller().marshall(createTaskSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTaskSetResult, JsonUnmarshallerContext> unmarshaller = new CreateTaskSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateTaskSetResult> responseHandler = new JsonResponseHandler<CreateTaskSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables an account setting for a specified IAM user, IAM role, or the
     * root user for an account.
     * </p>
     * 
     * @param deleteAccountSettingRequest
     * @return deleteAccountSettingResult The response from the
     *         DeleteAccountSetting service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteAccountSettingResult deleteAccountSetting(
            DeleteAccountSettingRequest deleteAccountSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAccountSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountSettingRequest> request = null;
        Response<DeleteAccountSettingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountSettingRequestMarshaller()
                        .marshall(deleteAccountSettingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAccountSettingResult, JsonUnmarshallerContext> unmarshaller = new DeleteAccountSettingResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAccountSettingResult> responseHandler = new JsonResponseHandler<DeleteAccountSettingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes one or more custom attributes from an Amazon ECS resource.
     * </p>
     * 
     * @param deleteAttributesRequest
     * @return deleteAttributesResult The response from the DeleteAttributes
     *         service method, as returned by Amazon EC2 Container Service.
     * @throws ClusterNotFoundException
     * @throws TargetNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteAttributesResult deleteAttributes(DeleteAttributesRequest deleteAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttributesRequest> request = null;
        Response<DeleteAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttributesRequestMarshaller().marshall(deleteAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAttributesResult, JsonUnmarshallerContext> unmarshaller = new DeleteAttributesResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAttributesResult> responseHandler = new JsonResponseHandler<DeleteAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified cluster. The cluster will transition to the
     * <code>INACTIVE</code> state. Clusters with an <code>INACTIVE</code>
     * status may remain discoverable in your account for a period of time.
     * However, this behavior is subject to change in the future, so you should
     * not rely on <code>INACTIVE</code> clusters persisting.
     * </p>
     * <p>
     * You must deregister all container instances from this cluster before you
     * may delete it. You can list the container instances in a cluster with
     * <a>ListContainerInstances</a> and deregister them with
     * <a>DeregisterContainerInstance</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return deleteClusterResult The response from the DeleteCluster service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ClusterContainsContainerInstancesException
     * @throws ClusterContainsServicesException
     * @throws ClusterContainsTasksException
     * @throws UpdateInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestMarshaller().marshall(deleteClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteClusterResult, JsonUnmarshallerContext> unmarshaller = new DeleteClusterResultJsonUnmarshaller();
            JsonResponseHandler<DeleteClusterResult> responseHandler = new JsonResponseHandler<DeleteClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specified service within a cluster. You can delete a service if
     * you have no running tasks in it and the desired task count is zero. If
     * the service is actively maintaining tasks, you cannot delete it, and you
     * must update the service to a desired task count of zero. For more
     * information, see <a>UpdateService</a>.
     * </p>
     * <note>
     * <p>
     * When you delete a service, if there are still running tasks that require
     * cleanup, the service status moves from <code>ACTIVE</code> to
     * <code>DRAINING</code>, and the service is no longer visible in the
     * console or in the <a>ListServices</a> API operation. After all tasks have
     * transitioned to either <code>STOPPING</code> or <code>STOPPED</code>
     * status, the service status moves from <code>DRAINING</code> to
     * <code>INACTIVE</code>. Services in the <code>DRAINING</code> or
     * <code>INACTIVE</code> status can still be viewed with the
     * <a>DescribeServices</a> API operation. However, in the future,
     * <code>INACTIVE</code> services may be cleaned up and purged from Amazon
     * ECS record keeping, and <a>DescribeServices</a> calls on those services
     * return a <code>ServiceNotFoundException</code> error.
     * </p>
     * </note> <important>
     * <p>
     * If you attempt to create a new service with the same name as an existing
     * service in either <code>ACTIVE</code> or <code>DRAINING</code> status,
     * you receive an error.
     * </p>
     * </important>
     * 
     * @param deleteServiceRequest
     * @return deleteServiceResult The response from the DeleteService service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestMarshaller().marshall(deleteServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteServiceResult, JsonUnmarshallerContext> unmarshaller = new DeleteServiceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteServiceResult> responseHandler = new JsonResponseHandler<DeleteServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specified task set within a service. This is used when a
     * service uses the <code>EXTERNAL</code> deployment controller type. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
     * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param deleteTaskSetRequest
     * @return deleteTaskSetResult The response from the DeleteTaskSet service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws AccessDeniedException
     * @throws ServiceNotFoundException
     * @throws ServiceNotActiveException
     * @throws TaskSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteTaskSetResult deleteTaskSet(DeleteTaskSetRequest deleteTaskSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTaskSetRequest> request = null;
        Response<DeleteTaskSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTaskSetRequestMarshaller().marshall(deleteTaskSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTaskSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteTaskSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTaskSetResult> responseHandler = new JsonResponseHandler<DeleteTaskSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deregisters an Amazon ECS container instance from the specified cluster.
     * This instance is no longer available to run tasks.
     * </p>
     * <p>
     * If you intend to use the container instance for some other purpose after
     * deregistration, you should stop all of the tasks running on the container
     * instance before deregistration. That prevents any orphaned tasks from
     * consuming resources.
     * </p>
     * <p>
     * Deregistering a container instance removes the instance from a cluster,
     * but it does not terminate the EC2 instance. If you are finished using the
     * instance, be sure to terminate it in the Amazon EC2 console to stop
     * billing.
     * </p>
     * <note>
     * <p>
     * If you terminate a running container instance, Amazon ECS automatically
     * deregisters the instance from your cluster (stopped container instances
     * or instances with disconnected agents are not automatically deregistered
     * when terminated).
     * </p>
     * </note>
     * 
     * @param deregisterContainerInstanceRequest
     * @return deregisterContainerInstanceResult The response from the
     *         DeregisterContainerInstance service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeregisterContainerInstanceResult deregisterContainerInstance(
            DeregisterContainerInstanceRequest deregisterContainerInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterContainerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterContainerInstanceRequest> request = null;
        Response<DeregisterContainerInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterContainerInstanceRequestMarshaller()
                        .marshall(deregisterContainerInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterContainerInstanceResult, JsonUnmarshallerContext> unmarshaller = new DeregisterContainerInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterContainerInstanceResult> responseHandler = new JsonResponseHandler<DeregisterContainerInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deregisters the specified task definition by family and revision. Upon
     * deregistration, the task definition is marked as <code>INACTIVE</code>.
     * Existing tasks and services that reference an <code>INACTIVE</code> task
     * definition continue to run without disruption. Existing services that
     * reference an <code>INACTIVE</code> task definition can still scale up or
     * down by modifying the service's desired count.
     * </p>
     * <p>
     * You cannot use an <code>INACTIVE</code> task definition to run new tasks
     * or create new services, and you cannot update an existing service to
     * reference an <code>INACTIVE</code> task definition. However, there may be
     * up to a 10-minute window following deregistration where these
     * restrictions have not yet taken effect.
     * </p>
     * <note>
     * <p>
     * At this time, <code>INACTIVE</code> task definitions remain discoverable
     * in your account indefinitely. However, this behavior is subject to change
     * in the future, so you should not rely on <code>INACTIVE</code> task
     * definitions persisting beyond the lifecycle of any associated tasks and
     * services.
     * </p>
     * </note>
     * 
     * @param deregisterTaskDefinitionRequest
     * @return deregisterTaskDefinitionResult The response from the
     *         DeregisterTaskDefinition service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeregisterTaskDefinitionResult deregisterTaskDefinition(
            DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTaskDefinitionRequest> request = null;
        Response<DeregisterTaskDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTaskDefinitionRequestMarshaller()
                        .marshall(deregisterTaskDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterTaskDefinitionResult, JsonUnmarshallerContext> unmarshaller = new DeregisterTaskDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterTaskDefinitionResult> responseHandler = new JsonResponseHandler<DeregisterTaskDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes one or more of your capacity providers.
     * </p>
     * 
     * @param describeCapacityProvidersRequest
     * @return describeCapacityProvidersResult The response from the
     *         DescribeCapacityProviders service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeCapacityProvidersResult describeCapacityProviders(
            DescribeCapacityProvidersRequest describeCapacityProvidersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCapacityProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCapacityProvidersRequest> request = null;
        Response<DescribeCapacityProvidersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCapacityProvidersRequestMarshaller()
                        .marshall(describeCapacityProvidersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCapacityProvidersResult, JsonUnmarshallerContext> unmarshaller = new DescribeCapacityProvidersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCapacityProvidersResult> responseHandler = new JsonResponseHandler<DescribeCapacityProvidersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     * 
     * @param describeClustersRequest
     * @return describeClustersResult The response from the DescribeClusters
     *         service method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClustersRequestMarshaller().marshall(describeClustersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeClustersResult, JsonUnmarshallerContext> unmarshaller = new DescribeClustersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeClustersResult> responseHandler = new JsonResponseHandler<DescribeClustersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes Amazon Elastic Container Service container instances. Returns
     * metadata about registered and remaining resources on each container
     * instance requested.
     * </p>
     * 
     * @param describeContainerInstancesRequest
     * @return describeContainerInstancesResult The response from the
     *         DescribeContainerInstances service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeContainerInstancesResult describeContainerInstances(
            DescribeContainerInstancesRequest describeContainerInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeContainerInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContainerInstancesRequest> request = null;
        Response<DescribeContainerInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContainerInstancesRequestMarshaller()
                        .marshall(describeContainerInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeContainerInstancesResult, JsonUnmarshallerContext> unmarshaller = new DescribeContainerInstancesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeContainerInstancesResult> responseHandler = new JsonResponseHandler<DescribeContainerInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     * 
     * @param describeServicesRequest
     * @return describeServicesResult The response from the DescribeServices
     *         service method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestMarshaller().marshall(describeServicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeServicesResult, JsonUnmarshallerContext> unmarshaller = new DescribeServicesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeServicesResult> responseHandler = new JsonResponseHandler<DescribeServicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a task definition. You can specify a <code>family</code> and
     * <code>revision</code> to find information about a specific task
     * definition, or you can simply specify the family to find the latest
     * <code>ACTIVE</code> revision in that family.
     * </p>
     * <note>
     * <p>
     * You can only describe <code>INACTIVE</code> task definitions while an
     * active task or service references them.
     * </p>
     * </note>
     * 
     * @param describeTaskDefinitionRequest
     * @return describeTaskDefinitionResult The response from the
     *         DescribeTaskDefinition service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeTaskDefinitionResult describeTaskDefinition(
            DescribeTaskDefinitionRequest describeTaskDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskDefinitionRequest> request = null;
        Response<DescribeTaskDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskDefinitionRequestMarshaller()
                        .marshall(describeTaskDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTaskDefinitionResult, JsonUnmarshallerContext> unmarshaller = new DescribeTaskDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTaskDefinitionResult> responseHandler = new JsonResponseHandler<DescribeTaskDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the task sets in the specified cluster and service. This is
     * used when a service uses the <code>EXTERNAL</code> deployment controller
     * type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
     * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param describeTaskSetsRequest
     * @return describeTaskSetsResult The response from the DescribeTaskSets
     *         service method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws AccessDeniedException
     * @throws ServiceNotFoundException
     * @throws ServiceNotActiveException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeTaskSetsResult describeTaskSets(DescribeTaskSetsRequest describeTaskSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTaskSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskSetsRequest> request = null;
        Response<DescribeTaskSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskSetsRequestMarshaller().marshall(describeTaskSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTaskSetsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTaskSetsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTaskSetsResult> responseHandler = new JsonResponseHandler<DescribeTaskSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     * 
     * @param describeTasksRequest
     * @return describeTasksResult The response from the DescribeTasks service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeTasksResult describeTasks(DescribeTasksRequest describeTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTasksRequest> request = null;
        Response<DescribeTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTasksRequestMarshaller().marshall(describeTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTasksResult, JsonUnmarshallerContext> unmarshaller = new DescribeTasksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTasksResult> responseHandler = new JsonResponseHandler<DescribeTasksResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended
     * for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Returns an endpoint for the Amazon ECS agent to poll for updates.
     * </p>
     * 
     * @param discoverPollEndpointRequest
     * @return discoverPollEndpointResult The response from the
     *         DiscoverPollEndpoint service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DiscoverPollEndpointResult discoverPollEndpoint(
            DiscoverPollEndpointRequest discoverPollEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(discoverPollEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DiscoverPollEndpointRequest> request = null;
        Response<DiscoverPollEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DiscoverPollEndpointRequestMarshaller()
                        .marshall(discoverPollEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DiscoverPollEndpointResult, JsonUnmarshallerContext> unmarshaller = new DiscoverPollEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DiscoverPollEndpointResult> responseHandler = new JsonResponseHandler<DiscoverPollEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the account settings for a specified principal.
     * </p>
     * 
     * @param listAccountSettingsRequest
     * @return listAccountSettingsResult The response from the
     *         ListAccountSettings service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListAccountSettingsResult listAccountSettings(
            ListAccountSettingsRequest listAccountSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountSettingsRequest> request = null;
        Response<ListAccountSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountSettingsRequestMarshaller()
                        .marshall(listAccountSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAccountSettingsResult, JsonUnmarshallerContext> unmarshaller = new ListAccountSettingsResultJsonUnmarshaller();
            JsonResponseHandler<ListAccountSettingsResult> responseHandler = new JsonResponseHandler<ListAccountSettingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the attributes for Amazon ECS resources within a specified target
     * type and cluster. When you specify a target type and cluster,
     * <code>ListAttributes</code> returns a list of attribute objects, one for
     * each attribute on each resource. You can filter the list of results to a
     * single attribute name to only return results that have that name. You can
     * also filter the results by attribute name and value, for example, to see
     * which container instances in a cluster are running a Linux AMI (
     * <code>ecs.os-type=linux</code>).
     * </p>
     * 
     * @param listAttributesRequest
     * @return listAttributesResult The response from the ListAttributes service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ClusterNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListAttributesResult listAttributes(ListAttributesRequest listAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttributesRequest> request = null;
        Response<ListAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttributesRequestMarshaller().marshall(listAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAttributesResult, JsonUnmarshallerContext> unmarshaller = new ListAttributesResultJsonUnmarshaller();
            JsonResponseHandler<ListAttributesResult> responseHandler = new JsonResponseHandler<ListAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return listClustersResult The response from the ListClusters service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestMarshaller().marshall(listClustersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClustersResult, JsonUnmarshallerContext> unmarshaller = new ListClustersResultJsonUnmarshaller();
            JsonResponseHandler<ListClustersResult> responseHandler = new JsonResponseHandler<ListClustersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of container instances in a specified cluster. You can
     * filter the results of a <code>ListContainerInstances</code> operation
     * with cluster query language statements inside the <code>filter</code>
     * parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param listContainerInstancesRequest
     * @return listContainerInstancesResult The response from the
     *         ListContainerInstances service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListContainerInstancesResult listContainerInstances(
            ListContainerInstancesRequest listContainerInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listContainerInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContainerInstancesRequest> request = null;
        Response<ListContainerInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContainerInstancesRequestMarshaller()
                        .marshall(listContainerInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListContainerInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListContainerInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListContainerInstancesResult> responseHandler = new JsonResponseHandler<ListContainerInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     * 
     * @param listServicesRequest
     * @return listServicesResult The response from the ListServices service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListServicesResult listServices(ListServicesRequest listServicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestMarshaller().marshall(listServicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListServicesResult, JsonUnmarshallerContext> unmarshaller = new ListServicesResultJsonUnmarshaller();
            JsonResponseHandler<ListServicesResult> responseHandler = new JsonResponseHandler<ListServicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the tags for an Amazon ECS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws ClusterNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Returns a list of task definition families that are registered to your
     * account (which may include task definition families that no longer have
     * any <code>ACTIVE</code> task definition revisions).
     * </p>
     * <p>
     * You can filter out task definition families that do not contain any
     * <code>ACTIVE</code> task definition revisions by setting the
     * <code>status</code> parameter to <code>ACTIVE</code>. You can also filter
     * the results with the <code>familyPrefix</code> parameter.
     * </p>
     * 
     * @param listTaskDefinitionFamiliesRequest
     * @return listTaskDefinitionFamiliesResult The response from the
     *         ListTaskDefinitionFamilies service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(
            ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTaskDefinitionFamiliesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskDefinitionFamiliesRequest> request = null;
        Response<ListTaskDefinitionFamiliesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskDefinitionFamiliesRequestMarshaller()
                        .marshall(listTaskDefinitionFamiliesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTaskDefinitionFamiliesResult, JsonUnmarshallerContext> unmarshaller = new ListTaskDefinitionFamiliesResultJsonUnmarshaller();
            JsonResponseHandler<ListTaskDefinitionFamiliesResult> responseHandler = new JsonResponseHandler<ListTaskDefinitionFamiliesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of task definitions that are registered to your account.
     * You can filter the results by family name with the
     * <code>familyPrefix</code> parameter or by status with the
     * <code>status</code> parameter.
     * </p>
     * 
     * @param listTaskDefinitionsRequest
     * @return listTaskDefinitionsResult The response from the
     *         ListTaskDefinitions service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListTaskDefinitionsResult listTaskDefinitions(
            ListTaskDefinitionsRequest listTaskDefinitionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTaskDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskDefinitionsRequest> request = null;
        Response<ListTaskDefinitionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskDefinitionsRequestMarshaller()
                        .marshall(listTaskDefinitionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTaskDefinitionsResult, JsonUnmarshallerContext> unmarshaller = new ListTaskDefinitionsResultJsonUnmarshaller();
            JsonResponseHandler<ListTaskDefinitionsResult> responseHandler = new JsonResponseHandler<ListTaskDefinitionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of tasks for a specified cluster. You can filter the
     * results by family name, by a particular container instance, or by the
     * desired status of the task with the <code>family</code>,
     * <code>containerInstance</code>, and <code>desiredStatus</code>
     * parameters.
     * </p>
     * <p>
     * Recently stopped tasks might appear in the returned results. Currently,
     * stopped tasks appear in the returned results for at least one hour.
     * </p>
     * 
     * @param listTasksRequest
     * @return listTasksResult The response from the ListTasks service method,
     *         as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListTasksResult listTasks(ListTasksRequest listTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTasksRequest> request = null;
        Response<ListTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTasksRequestMarshaller().marshall(listTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTasksResult, JsonUnmarshallerContext> unmarshaller = new ListTasksResultJsonUnmarshaller();
            JsonResponseHandler<ListTasksResult> responseHandler = new JsonResponseHandler<ListTasksResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies an account setting. Account settings are set on a per-Region
     * basis.
     * </p>
     * <p>
     * If you change the account setting for the root user, the default settings
     * for all of the IAM users and roles for which no individual account
     * setting has been specified are reset. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html"
     * >Account Settings</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When <code>serviceLongArnFormat</code>, <code>taskLongArnFormat</code>,
     * or <code>containerInstanceLongArnFormat</code> are specified, the Amazon
     * Resource Name (ARN) and resource ID format of the resource type for a
     * specified IAM user, IAM role, or the root user for an account is
     * affected. The opt-in and opt-out account setting must be set for each
     * Amazon ECS resource separately. The ARN and resource ID format of a
     * resource will be defined by the opt-in status of the IAM user or role
     * that created the resource. You must enable this setting to use Amazon ECS
     * features such as resource tagging.
     * </p>
     * <p>
     * When <code>awsvpcTrunking</code> is specified, the elastic network
     * interface (ENI) limit for any new container instances that support the
     * feature is changed. If <code>awsvpcTrunking</code> is enabled, any new
     * container instances that support the feature are launched have the
     * increased ENI limits available to them. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html"
     * >Elastic Network Interface Trunking</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * When <code>containerInsights</code> is specified, the default setting
     * indicating whether CloudWatch Container Insights is enabled for your
     * clusters is changed. If <code>containerInsights</code> is enabled, any
     * new clusters that are created will have Container Insights enabled unless
     * you disable it during cluster creation. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html"
     * >CloudWatch Container Insights</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param putAccountSettingRequest
     * @return putAccountSettingResult The response from the PutAccountSetting
     *         service method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutAccountSettingResult putAccountSetting(
            PutAccountSettingRequest putAccountSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAccountSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSettingRequest> request = null;
        Response<PutAccountSettingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSettingRequestMarshaller()
                        .marshall(putAccountSettingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAccountSettingResult, JsonUnmarshallerContext> unmarshaller = new PutAccountSettingResultJsonUnmarshaller();
            JsonResponseHandler<PutAccountSettingResult> responseHandler = new JsonResponseHandler<PutAccountSettingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies an account setting for all IAM users on an account for whom no
     * individual account setting has been specified. Account settings are set
     * on a per-Region basis.
     * </p>
     * 
     * @param putAccountSettingDefaultRequest
     * @return putAccountSettingDefaultResult The response from the
     *         PutAccountSettingDefault service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutAccountSettingDefaultResult putAccountSettingDefault(
            PutAccountSettingDefaultRequest putAccountSettingDefaultRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAccountSettingDefaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSettingDefaultRequest> request = null;
        Response<PutAccountSettingDefaultResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSettingDefaultRequestMarshaller()
                        .marshall(putAccountSettingDefaultRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAccountSettingDefaultResult, JsonUnmarshallerContext> unmarshaller = new PutAccountSettingDefaultResultJsonUnmarshaller();
            JsonResponseHandler<PutAccountSettingDefaultResult> responseHandler = new JsonResponseHandler<PutAccountSettingDefaultResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Create or update an attribute on an Amazon ECS resource. If the attribute
     * does not exist, it is created. If the attribute exists, its value is
     * replaced with the specified value. To delete an attribute, use
     * <a>DeleteAttributes</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param putAttributesRequest
     * @return putAttributesResult The response from the PutAttributes service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ClusterNotFoundException
     * @throws TargetNotFoundException
     * @throws AttributeLimitExceededException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutAttributesResult putAttributes(PutAttributesRequest putAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAttributesRequest> request = null;
        Response<PutAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAttributesRequestMarshaller().marshall(putAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAttributesResult, JsonUnmarshallerContext> unmarshaller = new PutAttributesResultJsonUnmarshaller();
            JsonResponseHandler<PutAttributesResult> responseHandler = new JsonResponseHandler<PutAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the available capacity providers and the default capacity
     * provider strategy for a cluster.
     * </p>
     * <p>
     * You must specify both the available capacity providers and a default
     * capacity provider strategy for the cluster. If the specified cluster has
     * existing capacity providers associated with it, you must specify all
     * existing capacity providers in addition to any new ones you want to add.
     * Any existing capacity providers associated with a cluster that are
     * omitted from a <a>PutClusterCapacityProviders</a> API call will be
     * disassociated with the cluster. You can only disassociate an existing
     * capacity provider from a cluster if it's not being used by any existing
     * tasks.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified, then the cluster's default capacity
     * provider strategy is used. It is recommended to define a default capacity
     * provider strategy for your cluster, however you may specify an empty
     * array (<code>[]</code>) to bypass defining a default strategy.
     * </p>
     * 
     * @param putClusterCapacityProvidersRequest
     * @return putClusterCapacityProvidersResult The response from the
     *         PutClusterCapacityProviders service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ResourceInUseException
     * @throws UpdateInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutClusterCapacityProvidersResult putClusterCapacityProviders(
            PutClusterCapacityProvidersRequest putClusterCapacityProvidersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putClusterCapacityProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutClusterCapacityProvidersRequest> request = null;
        Response<PutClusterCapacityProvidersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutClusterCapacityProvidersRequestMarshaller()
                        .marshall(putClusterCapacityProvidersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutClusterCapacityProvidersResult, JsonUnmarshallerContext> unmarshaller = new PutClusterCapacityProvidersResultJsonUnmarshaller();
            JsonResponseHandler<PutClusterCapacityProvidersResult> responseHandler = new JsonResponseHandler<PutClusterCapacityProvidersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended
     * for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Registers an EC2 instance into the specified cluster. This instance
     * becomes available to place containers on.
     * </p>
     * 
     * @param registerContainerInstanceRequest
     * @return registerContainerInstanceResult The response from the
     *         RegisterContainerInstance service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public RegisterContainerInstanceResult registerContainerInstance(
            RegisterContainerInstanceRequest registerContainerInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerContainerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterContainerInstanceRequest> request = null;
        Response<RegisterContainerInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterContainerInstanceRequestMarshaller()
                        .marshall(registerContainerInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterContainerInstanceResult, JsonUnmarshallerContext> unmarshaller = new RegisterContainerInstanceResultJsonUnmarshaller();
            JsonResponseHandler<RegisterContainerInstanceResult> responseHandler = new JsonResponseHandler<RegisterContainerInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers a new task definition from the supplied <code>family</code> and
     * <code>containerDefinitions</code>. Optionally, you can add data volumes
     * to your containers with the <code>volumes</code> parameter. For more
     * information about task definition parameters and defaults, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * You can specify an IAM role for your task with the
     * <code>taskRoleArn</code> parameter. When you specify an IAM role for a
     * task, its containers can then use the latest versions of the AWS CLI or
     * SDKs to make API requests to the AWS services that are specified in the
     * IAM policy associated with the role. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can specify a Docker networking mode for the containers in your task
     * definition with the <code>networkMode</code> parameter. The available
     * network modes correspond to those described in <a
     * href="https://docs.docker.com/engine/reference/run/#/network-settings"
     * >Network settings</a> in the Docker run reference. If you specify the
     * <code>awsvpc</code> network mode, the task is allocated an elastic
     * network interface, and you must specify a <a>NetworkConfiguration</a>
     * when you create a service or run a task with the task definition. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param registerTaskDefinitionRequest
     * @return registerTaskDefinitionResult The response from the
     *         RegisterTaskDefinition service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public RegisterTaskDefinitionResult registerTaskDefinition(
            RegisterTaskDefinitionRequest registerTaskDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTaskDefinitionRequest> request = null;
        Response<RegisterTaskDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTaskDefinitionRequestMarshaller()
                        .marshall(registerTaskDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterTaskDefinitionResult, JsonUnmarshallerContext> unmarshaller = new RegisterTaskDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<RegisterTaskDefinitionResult> responseHandler = new JsonResponseHandler<RegisterTaskDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a new task using the specified task definition.
     * </p>
     * <p>
     * You can allow Amazon ECS to place tasks for you, or you can customize how
     * Amazon ECS places tasks using placement constraints and placement
     * strategies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html"
     * >Scheduling Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Alternatively, you can use <a>StartTask</a> to use your own scheduler or
     * place tasks manually on specific container instances.
     * </p>
     * <p>
     * The Amazon ECS API follows an eventual consistency model, due to the
     * distributed nature of the system supporting the API. This means that the
     * result of an API command you run that affects your Amazon ECS resources
     * might not be immediately visible to all subsequent commands you run. Keep
     * this in mind when you carry out an API command that immediately follows a
     * previous API command.
     * </p>
     * <p>
     * To manage eventual consistency, you can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Confirm the state of the resource before you run a command to modify it.
     * Run the DescribeTasks command using an exponential backoff algorithm to
     * ensure that you allow enough time for the previous command to propagate
     * through the system. To do this, run the DescribeTasks command repeatedly,
     * starting with a couple of seconds of wait time and increasing gradually
     * up to five minutes of wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add wait time between subsequent commands, even if the DescribeTasks
     * command returns an accurate response. Apply an exponential backoff
     * algorithm starting with a couple of seconds of wait time, and increase
     * gradually up to about five minutes of wait time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param runTaskRequest
     * @return runTaskResult The response from the RunTask service method, as
     *         returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws PlatformUnknownException
     * @throws PlatformTaskDefinitionIncompatibilityException
     * @throws AccessDeniedException
     * @throws BlockedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public RunTaskResult runTask(RunTaskRequest runTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(runTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunTaskRequest> request = null;
        Response<RunTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunTaskRequestMarshaller().marshall(runTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RunTaskResult, JsonUnmarshallerContext> unmarshaller = new RunTaskResultJsonUnmarshaller();
            JsonResponseHandler<RunTaskResult> responseHandler = new JsonResponseHandler<RunTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a new task from the specified task definition on the specified
     * container instance or instances.
     * </p>
     * <p>
     * Alternatively, you can use <a>RunTask</a> to place tasks for you. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html"
     * >Scheduling Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param startTaskRequest
     * @return startTaskResult The response from the StartTask service method,
     *         as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StartTaskResult startTask(StartTaskRequest startTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTaskRequest> request = null;
        Response<StartTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTaskRequestMarshaller().marshall(startTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartTaskResult, JsonUnmarshallerContext> unmarshaller = new StartTaskResultJsonUnmarshaller();
            JsonResponseHandler<StartTaskResult> responseHandler = new JsonResponseHandler<StartTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a running task. Any tags associated with the task will be deleted.
     * </p>
     * <p>
     * When <a>StopTask</a> is called on a task, the equivalent of
     * <code>docker stop</code> is issued to the containers running in the task.
     * This results in a <code>SIGTERM</code> value and a default 30-second
     * timeout, after which the <code>SIGKILL</code> value is sent and the
     * containers are forcibly stopped. If the container handles the
     * <code>SIGTERM</code> value gracefully and exits within 30 seconds from
     * receiving it, no <code>SIGKILL</code> value is sent.
     * </p>
     * <note>
     * <p>
     * The default 30-second timeout can be configured on the Amazon ECS
     * container agent with the <code>ECS_CONTAINER_STOP_TIMEOUT</code>
     * variable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html"
     * >Amazon ECS Container Agent Configuration</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param stopTaskRequest
     * @return stopTaskResult The response from the StopTask service method, as
     *         returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StopTaskResult stopTask(StopTaskRequest stopTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTaskRequest> request = null;
        Response<StopTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTaskRequestMarshaller().marshall(stopTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopTaskResult, JsonUnmarshallerContext> unmarshaller = new StopTaskResultJsonUnmarshaller();
            JsonResponseHandler<StopTaskResult> responseHandler = new JsonResponseHandler<StopTaskResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended
     * for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Sent to acknowledge that an attachment changed states.
     * </p>
     * 
     * @param submitAttachmentStateChangesRequest
     * @return submitAttachmentStateChangesResult The response from the
     *         SubmitAttachmentStateChanges service method, as returned by
     *         Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws AccessDeniedException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SubmitAttachmentStateChangesResult submitAttachmentStateChanges(
            SubmitAttachmentStateChangesRequest submitAttachmentStateChangesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(submitAttachmentStateChangesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitAttachmentStateChangesRequest> request = null;
        Response<SubmitAttachmentStateChangesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitAttachmentStateChangesRequestMarshaller()
                        .marshall(submitAttachmentStateChangesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SubmitAttachmentStateChangesResult, JsonUnmarshallerContext> unmarshaller = new SubmitAttachmentStateChangesResultJsonUnmarshaller();
            JsonResponseHandler<SubmitAttachmentStateChangesResult> responseHandler = new JsonResponseHandler<SubmitAttachmentStateChangesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended
     * for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Sent to acknowledge that a container changed states.
     * </p>
     * 
     * @param submitContainerStateChangeRequest
     * @return submitContainerStateChangeResult The response from the
     *         SubmitContainerStateChange service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SubmitContainerStateChangeResult submitContainerStateChange(
            SubmitContainerStateChangeRequest submitContainerStateChangeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(submitContainerStateChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitContainerStateChangeRequest> request = null;
        Response<SubmitContainerStateChangeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitContainerStateChangeRequestMarshaller()
                        .marshall(submitContainerStateChangeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SubmitContainerStateChangeResult, JsonUnmarshallerContext> unmarshaller = new SubmitContainerStateChangeResultJsonUnmarshaller();
            JsonResponseHandler<SubmitContainerStateChangeResult> responseHandler = new JsonResponseHandler<SubmitContainerStateChangeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended
     * for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Sent to acknowledge that a task changed states.
     * </p>
     * 
     * @param submitTaskStateChangeRequest
     * @return submitTaskStateChangeResult The response from the
     *         SubmitTaskStateChange service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws AccessDeniedException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SubmitTaskStateChangeResult submitTaskStateChange(
            SubmitTaskStateChangeRequest submitTaskStateChangeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(submitTaskStateChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitTaskStateChangeRequest> request = null;
        Response<SubmitTaskStateChangeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitTaskStateChangeRequestMarshaller()
                        .marshall(submitTaskStateChangeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SubmitTaskStateChangeResult, JsonUnmarshallerContext> unmarshaller = new SubmitTaskStateChangeResultJsonUnmarshaller();
            JsonResponseHandler<SubmitTaskStateChangeResult> responseHandler = new JsonResponseHandler<SubmitTaskStateChangeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Associates the specified tags to a resource with the specified
     * <code>resourceArn</code>. If existing tags on a resource are not
     * specified in the request parameters, they are not changed. When a
     * resource is deleted, the tags associated with that resource are deleted
     * as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws ClusterNotFoundException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws ClusterNotFoundException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Modifies the settings to use for a cluster.
     * </p>
     * 
     * @param updateClusterSettingsRequest
     * @return updateClusterSettingsResult The response from the
     *         UpdateClusterSettings service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws ClusterNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateClusterSettingsResult updateClusterSettings(
            UpdateClusterSettingsRequest updateClusterSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClusterSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterSettingsRequest> request = null;
        Response<UpdateClusterSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterSettingsRequestMarshaller()
                        .marshall(updateClusterSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClusterSettingsResult, JsonUnmarshallerContext> unmarshaller = new UpdateClusterSettingsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClusterSettingsResult> responseHandler = new JsonResponseHandler<UpdateClusterSettingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the Amazon ECS container agent on a specified container instance.
     * Updating the Amazon ECS container agent does not interrupt running tasks
     * or services on the container instance. The process for updating the agent
     * differs depending on whether your container instance was launched with
     * the Amazon ECS-optimized AMI or another operating system.
     * </p>
     * <p>
     * <code>UpdateContainerAgent</code> requires the Amazon ECS-optimized AMI
     * or Amazon Linux with the <code>ecs-init</code> service installed and
     * running. For help updating the Amazon ECS container agent on other
     * operating systems, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html#manually_update_agent"
     * >Manually Updating the Amazon ECS Container Agent</a> in the <i>Amazon
     * Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param updateContainerAgentRequest
     * @return updateContainerAgentResult The response from the
     *         UpdateContainerAgent service method, as returned by Amazon EC2
     *         Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UpdateInProgressException
     * @throws NoUpdateAvailableException
     * @throws MissingVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateContainerAgentResult updateContainerAgent(
            UpdateContainerAgentRequest updateContainerAgentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateContainerAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContainerAgentRequest> request = null;
        Response<UpdateContainerAgentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContainerAgentRequestMarshaller()
                        .marshall(updateContainerAgentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateContainerAgentResult, JsonUnmarshallerContext> unmarshaller = new UpdateContainerAgentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateContainerAgentResult> responseHandler = new JsonResponseHandler<UpdateContainerAgentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the status of an Amazon ECS container instance.
     * </p>
     * <p>
     * Once a container instance has reached an <code>ACTIVE</code> state, you
     * can change the status of a container instance to <code>DRAINING</code> to
     * manually remove an instance from a cluster, for example to perform system
     * updates, update the Docker daemon, or scale down the cluster size.
     * </p>
     * <important>
     * <p>
     * A container instance cannot be changed to <code>DRAINING</code> until it
     * has reached an <code>ACTIVE</code> status. If the instance is in any
     * other status, an error will be received.
     * </p>
     * </important>
     * <p>
     * When you set a container instance to <code>DRAINING</code>, Amazon ECS
     * prevents new tasks from being scheduled for placement on the container
     * instance and replacement service tasks are started on other container
     * instances in the cluster if the resources are available. Service tasks on
     * the container instance that are in the <code>PENDING</code> state are
     * stopped immediately.
     * </p>
     * <p>
     * Service tasks on the container instance that are in the
     * <code>RUNNING</code> state are stopped and replaced according to the
     * service's deployment configuration parameters,
     * <code>minimumHealthyPercent</code> and <code>maximumPercent</code>. You
     * can change the deployment configuration of your service using
     * <a>UpdateService</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>minimumHealthyPercent</code> is below 100%, the scheduler can
     * ignore <code>desiredCount</code> temporarily during task replacement. For
     * example, <code>desiredCount</code> is four tasks, a minimum of 50% allows
     * the scheduler to stop two existing tasks before starting two new tasks.
     * If the minimum is 100%, the service scheduler can't remove existing tasks
     * until the replacement tasks are considered healthy. Tasks for services
     * that do not use a load balancer are considered healthy if they are in the
     * <code>RUNNING</code> state. Tasks for services that use a load balancer
     * are considered healthy if they are in the <code>RUNNING</code> state and
     * the container instance they are hosted on is reported as healthy by the
     * load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on
     * the number of running tasks during task replacement, which enables you to
     * define the replacement batch size. For example, if
     * <code>desiredCount</code> is four tasks, a maximum of 200% starts four
     * new tasks before stopping the four tasks to be drained, provided that the
     * cluster resources required to do this are available. If the maximum is
     * 100%, then replacement tasks can't start until the draining tasks have
     * stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any <code>PENDING</code> or <code>RUNNING</code> tasks that do not belong
     * to a service are not affected. You must wait for them to finish or stop
     * them manually.
     * </p>
     * <p>
     * A container instance has completed draining when it has no more
     * <code>RUNNING</code> tasks. You can verify this using <a>ListTasks</a>.
     * </p>
     * <p>
     * When a container instance has been drained, you can set a container
     * instance to <code>ACTIVE</code> status and once it has reached that
     * status the Amazon ECS scheduler can begin scheduling tasks on the
     * instance again.
     * </p>
     * 
     * @param updateContainerInstancesStateRequest
     * @return updateContainerInstancesStateResult The response from the
     *         UpdateContainerInstancesState service method, as returned by
     *         Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateContainerInstancesStateResult updateContainerInstancesState(
            UpdateContainerInstancesStateRequest updateContainerInstancesStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateContainerInstancesStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContainerInstancesStateRequest> request = null;
        Response<UpdateContainerInstancesStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContainerInstancesStateRequestMarshaller()
                        .marshall(updateContainerInstancesStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateContainerInstancesStateResult, JsonUnmarshallerContext> unmarshaller = new UpdateContainerInstancesStateResultJsonUnmarshaller();
            JsonResponseHandler<UpdateContainerInstancesStateResult> responseHandler = new JsonResponseHandler<UpdateContainerInstancesStateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <important>
     * <p>
     * Updating the task placement strategies and constraints on an Amazon ECS
     * service remains in preview and is a Beta Service as defined by and
     * subject to the Beta Service Participation Service Terms located at <a
     * href
     * ="https://aws.amazon.com/service-terms">https://aws.amazon.com/service
     * -terms</a> ("Beta Terms"). These Beta Terms apply to your participation
     * in this preview.
     * </p>
     * </important>
     * <p>
     * Modifies the parameters of a service.
     * </p>
     * <p>
     * For services using the rolling update (<code>ECS</code>) deployment
     * controller, the desired count, deployment configuration, network
     * configuration, task placement constraints and strategies, or task
     * definition used can be updated.
     * </p>
     * <p>
     * For services using the blue/green (<code>CODE_DEPLOY</code>) deployment
     * controller, only the desired count, deployment configuration, task
     * placement constraints and strategies, and health check grace period can
     * be updated using this API. If the network configuration, platform
     * version, or task definition need to be updated, a new AWS CodeDeploy
     * deployment should be created. For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeployment.html"
     * >CreateDeployment</a> in the <i>AWS CodeDeploy API Reference</i>.
     * </p>
     * <p>
     * For services using an external deployment controller, you can update only
     * the desired count, task placement constraints and strategies, and health
     * check grace period using this API. If the launch type, load balancer,
     * network configuration, platform version, or task definition need to be
     * updated, you should create a new task set. For more information, see
     * <a>CreateTaskSet</a>.
     * </p>
     * <p>
     * You can add to or subtract from the number of instantiations of a task
     * definition in a service by specifying the cluster that the service is
     * running in and a new <code>desiredCount</code> parameter.
     * </p>
     * <p>
     * If you have updated the Docker image of your application, you can create
     * a new task definition with that image and deploy it to your service. The
     * service scheduler uses the minimum healthy percent and maximum percent
     * parameters (in the service's deployment configuration) to determine the
     * deployment strategy.
     * </p>
     * <note>
     * <p>
     * If your updated Docker image uses the same tag as what is in the existing
     * task definition for your service (for example,
     * <code>my_image:latest</code>), you do not need to create a new revision
     * of your task definition. You can update the service using the
     * <code>forceNewDeployment</code> option. The new tasks launched by the
     * deployment pull the current image/tag combination from your repository
     * when they start.
     * </p>
     * </note>
     * <p>
     * You can also update the deployment configuration of a service. When a
     * deployment is triggered by updating the task definition of a service, the
     * service scheduler uses the deployment configuration parameters,
     * <code>minimumHealthyPercent</code> and <code>maximumPercent</code>, to
     * determine the deployment strategy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>minimumHealthyPercent</code> is below 100%, the scheduler can
     * ignore <code>desiredCount</code> temporarily during a deployment. For
     * example, if <code>desiredCount</code> is four tasks, a minimum of 50%
     * allows the scheduler to stop two existing tasks before starting two new
     * tasks. Tasks for services that do not use a load balancer are considered
     * healthy if they are in the <code>RUNNING</code> state. Tasks for services
     * that use a load balancer are considered healthy if they are in the
     * <code>RUNNING</code> state and the container instance they are hosted on
     * is reported as healthy by the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on
     * the number of running tasks during a deployment, which enables you to
     * define the deployment batch size. For example, if
     * <code>desiredCount</code> is four tasks, a maximum of 200% starts four
     * new tasks before stopping the four older tasks (provided that the cluster
     * resources required to do this are available).
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <a>UpdateService</a> stops a task during a deployment, the
     * equivalent of <code>docker stop</code> is issued to the containers
     * running in the task. This results in a <code>SIGTERM</code> and a
     * 30-second timeout, after which <code>SIGKILL</code> is sent and the
     * containers are forcibly stopped. If the container handles the
     * <code>SIGTERM</code> gracefully and exits within 30 seconds from
     * receiving it, no <code>SIGKILL</code> is sent.
     * </p>
     * <p>
     * When the service scheduler launches new tasks, it determines task
     * placement in your cluster with the following logic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Determine which of the container instances in your cluster can support
     * your service's task definition (for example, they have the required CPU,
     * memory, ports, and container instance attributes).
     * </p>
     * </li>
     * <li>
     * <p>
     * By default, the service scheduler attempts to balance tasks across
     * Availability Zones in this manner (although you can choose a different
     * placement strategy):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sort the valid container instances by the fewest number of running tasks
     * for this service in the same Availability Zone as the instance. For
     * example, if zone A has one running service task and zones B and C each
     * have zero, valid container instances in either zone B or C are considered
     * optimal for placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * Place the new service task on a valid container instance in an optimal
     * Availability Zone (based on the previous steps), favoring container
     * instances with the fewest number of running tasks for this service.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * When the service scheduler stops running tasks, it attempts to maintain
     * balance across the Availability Zones in your cluster using the following
     * logic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sort the container instances by the largest number of running tasks for
     * this service in the same Availability Zone as the instance. For example,
     * if zone A has one running service task and zones B and C each have two,
     * container instances in either zone B or C are considered optimal for
     * termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stop the task on a container instance in an optimal Availability Zone
     * (based on the previous steps), favoring container instances with the
     * largest number of running tasks for this service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateServiceRequest
     * @return updateServiceResult The response from the UpdateService service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServiceNotFoundException
     * @throws ServiceNotActiveException
     * @throws PlatformUnknownException
     * @throws PlatformTaskDefinitionIncompatibilityException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestMarshaller().marshall(updateServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateServiceResult, JsonUnmarshallerContext> unmarshaller = new UpdateServiceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateServiceResult> responseHandler = new JsonResponseHandler<UpdateServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies which task set in a service is the primary task set. Any
     * parameters that are updated on the primary task set in a service will
     * transition to the service. This is used when a service uses the
     * <code>EXTERNAL</code> deployment controller type. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
     * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param updateServicePrimaryTaskSetRequest
     * @return updateServicePrimaryTaskSetResult The response from the
     *         UpdateServicePrimaryTaskSet service method, as returned by Amazon
     *         EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws ServiceNotFoundException
     * @throws ServiceNotActiveException
     * @throws TaskSetNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateServicePrimaryTaskSetResult updateServicePrimaryTaskSet(
            UpdateServicePrimaryTaskSetRequest updateServicePrimaryTaskSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateServicePrimaryTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServicePrimaryTaskSetRequest> request = null;
        Response<UpdateServicePrimaryTaskSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServicePrimaryTaskSetRequestMarshaller()
                        .marshall(updateServicePrimaryTaskSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateServicePrimaryTaskSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateServicePrimaryTaskSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateServicePrimaryTaskSetResult> responseHandler = new JsonResponseHandler<UpdateServicePrimaryTaskSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies a task set. This is used when a service uses the
     * <code>EXTERNAL</code> deployment controller type. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
     * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param updateTaskSetRequest
     * @return updateTaskSetResult The response from the UpdateTaskSet service
     *         method, as returned by Amazon EC2 Container Service.
     * @throws ServerException
     * @throws ClientException
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws UnsupportedFeatureException
     * @throws AccessDeniedException
     * @throws ServiceNotFoundException
     * @throws ServiceNotActiveException
     * @throws TaskSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateTaskSetResult updateTaskSet(UpdateTaskSetRequest updateTaskSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTaskSetRequest> request = null;
        Response<UpdateTaskSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTaskSetRequestMarshaller().marshall(updateTaskSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTaskSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateTaskSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTaskSetResult> responseHandler = new JsonResponseHandler<UpdateTaskSetResult>(
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
