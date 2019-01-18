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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Amazon Auto Scaling <fullname>Amazon EC2 Auto
 * Scaling</fullname>
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
public interface AmazonAutoScaling {

    /**
     * Overrides the default endpoint for this client
     * ("https://autoscaling.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "autoscaling.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://autoscaling.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "autoscaling.amazonaws.com") or a full
     *            URL, including the protocol (ex:
     *            "https://autoscaling.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonAutoScaling#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

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
    void attachInstances(AttachInstancesRequest attachInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    AttachLoadBalancerTargetGroupsResult attachLoadBalancerTargetGroups(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    AttachLoadBalancersResult attachLoadBalancers(
            AttachLoadBalancersRequest attachLoadBalancersRequest) throws AmazonClientException,
            AmazonServiceException;

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
    BatchDeleteScheduledActionResult batchDeleteScheduledAction(
            BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    BatchPutScheduledUpdateGroupActionResult batchPutScheduledUpdateGroupAction(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    CompleteLifecycleActionResult completeLifecycleAction(
            CompleteLifecycleActionRequest completeLifecycleActionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void createAutoScalingGroup(CreateAutoScalingGroupRequest createAutoScalingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void createLaunchConfiguration(CreateLaunchConfigurationRequest createLaunchConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void createOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteAutoScalingGroup(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteLaunchConfiguration(DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DeleteLifecycleHookResult deleteLifecycleHook(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest) throws AmazonClientException,
            AmazonServiceException;

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
    void deleteNotificationConfiguration(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deletePolicy(DeletePolicyRequest deletePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

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
    void deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteTags(DeleteTagsRequest deleteTagsRequest) throws AmazonClientException,
            AmazonServiceException;

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
    DescribeAccountLimitsResult describeAccountLimits(
            DescribeAccountLimitsRequest describeAccountLimitsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeAdjustmentTypesResult describeAdjustmentTypes(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeAutoScalingGroupsResult describeAutoScalingGroups(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeAutoScalingInstancesResult describeAutoScalingInstances(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeLaunchConfigurationsResult describeLaunchConfigurations(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeLifecycleHookTypesResult describeLifecycleHookTypes(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeLifecycleHooksResult describeLifecycleHooks(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeLoadBalancerTargetGroupsResult describeLoadBalancerTargetGroups(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeLoadBalancersResult describeLoadBalancers(
            DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeMetricCollectionTypesResult describeMetricCollectionTypes(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeNotificationConfigurationsResult describeNotificationConfigurations(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribePoliciesResult describePolicies(DescribePoliciesRequest describePoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeScalingActivitiesResult describeScalingActivities(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeScalingProcessTypesResult describeScalingProcessTypes(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeScheduledActionsResult describeScheduledActions(
            DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DetachInstancesResult detachInstances(DetachInstancesRequest detachInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DetachLoadBalancerTargetGroupsResult detachLoadBalancerTargetGroups(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DetachLoadBalancersResult detachLoadBalancers(
            DetachLoadBalancersRequest detachLoadBalancersRequest) throws AmazonClientException,
            AmazonServiceException;

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
    void disableMetricsCollection(DisableMetricsCollectionRequest disableMetricsCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void enableMetricsCollection(EnableMetricsCollectionRequest enableMetricsCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    EnterStandbyResult enterStandby(EnterStandbyRequest enterStandbyRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void executePolicy(ExecutePolicyRequest executePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

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
    ExitStandbyResult exitStandby(ExitStandbyRequest exitStandbyRequest)
            throws AmazonClientException, AmazonServiceException;

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
    PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest putLifecycleHookRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void putNotificationConfiguration(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void putScheduledUpdateGroupAction(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void resumeProcesses(ResumeProcessesRequest resumeProcessesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void setDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void setInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest)
            throws AmazonClientException, AmazonServiceException;

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
    SetInstanceProtectionResult setInstanceProtection(
            SetInstanceProtectionRequest setInstanceProtectionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void suspendProcesses(SuspendProcessesRequest suspendProcessesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateAutoScalingGroup(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeAccountLimitsResult describeAccountLimits() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeAutoScalingGroupsResult describeAutoScalingGroups() throws AmazonClientException,
            AmazonServiceException;

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
    DescribePoliciesResult describePolicies() throws AmazonClientException, AmazonServiceException;

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
    DescribeScalingProcessTypesResult describeScalingProcessTypes() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeScalingActivitiesResult describeScalingActivities() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeNotificationConfigurationsResult describeNotificationConfigurations()
            throws AmazonClientException, AmazonServiceException;

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
    DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes()
            throws AmazonClientException, AmazonServiceException;

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
    DescribeTagsResult describeTags() throws AmazonClientException, AmazonServiceException;

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
    DetachLoadBalancersResult detachLoadBalancers() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes()
            throws AmazonClientException, AmazonServiceException;

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
    AttachLoadBalancersResult attachLoadBalancers() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeAutoScalingInstancesResult describeAutoScalingInstances() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeLifecycleHookTypesResult describeLifecycleHookTypes() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeLaunchConfigurationsResult describeLaunchConfigurations() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeAdjustmentTypesResult describeAdjustmentTypes() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeScheduledActionsResult describeScheduledActions() throws AmazonClientException,
            AmazonServiceException;

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
    DescribeMetricCollectionTypesResult describeMetricCollectionTypes()
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
