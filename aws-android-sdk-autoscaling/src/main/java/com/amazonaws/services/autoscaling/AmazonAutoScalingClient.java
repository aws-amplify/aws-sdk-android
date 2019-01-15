/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling;

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

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.services.autoscaling.model.transform.*;

/**
 * Client for accessing Amazon Auto Scaling. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon EC2 Auto Scaling</fullname>
 * <p>
 * Amazon EC2 Auto Scaling is designed to automatically launch or terminate EC2
 * instances based on user-defined policies, schedules, and health checks. Use
 * this service with AWS Auto Scaling, Amazon CloudWatch, and Elastic Load
 * Balancing.
 * </p>
 * <p>
 * For more information, see the <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html"
 * >Amazon EC2 Auto Scaling User Guide</a>.
 * </p>
 */
public class AmazonAutoScalingClient extends AmazonWebServiceClient implements AmazonAutoScaling {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Auto Scaling exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling. A
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
    public AmazonAutoScalingClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling. A
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
     *            how this client connects to AmazonAutoScaling (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonAutoScalingClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling
     * using the specified AWS account credentials.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonAutoScalingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling
     * using the specified AWS account credentials and client configuration
     * options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonAutoScaling (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonAutoScalingClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling
     * using the specified AWS account credentials provider.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling
     * using the specified AWS account credentials provider and client
     * configuration options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonAutoScaling (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling
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
     *            how this client connects to AmazonAutoScaling (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAutoScaling
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
     *            how this client connects to AmazonAutoScaling (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceContentionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScalingActivityInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceLinkedRoleFailureExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("autoscaling.amazonaws.com");
        this.endpointPrefix = "autoscaling";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/autoscaling/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/autoscaling/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Amazon EC2 Auto Scaling increases the desired
     * capacity of the group by the number of instances being attached. If the
     * number of instances being attached plus the desired capacity of the group
     * exceeds the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to your Auto Scaling group,
     * the instances are also registered with the load balancer. If there are
     * target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-instance-asg.html"
     * >Attach EC2 Instances to Your Auto Scaling Group</a> in the <i>Amazon EC2
     * Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void attachInstances(AttachInstancesRequest attachInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachInstancesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AttachInstancesRequestMarshaller().marshall(attachInstancesRequest);
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
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * To describe the target groups for an Auto Scaling group, use
     * <a>DescribeLoadBalancerTargetGroups</a>. To detach the target group from
     * the Auto Scaling group, use <a>DetachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html"
     * >Attach a Load Balancer to Your Auto Scaling Group</a> in the <i>Amazon
     * EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     * @return attachLoadBalancerTargetGroupsResult The response from the
     *         AttachLoadBalancerTargetGroups service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachLoadBalancerTargetGroupsResult attachLoadBalancerTargetGroups(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancerTargetGroupsRequest> request = null;
        Response<AttachLoadBalancerTargetGroupsResult> response = null;
        try {
            request = new AttachLoadBalancerTargetGroupsRequestMarshaller()
                    .marshall(attachLoadBalancerTargetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AttachLoadBalancerTargetGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * To attach an Application Load Balancer instead, see
     * <a>AttachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use
     * <a>DescribeLoadBalancers</a>. To detach the load balancer from the Auto
     * Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html"
     * >Attach a Load Balancer to Your Auto Scaling Group</a> in the <i>Amazon
     * EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @return attachLoadBalancersResult The response from the
     *         AttachLoadBalancers service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachLoadBalancersResult attachLoadBalancers(
            AttachLoadBalancersRequest attachLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancersRequest> request = null;
        Response<AttachLoadBalancersResult> response = null;
        try {
            request = new AttachLoadBalancersRequestMarshaller()
                    .marshall(attachLoadBalancersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AttachLoadBalancersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @return batchDeleteScheduledActionResult The response from the
     *         BatchDeleteScheduledAction service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeleteScheduledActionResult batchDeleteScheduledAction(
            BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteScheduledActionRequest> request = null;
        Response<BatchDeleteScheduledActionResult> response = null;
        try {
            request = new BatchDeleteScheduledActionRequestMarshaller()
                    .marshall(batchDeleteScheduledActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new BatchDeleteScheduledActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto
     * Scaling group. If you leave a parameter unspecified when updating a
     * scheduled scaling action, the corresponding value remains unchanged.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @return batchPutScheduledUpdateGroupActionResult The response from the
     *         BatchPutScheduledUpdateGroupAction service method, as returned by
     *         Amazon Auto Scaling.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchPutScheduledUpdateGroupActionResult batchPutScheduledUpdateGroupAction(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchPutScheduledUpdateGroupActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutScheduledUpdateGroupActionRequest> request = null;
        Response<BatchPutScheduledUpdateGroupActionResult> response = null;
        try {
            request = new BatchPutScheduledUpdateGroupActionRequestMarshaller()
                    .marshall(batchPutScheduledUpdateGroupActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new BatchPutScheduledUpdateGroupActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with
     * the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an
     * Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch
     * Events to invoke your Lambda function when Amazon EC2 Auto Scaling
     * launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can
     * be either an Amazon SQS queue or an Amazon SNS topic. The role allows
     * Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the
     * instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the
     * instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle
     * action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @return completeLifecycleActionResult The response from the
     *         CompleteLifecycleAction service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CompleteLifecycleActionResult completeLifecycleAction(
            CompleteLifecycleActionRequest completeLifecycleActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(completeLifecycleActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteLifecycleActionRequest> request = null;
        Response<CompleteLifecycleActionResult> response = null;
        try {
            request = new CompleteLifecycleActionRequestMarshaller()
                    .marshall(completeLifecycleActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CompleteLifecycleActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, the call fails.
     * For information about viewing this limit, see
     * <a>DescribeAccountLimits</a>. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html"
     * >Auto Scaling Limits</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroup.html"
     * >Auto Scaling Groups</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void createAutoScalingGroup(CreateAutoScalingGroupRequest createAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutoScalingGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new CreateAutoScalingGroupRequestMarshaller()
                    .marshall(createAutoScalingGroupRequest);
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
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, the call
     * fails. For information about viewing this limit, see
     * <a>DescribeAccountLimits</a>. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html"
     * >Auto Scaling Limits</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchConfiguration.html"
     * >Launch Configurations</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void createLaunchConfiguration(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLaunchConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new CreateLaunchConfigurationRequestMarshaller()
                    .marshall(createLaunchConfigurationRequest);
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
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation
     * overwrites the previous tag definition, and you do not get an error
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws ResourceContentionException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void createOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createOrUpdateTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrUpdateTagsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new CreateOrUpdateTagsRequestMarshaller().marshall(createOrUpdateTagsRequest);
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
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must
     * specify the option to force the deletion in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the
     * underlying alarm actions, and any alarm that no longer has an associated
     * action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call
     * <a>DetachInstances</a> with the list of instances and the option to
     * decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling
     * does not launch replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call
     * <a>UpdateAutoScalingGroup</a> and set the minimum size and desired
     * capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @throws ScalingActivityInProgressException
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteAutoScalingGroup(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAutoScalingGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteAutoScalingGroupRequestMarshaller()
                    .marshall(deleteAutoScalingGroupRequest);
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
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group.
     * When this call completes, the launch configuration is no longer available
     * for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteLaunchConfiguration(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLaunchConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteLaunchConfigurationRequestMarshaller()
                    .marshall(deleteLaunchConfigurationRequest);
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
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first
     * (<code>ABANDON</code> for launching instances, <code>CONTINUE</code> for
     * terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @return deleteLifecycleHookResult The response from the
     *         DeleteLifecycleHook service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteLifecycleHookResult deleteLifecycleHook(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLifecycleHookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLifecycleHookRequest> request = null;
        Response<DeleteLifecycleHookResult> response = null;
        try {
            request = new DeleteLifecycleHookRequestMarshaller()
                    .marshall(deleteLifecycleHookRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteLifecycleHookResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteNotificationConfiguration(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteNotificationConfigurationRequestMarshaller()
                    .marshall(deleteNotificationConfigurationRequest);
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
     * Deletes the specified Auto Scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not
     * delete the alarm, even if it no longer has an associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeletePolicyRequestMarshaller().marshall(deletePolicyRequest);
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
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledActionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteScheduledActionRequestMarshaller()
                    .marshall(deleteScheduledActionRequest);
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
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @throws ResourceContentionException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
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
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html"
     * >Auto Scaling Limits</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return describeAccountLimitsResult The response from the
     *         DescribeAccountLimits service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return describeAdjustmentTypesResult The response from the
     *         DescribeAdjustmentTypes service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAdjustmentTypesResult describeAdjustmentTypes(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAdjustmentTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAdjustmentTypesRequest> request = null;
        Response<DescribeAdjustmentTypesResult> response = null;
        try {
            request = new DescribeAdjustmentTypesRequestMarshaller()
                    .marshall(describeAdjustmentTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAdjustmentTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return describeAutoScalingGroupsResult The response from the
     *         DescribeAutoScalingGroups service method, as returned by Amazon
     *         Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAutoScalingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingGroupsRequest> request = null;
        Response<DescribeAutoScalingGroupsResult> response = null;
        try {
            request = new DescribeAutoScalingGroupsRequestMarshaller()
                    .marshall(describeAutoScalingGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAutoScalingGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return describeAutoScalingInstancesResult The response from the
     *         DescribeAutoScalingInstances service method, as returned by
     *         Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAutoScalingInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingInstancesRequest> request = null;
        Response<DescribeAutoScalingInstancesResult> response = null;
        try {
            request = new DescribeAutoScalingInstancesRequestMarshaller()
                    .marshall(describeAutoScalingInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAutoScalingInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto
     * Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return describeAutoScalingNotificationTypesResult The response from the
     *         DescribeAutoScalingNotificationTypes service method, as returned
     *         by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAutoScalingNotificationTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingNotificationTypesRequest> request = null;
        Response<DescribeAutoScalingNotificationTypesResult> response = null;
        try {
            request = new DescribeAutoScalingNotificationTypesRequestMarshaller()
                    .marshall(describeAutoScalingNotificationTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeAutoScalingNotificationTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return describeLaunchConfigurationsResult The response from the
     *         DescribeLaunchConfigurations service method, as returned by
     *         Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLaunchConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLaunchConfigurationsRequest> request = null;
        Response<DescribeLaunchConfigurationsResult> response = null;
        try {
            request = new DescribeLaunchConfigurationsRequestMarshaller()
                    .marshall(describeLaunchConfigurationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLaunchConfigurationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * <p>
     * The following hook types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return describeLifecycleHookTypesResult The response from the
     *         DescribeLifecycleHookTypes service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLifecycleHookTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLifecycleHookTypesRequest> request = null;
        Response<DescribeLifecycleHookTypesResult> response = null;
        try {
            request = new DescribeLifecycleHookTypesRequestMarshaller()
                    .marshall(describeLifecycleHookTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLifecycleHookTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return describeLifecycleHooksResult The response from the
     *         DescribeLifecycleHooks service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLifecycleHooksResult describeLifecycleHooks(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLifecycleHooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLifecycleHooksRequest> request = null;
        Response<DescribeLifecycleHooksResult> response = null;
        try {
            request = new DescribeLifecycleHooksRequestMarshaller()
                    .marshall(describeLifecycleHooksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLifecycleHooksResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @return describeLoadBalancerTargetGroupsResult The response from the
     *         DescribeLoadBalancerTargetGroups service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLoadBalancerTargetGroupsResult describeLoadBalancerTargetGroups(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerTargetGroupsRequest> request = null;
        Response<DescribeLoadBalancerTargetGroupsResult> response = null;
        try {
            request = new DescribeLoadBalancerTargetGroupsRequestMarshaller()
                    .marshall(describeLoadBalancerTargetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeLoadBalancerTargetGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation describes only Classic Load Balancers. If you have
     * Application Load Balancers, use <a>DescribeLoadBalancerTargetGroups</a>
     * instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return describeLoadBalancersResult The response from the
     *         DescribeLoadBalancers service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers(
            DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancersRequest> request = null;
        Response<DescribeLoadBalancersResult> response = null;
        try {
            request = new DescribeLoadBalancersRequestMarshaller()
                    .marshall(describeLoadBalancersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * The <code>GroupStandbyInstances</code> metric is not returned by default.
     * You must explicitly request this metric when calling
     * <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return describeMetricCollectionTypesResult The response from the
     *         DescribeMetricCollectionTypes service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMetricCollectionTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetricCollectionTypesRequest> request = null;
        Response<DescribeMetricCollectionTypesResult> response = null;
        try {
            request = new DescribeMetricCollectionTypesRequestMarshaller()
                    .marshall(describeMetricCollectionTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeMetricCollectionTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return describeNotificationConfigurationsResult The response from the
     *         DescribeNotificationConfigurations service method, as returned by
     *         Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeNotificationConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationConfigurationsRequest> request = null;
        Response<DescribeNotificationConfigurationsResult> response = null;
        try {
            request = new DescribeNotificationConfigurationsRequestMarshaller()
                    .marshall(describeNotificationConfigurationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeNotificationConfigurationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return describePoliciesResult The response from the DescribePolicies
     *         service method, as returned by Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribePoliciesResult describePolicies(DescribePoliciesRequest describePoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePoliciesRequest> request = null;
        Response<DescribePoliciesResult> response = null;
        try {
            request = new DescribePoliciesRequestMarshaller().marshall(describePoliciesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribePoliciesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return describeScalingActivitiesResult The response from the
     *         DescribeScalingActivities service method, as returned by Amazon
     *         Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScalingActivitiesResult describeScalingActivities(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScalingActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingActivitiesRequest> request = null;
        Response<DescribeScalingActivitiesResult> response = null;
        try {
            request = new DescribeScalingActivitiesRequestMarshaller()
                    .marshall(describeScalingActivitiesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeScalingActivitiesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return describeScalingProcessTypesResult The response from the
     *         DescribeScalingProcessTypes service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScalingProcessTypesResult describeScalingProcessTypes(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScalingProcessTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingProcessTypesRequest> request = null;
        Response<DescribeScalingProcessTypesResult> response = null;
        try {
            request = new DescribeScalingProcessTypesRequestMarshaller()
                    .marshall(describeScalingProcessTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeScalingProcessTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return describeScheduledActionsResult The response from the
     *         DescribeScheduledActions service method, as returned by Amazon
     *         Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScheduledActionsResult describeScheduledActions(
            DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScheduledActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledActionsRequest> request = null;
        Response<DescribeScheduledActionsResult> response = null;
        try {
            request = new DescribeScheduledActionsRequestMarshaller()
                    .marshall(describeScheduledActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeScheduledActionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for
     * the tags for a specific Auto Scaling group. You can specify multiple
     * values for a filter. A tag must match at least one of the specified
     * values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information
     * for a particular tag only if it matches all the filters. If there's no
     * match, no special message is returned.
     * </p>
     * 
     * @param describeTagsRequest
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        try {
            request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Auto Scaling Instances Terminate During Scale In</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return describeTerminationPolicyTypesResult The response from the
     *         DescribeTerminationPolicyTypes service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTerminationPolicyTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTerminationPolicyTypesRequest> request = null;
        Response<DescribeTerminationPolicyTypesResult> response = null;
        try {
            request = new DescribeTerminationPolicyTypesRequestMarshaller()
                    .marshall(describeTerminationPolicyTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTerminationPolicyTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independent of the
     * Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity,
     * Amazon EC2 Auto Scaling launches instances to replace the ones that are
     * detached.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to the Auto Scaling group,
     * the instances are deregistered from the load balancer. If there are
     * target groups attached to the Auto Scaling group, the instances are
     * deregistered from the target groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/detach-instance-asg.html"
     * >Detach EC2 Instances from Your Auto Scaling Group</a> in the <i>Amazon
     * EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @return detachInstancesResult The response from the DetachInstances
     *         service method, as returned by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachInstancesResult detachInstances(DetachInstancesRequest detachInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachInstancesRequest> request = null;
        Response<DetachInstancesResult> response = null;
        try {
            request = new DetachInstancesRequestMarshaller().marshall(detachInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetachInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return detachLoadBalancerTargetGroupsResult The response from the
     *         DetachLoadBalancerTargetGroups service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachLoadBalancerTargetGroupsResult detachLoadBalancerTargetGroups(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachLoadBalancerTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachLoadBalancerTargetGroupsRequest> request = null;
        Response<DetachLoadBalancerTargetGroupsResult> response = null;
        try {
            request = new DetachLoadBalancerTargetGroupsRequestMarshaller()
                    .marshall(detachLoadBalancerTargetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetachLoadBalancerTargetGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches one or more Classic Load Balancers from the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * This operation detaches only Classic Load Balancers. If you have
     * Application Load Balancers, use <a>DetachLoadBalancerTargetGroups</a>
     * instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code>
     * state while deregistering the instances in the group. When all instances
     * are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. The instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @return detachLoadBalancersResult The response from the
     *         DetachLoadBalancers service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachLoadBalancersResult detachLoadBalancers(
            DetachLoadBalancersRequest detachLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachLoadBalancersRequest> request = null;
        Response<DetachLoadBalancersResult> response = null;
        try {
            request = new DetachLoadBalancersRequestMarshaller()
                    .marshall(detachLoadBalancersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetachLoadBalancersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void disableMetricsCollection(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableMetricsCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableMetricsCollectionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DisableMetricsCollectionRequestMarshaller()
                    .marshall(disableMetricsCollectionRequest);
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
     * Enables group metrics for the specified Auto Scaling group. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html"
     * >Monitoring Your Auto Scaling Groups and Instances</a> in the <i>Amazon
     * EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void enableMetricsCollection(
            EnableMetricsCollectionRequest enableMetricsCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableMetricsCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableMetricsCollectionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new EnableMetricsCollectionRequestMarshaller()
                    .marshall(enableMetricsCollectionRequest);
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
     * Moves the specified instances into the standby state.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html"
     * >Temporarily Removing Instances from Your Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @return enterStandbyResult The response from the EnterStandby service
     *         method, as returned by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnterStandbyResult enterStandby(EnterStandbyRequest enterStandbyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enterStandbyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnterStandbyRequest> request = null;
        Response<EnterStandbyResult> response = null;
        try {
            request = new EnterStandbyRequestMarshaller().marshall(enterStandbyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new EnterStandbyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void executePolicy(ExecutePolicyRequest executePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(executePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecutePolicyRequest> request = null;
        Response<Void> response = null;
        try {
            request = new ExecutePolicyRequestMarshaller().marshall(executePolicyRequest);
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
     * Moves the specified instances out of the standby state.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html"
     * >Temporarily Removing Instances from Your Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @return exitStandbyResult The response from the ExitStandby service
     *         method, as returned by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ExitStandbyResult exitStandby(ExitStandbyRequest exitStandbyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exitStandbyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExitStandbyRequest> request = null;
        Response<ExitStandbyResult> response = null;
        try {
            request = new ExitStandbyRequestMarshaller().marshall(exitStandbyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ExitStandbyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling group.
     * </p>
     * <p>
     * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an
     * instance that is not actively in service; for example, either when the
     * instance launches or before the instance terminates.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an
     * Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch
     * Events to invoke your Lambda function when Amazon EC2 Auto Scaling
     * launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can
     * be either an Amazon SQS queue or an Amazon SNS topic. The role allows
     * Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the
     * instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the
     * instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle
     * action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html"
     * >Auto Scaling Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is
     * 50 per Auto Scaling group, the call fails. For information about updating
     * this limit, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @return putLifecycleHookResult The response from the PutLifecycleHook
     *         service method, as returned by Amazon Auto Scaling.
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest putLifecycleHookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLifecycleHookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecycleHookRequest> request = null;
        Response<PutLifecycleHookResult> response = null;
        try {
            request = new PutLifecycleHookRequestMarshaller().marshall(putLifecycleHookRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PutLifecycleHookResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to the specified topic can have messages
     * delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html"
     * >Getting SNS Notifications When Your Auto Scaling Group Scales</a> in the
     * <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putNotificationConfiguration(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutNotificationConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new PutNotificationConfigurationRequestMarshaller()
                    .marshall(putNotificationConfigurationRequest);
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
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameters to
     * change. Any existing parameter not changed in an update to an existing
     * policy is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by default is
     * 20 per region, the call fails. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return putScalingPolicyResult The response from the PutScalingPolicy
     *         service method, as returned by Amazon Auto Scaling.
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScalingPolicyRequest> request = null;
        Response<PutScalingPolicyResult> response = null;
        try {
            request = new PutScalingPolicyRequestMarshaller().marshall(putScalingPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PutScalingPolicyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group.
     * If you leave a parameter unspecified when updating a scheduled scaling
     * action, the corresponding value remains unchanged.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html"
     * >Scheduled Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putScheduledUpdateGroupAction(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putScheduledUpdateGroupActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScheduledUpdateGroupActionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new PutScheduledUpdateGroupActionRequestMarshaller()
                    .marshall(putScheduledUpdateGroupActionRequest);
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
     * Records a heartbeat for the lifecycle action associated with the
     * specified token or instance. This extends the timeout by the length of
     * time defined using <a>PutLifecycleHook</a>.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an
     * Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch
     * Events to invoke your Lambda function when Amazon EC2 Auto Scaling
     * launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can
     * be either an Amazon SQS queue or an Amazon SNS topic. The role allows
     * Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the
     * instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep
     * the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle
     * action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @return recordLifecycleActionHeartbeatResult The response from the
     *         RecordLifecycleActionHeartbeat service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(recordLifecycleActionHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecordLifecycleActionHeartbeatRequest> request = null;
        Response<RecordLifecycleActionHeartbeatResult> response = null;
        try {
            request = new RecordLifecycleActionHeartbeatRequestMarshaller()
                    .marshall(recordLifecycleActionHeartbeatRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RecordLifecycleActionHeartbeatResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes the specified suspended automatic scaling processes, or all
     * suspended process, for the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html"
     * >Suspending and Resuming Scaling Processes</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void resumeProcesses(ResumeProcessesRequest resumeProcessesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resumeProcessesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeProcessesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new ResumeProcessesRequestMarshaller().marshall(resumeProcessesRequest);
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
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/WhatIsAutoScaling.html"
     * >What Is Amazon EC2 Auto Scaling?</a> in the <i>Amazon EC2 Auto Scaling
     * User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void setDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setDesiredCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDesiredCapacityRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetDesiredCapacityRequestMarshaller().marshall(setDesiredCapacityRequest);
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
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     * >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void setInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setInstanceHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetInstanceHealthRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetInstanceHealthRequestMarshaller().marshall(setInstanceHealthRequest);
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
     * Updates the instance protection settings of the specified instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @return setInstanceProtectionResult The response from the
     *         SetInstanceProtection service method, as returned by Amazon Auto
     *         Scaling.
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SetInstanceProtectionResult setInstanceProtection(
            SetInstanceProtectionRequest setInstanceProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setInstanceProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetInstanceProtectionRequest> request = null;
        Response<SetInstanceProtectionResult> response = null;
        try {
            request = new SetInstanceProtectionRequestMarshaller()
                    .marshall(setInstanceProtectionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SetInstanceProtectionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends the specified automatic scaling processes, or all processes, for
     * the specified Auto Scaling group.
     * </p>
     * <p>
     * If you suspend either the <code>Launch</code> or <code>Terminate</code>
     * process types, it can prevent other process types from functioning
     * properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html"
     * >Suspending and Resuming Scaling Processes</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void suspendProcesses(SuspendProcessesRequest suspendProcessesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(suspendProcessesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SuspendProcessesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SuspendProcessesRequestMarshaller().marshall(suspendProcessesRequest);
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
     * Terminates the specified instance and optionally adjusts the desired
     * group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not
     * terminated immediately.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @return terminateInstanceInAutoScalingGroupResult The response from the
     *         TerminateInstanceInAutoScalingGroup service method, as returned
     *         by Amazon Auto Scaling.
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(terminateInstanceInAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateInstanceInAutoScalingGroupRequest> request = null;
        Response<TerminateInstanceInAutoScalingGroupResult> response = null;
        try {
            request = new TerminateInstanceInAutoScalingGroupRequestMarshaller()
                    .marshall(terminateInstanceInAutoScalingGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new TerminateInstanceInAutoScalingGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * The new settings take effect on any scaling activities after this call
     * returns. Scaling activities that are currently in progress aren't
     * affected.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with
     * <code>InstanceMonitoring</code> set to <code>false</code>, you must first
     * disable the collection of group metrics. Otherwise, you get an error. If
     * you have previously enabled the collection of group metrics, you can
     * disable it using <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a
     * value for <code>DesiredCapacity</code>, and the new <code>MinSize</code>
     * is larger than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value
     * of <code>MinSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a
     * value for <code>DesiredCapacity</code>, and the new <code>MaxSize</code>
     * is smaller than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value
     * of <code>MaxSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAutoScalingGroupRequest
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateAutoScalingGroup(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAutoScalingGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new UpdateAutoScalingGroupRequestMarshaller()
                    .marshall(updateAutoScalingGroupRequest);
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
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html"
     * >Auto Scaling Limits</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @return describeAccountLimitsResult The response from the
     *         DescribeAccountLimits service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAccountLimitsResult describeAccountLimits()
            throws AmazonServiceException, AmazonClientException {
        DescribeAccountLimitsRequest describeAccountLimitsRequest = new DescribeAccountLimitsRequest();
        return describeAccountLimits(describeAccountLimitsRequest);
    }

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @return describeAutoScalingGroupsResult The response from the
     *         DescribeAutoScalingGroups service method, as returned by Amazon
     *         Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups()
            throws AmazonServiceException, AmazonClientException {
        DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest = new DescribeAutoScalingGroupsRequest();
        return describeAutoScalingGroups(describeAutoScalingGroupsRequest);
    }

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @return describePoliciesResult The response from the DescribePolicies
     *         service method, as returned by Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribePoliciesResult describePolicies()
            throws AmazonServiceException, AmazonClientException {
        DescribePoliciesRequest describePoliciesRequest = new DescribePoliciesRequest();
        return describePolicies(describePoliciesRequest);
    }

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @return describeScalingProcessTypesResult The response from the
     *         DescribeScalingProcessTypes service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScalingProcessTypesResult describeScalingProcessTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest = new DescribeScalingProcessTypesRequest();
        return describeScalingProcessTypes(describeScalingProcessTypesRequest);
    }

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @return describeScalingActivitiesResult The response from the
     *         DescribeScalingActivities service method, as returned by Amazon
     *         Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScalingActivitiesResult describeScalingActivities()
            throws AmazonServiceException, AmazonClientException {
        DescribeScalingActivitiesRequest describeScalingActivitiesRequest = new DescribeScalingActivitiesRequest();
        return describeScalingActivities(describeScalingActivitiesRequest);
    }

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @return describeNotificationConfigurationsResult The response from the
     *         DescribeNotificationConfigurations service method, as returned by
     *         Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations()
            throws AmazonServiceException, AmazonClientException {
        DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest = new DescribeNotificationConfigurationsRequest();
        return describeNotificationConfigurations(describeNotificationConfigurationsRequest);
    }

    /**
     * <p>
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Auto Scaling Instances Terminate During Scale In</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return describeTerminationPolicyTypesResult The response from the
     *         DescribeTerminationPolicyTypes service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest = new DescribeTerminationPolicyTypesRequest();
        return describeTerminationPolicyTypes(describeTerminationPolicyTypesRequest);
    }

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for
     * the tags for a specific Auto Scaling group. You can specify multiple
     * values for a filter. A tag must match at least one of the specified
     * values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information
     * for a particular tag only if it matches all the filters. If there's no
     * match, no special message is returned.
     * </p>
     * 
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTagsResult describeTags()
            throws AmazonServiceException, AmazonClientException {
        DescribeTagsRequest describeTagsRequest = new DescribeTagsRequest();
        return describeTags(describeTagsRequest);
    }

    /**
     * <p>
     * Detaches one or more Classic Load Balancers from the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * This operation detaches only Classic Load Balancers. If you have
     * Application Load Balancers, use <a>DetachLoadBalancerTargetGroups</a>
     * instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code>
     * state while deregistering the instances in the group. When all instances
     * are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. The instances remain running.
     * </p>
     * 
     * @return detachLoadBalancersResult The response from the
     *         DetachLoadBalancers service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetachLoadBalancersResult detachLoadBalancers()
            throws AmazonServiceException, AmazonClientException {
        DetachLoadBalancersRequest detachLoadBalancersRequest = new DetachLoadBalancersRequest();
        return detachLoadBalancers(detachLoadBalancersRequest);
    }

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto
     * Scaling.
     * </p>
     * 
     * @return describeAutoScalingNotificationTypesResult The response from the
     *         DescribeAutoScalingNotificationTypes service method, as returned
     *         by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest = new DescribeAutoScalingNotificationTypesRequest();
        return describeAutoScalingNotificationTypes(describeAutoScalingNotificationTypesRequest);
    }

    /**
     * <p>
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * To attach an Application Load Balancer instead, see
     * <a>AttachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use
     * <a>DescribeLoadBalancers</a>. To detach the load balancer from the Auto
     * Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html"
     * >Attach a Load Balancer to Your Auto Scaling Group</a> in the <i>Amazon
     * EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return attachLoadBalancersResult The response from the
     *         AttachLoadBalancers service method, as returned by Amazon Auto
     *         Scaling.
     * @throws ResourceContentionException
     * @throws ServiceLinkedRoleFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AttachLoadBalancersResult attachLoadBalancers()
            throws AmazonServiceException, AmazonClientException {
        AttachLoadBalancersRequest attachLoadBalancersRequest = new AttachLoadBalancersRequest();
        return attachLoadBalancers(attachLoadBalancersRequest);
    }

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @return describeAutoScalingInstancesResult The response from the
     *         DescribeAutoScalingInstances service method, as returned by
     *         Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances()
            throws AmazonServiceException, AmazonClientException {
        DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest = new DescribeAutoScalingInstancesRequest();
        return describeAutoScalingInstances(describeAutoScalingInstancesRequest);
    }

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * <p>
     * The following hook types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @return describeLifecycleHookTypesResult The response from the
     *         DescribeLifecycleHookTypes service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest = new DescribeLifecycleHookTypesRequest();
        return describeLifecycleHookTypes(describeLifecycleHookTypesRequest);
    }

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @return describeLaunchConfigurationsResult The response from the
     *         DescribeLaunchConfigurations service method, as returned by
     *         Amazon Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations()
            throws AmazonServiceException, AmazonClientException {
        DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest = new DescribeLaunchConfigurationsRequest();
        return describeLaunchConfigurations(describeLaunchConfigurationsRequest);
    }

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @return describeAdjustmentTypesResult The response from the
     *         DescribeAdjustmentTypes service method, as returned by Amazon
     *         Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAdjustmentTypesResult describeAdjustmentTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest = new DescribeAdjustmentTypesRequest();
        return describeAdjustmentTypes(describeAdjustmentTypesRequest);
    }

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @return describeScheduledActionsResult The response from the
     *         DescribeScheduledActions service method, as returned by Amazon
     *         Auto Scaling.
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScheduledActionsResult describeScheduledActions()
            throws AmazonServiceException, AmazonClientException {
        DescribeScheduledActionsRequest describeScheduledActionsRequest = new DescribeScheduledActionsRequest();
        return describeScheduledActions(describeScheduledActionsRequest);
    }

    /**
     * <p>
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * The <code>GroupStandbyInstances</code> metric is not returned by default.
     * You must explicitly request this metric when calling
     * <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @return describeMetricCollectionTypesResult The response from the
     *         DescribeMetricCollectionTypes service method, as returned by
     *         Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest = new DescribeMetricCollectionTypesRequest();
        return describeMetricCollectionTypes(describeMetricCollectionTypesRequest);
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
