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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
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
public interface AmazonAutoScalingAsync extends AmazonAutoScaling {
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
    Future<Void> attachInstancesAsync(AttachInstancesRequest attachInstancesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> attachInstancesAsync(AttachInstancesRequest attachInstancesRequest,
            AsyncHandler<AttachInstancesRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

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
    Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest,
            AsyncHandler<AttachLoadBalancerTargetGroupsRequest, AttachLoadBalancerTargetGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            AttachLoadBalancersRequest attachLoadBalancersRequest) throws AmazonServiceException,
            AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            AttachLoadBalancersRequest attachLoadBalancersRequest,
            AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(
            BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(
            BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest,
            AsyncHandler<BatchDeleteScheduledActionRequest, BatchDeleteScheduledActionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto
     * Scaling group. If you leave a parameter unspecified when updating a
     * scheduled scaling action, the corresponding value remains unchanged.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest,
            AsyncHandler<BatchPutScheduledUpdateGroupActionRequest, BatchPutScheduledUpdateGroupActionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            CompleteLifecycleActionRequest completeLifecycleActionRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            CompleteLifecycleActionRequest completeLifecycleActionRequest,
            AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> createAutoScalingGroupAsync(
            CreateAutoScalingGroupRequest createAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> createAutoScalingGroupAsync(
            CreateAutoScalingGroupRequest createAutoScalingGroupRequest,
            AsyncHandler<CreateAutoScalingGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest,
            AsyncHandler<CreateLaunchConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest createOrUpdateTagsRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest createOrUpdateTagsRequest,
            AsyncHandler<CreateOrUpdateTagsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> deleteAutoScalingGroupAsync(
            DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> deleteAutoScalingGroupAsync(
            DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest,
            AsyncHandler<DeleteAutoScalingGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest,
            AsyncHandler<DeleteLaunchConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest) throws AmazonServiceException,
            AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest,
            AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest,
            AsyncHandler<DeleteNotificationConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            AsyncHandler<DeletePolicyRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

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
    Future<Void> deleteScheduledActionAsync(
            DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> deleteScheduledActionAsync(
            DeleteScheduledActionRequest deleteScheduledActionRequest,
            AsyncHandler<DeleteScheduledActionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            AsyncHandler<DeleteTagsRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

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
    Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest,
            AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest,
            AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest,
            AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest,
            AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto
     * Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest,
            AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest,
            AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest,
            AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest,
            AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest,
            AsyncHandler<DescribeLoadBalancerTargetGroupsRequest, DescribeLoadBalancerTargetGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest describeLoadBalancersRequest,
            AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest,
            AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest,
            AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribePoliciesResult> describePoliciesAsync(
            DescribePoliciesRequest describePoliciesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribePoliciesResult> describePoliciesAsync(
            DescribePoliciesRequest describePoliciesRequest,
            AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest,
            AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            DescribeScheduledActionsRequest describeScheduledActionsRequest,
            AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest,
            AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest detachInstancesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DetachInstancesResult> detachInstancesAsync(
            DetachInstancesRequest detachInstancesRequest,
            AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest,
            AsyncHandler<DetachLoadBalancerTargetGroupsRequest, DetachLoadBalancerTargetGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            DetachLoadBalancersRequest detachLoadBalancersRequest) throws AmazonServiceException,
            AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            DetachLoadBalancersRequest detachLoadBalancersRequest,
            AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> disableMetricsCollectionAsync(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> disableMetricsCollectionAsync(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest,
            AsyncHandler<DisableMetricsCollectionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> enableMetricsCollectionAsync(
            EnableMetricsCollectionRequest enableMetricsCollectionRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> enableMetricsCollectionAsync(
            EnableMetricsCollectionRequest enableMetricsCollectionRequest,
            AsyncHandler<EnableMetricsCollectionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest enterStandbyRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest enterStandbyRequest,
            AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> executePolicyAsync(ExecutePolicyRequest executePolicyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> executePolicyAsync(ExecutePolicyRequest executePolicyRequest,
            AsyncHandler<ExecutePolicyRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

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
    Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest exitStandbyRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest exitStandbyRequest,
            AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<PutLifecycleHookResult> putLifecycleHookAsync(
            PutLifecycleHookRequest putLifecycleHookRequest) throws AmazonServiceException,
            AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<PutLifecycleHookResult> putLifecycleHookAsync(
            PutLifecycleHookRequest putLifecycleHookRequest,
            AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest,
            AsyncHandler<PutNotificationConfigurationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest putScalingPolicyRequest) throws AmazonServiceException,
            AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest putScalingPolicyRequest,
            AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest,
            AsyncHandler<PutScheduledUpdateGroupActionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest,
            AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> resumeProcessesAsync(ResumeProcessesRequest resumeProcessesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> resumeProcessesAsync(ResumeProcessesRequest resumeProcessesRequest,
            AsyncHandler<ResumeProcessesRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

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
    Future<Void> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest,
            AsyncHandler<SetDesiredCapacityRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> setInstanceHealthAsync(SetInstanceHealthRequest setInstanceHealthRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> setInstanceHealthAsync(SetInstanceHealthRequest setInstanceHealthRequest,
            AsyncHandler<SetInstanceHealthRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            SetInstanceProtectionRequest setInstanceProtectionRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            SetInstanceProtectionRequest setInstanceProtectionRequest,
            AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> suspendProcessesAsync(SuspendProcessesRequest suspendProcessesRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> suspendProcessesAsync(SuspendProcessesRequest suspendProcessesRequest,
            AsyncHandler<SuspendProcessesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest,
            AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

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
    Future<Void> updateAutoScalingGroupAsync(
            UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest)
            throws AmazonServiceException, AmazonClientException;

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
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
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
    Future<Void> updateAutoScalingGroupAsync(
            UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest,
            AsyncHandler<UpdateAutoScalingGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
