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

package com.amazonaws.services.elasticloadbalancing;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing Amazon Elastic Load Balancing asynchronously.
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer can distribute incoming traffic across your EC2 instances.
 * This enables you to increase the availability of your application. The load
 * balancer also monitors the health of its registered instances and ensures
 * that it routes traffic only to healthy instances. You configure your load
 * balancer to accept incoming traffic by specifying one or more listeners,
 * which are configured with a protocol and port number for connections from
 * clients to the load balancer and a protocol and port number for connections
 * from the load balancer to the instances.
 * </p>
 * <p>
 * Elastic Load Balancing supports three types of load balancers: Application
 * Load Balancers, Network Load Balancers, and Classic Load Balancers. You can
 * select a load balancer based on your application needs. For more information,
 * see the <a
 * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/"
 * >Elastic Load Balancing User Guide</a>.
 * </p>
 * <p>
 * This reference covers the 2012-06-01 API, which supports Classic Load
 * Balancers. The 2015-12-01 API supports Application Load Balancers and Network
 * Load Balancers.
 * </p>
 * <p>
 * To get started, create a load balancer with one or more listeners using
 * <a>CreateLoadBalancer</a>. Register your instances with the load balancer
 * using <a>RegisterInstancesWithLoadBalancer</a>.
 * </p>
 * <p>
 * All Elastic Load Balancing operations are <i>idempotent</i>, which means that
 * they complete at most one time. If you repeat an operation, it succeeds with
 * a 200 OK response code.
 * </p>
 **/
public interface AmazonElasticLoadBalancingAsync extends AmazonElasticLoadBalancing {
    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same
     * key is already associated with the load balancer, <code>AddTags</code>
     * updates its value.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param addTagsRequest <p>
     *            Contains the parameters for AddTags.
     *            </p>
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws TooManyTagsException
     * @throws DuplicateTagKeysException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same
     * key is already associated with the load balancer, <code>AddTags</code>
     * updates its value.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param addTagsRequest <p>
     *            Contains the parameters for AddTags.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws TooManyTagsException
     * @throws DuplicateTagKeysException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override the
     * previously associated security groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-groups.html#elb-vpc-security-groups"
     * >Security Groups for Load Balancers in a VPC</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param applySecurityGroupsToLoadBalancerRequest <p>
     *            Contains the parameters for ApplySecurityGroupsToLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws InvalidSecurityGroupException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override the
     * previously associated security groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-groups.html#elb-vpc-security-groups"
     * >Security Groups for Load Balancers in a VPC</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param applySecurityGroupsToLoadBalancerRequest <p>
     *            Contains the parameters for ApplySecurityGroupsToLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws InvalidSecurityGroupException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest,
            AsyncHandler<ApplySecurityGroupsToLoadBalancerRequest, ApplySecurityGroupsToLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-manage-subnets.html"
     * >Add or Remove Subnets for Your Load Balancer in a VPC</a> in the
     * <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerToSubnetsRequest <p>
     *            Contains the parameters for AttachLoaBalancerToSubnets.
     *            </p>
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws SubnetNotFoundException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-manage-subnets.html"
     * >Add or Remove Subnets for Your Load Balancer in a VPC</a> in the
     * <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerToSubnetsRequest <p>
     *            Contains the parameters for AttachLoaBalancerToSubnets.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws SubnetNotFoundException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest,
            AsyncHandler<AttachLoadBalancerToSubnetsRequest, AttachLoadBalancerToSubnetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-healthchecks.html"
     * >Configure Health Checks for Your Load Balancer</a> in the <i>Classic
     * Load Balancers Guide</i>.
     * </p>
     * 
     * @param configureHealthCheckRequest <p>
     *            Contains the parameters for ConfigureHealthCheck.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ConfigureHealthCheckResult> configureHealthCheckAsync(
            ConfigureHealthCheckRequest configureHealthCheckRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-healthchecks.html"
     * >Configure Health Checks for Your Load Balancer</a> in the <i>Classic
     * Load Balancers Guide</i>.
     * </p>
     * 
     * @param configureHealthCheckRequest <p>
     *            Contains the parameters for ConfigureHealthCheck.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ConfigureHealthCheckResult> configureHealthCheckAsync(
            ConfigureHealthCheckRequest configureHealthCheckRequest,
            AsyncHandler<ConfigureHealthCheckRequest, ConfigureHealthCheckResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that follow
     * that of an application-generated cookie. This policy can be associated
     * only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * <a>CreateLBCookieStickinessPolicy</a>, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code>, follows the
     * lifetime of the application-generated cookie specified in the policy
     * configuration. The load balancer only inserts a new stickiness cookie
     * when the application response includes a new application cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the session
     * stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param createAppCookieStickinessPolicyRequest <p>
     *            Contains the parameters for CreateAppCookieStickinessPolicy.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that follow
     * that of an application-generated cookie. This policy can be associated
     * only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * <a>CreateLBCookieStickinessPolicy</a>, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code>, follows the
     * lifetime of the application-generated cookie specified in the policy
     * configuration. The load balancer only inserts a new stickiness cookie
     * when the application response includes a new application cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the session
     * stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param createAppCookieStickinessPolicyRequest <p>
     *            Contains the parameters for CreateAppCookieStickinessPolicy.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest,
            AsyncHandler<CreateAppCookieStickinessPolicyRequest, CreateAppCookieStickinessPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes controlled by
     * the lifetime of the browser (user-agent) or a specified expiration
     * period. This policy can be associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the instance for each request. When the load
     * balancer receives a request, it first checks to see if this cookie is
     * present in the request. If so, the load balancer sends the request to the
     * application server specified in the cookie. If not, the load balancer
     * sends the request to a server that is chosen based on the existing
     * load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent requests
     * from the same user to that server. The validity of the cookie is based on
     * the cookie expiration time, which is specified in the policy
     * configuration.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param createLBCookieStickinessPolicyRequest <p>
     *            Contains the parameters for CreateLBCookieStickinessPolicy.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes controlled by
     * the lifetime of the browser (user-agent) or a specified expiration
     * period. This policy can be associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the instance for each request. When the load
     * balancer receives a request, it first checks to see if this cookie is
     * present in the request. If so, the load balancer sends the request to the
     * application server specified in the cookie. If not, the load balancer
     * sends the request to a server that is chosen based on the existing
     * load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent requests
     * from the same user to that server. The validity of the cookie is based on
     * the cookie expiration time, which is specified in the policy
     * configuration.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param createLBCookieStickinessPolicyRequest <p>
     *            Contains the parameters for CreateLBCookieStickinessPolicy.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest,
            AsyncHandler<CreateLBCookieStickinessPolicyRequest, CreateLBCookieStickinessPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Classic Load Balancer.
     * </p>
     * <p>
     * You can add listeners, security groups, subnets, and tags when you create
     * your load balancer, or you can add them later using
     * <a>CreateLoadBalancerListeners</a>,
     * <a>ApplySecurityGroupsToLoadBalancer</a>,
     * <a>AttachLoadBalancerToSubnets</a>, and <a>AddTags</a>.
     * </p>
     * <p>
     * To describe your current load balancers, see
     * <a>DescribeLoadBalancers</a>. When you are finished with a load balancer,
     * you can delete it using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can
     * request an increase for the number of load balancers for your account.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html"
     * >Limits for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest <p>
     *            Contains the parameters for CreateLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws DuplicateLoadBalancerNameException
     * @throws TooManyLoadBalancersException
     * @throws CertificateNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws SubnetNotFoundException
     * @throws InvalidSubnetException
     * @throws InvalidSecurityGroupException
     * @throws InvalidSchemeException
     * @throws TooManyTagsException
     * @throws DuplicateTagKeysException
     * @throws UnsupportedProtocolException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLoadBalancerResult> createLoadBalancerAsync(
            CreateLoadBalancerRequest createLoadBalancerRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a Classic Load Balancer.
     * </p>
     * <p>
     * You can add listeners, security groups, subnets, and tags when you create
     * your load balancer, or you can add them later using
     * <a>CreateLoadBalancerListeners</a>,
     * <a>ApplySecurityGroupsToLoadBalancer</a>,
     * <a>AttachLoadBalancerToSubnets</a>, and <a>AddTags</a>.
     * </p>
     * <p>
     * To describe your current load balancers, see
     * <a>DescribeLoadBalancers</a>. When you are finished with a load balancer,
     * you can delete it using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can
     * request an increase for the number of load balancers for your account.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html"
     * >Limits for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest <p>
     *            Contains the parameters for CreateLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws DuplicateLoadBalancerNameException
     * @throws TooManyLoadBalancersException
     * @throws CertificateNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws SubnetNotFoundException
     * @throws InvalidSubnetException
     * @throws InvalidSecurityGroupException
     * @throws InvalidSchemeException
     * @throws TooManyTagsException
     * @throws DuplicateTagKeysException
     * @throws UnsupportedProtocolException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLoadBalancerResult> createLoadBalancerAsync(
            CreateLoadBalancerRequest createLoadBalancerRequest,
            AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is created;
     * otherwise, the properties of the new listener must match the properties
     * of the existing listener.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerListenersRequest <p>
     *            Contains the parameters for CreateLoadBalancerListeners.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DuplicateListenerException
     * @throws CertificateNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws UnsupportedProtocolException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(
            CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is created;
     * otherwise, the properties of the new listener must match the properties
     * of the existing listener.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerListenersRequest <p>
     *            Contains the parameters for CreateLoadBalancerListeners.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DuplicateListenerException
     * @throws CertificateNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws UnsupportedProtocolException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(
            CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest,
            AsyncHandler<CreateLoadBalancerListenersRequest, CreateLoadBalancerListenersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that can
     * be applied to the listener or the application server, depending on the
     * policy type.
     * </p>
     * 
     * @param createLoadBalancerPolicyRequest <p>
     *            Contains the parameters for CreateLoadBalancerPolicy.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyTypeNotFoundException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(
            CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that can
     * be applied to the listener or the application server, depending on the
     * policy type.
     * </p>
     * 
     * @param createLoadBalancerPolicyRequest <p>
     *            Contains the parameters for CreateLoadBalancerPolicy.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyTypeNotFoundException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(
            CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest,
            AsyncHandler<CreateLoadBalancerPolicyRequest, CreateLoadBalancerPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must reconfigure
     * all settings. The DNS name associated with a deleted load balancer are no
     * longer usable. The name and associated DNS record of the deleted load
     * balancer no longer exist and traffic sent to any of its IP addresses is
     * no longer delivered to your instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the call
     * to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     * 
     * @param deleteLoadBalancerRequest <p>
     *            Contains the parameters for DeleteLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(
            DeleteLoadBalancerRequest deleteLoadBalancerRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must reconfigure
     * all settings. The DNS name associated with a deleted load balancer are no
     * longer usable. The name and associated DNS record of the deleted load
     * balancer no longer exist and traffic sent to any of its IP addresses is
     * no longer delivered to your instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the call
     * to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     * 
     * @param deleteLoadBalancerRequest <p>
     *            Contains the parameters for DeleteLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(
            DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest <p>
     *            Contains the parameters for DeleteLoadBalancerListeners.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(
            DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest <p>
     *            Contains the parameters for DeleteLoadBalancerListeners.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(
            DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest,
            AsyncHandler<DeleteLoadBalancerListenersRequest, DeleteLoadBalancerListenersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest <p>
     *            Contains the parameters for DeleteLoadBalancerPolicy.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(
            DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest <p>
     *            Contains the parameters for DeleteLoadBalancerPolicy.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(
            DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest,
            AsyncHandler<DeleteLoadBalancerPolicyRequest, DeleteLoadBalancerPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
     * >Register or De-Register EC2 Instances</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param deregisterInstancesFromLoadBalancerRequest <p>
     *            Contains the parameters for
     *            DeregisterInstancesFromLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
     * >Register or De-Register EC2 Instances</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param deregisterInstancesFromLoadBalancerRequest <p>
     *            Contains the parameters for
     *            DeregisterInstancesFromLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest,
            AsyncHandler<DeregisterInstancesFromLoadBalancerRequest, DeregisterInstancesFromLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the current Elastic Load Balancing resource limits for your AWS
     * account.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html"
     * >Limits for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAccountLimits service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the current Elastic Load Balancing resource limits for your AWS
     * account.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html"
     * >Limits for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAccountLimits service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest,
            AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the state of the specified instances with respect to the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances that are currently registered with
     * the load balancer. If instances are specified, their state is returned
     * even if they are no longer registered with the load balancer. The state
     * of terminated instances is not returned.
     * </p>
     * 
     * @param describeInstanceHealthRequest <p>
     *            Contains the parameters for DescribeInstanceHealth.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(
            DescribeInstanceHealthRequest describeInstanceHealthRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the state of the specified instances with respect to the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances that are currently registered with
     * the load balancer. If instances are specified, their state is returned
     * even if they are no longer registered with the load balancer. The state
     * of terminated instances is not returned.
     * </p>
     * 
     * @param describeInstanceHealthRequest <p>
     *            Contains the parameters for DescribeInstanceHealth.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(
            DescribeInstanceHealthRequest describeInstanceHealthRequest,
            AsyncHandler<DescribeInstanceHealthRequest, DescribeInstanceHealthResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest <p>
     *            Contains the parameters for DescribeLoadBalancerAttributes.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws LoadBalancerAttributeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest <p>
     *            Contains the parameters for DescribeLoadBalancerAttributes.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws LoadBalancerAttributeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the descriptions
     * of all policies created for the load balancer. If you specify a policy
     * name associated with your load balancer, the action returns the
     * description of that policy. If you don't specify a load balancer name,
     * the action returns descriptions of the specified sample policies, or
     * descriptions of all sample policies. The names of the sample policies
     * have the <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @param describeLoadBalancerPoliciesRequest <p>
     *            Contains the parameters for DescribeLoadBalancerPolicies.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the descriptions
     * of all policies created for the load balancer. If you specify a policy
     * name associated with your load balancer, the action returns the
     * description of that policy. If you don't specify a load balancer name,
     * the action returns descriptions of the specified sample policies, or
     * descriptions of all sample policies. The names of the sample policies
     * have the <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @param describeLoadBalancerPoliciesRequest <p>
     *            Contains the parameters for DescribeLoadBalancerPolicies.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest,
            AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified load balancer policy types or all load balancer
     * policy types.
     * </p>
     * <p>
     * The description of each type indicates how it can be used. For example,
     * some policies can be used only with layer 7 listeners, some policies can
     * be used only with layer 4 listeners, and some policies can be used only
     * with your EC2 instances.
     * </p>
     * <p>
     * You can use <a>CreateLoadBalancerPolicy</a> to create a policy
     * configuration for any of these policy types. Then, depending on the
     * policy type, use either <a>SetLoadBalancerPoliciesOfListener</a> or
     * <a>SetLoadBalancerPoliciesForBackendServer</a> to set the policy.
     * </p>
     * 
     * @param describeLoadBalancerPolicyTypesRequest <p>
     *            Contains the parameters for DescribeLoadBalancerPolicyTypes.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws PolicyTypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified load balancer policy types or all load balancer
     * policy types.
     * </p>
     * <p>
     * The description of each type indicates how it can be used. For example,
     * some policies can be used only with layer 7 listeners, some policies can
     * be used only with layer 4 listeners, and some policies can be used only
     * with your EC2 instances.
     * </p>
     * <p>
     * You can use <a>CreateLoadBalancerPolicy</a> to create a policy
     * configuration for any of these policy types. Then, depending on the
     * policy type, use either <a>SetLoadBalancerPoliciesOfListener</a> or
     * <a>SetLoadBalancerPoliciesForBackendServer</a> to set the policy.
     * </p>
     * 
     * @param describeLoadBalancerPolicyTypesRequest <p>
     *            Contains the parameters for DescribeLoadBalancerPolicyTypes.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws PolicyTypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest,
            AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest <p>
     *            Contains the parameters for DescribeLoadBalancers.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DependencyThrottleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest <p>
     *            Contains the parameters for DescribeLoadBalancers.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws DependencyThrottleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest describeLoadBalancersRequest,
            AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest <p>
     *            Contains the parameters for DescribeTags.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by Amazon Elastic Load
     *         Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest <p>
     *            Contains the parameters for DescribeTags.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by Amazon Elastic Load
     *         Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for the
     * load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the remaining
     * routable subnets.
     * </p>
     * 
     * @param detachLoadBalancerFromSubnetsRequest <p>
     *            Contains the parameters for DetachLoadBalancerFromSubnets.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for the
     * load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the remaining
     * routable subnets.
     * </p>
     * 
     * @param detachLoadBalancerFromSubnetsRequest <p>
     *            Contains the parameters for DetachLoadBalancerFromSubnets.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest,
            AsyncHandler<DetachLoadBalancerFromSubnetsRequest, DetachLoadBalancerFromSubnetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer in EC2-Classic or a default VPC.
     * </p>
     * <p>
     * For load balancers in a non-default VPC, use
     * <a>DetachLoadBalancerFromSubnets</a>.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then, the
     * load balancer attempts to equally balance the traffic among its remaining
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html"
     * >Add or Remove Availability Zones</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param disableAvailabilityZonesForLoadBalancerRequest <p>
     *            Contains the parameters for
     *            DisableAvailabilityZonesForLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer in EC2-Classic or a default VPC.
     * </p>
     * <p>
     * For load balancers in a non-default VPC, use
     * <a>DetachLoadBalancerFromSubnets</a>.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then, the
     * load balancer attempts to equally balance the traffic among its remaining
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html"
     * >Add or Remove Availability Zones</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param disableAvailabilityZonesForLoadBalancerRequest <p>
     *            Contains the parameters for
     *            DisableAvailabilityZonesForLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest,
            AsyncHandler<DisableAvailabilityZonesForLoadBalancerRequest, DisableAvailabilityZonesForLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability Zones
     * for the specified load balancer in EC2-Classic or a default VPC.
     * </p>
     * <p>
     * For load balancers in a non-default VPC, use
     * <a>AttachLoadBalancerToSubnets</a>.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its registered
     * Availability Zones that contain instances. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html"
     * >Add or Remove Availability Zones</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param enableAvailabilityZonesForLoadBalancerRequest <p>
     *            Contains the parameters for
     *            EnableAvailabilityZonesForLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability Zones
     * for the specified load balancer in EC2-Classic or a default VPC.
     * </p>
     * <p>
     * For load balancers in a non-default VPC, use
     * <a>AttachLoadBalancerToSubnets</a>.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its registered
     * Availability Zones that contain instances. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html"
     * >Add or Remove Availability Zones</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param enableAvailabilityZonesForLoadBalancerRequest <p>
     *            Contains the parameters for
     *            EnableAvailabilityZonesForLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest,
            AsyncHandler<EnableAvailabilityZonesForLoadBalancerRequest, EnableAvailabilityZonesForLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code>, <code>ConnectionDraining</code>, and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling them.
     * Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection timeout
     * value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Classic Load Balancers
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html"
     * >Cross-Zone Load Balancing</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html"
     * >Connection Draining</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/access-log-collection.html"
     * >Access Logs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html"
     * >Idle Connection Timeout</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyLoadBalancerAttributesRequest <p>
     *            Contains the parameters for ModifyLoadBalancerAttributes.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws LoadBalancerAttributeNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code>, <code>ConnectionDraining</code>, and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling them.
     * Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection timeout
     * value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Classic Load Balancers
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html"
     * >Cross-Zone Load Balancing</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html"
     * >Connection Draining</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/access-log-collection.html"
     * >Access Logs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html"
     * >Idle Connection Timeout</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyLoadBalancerAttributesRequest <p>
     *            Contains the parameters for ModifyLoadBalancerAttributes.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws LoadBalancerAttributeNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the load
     * balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances
     * and a load balancer in a VPC with ClassicLink enabled, you can link the
     * EC2-Classic instances to that VPC and then register the linked
     * EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes when
     * the request has been registered. Instance registration takes a little
     * time to complete. To check the state of the registered instances, use
     * <a>DescribeLoadBalancers</a> or <a>DescribeInstanceHealth</a>.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of the
     * Availability Zones registered for the load balancer is moved to the
     * <code>OutOfService</code> state. If an Availability Zone is added to the
     * load balancer later, any instances registered with the load balancer move
     * to the <code>InService</code> state.
     * </p>
     * <p>
     * To deregister instances from a load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
     * >Register or De-Register EC2 Instances</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param registerInstancesWithLoadBalancerRequest <p>
     *            Contains the parameters for RegisterInstancesWithLoadBalancer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the load
     * balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances
     * and a load balancer in a VPC with ClassicLink enabled, you can link the
     * EC2-Classic instances to that VPC and then register the linked
     * EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes when
     * the request has been registered. Instance registration takes a little
     * time to complete. To check the state of the registered instances, use
     * <a>DescribeLoadBalancers</a> or <a>DescribeInstanceHealth</a>.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of the
     * Availability Zones registered for the load balancer is moved to the
     * <code>OutOfService</code> state. If an Availability Zone is added to the
     * load balancer later, any instances registered with the load balancer move
     * to the <code>InService</code> state.
     * </p>
     * <p>
     * To deregister instances from a load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
     * >Register or De-Register EC2 Instances</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param registerInstancesWithLoadBalancerRequest <p>
     *            Contains the parameters for RegisterInstancesWithLoadBalancer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest,
            AsyncHandler<RegisterInstancesWithLoadBalancerRequest, RegisterInstancesWithLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest <p>
     *            Contains the parameters for RemoveTags.
     *            </p>
     * @return A Java Future object containing the response from the RemoveTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest <p>
     *            Contains the parameters for RemoveTags.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the RemoveTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-update-ssl-cert.html"
     * >Replace the SSL Certificate for Your Load Balancer</a> in the <i>Classic
     * Load Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerListenerSSLCertificateRequest <p>
     *            Contains the parameters for
     *            SetLoadBalancerListenerSSLCertificate.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws CertificateNotFoundException
     * @throws LoadBalancerNotFoundException
     * @throws ListenerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws UnsupportedProtocolException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-update-ssl-cert.html"
     * >Replace the SSL Certificate for Your Load Balancer</a> in the <i>Classic
     * Load Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerListenerSSLCertificateRequest <p>
     *            Contains the parameters for
     *            SetLoadBalancerListenerSSLCertificate.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws CertificateNotFoundException
     * @throws LoadBalancerNotFoundException
     * @throws ListenerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws UnsupportedProtocolException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest,
            AsyncHandler<SetLoadBalancerListenerSSLCertificateRequest, SetLoadBalancerListenerSSLCertificateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on which
     * the EC2 instance is listening with a new set of policies. At this time,
     * only the back-end server authentication policy type can be applied to the
     * instance ports; this policy type is composed of multiple public key
     * policies.
     * </p>
     * <p>
     * Each time you use <code>SetLoadBalancerPoliciesForBackendServer</code> to
     * enable the policies, use the <code>PolicyNames</code> parameter to list
     * the policies that you want to enable.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> or
     * <a>DescribeLoadBalancerPolicies</a> to verify that the policy is
     * associated with the EC2 instance.
     * </p>
     * <p>
     * For more information about enabling back-end instance authentication, see
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html#configure_backendauth_clt"
     * >Configure Back-end Instance Authentication</a> in the <i>Classic Load
     * Balancers Guide</i>. For more information about Proxy Protocol, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-proxy-protocol.html"
     * >Configure Proxy Protocol Support</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerPoliciesForBackendServerRequest <p>
     *            Contains the parameters for
     *            SetLoadBalancerPoliciesForBackendServer.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on which
     * the EC2 instance is listening with a new set of policies. At this time,
     * only the back-end server authentication policy type can be applied to the
     * instance ports; this policy type is composed of multiple public key
     * policies.
     * </p>
     * <p>
     * Each time you use <code>SetLoadBalancerPoliciesForBackendServer</code> to
     * enable the policies, use the <code>PolicyNames</code> parameter to list
     * the policies that you want to enable.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> or
     * <a>DescribeLoadBalancerPolicies</a> to verify that the policy is
     * associated with the EC2 instance.
     * </p>
     * <p>
     * For more information about enabling back-end instance authentication, see
     * <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html#configure_backendauth_clt"
     * >Configure Back-end Instance Authentication</a> in the <i>Classic Load
     * Balancers Guide</i>. For more information about Proxy Protocol, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-proxy-protocol.html"
     * >Configure Proxy Protocol Support</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerPoliciesForBackendServerRequest <p>
     *            Contains the parameters for
     *            SetLoadBalancerPoliciesForBackendServer.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest,
            AsyncHandler<SetLoadBalancerPoliciesForBackendServerRequest, SetLoadBalancerPoliciesForBackendServerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the current set of policies for the specified load balancer port
     * with the specified set of policies.
     * </p>
     * <p>
     * To enable back-end server authentication, use
     * <a>SetLoadBalancerPoliciesForBackendServer</a>.
     * </p>
     * <p>
     * For more information about setting policies, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/ssl-config-update.html"
     * >Update the SSL Negotiation Configuration</a>, <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a>, and <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerPoliciesOfListenerRequest <p>
     *            Contains the parameters for SetLoadBalancePoliciesOfListener.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyNotFoundException
     * @throws ListenerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the current set of policies for the specified load balancer port
     * with the specified set of policies.
     * </p>
     * <p>
     * To enable back-end server authentication, use
     * <a>SetLoadBalancerPoliciesForBackendServer</a>.
     * </p>
     * <p>
     * For more information about setting policies, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/ssl-config-update.html"
     * >Update the SSL Negotiation Configuration</a>, <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a>, and <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerPoliciesOfListenerRequest <p>
     *            Contains the parameters for SetLoadBalancePoliciesOfListener.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException
     * @throws PolicyNotFoundException
     * @throws ListenerNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest,
            AsyncHandler<SetLoadBalancerPoliciesOfListenerRequest, SetLoadBalancerPoliciesOfListenerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
