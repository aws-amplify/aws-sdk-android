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

package com.amazonaws.services.cloudformation;

import org.w3c.dom.*;

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

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.model.transform.*;

/**
 * Client for accessing AWS CloudFormation. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation allows you to create and manage AWS infrastructure
 * deployments predictably and repeatedly. You can use AWS CloudFormation to
 * leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic
 * Block Store, Amazon Simple Notification Service, Elastic Load Balancing, and
 * Auto Scaling to build highly-reliable, highly scalable, cost-effective
 * applications without creating or configuring the underlying AWS
 * infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies
 * in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about AWS CloudFormation, see the <a
 * href="http://aws.amazon.com/cloudformation/">AWS CloudFormation Product
 * Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional
 * technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="https://docs.aws.amazon.com/">docs.aws.amazon.com</a>.
 * </p>
 */
public class AWSCloudFormationClient extends AmazonWebServiceClient implements AWSCloudFormation {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS CloudFormation exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation. A
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
    public AWSCloudFormationClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation. A
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
     *            how this client connects to AWSCloudFormation (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCloudFormationClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation
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
     *         AWSCloudFormationClient client = new AWSCloudFormationClient(AWSMobileClient.getInstance());
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
    public AWSCloudFormationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation
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
     *         AWSCloudFormationClient client = new AWSCloudFormationClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCloudFormation (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSCloudFormationClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation
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
     *         AWSCloudFormationClient client = new AWSCloudFormationClient(AWSMobileClient.getInstance());
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
    public AWSCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation
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
     *         AWSCloudFormationClient client = new AWSCloudFormationClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCloudFormation (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation
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
     *            how this client connects to AWSCloudFormation (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudFormation
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
     *         AWSCloudFormationClient client = new AWSCloudFormationClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCloudFormation (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CFNRegistryExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ChangeSetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CreatedButModifiedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCapabilitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidChangeSetStatusExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidStateTransitionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NameAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationIdAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationStatusCheckFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StackInstanceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StackSetNotEmptyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StackSetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StaleRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TokenAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TypeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudformation.us-east-1.amazonaws.com");
        this.endpointPrefix = "cloudformation";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudformation/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudformation/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the previous
     * stack configuration.
     * </p>
     * <note>
     * <p>
     * You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.
     * </p>
     * </note>
     * 
     * @param cancelUpdateStackRequest <p>
     *            The input for the <a>CancelUpdateStack</a> action.
     *            </p>
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void cancelUpdateStack(CancelUpdateStackRequest cancelUpdateStackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelUpdateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelUpdateStackRequest> request = null;
        Response<Void> response = null;
        try {
            request = new CancelUpdateStackRequestMarshaller().marshall(cancelUpdateStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code>
     * state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of
     * the failure, you can manually <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the
     * rollback, you can return your stack to a working state (the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the
     * stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS
     * CloudFormation cannot roll back all changes after a failed stack update.
     * For example, you might have a stack that is rolling back to an old
     * database instance that was deleted outside of AWS CloudFormation. Because
     * AWS CloudFormation doesn't know the database was deleted, it assumes that
     * the database instance still exists and attempts to roll back to it,
     * causing the update rollback to fail.
     * </p>
     * 
     * @param continueUpdateRollbackRequest <p>
     *            The input for the <a>ContinueUpdateRollback</a> action.
     *            </p>
     * @return continueUpdateRollbackResult The response from the
     *         ContinueUpdateRollback service method, as returned by AWS
     *         CloudFormation.
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ContinueUpdateRollbackResult continueUpdateRollback(
            ContinueUpdateRollbackRequest continueUpdateRollbackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(continueUpdateRollbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ContinueUpdateRollbackRequest> request = null;
        Response<ContinueUpdateRollbackResult> response = null;
        try {
            request = new ContinueUpdateRollbackRequestMarshaller()
                    .marshall(continueUpdateRollbackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ContinueUpdateRollbackResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a list of changes that will be applied to a stack so that you can
     * review the changes before executing them. You can create a change set for
     * a stack that doesn't exist or an existing stack. If you create a change
     * set for a stack that doesn't exist, the change set shows all of the
     * resources that AWS CloudFormation will create. If you create a change set
     * for an existing stack, AWS CloudFormation compares the stack's
     * information with the information that you submit in the change set and
     * lists the differences. Use change sets to understand which resources AWS
     * CloudFormation will create or change, and how it will change resources in
     * an existing stack, before you create or update a stack.
     * </p>
     * <p>
     * To create a change set for a stack that doesn't exist, for the
     * <code>ChangeSetType</code> parameter, specify <code>CREATE</code>. To
     * create a change set for an existing stack, specify <code>UPDATE</code>
     * for the <code>ChangeSetType</code> parameter. To create a change set for
     * an import operation, specify <code>IMPORT</code> for the
     * <code>ChangeSetType</code> parameter. After the
     * <code>CreateChangeSet</code> call successfully completes, AWS
     * CloudFormation starts creating the change set. To check the status of the
     * change set or to review it, use the <a>DescribeChangeSet</a> action.
     * </p>
     * <p>
     * When you are satisfied with the changes the change set will make, execute
     * the change set by using the <a>ExecuteChangeSet</a> action. AWS
     * CloudFormation doesn't make changes until you execute the change set.
     * </p>
     * 
     * @param createChangeSetRequest <p>
     *            The input for the <a>CreateChangeSet</a> action.
     *            </p>
     * @return createChangeSetResult The response from the CreateChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws AlreadyExistsException
     * @throws InsufficientCapabilitiesException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateChangeSetResult createChangeSet(CreateChangeSetRequest createChangeSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChangeSetRequest> request = null;
        Response<CreateChangeSetResult> response = null;
        try {
            request = new CreateChangeSetRequestMarshaller().marshall(createChangeSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateChangeSetResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> API.
     * </p>
     * 
     * @param createStackRequest <p>
     *            The input for <a>CreateStack</a> action.
     *            </p>
     * @return createStackResult The response from the CreateStack service
     *         method, as returned by AWS CloudFormation.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws TokenAlreadyExistsException
     * @throws InsufficientCapabilitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateStackResult createStack(CreateStackRequest createStackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;
        try {
            request = new CreateStackRequestMarshaller().marshall(createStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStackResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates stack instances for the specified accounts, within the specified
     * Regions. A stack instance refers to a stack in a specific account and
     * Region. You must specify at least one value for either
     * <code>Accounts</code> or <code>DeploymentTargets</code>, and you must
     * specify at least one value for <code>Regions</code>.
     * </p>
     * 
     * @param createStackInstancesRequest
     * @return createStackInstancesResult The response from the
     *         CreateStackInstances service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateStackInstancesResult createStackInstances(
            CreateStackInstancesRequest createStackInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackInstancesRequest> request = null;
        Response<CreateStackInstancesResult> response = null;
        try {
            request = new CreateStackInstancesRequestMarshaller()
                    .marshall(createStackInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStackInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stack set.
     * </p>
     * 
     * @param createStackSetRequest
     * @return createStackSetResult The response from the CreateStackSet service
     *         method, as returned by AWS CloudFormation.
     * @throws NameAlreadyExistsException
     * @throws CreatedButModifiedException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateStackSetResult createStackSet(CreateStackSetRequest createStackSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackSetRequest> request = null;
        Response<CreateStackSetResult> response = null;
        try {
            request = new CreateStackSetRequestMarshaller().marshall(createStackSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStackSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no
     * one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully
     * deleted the change set.
     * </p>
     * 
     * @param deleteChangeSetRequest <p>
     *            The input for the <a>DeleteChangeSet</a> action.
     *            </p>
     * @return deleteChangeSetResult The response from the DeleteChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws InvalidChangeSetStatusException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteChangeSetResult deleteChangeSet(DeleteChangeSetRequest deleteChangeSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChangeSetRequest> request = null;
        Response<DeleteChangeSetResult> response = null;
        try {
            request = new DeleteChangeSetRequestMarshaller().marshall(deleteChangeSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteChangeSetResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the
     * <a>DescribeStacks</a> API if the deletion has been completed
     * successfully.
     * </p>
     * 
     * @param deleteStackRequest <p>
     *            The input for <a>DeleteStack</a> action.
     *            </p>
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteStackRequestMarshaller().marshall(deleteStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes stack instances for the specified accounts, in the specified
     * Regions.
     * </p>
     * 
     * @param deleteStackInstancesRequest
     * @return deleteStackInstancesResult The response from the
     *         DeleteStackInstances service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteStackInstancesResult deleteStackInstances(
            DeleteStackInstancesRequest deleteStackInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackInstancesRequest> request = null;
        Response<DeleteStackInstancesResult> response = null;
        try {
            request = new DeleteStackInstancesRequestMarshaller()
                    .marshall(deleteStackInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteStackInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a stack set. Before you can delete a stack set, all of its member
     * stack instances must be deleted. For more information about how to do
     * this, see <a>DeleteStackInstances</a>.
     * </p>
     * 
     * @param deleteStackSetRequest
     * @return deleteStackSetResult The response from the DeleteStackSet service
     *         method, as returned by AWS CloudFormation.
     * @throws StackSetNotEmptyException
     * @throws OperationInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest deleteStackSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackSetRequest> request = null;
        Response<DeleteStackSetResult> response = null;
        try {
            request = new DeleteStackSetRequestMarshaller().marshall(deleteStackSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteStackSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a type or type version from active use in the CloudFormation
     * registry. If a type or type version is deregistered, it cannot be used in
     * CloudFormation operations.
     * </p>
     * <p>
     * To deregister a type, you must individually deregister all registered
     * versions of that type. If a type has only a single registered version,
     * deregistering that version results in the type itself being deregistered.
     * </p>
     * <p>
     * You cannot deregister the default version of a type, unless it is the
     * only registered version of that type, in which case the type itself is
     * deregistered as well.
     * </p>
     * 
     * @param deregisterTypeRequest
     * @return deregisterTypeResult The response from the DeregisterType service
     *         method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws TypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeregisterTypeResult deregisterType(DeregisterTypeRequest deregisterTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTypeRequest> request = null;
        Response<DeregisterTypeResult> response = null;
        try {
            request = new DeregisterTypeRequestMarshaller().marshall(deregisterTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeregisterTypeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum
     * number of stacks that you can create in your account. For more
     * information about account limits, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
     * >AWS CloudFormation Limits</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest <p>
     *            The input for the <a>DescribeAccountLimits</a> action.
     *            </p>
     * @return describeAccountLimitsResult The response from the
     *         DescribeAccountLimits service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeAccountLimitsResult describeAccountLimits(
            DescribeAccountLimitsRequest describeAccountLimitsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccountLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountLimitsRequest> request = null;
        Response<DescribeAccountLimitsResult> response = null;
        try {
            request = new DescribeAccountLimitsRequestMarshaller()
                    .marshall(describeAccountLimitsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAccountLimitsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS
     * CloudFormation will make if you execute the change set. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * 
     * @param describeChangeSetRequest <p>
     *            The input for the <a>DescribeChangeSet</a> action.
     *            </p>
     * @return describeChangeSetResult The response from the DescribeChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws ChangeSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeChangeSetResult describeChangeSet(
            DescribeChangeSetRequest describeChangeSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChangeSetRequest> request = null;
        Response<DescribeChangeSetResult> response = null;
        try {
            request = new DescribeChangeSetRequestMarshaller().marshall(describeChangeSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeChangeSetResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a stack drift detection operation. A stack
     * drift detection operation detects whether a stack's actual configuration
     * differs, or has <i>drifted</i>, from it's expected configuration, as
     * defined in the stack template and any values specified as template
     * parameters. A stack is considered to have drifted if one or more of its
     * resources have drifted. For more information on stack and resource drift,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <a>DetectStackDrift</a> to initiate a stack drift detection
     * operation. <code>DetectStackDrift</code> returns a
     * <code>StackDriftDetectionId</code> you can use to monitor the progress of
     * the operation using <code>DescribeStackDriftDetectionStatus</code>. Once
     * the drift detection operation has completed, use
     * <a>DescribeStackResourceDrifts</a> to return drift information about the
     * stack and its resources.
     * </p>
     * 
     * @param describeStackDriftDetectionStatusRequest
     * @return describeStackDriftDetectionStatusResult The response from the
     *         DescribeStackDriftDetectionStatus service method, as returned by
     *         AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackDriftDetectionStatusResult describeStackDriftDetectionStatus(
            DescribeStackDriftDetectionStatusRequest describeStackDriftDetectionStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackDriftDetectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackDriftDetectionStatusRequest> request = null;
        Response<DescribeStackDriftDetectionStatusResult> response = null;
        try {
            request = new DescribeStackDriftDetectionStatusRequestMarshaller()
                    .marshall(describeStackDriftDetectionStatusRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeStackDriftDetectionStatusResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all stack related events for a specified stack in reverse
     * chronological order. For more information about a stack's event history,
     * go to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"
     * >Stacks</a> in the AWS CloudFormation User Guide.
     * </p>
     * <note>
     * <p>
     * You can list events for stacks that have failed to create or have been
     * deleted by specifying the unique stack identifier (stack ID).
     * </p>
     * </note>
     * 
     * @param describeStackEventsRequest <p>
     *            The input for <a>DescribeStackEvents</a> action.
     *            </p>
     * @return describeStackEventsResult The response from the
     *         DescribeStackEvents service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackEventsResult describeStackEvents(
            DescribeStackEventsRequest describeStackEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackEventsRequest> request = null;
        Response<DescribeStackEventsResult> response = null;
        try {
            request = new DescribeStackEventsRequestMarshaller()
                    .marshall(describeStackEventsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackEventsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the stack instance that's associated with the specified stack
     * set, AWS account, and Region.
     * </p>
     * <p>
     * For a list of stack instances that are associated with a specific stack
     * set, use <a>ListStackInstances</a>.
     * </p>
     * 
     * @param describeStackInstanceRequest
     * @return describeStackInstanceResult The response from the
     *         DescribeStackInstance service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws StackInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackInstanceResult describeStackInstance(
            DescribeStackInstanceRequest describeStackInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackInstanceRequest> request = null;
        Response<DescribeStackInstanceResult> response = null;
        try {
            request = new DescribeStackInstanceRequestMarshaller()
                    .marshall(describeStackInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackInstanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     * 
     * @param describeStackResourceRequest <p>
     *            The input for <a>DescribeStackResource</a> action.
     *            </p>
     * @return describeStackResourceResult The response from the
     *         DescribeStackResource service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackResourceResult describeStackResource(
            DescribeStackResourceRequest describeStackResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourceRequest> request = null;
        Response<DescribeStackResourceResult> response = null;
        try {
            request = new DescribeStackResourceRequestMarshaller()
                    .marshall(describeStackResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackResourceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns drift information for the resources that have been checked for
     * drift in the specified stack. This includes actual and expected
     * configuration values for resources where AWS CloudFormation detects
     * configuration drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for
     * each stack resource that has been checked for drift. Resources that have
     * not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included.
     * For a list of resources that support drift detection, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * Use <a>DetectStackResourceDrift</a> to detect drift on individual
     * resources, or <a>DetectStackDrift</a> to detect drift on all supported
     * resources for a given stack.
     * </p>
     * 
     * @param describeStackResourceDriftsRequest
     * @return describeStackResourceDriftsResult The response from the
     *         DescribeStackResourceDrifts service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackResourceDriftsResult describeStackResourceDrifts(
            DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackResourceDriftsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourceDriftsRequest> request = null;
        Response<DescribeStackResourceDriftsResult> response = null;
        try {
            request = new DescribeStackResourceDriftsRequestMarshaller()
                    .marshall(describeStackResourceDriftsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackResourceDriftsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code> is
     * specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <note>
     * <p>
     * Only the first 100 resources will be returned. If your stack has more
     * resources than this, you should use <code>ListStackResources</code>
     * instead.
     * </p>
     * </note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code>, but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result. For
     * more information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code>, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/"
     * >AWS CloudFormation User Guide</a>.
     * </p>
     * <note>
     * <p>
     * A <code>ValidationError</code> is returned if you specify both
     * <code>StackName</code> and <code>PhysicalResourceId</code> in the same
     * request.
     * </p>
     * </note>
     * 
     * @param describeStackResourcesRequest <p>
     *            The input for <a>DescribeStackResources</a> action.
     *            </p>
     * @return describeStackResourcesResult The response from the
     *         DescribeStackResources service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackResourcesResult describeStackResources(
            DescribeStackResourcesRequest describeStackResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourcesRequest> request = null;
        Response<DescribeStackResourcesResult> response = null;
        try {
            request = new DescribeStackResourcesRequestMarshaller()
                    .marshall(describeStackResourcesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackResourcesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of the specified stack set.
     * </p>
     * 
     * @param describeStackSetRequest
     * @return describeStackSetResult The response from the DescribeStackSet
     *         service method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackSetResult describeStackSet(DescribeStackSetRequest describeStackSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackSetRequest> request = null;
        Response<DescribeStackSetResult> response = null;
        try {
            request = new DescribeStackSetRequestMarshaller().marshall(describeStackSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackSetResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of the specified stack set operation.
     * </p>
     * 
     * @param describeStackSetOperationRequest
     * @return describeStackSetOperationResult The response from the
     *         DescribeStackSetOperation service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStackSetOperationResult describeStackSetOperation(
            DescribeStackSetOperationRequest describeStackSetOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStackSetOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackSetOperationRequest> request = null;
        Response<DescribeStackSetOperationResult> response = null;
        try {
            request = new DescribeStackSetOperationRequestMarshaller()
                    .marshall(describeStackSetOperationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackSetOperationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     * <note>
     * <p>
     * If the stack does not exist, an
     * <code>AmazonCloudFormationException</code> is returned.
     * </p>
     * </note>
     * 
     * @param describeStacksRequest <p>
     *            The input for <a>DescribeStacks</a> action.
     *            </p>
     * @return describeStacksResult The response from the DescribeStacks service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;
        try {
            request = new DescribeStacksRequestMarshaller().marshall(describeStacksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStacksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about a type that has been registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code>
     * returns information about that specific type version. Otherwise, it
     * returns information about the default type version.
     * </p>
     * 
     * @param describeTypeRequest
     * @return describeTypeResult The response from the DescribeType service
     *         method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws TypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTypeResult describeType(DescribeTypeRequest describeTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTypeRequest> request = null;
        Response<DescribeTypeResult> response = null;
        try {
            request = new DescribeTypeRequestMarshaller().marshall(describeTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTypeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a type's registration, including its current
     * status and type and version identifiers.
     * </p>
     * <p>
     * When you initiate a registration request using
     * <code> <a>RegisterType</a> </code>, you can then use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of
     * that registration request.
     * </p>
     * <p>
     * Once the registration request has completed, use
     * <code> <a>DescribeType</a> </code> to return detailed informaiton about a
     * type.
     * </p>
     * 
     * @param describeTypeRegistrationRequest
     * @return describeTypeRegistrationResult The response from the
     *         DescribeTypeRegistration service method, as returned by AWS
     *         CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTypeRegistrationResult describeTypeRegistration(
            DescribeTypeRegistrationRequest describeTypeRegistrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTypeRegistrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTypeRegistrationRequest> request = null;
        Response<DescribeTypeRegistrationResult> response = null;
        try {
            request = new DescribeTypeRegistrationRequestMarshaller()
                    .marshall(describeTypeRegistrationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTypeRegistrationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects whether a stack's actual configuration differs, or has
     * <i>drifted</i>, from it's expected configuration, as defined in the stack
     * template and any values specified as template parameters. For each
     * resource in the stack that supports drift detection, AWS CloudFormation
     * compares the actual configuration of the resource with its expected
     * template configuration. Only resource properties explicitly defined in
     * the stack template are checked for drift. A stack is considered to have
     * drifted if one or more of its resources differ from their expected
     * template configurations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackDrift</code> to detect drift on all supported
     * resources for a given stack, or <a>DetectStackResourceDrift</a> to detect
     * drift on individual resources.
     * </p>
     * <p>
     * For a list of stack resources that currently support drift detection, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * <code>DetectStackDrift</code> can take up to several minutes, depending
     * on the number of resources contained within the stack. Use
     * <a>DescribeStackDriftDetectionStatus</a> to monitor the progress of a
     * detect stack drift operation. Once the drift detection operation has
     * completed, use <a>DescribeStackResourceDrifts</a> to return drift
     * information about the stack and its resources.
     * </p>
     * <p>
     * When detecting drift on a stack, AWS CloudFormation does not detect drift
     * on any nested stacks belonging to that stack. Perform
     * <code>DetectStackDrift</code> directly on the nested stack itself.
     * </p>
     * 
     * @param detectStackDriftRequest
     * @return detectStackDriftResult The response from the DetectStackDrift
     *         service method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DetectStackDriftResult detectStackDrift(DetectStackDriftRequest detectStackDriftRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectStackDriftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectStackDriftRequest> request = null;
        Response<DetectStackDriftResult> response = null;
        try {
            request = new DetectStackDriftRequestMarshaller().marshall(detectStackDriftRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetectStackDriftResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about whether a resource's actual configuration
     * differs, or has <i>drifted</i>, from it's expected configuration, as
     * defined in the stack template and any values specified as template
     * parameters. This information includes actual and expected property values
     * for resources in which AWS CloudFormation detects drift. Only resource
     * properties explicitly defined in the stack template are checked for
     * drift. For more information about stack and resource drift, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackResourceDrift</code> to detect drift on individual
     * resources, or <a>DetectStackDrift</a> to detect drift on all resources in
     * a given stack that support drift detection.
     * </p>
     * <p>
     * Resources that do not currently support drift detection cannot be
     * checked. For a list of resources that support drift detection, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param detectStackResourceDriftRequest
     * @return detectStackResourceDriftResult The response from the
     *         DetectStackResourceDrift service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DetectStackResourceDriftResult detectStackResourceDrift(
            DetectStackResourceDriftRequest detectStackResourceDriftRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectStackResourceDriftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectStackResourceDriftRequest> request = null;
        Response<DetectStackResourceDriftResult> response = null;
        try {
            request = new DetectStackResourceDriftRequestMarshaller()
                    .marshall(detectStackResourceDriftRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetectStackResourceDriftResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detect drift on a stack set. When CloudFormation performs drift detection
     * on a stack set, it performs drift detection on the stack associated with
     * each stack instance in the stack set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >How CloudFormation Performs Drift Detection on a Stack Set</a>.
     * </p>
     * <p>
     * <code>DetectStackSetDrift</code> returns the <code>OperationId</code> of
     * the stack set drift detection operation. Use this operation id with
     * <code> <a>DescribeStackSetOperation</a> </code> to monitor the progress
     * of the drift detection operation. The drift detection operation may take
     * some time, depending on the number of stack instances included in the
     * stack set, as well as the number of resources included in each stack.
     * </p>
     * <p>
     * Once the operation has completed, use the following actions to return
     * drift information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackSet</a> </code> to return detailed informaiton
     * about the stack set, including detailed information about the last
     * <i>completed</i> drift operation performed on the stack set. (Information
     * about drift operations that are in progress is not included.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>ListStackInstances</a> </code> to return a list of stack
     * instances belonging to the stack set, including the drift status and last
     * drift time checked of each instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackInstance</a> </code> to return detailed
     * information about a specific stack instance, including its drift status
     * and last drift time checked.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on performing a drift detection operation on a stack
     * set, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >Detecting Unmanaged Changes in Stack Sets</a>.
     * </p>
     * <p>
     * You can only run a single drift detection operation on a given stack set
     * at one time.
     * </p>
     * <p>
     * To stop a drift detection stack set operation, use
     * <code> <a>StopStackSetOperation</a> </code>.
     * </p>
     * 
     * @param detectStackSetDriftRequest
     * @return detectStackSetDriftResult The response from the
     *         DetectStackSetDrift service method, as returned by AWS
     *         CloudFormation.
     * @throws InvalidOperationException
     * @throws OperationInProgressException
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DetectStackSetDriftResult detectStackSetDrift(
            DetectStackSetDriftRequest detectStackSetDriftRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectStackSetDriftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectStackSetDriftRequest> request = null;
        Response<DetectStackSetDriftResult> response = null;
        try {
            request = new DetectStackSetDriftRequestMarshaller()
                    .marshall(detectStackSetDriftRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetectStackSetDriftResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an
     * AWS Simple Monthly Calculator URL with a query string that describes the
     * resources required to run the template.
     * </p>
     * 
     * @param estimateTemplateCostRequest <p>
     *            The input for an <a>EstimateTemplateCost</a> action.
     *            </p>
     * @return estimateTemplateCostResult The response from the
     *         EstimateTemplateCost service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EstimateTemplateCostResult estimateTemplateCost(
            EstimateTemplateCostRequest estimateTemplateCostRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(estimateTemplateCostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EstimateTemplateCostRequest> request = null;
        Response<EstimateTemplateCostResult> response = null;
        try {
            request = new EstimateTemplateCostRequestMarshaller()
                    .marshall(estimateTemplateCostRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new EstimateTemplateCostResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a stack using the input information that was provided when the
     * specified change set was created. After the call successfully completes,
     * AWS CloudFormation starts updating the stack. Use the
     * <a>DescribeStacks</a> action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other
     * change sets associated with the stack because they aren't valid for the
     * updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation
     * enforces the policy during the update. You can't specify a temporary
     * stack policy that overrides the current policy.
     * </p>
     * 
     * @param executeChangeSetRequest <p>
     *            The input for the <a>ExecuteChangeSet</a> action.
     *            </p>
     * @return executeChangeSetResult The response from the ExecuteChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws InvalidChangeSetStatusException
     * @throws ChangeSetNotFoundException
     * @throws InsufficientCapabilitiesException
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ExecuteChangeSetResult executeChangeSet(ExecuteChangeSetRequest executeChangeSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(executeChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteChangeSetRequest> request = null;
        Response<ExecuteChangeSetResult> response = null;
        try {
            request = new ExecuteChangeSetRequestMarshaller().marshall(executeChangeSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ExecuteChangeSetResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a
     * policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest <p>
     *            The input for the <a>GetStackPolicy</a> action.
     *            </p>
     * @return getStackPolicyResult The response from the GetStackPolicy service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetStackPolicyResult getStackPolicy(GetStackPolicyRequest getStackPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStackPolicyRequest> request = null;
        Response<GetStackPolicyResult> response = null;
        try {
            request = new GetStackPolicyRequestMarshaller().marshall(getStackPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetStackPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template
     * for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <note>
     * <p>
     * If the template does not exist, a <code>ValidationError</code> is
     * returned.
     * </p>
     * </note>
     * 
     * @param getTemplateRequest <p>
     *            The input for a <a>GetTemplate</a> action.
     *            </p>
     * @return getTemplateResult The response from the GetTemplate service
     *         method, as returned by AWS CloudFormation.
     * @throws ChangeSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;
        try {
            request = new GetTemplateRequestMarshaller().marshall(getTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetTemplateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types, before
     * you create or update a stack or stack set.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a
     * template, or you can get template information for a stack set, or a
     * running or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template
     * information for up to 90 days after the stack has been deleted. If the
     * template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest <p>
     *            The input for the <a>GetTemplateSummary</a> action.
     *            </p>
     * @return getTemplateSummaryResult The response from the GetTemplateSummary
     *         service method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetTemplateSummaryResult getTemplateSummary(
            GetTemplateSummaryRequest getTemplateSummaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTemplateSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateSummaryRequest> request = null;
        Response<GetTemplateSummaryResult> response = null;
        try {
            request = new GetTemplateSummaryRequestMarshaller().marshall(getTemplateSummaryRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetTemplateSummaryResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For
     * example, AWS CloudFormation lists change sets that are in the
     * <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * 
     * @param listChangeSetsRequest <p>
     *            The input for the <a>ListChangeSets</a> action.
     *            </p>
     * @return listChangeSetsResult The response from the ListChangeSets service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListChangeSetsResult listChangeSets(ListChangeSetsRequest listChangeSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChangeSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangeSetsRequest> request = null;
        Response<ListChangeSetsResult> response = null;
        try {
            request = new ListChangeSetsRequestMarshaller().marshall(listChangeSetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListChangeSetsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all exported output values in the account and Region in which you
     * call this action. Use this action to see the exported output values that
     * you can import into other stacks. To import values, use the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html"
     * > <code>Fn::ImportValue</code> </a> function.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html"
     * > AWS CloudFormation Export Stack Output Values</a>.
     * </p>
     * 
     * @param listExportsRequest
     * @return listExportsResult The response from the ListExports service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListExportsResult listExports(ListExportsRequest listExportsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExportsRequest> request = null;
        Response<ListExportsResult> response = null;
        try {
            request = new ListExportsRequestMarshaller().marshall(listExportsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListExportsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all stacks that are importing an exported output value. To modify
     * or remove an exported output value, first use this action to see which
     * stacks are using it. To see the exported output values in your account,
     * see <a>ListExports</a>.
     * </p>
     * <p>
     * For more information about importing an exported output value, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html"
     * > <code>Fn::ImportValue</code> </a> function.
     * </p>
     * 
     * @param listImportsRequest
     * @return listImportsResult The response from the ListImports service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListImportsResult listImports(ListImportsRequest listImportsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listImportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportsRequest> request = null;
        Response<ListImportsResult> response = null;
        try {
            request = new ListImportsRequestMarshaller().marshall(listImportsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListImportsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about stack instances that are associated
     * with the specified stack set. You can filter for stack instances that are
     * associated with a specific AWS account name or Region.
     * </p>
     * 
     * @param listStackInstancesRequest
     * @return listStackInstancesResult The response from the ListStackInstances
     *         service method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStackInstancesResult listStackInstances(
            ListStackInstancesRequest listStackInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackInstancesRequest> request = null;
        Response<ListStackInstancesResult> response = null;
        try {
            request = new ListStackInstancesRequestMarshaller().marshall(listStackInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStackInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for
     * up to 90 days after the stack has been deleted.
     * </p>
     * 
     * @param listStackResourcesRequest <p>
     *            The input for the <a>ListStackResource</a> action.
     *            </p>
     * @return listStackResourcesResult The response from the ListStackResources
     *         service method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStackResourcesResult listStackResources(
            ListStackResourcesRequest listStackResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackResourcesRequest> request = null;
        Response<ListStackResourcesResult> response = null;
        try {
            request = new ListStackResourcesRequestMarshaller().marshall(listStackResourcesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStackResourcesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about the results of a stack set operation.
     * </p>
     * 
     * @param listStackSetOperationResultsRequest
     * @return listStackSetOperationResultsResult The response from the
     *         ListStackSetOperationResults service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStackSetOperationResultsResult listStackSetOperationResults(
            ListStackSetOperationResultsRequest listStackSetOperationResultsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStackSetOperationResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackSetOperationResultsRequest> request = null;
        Response<ListStackSetOperationResultsResult> response = null;
        try {
            request = new ListStackSetOperationResultsRequestMarshaller()
                    .marshall(listStackSetOperationResultsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStackSetOperationResultsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about operations performed on a stack set.
     * </p>
     * 
     * @param listStackSetOperationsRequest
     * @return listStackSetOperationsResult The response from the
     *         ListStackSetOperations service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStackSetOperationsResult listStackSetOperations(
            ListStackSetOperationsRequest listStackSetOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStackSetOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackSetOperationsRequest> request = null;
        Response<ListStackSetOperationsResult> response = null;
        try {
            request = new ListStackSetOperationsRequestMarshaller()
                    .marshall(listStackSetOperationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStackSetOperationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about stack sets that are associated with the
     * user.
     * </p>
     * 
     * @param listStackSetsRequest
     * @return listStackSetsResult The response from the ListStackSets service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStackSetsResult listStackSets(ListStackSetsRequest listStackSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStackSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackSetsRequest> request = null;
        Response<ListStackSetsResult> response = null;
        try {
            request = new ListStackSetsRequestMarshaller().marshall(listStackSetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStackSetsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been deleted).
     * </p>
     * 
     * @param listStacksRequest <p>
     *            The input for <a>ListStacks</a> action.
     *            </p>
     * @return listStacksResult The response from the ListStacks service method,
     *         as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStacksResult listStacks(ListStacksRequest listStacksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStacksRequest> request = null;
        Response<ListStacksResult> response = null;
        try {
            request = new ListStacksRequestMarshaller().marshall(listStacksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStacksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of registration tokens for the specified type(s).
     * </p>
     * 
     * @param listTypeRegistrationsRequest
     * @return listTypeRegistrationsResult The response from the
     *         ListTypeRegistrations service method, as returned by AWS
     *         CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTypeRegistrationsResult listTypeRegistrations(
            ListTypeRegistrationsRequest listTypeRegistrationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTypeRegistrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTypeRegistrationsRequest> request = null;
        Response<ListTypeRegistrationsResult> response = null;
        try {
            request = new ListTypeRegistrationsRequestMarshaller()
                    .marshall(listTypeRegistrationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTypeRegistrationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about the versions of a type.
     * </p>
     * 
     * @param listTypeVersionsRequest
     * @return listTypeVersionsResult The response from the ListTypeVersions
     *         service method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTypeVersionsResult listTypeVersions(ListTypeVersionsRequest listTypeVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTypeVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTypeVersionsRequest> request = null;
        Response<ListTypeVersionsResult> response = null;
        try {
            request = new ListTypeVersionsRequestMarshaller().marshall(listTypeVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTypeVersionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about types that have been registered with
     * CloudFormation.
     * </p>
     * 
     * @param listTypesRequest
     * @return listTypesResult The response from the ListTypes service method,
     *         as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTypesResult listTypes(ListTypesRequest listTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTypesRequest> request = null;
        Response<ListTypesResult> response = null;
        try {
            request = new ListTypesRequestMarshaller().marshall(listTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTypesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reports progress of a resource handler to CloudFormation.
     * </p>
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>. Do not use this API in your code.
     * </p>
     * 
     * @param recordHandlerProgressRequest
     * @return recordHandlerProgressResult The response from the
     *         RecordHandlerProgress service method, as returned by AWS
     *         CloudFormation.
     * @throws InvalidStateTransitionException
     * @throws OperationStatusCheckFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RecordHandlerProgressResult recordHandlerProgress(
            RecordHandlerProgressRequest recordHandlerProgressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(recordHandlerProgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecordHandlerProgressRequest> request = null;
        Response<RecordHandlerProgressResult> response = null;
        try {
            request = new RecordHandlerProgressRequestMarshaller()
                    .marshall(recordHandlerProgressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RecordHandlerProgressResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a type with the CloudFormation service. Registering a type
     * makes it available for use in CloudFormation templates in your AWS
     * account, and includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Validating the resource schema
     * </p>
     * </li>
     * <li>
     * <p>
     * Determining which handlers have been specified for the resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Making the resource type available for use in your account
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to develop types and ready them for
     * registeration, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html"
     * >Creating Resource Providers</a> in the <i>CloudFormation CLI User
     * Guide</i>.
     * </p>
     * <p>
     * You can have a maximum of 50 resource type versions registered at a time.
     * This maximum is per account and per region. Use <a
     * href="AWSCloudFormation/latest/APIReference/API_DeregisterType.html"
     * >DeregisterType</a> to deregister specific resource type versions if
     * necessary.
     * </p>
     * <p>
     * Once you have initiated a registration request using
     * <code> <a>RegisterType</a> </code>, you can use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of
     * the registration request.
     * </p>
     * 
     * @param registerTypeRequest
     * @return registerTypeResult The response from the RegisterType service
     *         method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RegisterTypeResult registerType(RegisterTypeRequest registerTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTypeRequest> request = null;
        Response<RegisterTypeResult> response = null;
        try {
            request = new RegisterTypeRequestMarshaller().marshall(registerTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RegisterTypeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * 
     * @param setStackPolicyRequest <p>
     *            The input for the <a>SetStackPolicy</a> action.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void setStackPolicy(SetStackPolicyRequest setStackPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetStackPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetStackPolicyRequestMarshaller().marshall(setStackPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify the default version of a type. The default version of a type will
     * be used in CloudFormation operations.
     * </p>
     * 
     * @param setTypeDefaultVersionRequest
     * @return setTypeDefaultVersionResult The response from the
     *         SetTypeDefaultVersion service method, as returned by AWS
     *         CloudFormation.
     * @throws CFNRegistryException
     * @throws TypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SetTypeDefaultVersionResult setTypeDefaultVersion(
            SetTypeDefaultVersionRequest setTypeDefaultVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setTypeDefaultVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTypeDefaultVersionRequest> request = null;
        Response<SetTypeDefaultVersionResult> response = null;
        try {
            request = new SetTypeDefaultVersionRequestMarshaller()
                    .marshall(setTypeDefaultVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SetTypeDefaultVersionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a creation
     * policy or update policy. AWS CloudFormation doesn't proceed with a stack
     * creation or update until resources receive the required number of signals
     * or the timeout period is exceeded. The SignalResource API is useful in
     * cases where you want to send signals from anywhere other than an Amazon
     * EC2 instance.
     * </p>
     * 
     * @param signalResourceRequest <p>
     *            The input for the <a>SignalResource</a> action.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void signalResource(SignalResourceRequest signalResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(signalResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignalResourceRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SignalResourceRequestMarshaller().marshall(signalResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an in-progress operation on a stack set and its associated stack
     * instances.
     * </p>
     * 
     * @param stopStackSetOperationRequest
     * @return stopStackSetOperationResult The response from the
     *         StopStackSetOperation service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationNotFoundException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public StopStackSetOperationResult stopStackSetOperation(
            StopStackSetOperationRequest stopStackSetOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopStackSetOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStackSetOperationRequest> request = null;
        Response<StopStackSetOperationResult> response = null;
        try {
            request = new StopStackSetOperationRequestMarshaller()
                    .marshall(stopStackSetOperationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StopStackSetOperationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack,
     * and monitoring the progress of the update, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"
     * >Updating a Stack</a>.
     * </p>
     * 
     * @param updateStackRequest <p>
     *            The input for an <a>UpdateStack</a> action.
     *            </p>
     * @return updateStackResult The response from the UpdateStack service
     *         method, as returned by AWS CloudFormation.
     * @throws InsufficientCapabilitiesException
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateStackResult updateStack(UpdateStackRequest updateStackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackRequest> request = null;
        Response<UpdateStackResult> response = null;
        try {
            request = new UpdateStackRequestMarshaller().marshall(updateStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStackResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the parameter values for stack instances for the specified
     * accounts, within the specified Regions. A stack instance refers to a
     * stack in a specific account and Region.
     * </p>
     * <p>
     * You can only update stack instances in Regions and accounts where they
     * already exist; to create additional stack instances, use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html"
     * >CreateStackInstances</a>.
     * </p>
     * <p>
     * During stack set updates, any parameters overridden for a stack instance
     * are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only update the parameter <i>values</i> that are specified in the
     * stack set; to add or delete a parameter itself, use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update the stack set template. If you add a
     * parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param updateStackInstancesRequest
     * @return updateStackInstancesResult The response from the
     *         UpdateStackInstances service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws StackInstanceNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateStackInstancesResult updateStackInstances(
            UpdateStackInstancesRequest updateStackInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackInstancesRequest> request = null;
        Response<UpdateStackInstancesResult> response = null;
        try {
            request = new UpdateStackInstancesRequestMarshaller()
                    .marshall(updateStackInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStackInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the stack set, and associated stack instances in the specified
     * accounts and Regions.
     * </p>
     * <p>
     * Even if the stack set operation created by updating the stack set fails
     * (completely or partially, below or above a specified failure tolerance),
     * the stack set is updated with your changes. Subsequent
     * <a>CreateStackInstances</a> calls on the specified stack set use the
     * updated stack set.
     * </p>
     * 
     * @param updateStackSetRequest
     * @return updateStackSetResult The response from the UpdateStackSet service
     *         method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws StackInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateStackSetResult updateStackSet(UpdateStackSetRequest updateStackSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackSetRequest> request = null;
        Response<UpdateStackSetResult> response = null;
        try {
            request = new UpdateStackSetRequestMarshaller().marshall(updateStackSetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStackSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates termination protection for the specified stack. If a user
     * attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     * <p>
     * For <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     * 
     * @param updateTerminationProtectionRequest
     * @return updateTerminationProtectionResult The response from the
     *         UpdateTerminationProtection service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateTerminationProtectionResult updateTerminationProtection(
            UpdateTerminationProtectionRequest updateTerminationProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTerminationProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTerminationProtectionRequest> request = null;
        Response<UpdateTerminationProtectionResult> response = null;
        try {
            request = new UpdateTerminationProtectionRequestMarshaller()
                    .marshall(updateTerminationProtectionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateTerminationProtectionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates a specified template. AWS CloudFormation first checks if the
     * template is valid JSON. If it isn't, AWS CloudFormation checks if the
     * template is valid YAML. If both these checks fail, AWS CloudFormation
     * returns a template validation error.
     * </p>
     * 
     * @param validateTemplateRequest <p>
     *            The input for <a>ValidateTemplate</a> action.
     *            </p>
     * @return validateTemplateResult The response from the ValidateTemplate
     *         service method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest validateTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(validateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateTemplateRequest> request = null;
        Response<ValidateTemplateResult> response = null;
        try {
            request = new ValidateTemplateRequestMarshaller().marshall(validateTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ValidateTemplateResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
