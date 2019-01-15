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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Amazon Auto Scaling asynchronously. <fullname>Amazon
 * EC2 Auto Scaling</fullname>
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
 **/
public class AmazonAutoScalingAsyncClient extends AmazonAutoScalingClient implements
        AmazonAutoScalingAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AmazonAutoScalingAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *            how this client connects to Amazon Auto Scaling (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonAutoScalingAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials. Default client
     * settings will be used, and a fixed size thread pool will be created for
     * executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials,
            ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials, executor
     * service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will
     * be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials provider and
     * client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     */
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Auto Scaling using the specified AWS account credentials provider,
     * executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
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
     * @return A Java Future object containing the response from the
     *         AttachInstances service method, as returned by Amazon Auto
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
    public Future<Void> attachInstancesAsync(final AttachInstancesRequest attachInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                attachInstances(attachInstancesRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         AttachInstances service method, as returned by Amazon Auto
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
    public Future<Void> attachInstancesAsync(final AttachInstancesRequest attachInstancesRequest,
            final AsyncHandler<AttachInstancesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    attachInstances(attachInstancesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(attachInstancesRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            final AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancerTargetGroupsResult>() {
            public AttachLoadBalancerTargetGroupsResult call() throws Exception {
                return attachLoadBalancerTargetGroups(attachLoadBalancerTargetGroupsRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            final AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest,
            final AsyncHandler<AttachLoadBalancerTargetGroupsRequest, AttachLoadBalancerTargetGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancerTargetGroupsResult>() {
            public AttachLoadBalancerTargetGroupsResult call() throws Exception {
                AttachLoadBalancerTargetGroupsResult result = null;
                try {
                    result = attachLoadBalancerTargetGroups(attachLoadBalancerTargetGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(attachLoadBalancerTargetGroupsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            final AttachLoadBalancersRequest attachLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancersResult>() {
            public AttachLoadBalancersResult call() throws Exception {
                return attachLoadBalancers(attachLoadBalancersRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            final AttachLoadBalancersRequest attachLoadBalancersRequest,
            final AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancersResult>() {
            public AttachLoadBalancersResult call() throws Exception {
                AttachLoadBalancersResult result = null;
                try {
                    result = attachLoadBalancers(attachLoadBalancersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(attachLoadBalancersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @return A Java Future object containing the response from the
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
    public Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(
            final BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDeleteScheduledActionResult>() {
            public BatchDeleteScheduledActionResult call() throws Exception {
                return batchDeleteScheduledAction(batchDeleteScheduledActionRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @return A Java Future object containing the response from the
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
    public Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(
            final BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest,
            final AsyncHandler<BatchDeleteScheduledActionRequest, BatchDeleteScheduledActionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDeleteScheduledActionResult>() {
            public BatchDeleteScheduledActionResult call() throws Exception {
                BatchDeleteScheduledActionResult result = null;
                try {
                    result = batchDeleteScheduledAction(batchDeleteScheduledActionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDeleteScheduledActionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto
     * Scaling group. If you leave a parameter unspecified when updating a
     * scheduled scaling action, the corresponding value remains unchanged.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @return A Java Future object containing the response from the
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
    public Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            final BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchPutScheduledUpdateGroupActionResult>() {
            public BatchPutScheduledUpdateGroupActionResult call() throws Exception {
                return batchPutScheduledUpdateGroupAction(batchPutScheduledUpdateGroupActionRequest);
            }
        });
    }

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto
     * Scaling group. If you leave a parameter unspecified when updating a
     * scheduled scaling action, the corresponding value remains unchanged.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @return A Java Future object containing the response from the
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
    public Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            final BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest,
            final AsyncHandler<BatchPutScheduledUpdateGroupActionRequest, BatchPutScheduledUpdateGroupActionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchPutScheduledUpdateGroupActionResult>() {
            public BatchPutScheduledUpdateGroupActionResult call() throws Exception {
                BatchPutScheduledUpdateGroupActionResult result = null;
                try {
                    result = batchPutScheduledUpdateGroupAction(batchPutScheduledUpdateGroupActionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchPutScheduledUpdateGroupActionRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            final CompleteLifecycleActionRequest completeLifecycleActionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CompleteLifecycleActionResult>() {
            public CompleteLifecycleActionResult call() throws Exception {
                return completeLifecycleAction(completeLifecycleActionRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            final CompleteLifecycleActionRequest completeLifecycleActionRequest,
            final AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CompleteLifecycleActionResult>() {
            public CompleteLifecycleActionResult call() throws Exception {
                CompleteLifecycleActionResult result = null;
                try {
                    result = completeLifecycleAction(completeLifecycleActionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(completeLifecycleActionRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         CreateAutoScalingGroup service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> createAutoScalingGroupAsync(
            final CreateAutoScalingGroupRequest createAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createAutoScalingGroup(createAutoScalingGroupRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         CreateAutoScalingGroup service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> createAutoScalingGroupAsync(
            final CreateAutoScalingGroupRequest createAutoScalingGroupRequest,
            final AsyncHandler<CreateAutoScalingGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    createAutoScalingGroup(createAutoScalingGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createAutoScalingGroupRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         CreateLaunchConfiguration service method, as returned by Amazon
     *         Auto Scaling.
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
    public Future<Void> createLaunchConfigurationAsync(
            final CreateLaunchConfigurationRequest createLaunchConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createLaunchConfiguration(createLaunchConfigurationRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         CreateLaunchConfiguration service method, as returned by Amazon
     *         Auto Scaling.
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
    public Future<Void> createLaunchConfigurationAsync(
            final CreateLaunchConfigurationRequest createLaunchConfigurationRequest,
            final AsyncHandler<CreateLaunchConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    createLaunchConfiguration(createLaunchConfigurationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createLaunchConfigurationRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateTags service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> createOrUpdateTagsAsync(
            final CreateOrUpdateTagsRequest createOrUpdateTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createOrUpdateTags(createOrUpdateTagsRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateTags service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> createOrUpdateTagsAsync(
            final CreateOrUpdateTagsRequest createOrUpdateTagsRequest,
            final AsyncHandler<CreateOrUpdateTagsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    createOrUpdateTags(createOrUpdateTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createOrUpdateTagsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DeleteAutoScalingGroup service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> deleteAutoScalingGroupAsync(
            final DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAutoScalingGroup(deleteAutoScalingGroupRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DeleteAutoScalingGroup service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> deleteAutoScalingGroupAsync(
            final DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest,
            final AsyncHandler<DeleteAutoScalingGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteAutoScalingGroup(deleteAutoScalingGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteAutoScalingGroupRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DeleteLaunchConfiguration service method, as returned by Amazon
     *         Auto Scaling.
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
    public Future<Void> deleteLaunchConfigurationAsync(
            final DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLaunchConfiguration(deleteLaunchConfigurationRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DeleteLaunchConfiguration service method, as returned by Amazon
     *         Auto Scaling.
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
    public Future<Void> deleteLaunchConfigurationAsync(
            final DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest,
            final AsyncHandler<DeleteLaunchConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteLaunchConfiguration(deleteLaunchConfigurationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteLaunchConfigurationRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            final DeleteLifecycleHookRequest deleteLifecycleHookRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLifecycleHookResult>() {
            public DeleteLifecycleHookResult call() throws Exception {
                return deleteLifecycleHook(deleteLifecycleHookRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            final DeleteLifecycleHookRequest deleteLifecycleHookRequest,
            final AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLifecycleHookResult>() {
            public DeleteLifecycleHookResult call() throws Exception {
                DeleteLifecycleHookResult result = null;
                try {
                    result = deleteLifecycleHook(deleteLifecycleHookRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteLifecycleHookRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @return A Java Future object containing the response from the
     *         DeleteNotificationConfiguration service method, as returned by
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
    public Future<Void> deleteNotificationConfigurationAsync(
            final DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteNotificationConfiguration(deleteNotificationConfigurationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @return A Java Future object containing the response from the
     *         DeleteNotificationConfiguration service method, as returned by
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
    public Future<Void> deleteNotificationConfigurationAsync(
            final DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest,
            final AsyncHandler<DeleteNotificationConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteNotificationConfiguration(deleteNotificationConfigurationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteNotificationConfigurationRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DeletePolicy service method, as returned by Amazon Auto Scaling.
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
    public Future<Void> deletePolicyAsync(final DeletePolicyRequest deletePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePolicy(deletePolicyRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DeletePolicy service method, as returned by Amazon Auto Scaling.
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
    public Future<Void> deletePolicyAsync(final DeletePolicyRequest deletePolicyRequest,
            final AsyncHandler<DeletePolicyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deletePolicy(deletePolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deletePolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return A Java Future object containing the response from the
     *         DeleteScheduledAction service method, as returned by Amazon Auto
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
    public Future<Void> deleteScheduledActionAsync(
            final DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteScheduledAction(deleteScheduledActionRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return A Java Future object containing the response from the
     *         DeleteScheduledAction service method, as returned by Amazon Auto
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
    public Future<Void> deleteScheduledActionAsync(
            final DeleteScheduledActionRequest deleteScheduledActionRequest,
            final AsyncHandler<DeleteScheduledActionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteScheduledAction(deleteScheduledActionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteScheduledActionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future object containing the response from the DeleteTags
     *         service method, as returned by Amazon Auto Scaling.
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
    public Future<Void> deleteTagsAsync(final DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTags(deleteTagsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future object containing the response from the DeleteTags
     *         service method, as returned by Amazon Auto Scaling.
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
    public Future<Void> deleteTagsAsync(final DeleteTagsRequest deleteTagsRequest,
            final AsyncHandler<DeleteTagsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteTags(deleteTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTagsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            final DescribeAccountLimitsRequest describeAccountLimitsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAccountLimitsResult>() {
            public DescribeAccountLimitsResult call() throws Exception {
                return describeAccountLimits(describeAccountLimitsRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            final DescribeAccountLimitsRequest describeAccountLimitsRequest,
            final AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAccountLimitsResult>() {
            public DescribeAccountLimitsResult call() throws Exception {
                DescribeAccountLimitsResult result = null;
                try {
                    result = describeAccountLimits(describeAccountLimitsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAccountLimitsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            final DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAdjustmentTypesResult>() {
            public DescribeAdjustmentTypesResult call() throws Exception {
                return describeAdjustmentTypes(describeAdjustmentTypesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            final DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest,
            final AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAdjustmentTypesResult>() {
            public DescribeAdjustmentTypesResult call() throws Exception {
                DescribeAdjustmentTypesResult result = null;
                try {
                    result = describeAdjustmentTypes(describeAdjustmentTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAdjustmentTypesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            final DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingGroupsResult>() {
            public DescribeAutoScalingGroupsResult call() throws Exception {
                return describeAutoScalingGroups(describeAutoScalingGroupsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            final DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest,
            final AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingGroupsResult>() {
            public DescribeAutoScalingGroupsResult call() throws Exception {
                DescribeAutoScalingGroupsResult result = null;
                try {
                    result = describeAutoScalingGroups(describeAutoScalingGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAutoScalingGroupsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            final DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingInstancesResult>() {
            public DescribeAutoScalingInstancesResult call() throws Exception {
                return describeAutoScalingInstances(describeAutoScalingInstancesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            final DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest,
            final AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingInstancesResult>() {
            public DescribeAutoScalingInstancesResult call() throws Exception {
                DescribeAutoScalingInstancesResult result = null;
                try {
                    result = describeAutoScalingInstances(describeAutoScalingInstancesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAutoScalingInstancesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto
     * Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            final DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingNotificationTypesResult>() {
            public DescribeAutoScalingNotificationTypesResult call() throws Exception {
                return describeAutoScalingNotificationTypes(describeAutoScalingNotificationTypesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto
     * Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            final DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest,
            final AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingNotificationTypesResult>() {
            public DescribeAutoScalingNotificationTypesResult call() throws Exception {
                DescribeAutoScalingNotificationTypesResult result = null;
                try {
                    result = describeAutoScalingNotificationTypes(describeAutoScalingNotificationTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAutoScalingNotificationTypesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            final DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLaunchConfigurationsResult>() {
            public DescribeLaunchConfigurationsResult call() throws Exception {
                return describeLaunchConfigurations(describeLaunchConfigurationsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            final DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest,
            final AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLaunchConfigurationsResult>() {
            public DescribeLaunchConfigurationsResult call() throws Exception {
                DescribeLaunchConfigurationsResult result = null;
                try {
                    result = describeLaunchConfigurations(describeLaunchConfigurationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLaunchConfigurationsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            final DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHookTypesResult>() {
            public DescribeLifecycleHookTypesResult call() throws Exception {
                return describeLifecycleHookTypes(describeLifecycleHookTypesRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            final DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest,
            final AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHookTypesResult>() {
            public DescribeLifecycleHookTypesResult call() throws Exception {
                DescribeLifecycleHookTypesResult result = null;
                try {
                    result = describeLifecycleHookTypes(describeLifecycleHookTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLifecycleHookTypesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            final DescribeLifecycleHooksRequest describeLifecycleHooksRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHooksResult>() {
            public DescribeLifecycleHooksResult call() throws Exception {
                return describeLifecycleHooks(describeLifecycleHooksRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            final DescribeLifecycleHooksRequest describeLifecycleHooksRequest,
            final AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHooksResult>() {
            public DescribeLifecycleHooksResult call() throws Exception {
                DescribeLifecycleHooksResult result = null;
                try {
                    result = describeLifecycleHooks(describeLifecycleHooksRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLifecycleHooksRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            final DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerTargetGroupsResult>() {
            public DescribeLoadBalancerTargetGroupsResult call() throws Exception {
                return describeLoadBalancerTargetGroups(describeLoadBalancerTargetGroupsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            final DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest,
            final AsyncHandler<DescribeLoadBalancerTargetGroupsRequest, DescribeLoadBalancerTargetGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerTargetGroupsResult>() {
            public DescribeLoadBalancerTargetGroupsResult call() throws Exception {
                DescribeLoadBalancerTargetGroupsResult result = null;
                try {
                    result = describeLoadBalancerTargetGroups(describeLoadBalancerTargetGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLoadBalancerTargetGroupsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            final DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancersResult>() {
            public DescribeLoadBalancersResult call() throws Exception {
                return describeLoadBalancers(describeLoadBalancersRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            final DescribeLoadBalancersRequest describeLoadBalancersRequest,
            final AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancersResult>() {
            public DescribeLoadBalancersResult call() throws Exception {
                DescribeLoadBalancersResult result = null;
                try {
                    result = describeLoadBalancers(describeLoadBalancersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLoadBalancersRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            final DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricCollectionTypesResult>() {
            public DescribeMetricCollectionTypesResult call() throws Exception {
                return describeMetricCollectionTypes(describeMetricCollectionTypesRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            final DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest,
            final AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricCollectionTypesResult>() {
            public DescribeMetricCollectionTypesResult call() throws Exception {
                DescribeMetricCollectionTypesResult result = null;
                try {
                    result = describeMetricCollectionTypes(describeMetricCollectionTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMetricCollectionTypesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            final DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeNotificationConfigurationsResult>() {
            public DescribeNotificationConfigurationsResult call() throws Exception {
                return describeNotificationConfigurations(describeNotificationConfigurationsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            final DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest,
            final AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeNotificationConfigurationsResult>() {
            public DescribeNotificationConfigurationsResult call() throws Exception {
                DescribeNotificationConfigurationsResult result = null;
                try {
                    result = describeNotificationConfigurations(describeNotificationConfigurationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeNotificationConfigurationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return A Java Future object containing the response from the
     *         DescribePolicies service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<DescribePoliciesResult> describePoliciesAsync(
            final DescribePoliciesRequest describePoliciesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribePoliciesResult>() {
            public DescribePoliciesResult call() throws Exception {
                return describePolicies(describePoliciesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return A Java Future object containing the response from the
     *         DescribePolicies service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<DescribePoliciesResult> describePoliciesAsync(
            final DescribePoliciesRequest describePoliciesRequest,
            final AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePoliciesResult>() {
            public DescribePoliciesResult call() throws Exception {
                DescribePoliciesResult result = null;
                try {
                    result = describePolicies(describePoliciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePoliciesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            final DescribeScalingActivitiesRequest describeScalingActivitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingActivitiesResult>() {
            public DescribeScalingActivitiesResult call() throws Exception {
                return describeScalingActivities(describeScalingActivitiesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            final DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            final AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingActivitiesResult>() {
            public DescribeScalingActivitiesResult call() throws Exception {
                DescribeScalingActivitiesResult result = null;
                try {
                    result = describeScalingActivities(describeScalingActivitiesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeScalingActivitiesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            final DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingProcessTypesResult>() {
            public DescribeScalingProcessTypesResult call() throws Exception {
                return describeScalingProcessTypes(describeScalingProcessTypesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            final DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest,
            final AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingProcessTypesResult>() {
            public DescribeScalingProcessTypesResult call() throws Exception {
                DescribeScalingProcessTypesResult result = null;
                try {
                    result = describeScalingProcessTypes(describeScalingProcessTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeScalingProcessTypesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            final DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScheduledActionsResult>() {
            public DescribeScheduledActionsResult call() throws Exception {
                return describeScheduledActions(describeScheduledActionsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            final DescribeScheduledActionsRequest describeScheduledActionsRequest,
            final AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScheduledActionsResult>() {
            public DescribeScheduledActionsResult call() throws Exception {
                DescribeScheduledActionsResult result = null;
                try {
                    result = describeScheduledActions(describeScheduledActionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeScheduledActionsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by Amazon Auto Scaling.
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
    public Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
                return describeTags(describeTagsRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by Amazon Auto Scaling.
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
    public Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest,
            final AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;
                try {
                    result = describeTags(describeTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeTagsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            final DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTerminationPolicyTypesResult>() {
            public DescribeTerminationPolicyTypesResult call() throws Exception {
                return describeTerminationPolicyTypes(describeTerminationPolicyTypesRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            final DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest,
            final AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTerminationPolicyTypesResult>() {
            public DescribeTerminationPolicyTypesResult call() throws Exception {
                DescribeTerminationPolicyTypesResult result = null;
                try {
                    result = describeTerminationPolicyTypes(describeTerminationPolicyTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeTerminationPolicyTypesRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DetachInstances service method, as returned by Amazon Auto
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
    public Future<DetachInstancesResult> detachInstancesAsync(
            final DetachInstancesRequest detachInstancesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DetachInstancesResult>() {
            public DetachInstancesResult call() throws Exception {
                return detachInstances(detachInstancesRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
     *         DetachInstances service method, as returned by Amazon Auto
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
    public Future<DetachInstancesResult> detachInstancesAsync(
            final DetachInstancesRequest detachInstancesRequest,
            final AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachInstancesResult>() {
            public DetachInstancesResult call() throws Exception {
                DetachInstancesResult result = null;
                try {
                    result = detachInstances(detachInstancesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detachInstancesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            final DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancerTargetGroupsResult>() {
            public DetachLoadBalancerTargetGroupsResult call() throws Exception {
                return detachLoadBalancerTargetGroups(detachLoadBalancerTargetGroupsRequest);
            }
        });
    }

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return A Java Future object containing the response from the
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
    public Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            final DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest,
            final AsyncHandler<DetachLoadBalancerTargetGroupsRequest, DetachLoadBalancerTargetGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancerTargetGroupsResult>() {
            public DetachLoadBalancerTargetGroupsResult call() throws Exception {
                DetachLoadBalancerTargetGroupsResult result = null;
                try {
                    result = detachLoadBalancerTargetGroups(detachLoadBalancerTargetGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detachLoadBalancerTargetGroupsRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            final DetachLoadBalancersRequest detachLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancersResult>() {
            public DetachLoadBalancersResult call() throws Exception {
                return detachLoadBalancers(detachLoadBalancersRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            final DetachLoadBalancersRequest detachLoadBalancersRequest,
            final AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancersResult>() {
            public DetachLoadBalancersResult call() throws Exception {
                DetachLoadBalancersResult result = null;
                try {
                    result = detachLoadBalancers(detachLoadBalancersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detachLoadBalancersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @return A Java Future object containing the response from the
     *         DisableMetricsCollection service method, as returned by Amazon
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
    public Future<Void> disableMetricsCollectionAsync(
            final DisableMetricsCollectionRequest disableMetricsCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableMetricsCollection(disableMetricsCollectionRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @return A Java Future object containing the response from the
     *         DisableMetricsCollection service method, as returned by Amazon
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
    public Future<Void> disableMetricsCollectionAsync(
            final DisableMetricsCollectionRequest disableMetricsCollectionRequest,
            final AsyncHandler<DisableMetricsCollectionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disableMetricsCollection(disableMetricsCollectionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disableMetricsCollectionRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         EnableMetricsCollection service method, as returned by Amazon
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
    public Future<Void> enableMetricsCollectionAsync(
            final EnableMetricsCollectionRequest enableMetricsCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableMetricsCollection(enableMetricsCollectionRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         EnableMetricsCollection service method, as returned by Amazon
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
    public Future<Void> enableMetricsCollectionAsync(
            final EnableMetricsCollectionRequest enableMetricsCollectionRequest,
            final AsyncHandler<EnableMetricsCollectionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    enableMetricsCollection(enableMetricsCollectionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(enableMetricsCollectionRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         EnterStandby service method, as returned by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<EnterStandbyResult> enterStandbyAsync(
            final EnterStandbyRequest enterStandbyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<EnterStandbyResult>() {
            public EnterStandbyResult call() throws Exception {
                return enterStandby(enterStandbyRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
     *         EnterStandby service method, as returned by Amazon Auto Scaling.
     * @throws ResourceContentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Auto Scaling indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<EnterStandbyResult> enterStandbyAsync(
            final EnterStandbyRequest enterStandbyRequest,
            final AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnterStandbyResult>() {
            public EnterStandbyResult call() throws Exception {
                EnterStandbyResult result = null;
                try {
                    result = enterStandby(enterStandbyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(enterStandbyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @return A Java Future object containing the response from the
     *         ExecutePolicy service method, as returned by Amazon Auto Scaling.
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
    public Future<Void> executePolicyAsync(final ExecutePolicyRequest executePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                executePolicy(executePolicyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @return A Java Future object containing the response from the
     *         ExecutePolicy service method, as returned by Amazon Auto Scaling.
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
    public Future<Void> executePolicyAsync(final ExecutePolicyRequest executePolicyRequest,
            final AsyncHandler<ExecutePolicyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    executePolicy(executePolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(executePolicyRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the ExitStandby
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
    public Future<ExitStandbyResult> exitStandbyAsync(final ExitStandbyRequest exitStandbyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ExitStandbyResult>() {
            public ExitStandbyResult call() throws Exception {
                return exitStandby(exitStandbyRequest);
            }
        });
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
     * @return A Java Future object containing the response from the ExitStandby
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
    public Future<ExitStandbyResult> exitStandbyAsync(final ExitStandbyRequest exitStandbyRequest,
            final AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ExitStandbyResult>() {
            public ExitStandbyResult call() throws Exception {
                ExitStandbyResult result = null;
                try {
                    result = exitStandby(exitStandbyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(exitStandbyRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutLifecycleHook service method, as returned by Amazon Auto
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
    public Future<PutLifecycleHookResult> putLifecycleHookAsync(
            final PutLifecycleHookRequest putLifecycleHookRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PutLifecycleHookResult>() {
            public PutLifecycleHookResult call() throws Exception {
                return putLifecycleHook(putLifecycleHookRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutLifecycleHook service method, as returned by Amazon Auto
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
    public Future<PutLifecycleHookResult> putLifecycleHookAsync(
            final PutLifecycleHookRequest putLifecycleHookRequest,
            final AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutLifecycleHookResult>() {
            public PutLifecycleHookResult call() throws Exception {
                PutLifecycleHookResult result = null;
                try {
                    result = putLifecycleHook(putLifecycleHookRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putLifecycleHookRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutNotificationConfiguration service method, as returned by
     *         Amazon Auto Scaling.
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
    public Future<Void> putNotificationConfigurationAsync(
            final PutNotificationConfigurationRequest putNotificationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putNotificationConfiguration(putNotificationConfigurationRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutNotificationConfiguration service method, as returned by
     *         Amazon Auto Scaling.
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
    public Future<Void> putNotificationConfigurationAsync(
            final PutNotificationConfigurationRequest putNotificationConfigurationRequest,
            final AsyncHandler<PutNotificationConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    putNotificationConfiguration(putNotificationConfigurationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putNotificationConfigurationRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutScalingPolicy service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<PutScalingPolicyResult> putScalingPolicyAsync(
            final PutScalingPolicyRequest putScalingPolicyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PutScalingPolicyResult>() {
            public PutScalingPolicyResult call() throws Exception {
                return putScalingPolicy(putScalingPolicyRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutScalingPolicy service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<PutScalingPolicyResult> putScalingPolicyAsync(
            final PutScalingPolicyRequest putScalingPolicyRequest,
            final AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutScalingPolicyResult>() {
            public PutScalingPolicyResult call() throws Exception {
                PutScalingPolicyResult result = null;
                try {
                    result = putScalingPolicy(putScalingPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putScalingPolicyRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutScheduledUpdateGroupAction service method, as returned by
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
    public Future<Void> putScheduledUpdateGroupActionAsync(
            final PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putScheduledUpdateGroupAction(putScheduledUpdateGroupActionRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         PutScheduledUpdateGroupAction service method, as returned by
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
    public Future<Void> putScheduledUpdateGroupActionAsync(
            final PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest,
            final AsyncHandler<PutScheduledUpdateGroupActionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    putScheduledUpdateGroupAction(putScheduledUpdateGroupActionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putScheduledUpdateGroupActionRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            final RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RecordLifecycleActionHeartbeatResult>() {
            public RecordLifecycleActionHeartbeatResult call() throws Exception {
                return recordLifecycleActionHeartbeat(recordLifecycleActionHeartbeatRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            final RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest,
            final AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RecordLifecycleActionHeartbeatResult>() {
            public RecordLifecycleActionHeartbeatResult call() throws Exception {
                RecordLifecycleActionHeartbeatResult result = null;
                try {
                    result = recordLifecycleActionHeartbeat(recordLifecycleActionHeartbeatRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(recordLifecycleActionHeartbeatRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         ResumeProcesses service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> resumeProcessesAsync(final ResumeProcessesRequest resumeProcessesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                resumeProcesses(resumeProcessesRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         ResumeProcesses service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> resumeProcessesAsync(final ResumeProcessesRequest resumeProcessesRequest,
            final AsyncHandler<ResumeProcessesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    resumeProcesses(resumeProcessesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(resumeProcessesRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         SetDesiredCapacity service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> setDesiredCapacityAsync(
            final SetDesiredCapacityRequest setDesiredCapacityRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setDesiredCapacity(setDesiredCapacityRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         SetDesiredCapacity service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> setDesiredCapacityAsync(
            final SetDesiredCapacityRequest setDesiredCapacityRequest,
            final AsyncHandler<SetDesiredCapacityRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setDesiredCapacity(setDesiredCapacityRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setDesiredCapacityRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         SetInstanceHealth service method, as returned by Amazon Auto
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
    public Future<Void> setInstanceHealthAsync(
            final SetInstanceHealthRequest setInstanceHealthRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setInstanceHealth(setInstanceHealthRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         SetInstanceHealth service method, as returned by Amazon Auto
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
    public Future<Void> setInstanceHealthAsync(
            final SetInstanceHealthRequest setInstanceHealthRequest,
            final AsyncHandler<SetInstanceHealthRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setInstanceHealth(setInstanceHealthRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setInstanceHealthRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            final SetInstanceProtectionRequest setInstanceProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetInstanceProtectionResult>() {
            public SetInstanceProtectionResult call() throws Exception {
                return setInstanceProtection(setInstanceProtectionRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            final SetInstanceProtectionRequest setInstanceProtectionRequest,
            final AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetInstanceProtectionResult>() {
            public SetInstanceProtectionResult call() throws Exception {
                SetInstanceProtectionResult result = null;
                try {
                    result = setInstanceProtection(setInstanceProtectionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setInstanceProtectionRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         SuspendProcesses service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> suspendProcessesAsync(final SuspendProcessesRequest suspendProcessesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                suspendProcesses(suspendProcessesRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         SuspendProcesses service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> suspendProcessesAsync(
            final SuspendProcessesRequest suspendProcessesRequest,
            final AsyncHandler<SuspendProcessesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    suspendProcesses(suspendProcessesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(suspendProcessesRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            final TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateInstanceInAutoScalingGroupResult>() {
            public TerminateInstanceInAutoScalingGroupResult call() throws Exception {
                return terminateInstanceInAutoScalingGroup(terminateInstanceInAutoScalingGroupRequest);
            }
        });
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
     * @return A Java Future object containing the response from the
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
    public Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            final TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest,
            final AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateInstanceInAutoScalingGroupResult>() {
            public TerminateInstanceInAutoScalingGroupResult call() throws Exception {
                TerminateInstanceInAutoScalingGroupResult result = null;
                try {
                    result = terminateInstanceInAutoScalingGroup(terminateInstanceInAutoScalingGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(terminateInstanceInAutoScalingGroupRequest, result);
                return result;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         UpdateAutoScalingGroup service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> updateAutoScalingGroupAsync(
            final UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateAutoScalingGroup(updateAutoScalingGroupRequest);
                return null;
            }
        });
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
     * @return A Java Future object containing the response from the
     *         UpdateAutoScalingGroup service method, as returned by Amazon Auto
     *         Scaling.
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
    public Future<Void> updateAutoScalingGroupAsync(
            final UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest,
            final AsyncHandler<UpdateAutoScalingGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateAutoScalingGroup(updateAutoScalingGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateAutoScalingGroupRequest, result);
                return result;
            }
        });
    }

}
