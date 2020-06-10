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

package com.amazonaws.services.shield;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.shield.model.*;

/**
 * Interface for accessing AWS Shield <fullname>AWS Shield Advanced</fullname>
 * <p>
 * This is the <i>AWS Shield Advanced API Reference</i>. This guide is for
 * developers who need detailed information about the AWS Shield Advanced API
 * actions, data types, and errors. For detailed information about AWS WAF and
 * AWS Shield Advanced features and an overview of how to use the AWS WAF and
 * AWS Shield Advanced APIs, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS
 * Shield Developer Guide</a>.
 * </p>
 **/
public interface AWSShield {

    /**
     * Overrides the default endpoint for this client
     * ("https://shield.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "shield.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://shield.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex: "shield.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://shield.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSShield#setEndpoint(String)}, sets the
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
     * Authorizes the DDoS Response Team (DRT) to access the specified Amazon S3
     * bucket containing your AWS WAF logs. You can associate up to 10 Amazon S3
     * buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the DRT and make an
     * <code>AssociateDRTLogBucket</code> request, you must be subscribed to the
     * <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTLogBucketRequest
     * @return associateDRTLogBucketResult The response from the
     *         AssociateDRTLogBucket service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws NoAssociatedRoleException
     * @throws LimitsExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedForDependencyException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateDRTLogBucketResult associateDRTLogBucket(
            AssociateDRTLogBucketRequest associateDRTLogBucketRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Authorizes the DDoS Response Team (DRT), using the specified role, to
     * access your AWS account to assist with DDoS attack mitigation during
     * potential attacks. This enables the DRT to inspect your AWS WAF
     * configuration and create or update AWS WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription.
     * If you submit an <code>AssociateDRTRole</code> request for an account
     * that already has an associated role, the new <code>RoleArn</code> will
     * replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must
     * attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to the role you will specify
     * in the request. For more information see <a href=
     * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     * >Attaching and Detaching IAM Policies</a>. The role must also trust the
     * service principal <code> drt.shield.amazonaws.com</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html"
     * >IAM JSON Policy Elements: Principal</a>.
     * </p>
     * <p>
     * The DRT will have access only to your AWS WAF and Shield resources. By
     * submitting this request, you authorize the DRT to inspect your AWS WAF
     * and Shield configuration and create and update AWS WAF rules and web ACLs
     * on your behalf. The DRT takes these actions only if explicitly authorized
     * by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an
     * <code>AssociateDRTRole</code> request. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html"
     * >Granting a User Permissions to Pass a Role to an AWS Service</a>.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTRole</code>
     * request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTRoleRequest
     * @return associateDRTRoleResult The response from the AssociateDRTRole
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws AccessDeniedForDependencyException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateDRTRoleResult associateDRTRole(AssociateDRTRoleRequest associateDRTRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds health-based detection to the Shield Advanced protection for a
     * resource. Shield Advanced health-based detection uses the health of your
     * AWS resource to improve responsiveness and accuracy in attack detection
     * and mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate it with your
     * Shield Advanced protection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and
     * AWS Shield Developer Guide</a>.
     * </p>
     * 
     * @param associateHealthCheckRequest
     * @return associateHealthCheckResult The response from the
     *         AssociateHealthCheck service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws LimitsExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateHealthCheckResult associateHealthCheck(
            AssociateHealthCheckRequest associateHealthCheckRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Initializes proactive engagement and sets the list of contacts for the
     * DDoS Response Team (DRT) to use. You must provide at least one phone
     * number in the emergency contact list.
     * </p>
     * <p>
     * After you have initialized proactive engagement using this call, to
     * disable or enable proactive engagement, use the calls
     * <code>DisableProactiveEngagement</code> and
     * <code>EnableProactiveEngagement</code>.
     * </p>
     * <note>
     * <p>
     * This call defines the list of email addresses and phone numbers that the
     * DDoS Response Team (DRT) can use to contact you for escalations to the
     * DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * The contacts that you provide in the request replace any contacts that
     * were already defined. If you already have contacts defined and want to
     * use them, retrieve the list using
     * <code>DescribeEmergencyContactSettings</code> and then provide it to this
     * call.
     * </p>
     * </note>
     * 
     * @param associateProactiveEngagementDetailsRequest
     * @return associateProactiveEngagementDetailsResult The response from the
     *         AssociateProactiveEngagementDetails service method, as returned
     *         by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateProactiveEngagementDetailsResult associateProactiveEngagementDetails(
            AssociateProactiveEngagementDetailsRequest associateProactiveEngagementDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can
     * be an Amazon CloudFront distribution, Elastic Load Balancing load
     * balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an
     * Amazon Route 53 hosted zone.
     * </p>
     * <p>
     * You can add protection to only a single resource with each
     * CreateProtection request. If you want to add protection to multiple
     * resources at once, use the <a
     * href="https://console.aws.amazon.com/waf/">AWS WAF console</a>. For more
     * information see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html"
     * >Getting Started with AWS Shield Advanced</a> and <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html"
     * >Add AWS Shield Advanced Protection to more AWS Resources</a>.
     * </p>
     * 
     * @param createProtectionRequest
     * @return createProtectionResult The response from the CreateProtection
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidResourceException
     * @throws InvalidOperationException
     * @throws LimitsExceededException
     * @throws ResourceAlreadyExistsException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateProtectionResult createProtection(CreateProtectionRequest createProtectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Activates AWS Shield Advanced for an account.
     * </p>
     * <p>
     * When you initally create a subscription, your subscription is set to be
     * automatically renewed at the end of the existing subscription period. You
     * can change this by submitting an <code>UpdateSubscription</code> request.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @return createSubscriptionResult The response from the CreateSubscription
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSubscriptionResult createSubscription(CreateSubscriptionRequest createSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an AWS Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @return deleteProtectionResult The response from the DeleteProtection
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteProtectionResult deleteProtection(DeleteProtectionRequest deleteProtectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires
     * a 1-year subscription commitment. You cannot delete a subscription prior
     * to the completion of that commitment.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @return deleteSubscriptionResult The response from the DeleteSubscription
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws LockedSubscriptionException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    DeleteSubscriptionResult deleteSubscription(DeleteSubscriptionRequest deleteSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @return describeAttackResult The response from the DescribeAttack service
     *         method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAttackResult describeAttack(DescribeAttackRequest describeAttackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the current role and list of Amazon S3 log buckets used by the
     * DDoS Response Team (DRT) to access your AWS account while assisting with
     * attack mitigation.
     * </p>
     * 
     * @param describeDRTAccessRequest
     * @return describeDRTAccessResult The response from the DescribeDRTAccess
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDRTAccessResult describeDRTAccess(DescribeDRTAccessRequest describeDRTAccessRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * 
     * @param describeEmergencyContactSettingsRequest
     * @return describeEmergencyContactSettingsResult The response from the
     *         DescribeEmergencyContactSettings service method, as returned by
     *         AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeEmergencyContactSettingsResult describeEmergencyContactSettings(
            DescribeEmergencyContactSettingsRequest describeEmergencyContactSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @return describeProtectionResult The response from the DescribeProtection
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeProtectionResult describeProtection(DescribeProtectionRequest describeProtectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides details about the AWS Shield Advanced subscription for an
     * account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @return describeSubscriptionResult The response from the
     *         DescribeSubscription service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeSubscriptionResult describeSubscription(
            DescribeSubscriptionRequest describeSubscriptionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes authorization from the DDoS Response Team (DRT) to notify
     * contacts about escalations to the DRT and to initiate proactive customer
     * support.
     * </p>
     * 
     * @param disableProactiveEngagementRequest
     * @return disableProactiveEngagementResult The response from the
     *         DisableProactiveEngagement service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableProactiveEngagementResult disableProactiveEngagement(
            DisableProactiveEngagementRequest disableProactiveEngagementRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3
     * bucket containing your AWS WAF logs.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTLogBucket</code> request, you must be
     * subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>. However, if you are not subscribed to one
     * of these support plans, but had been previously and had granted the DRT
     * access to your account, you can submit a
     * <code>DisassociateDRTLogBucket</code> request to remove this access.
     * </p>
     * 
     * @param disassociateDRTLogBucketRequest
     * @return disassociateDRTLogBucketResult The response from the
     *         DisassociateDRTLogBucket service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws NoAssociatedRoleException
     * @throws AccessDeniedForDependencyException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateDRTLogBucketResult disassociateDRTLogBucket(
            DisassociateDRTLogBucketRequest disassociateDRTLogBucketRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the DDoS Response Team's (DRT) access to your AWS account.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTRole</code> request, you must be
     * subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>. However, if you are not subscribed to one
     * of these support plans, but had been previously and had granted the DRT
     * access to your account, you can submit a <code>DisassociateDRTRole</code>
     * request to remove this access.
     * </p>
     * 
     * @param disassociateDRTRoleRequest
     * @return disassociateDRTRoleResult The response from the
     *         DisassociateDRTRole service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateDRTRoleResult disassociateDRTRole(
            DisassociateDRTRoleRequest disassociateDRTRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes health-based detection from the Shield Advanced protection for a
     * resource. Shield Advanced health-based detection uses the health of your
     * AWS resource to improve responsiveness and accuracy in attack detection
     * and mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate or
     * disassociate it with your Shield Advanced protection. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and
     * AWS Shield Developer Guide</a>.
     * </p>
     * 
     * @param disassociateHealthCheckRequest
     * @return disassociateHealthCheckResult The response from the
     *         DisassociateHealthCheck service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateHealthCheckResult disassociateHealthCheck(
            DisassociateHealthCheckRequest disassociateHealthCheckRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Authorizes the DDoS Response Team (DRT) to use email and phone to notify
     * contacts about escalations to the DRT and to initiate proactive customer
     * support.
     * </p>
     * 
     * @param enableProactiveEngagementRequest
     * @return enableProactiveEngagementResult The response from the
     *         EnableProactiveEngagement service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableProactiveEngagementResult enableProactiveEngagement(
            EnableProactiveEngagementRequest enableProactiveEngagementRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the <code>SubscriptionState</code>, either <code>Active</code> or
     * <code>Inactive</code>.
     * </p>
     * 
     * @param getSubscriptionStateRequest
     * @return getSubscriptionStateResult The response from the
     *         GetSubscriptionState service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSubscriptionStateResult getSubscriptionState(
            GetSubscriptionStateRequest getSubscriptionStateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified
     * time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @return listAttacksResult The response from the ListAttacks service
     *         method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAttacksResult listAttacks(ListAttacksRequest listAttacksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all <a>Protection</a> objects for the account.
     * </p>
     * 
     * @param listProtectionsRequest
     * @return listProtectionsResult The response from the ListProtections
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws InvalidPaginationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListProtectionsResult listProtections(ListProtectionsRequest listProtectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the details of the list of email addresses and phone numbers that
     * the DDoS Response Team (DRT) can use to contact you if you have proactive
     * engagement enabled, for escalations to the DRT and to initiate proactive
     * customer support.
     * </p>
     * 
     * @param updateEmergencyContactSettingsRequest
     * @return updateEmergencyContactSettingsResult The response from the
     *         UpdateEmergencyContactSettings service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateEmergencyContactSettingsResult updateEmergencyContactSettings(
            UpdateEmergencyContactSettingsRequest updateEmergencyContactSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the details of an existing subscription. Only enter values for
     * parameters you want to change. Empty parameters are not updated.
     * </p>
     * 
     * @param updateSubscriptionRequest
     * @return updateSubscriptionResult The response from the UpdateSubscription
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws LockedSubscriptionException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateSubscriptionResult updateSubscription(UpdateSubscriptionRequest updateSubscriptionRequest)
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
