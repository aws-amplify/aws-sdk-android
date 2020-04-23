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

package com.amazonaws.services.applicationautoscaling;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.applicationautoscaling.model.*;

/**
 * Interface for accessing Application Auto Scaling
 * <p>
 * With Application Auto Scaling, you can configure automatic scaling for the
 * following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot Fleet requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR clusters
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon AppStream 2.0 fleets
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon DynamoDB tables and global secondary indexes throughput capacity
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora Replicas
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker endpoint variants
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom resources provided by your own applications or services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Comprehend document classification endpoints
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Lambda function provisioned concurrency
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Keyspaces for Apache Cassandra tables
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>API Summary</b>
 * </p>
 * <p>
 * The Application Auto Scaling service API includes three key sets of actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Register and manage scalable targets - Register AWS or custom resources as
 * scalable targets (a resource that Application Auto Scaling can scale), set
 * minimum and maximum capacity limits, and retrieve information on existing
 * scalable targets.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure and manage automatic scaling - Define scaling policies to
 * dynamically scale your resources in response to CloudWatch alarms, schedule
 * one-time or recurring scaling actions, and retrieve your recent scaling
 * activity history.
 * </p>
 * </li>
 * <li>
 * <p>
 * Suspend and resume scaling - Temporarily suspend and later resume automatic
 * scaling by calling the <a href=
 * "https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html"
 * >RegisterScalableTarget</a> API action for any Application Auto Scaling
 * scalable target. You can suspend and resume (individually or in combination)
 * scale-out activities that are triggered by a scaling policy, scale-in
 * activities that are triggered by a scaling policy, and scheduled scaling.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To learn more about Application Auto Scaling, including information about
 * granting IAM users required permissions for Application Auto Scaling actions,
 * see the <a href=
 * "https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
 * >Application Auto Scaling User Guide</a>.
 * </p>
 **/
public interface ApplicationAutoScaling {

    /**
     * Overrides the default endpoint for this client
     * ("https://application-autoscaling.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "application-autoscaling.us-east-1.amazonaws.com") or a full URL,
     * including the protocol (ex:
     * "https://application-autoscaling.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     * @param endpoint The endpoint (ex:
     *            "application-autoscaling.us-east-1.amazonaws.com") or a full
     *            URL, including the protocol (ex:
     *            "https://application-autoscaling.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link ApplicationAutoScaling#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
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
     * Deletes the specified scaling policy for an Application Auto Scaling
     * scalable target.
     * </p>
     * <p>
     * Deleting a step scaling policy deletes the underlying alarm action, but
     * does not delete the CloudWatch alarm associated with the scaling policy,
     * even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#delete-step-scaling-policy"
     * >Delete a Step Scaling Policy</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#delete-target-tracking-policy"
     * >Delete a Target Tracking Scaling Policy</a> in the <i>Application Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return deleteScalingPolicyResult The response from the
     *         DeleteScalingPolicy service method, as returned by Application
     *         Auto Scaling.
     * @throws ValidationException
     * @throws ObjectNotFoundException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteScalingPolicyResult deleteScalingPolicy(
            DeleteScalingPolicyRequest deleteScalingPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified scheduled action for an Application Auto Scaling
     * scalable target.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html#delete-scheduled-action"
     * >Delete a Scheduled Action</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return deleteScheduledActionResult The response from the
     *         DeleteScheduledAction service method, as returned by Application
     *         Auto Scaling.
     * @throws ValidationException
     * @throws ObjectNotFoundException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteScheduledActionResult deleteScheduledAction(
            DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deregisters an Application Auto Scaling scalable target when you have
     * finished using it. To see which resources have been registered, use <a
     * href=
     * "https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>.
     * </p>
     * <note>
     * <p>
     * Deregistering a scalable target deletes the scaling policies and the
     * scheduled actions that are associated with it.
     * </p>
     * </note>
     * 
     * @param deregisterScalableTargetRequest
     * @return deregisterScalableTargetResult The response from the
     *         DeregisterScalableTarget service method, as returned by
     *         Application Auto Scaling.
     * @throws ValidationException
     * @throws ObjectNotFoundException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeregisterScalableTargetResult deregisterScalableTarget(
            DeregisterScalableTargetRequest deregisterScalableTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the scalable targets in the specified namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceIds</code> and
     * <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @return describeScalableTargetsResult The response from the
     *         DescribeScalableTargets service method, as returned by
     *         Application Auto Scaling.
     * @throws ValidationException
     * @throws InvalidNextTokenException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeScalableTargetsResult describeScalableTargets(
            DescribeScalableTargetsRequest describeScalableTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides descriptive information about the scaling activities in the
     * specified namespace from the previous six weeks.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code> and
     * <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return describeScalingActivitiesResult The response from the
     *         DescribeScalingActivities service method, as returned by
     *         Application Auto Scaling.
     * @throws ValidationException
     * @throws InvalidNextTokenException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeScalingActivitiesResult describeScalingActivities(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Application Auto Scaling scaling policies for the specified
     * service namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code>,
     * <code>ScalableDimension</code>, and <code>PolicyNames</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target Tracking Scaling Policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step Scaling Policies</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @return describeScalingPoliciesResult The response from the
     *         DescribeScalingPolicies service method, as returned by
     *         Application Auto Scaling.
     * @throws ValidationException
     * @throws FailedResourceAccessException
     * @throws InvalidNextTokenException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeScalingPoliciesResult describeScalingPolicies(
            DescribeScalingPoliciesRequest describeScalingPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Application Auto Scaling scheduled actions for the
     * specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>,
     * <code>ScalableDimension</code>, and <code>ScheduledActionNames</code>
     * parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return describeScheduledActionsResult The response from the
     *         DescribeScheduledActions service method, as returned by
     *         Application Auto Scaling.
     * @throws ValidationException
     * @throws InvalidNextTokenException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeScheduledActionsResult describeScheduledActions(
            DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a scaling policy for an Application Auto Scaling
     * scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID,
     * and scalable dimension. A scaling policy applies to the scalable target
     * identified by those three attributes. You cannot create a scaling policy
     * until you have registered the resource as a scalable target.
     * </p>
     * <p>
     * Multiple scaling policies can be in force at the same time for the same
     * scalable target. You can have one or more target tracking scaling
     * policies, one or more step scaling policies, or both. However, there is a
     * chance that multiple policies could conflict, instructing the scalable
     * target to scale out or in at the same time. Application Auto Scaling
     * gives precedence to the policy that provides the largest capacity for
     * both scale out and scale in. For example, if one policy increases
     * capacity by 3, another policy increases capacity by 200 percent, and the
     * current capacity is 10, Application Auto Scaling uses the policy with the
     * highest calculated capacity (200% of 10 = 20) and scales out to 30.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target Tracking Scaling Policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step Scaling Policies</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer
     * available to execute scaling policies. Any scaling policies that were
     * specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScalingPolicyRequest
     * @return putScalingPolicyResult The response from the PutScalingPolicy
     *         service method, as returned by Application Auto Scaling.
     * @throws ValidationException
     * @throws LimitExceededException
     * @throws ObjectNotFoundException
     * @throws ConcurrentUpdateException
     * @throws FailedResourceAccessException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a scheduled action for an Application Auto Scaling
     * scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID,
     * and scalable dimension. A scheduled action applies to the scalable target
     * identified by those three attributes. You cannot create a scheduled
     * action until you have registered the resource as a scalable target.
     * </p>
     * <p>
     * When start and end times are specified with a recurring schedule using a
     * cron expression or rates, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     * <p>
     * To update a scheduled action, specify the parameters that you want to
     * change. If you don't specify start and end times, the old values are
     * deleted.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer
     * available to run scheduled actions. Any scheduled actions that were
     * specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScheduledActionRequest
     * @return putScheduledActionResult The response from the PutScheduledAction
     *         service method, as returned by Application Auto Scaling.
     * @throws ValidationException
     * @throws LimitExceededException
     * @throws ObjectNotFoundException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutScheduledActionResult putScheduledAction(PutScheduledActionRequest putScheduledActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers or updates a scalable target.
     * </p>
     * <p>
     * A scalable target is a resource that Application Auto Scaling can scale
     * out and scale in. Scalable targets are uniquely identified by the
     * combination of resource ID, scalable dimension, and namespace.
     * </p>
     * <p>
     * When you register a new scalable target, you must specify values for
     * minimum and maximum capacity. Application Auto Scaling scaling policies
     * will not scale capacity to values that are outside of this range.
     * </p>
     * <p>
     * After you register a scalable target, you do not need to register it
     * again to use other Application Auto Scaling operations. To see which
     * resources have been registered, use <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. You can also view the scaling policies for
     * a service namespace by using <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. If you no longer need a scalable target,
     * you can deregister it by using <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DeregisterScalableTarget.html"
     * >DeregisterScalableTarget</a>.
     * </p>
     * <p>
     * To update a scalable target, specify the parameters that you want to
     * change. Include the parameters that identify the scalable target:
     * resource ID, scalable dimension, and namespace. Any parameters that you
     * don't specify are not changed by this update request.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @return registerScalableTargetResult The response from the
     *         RegisterScalableTarget service method, as returned by Application
     *         Auto Scaling.
     * @throws ValidationException
     * @throws LimitExceededException
     * @throws ConcurrentUpdateException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Application Auto Scaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RegisterScalableTargetResult registerScalableTarget(
            RegisterScalableTargetRequest registerScalableTargetRequest)
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
