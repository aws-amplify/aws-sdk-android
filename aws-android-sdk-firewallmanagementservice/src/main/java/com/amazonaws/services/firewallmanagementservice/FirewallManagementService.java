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

package com.amazonaws.services.firewallmanagementservice;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.firewallmanagementservice.model.*;

/**
 * Interface for accessing Firewall Management Service <fullname>AWS Firewall
 * Manager</fullname>
 * <p>
 * This is the <i>AWS Firewall Manager API Reference</i>. This guide is for
 * developers who need detailed information about the AWS Firewall Manager API
 * actions, data types, and errors. For detailed information about AWS Firewall
 * Manager features, see the <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html">AWS
 * Firewall Manager Developer Guide</a>.
 * </p>
 **/
public interface FirewallManagementService {

    /**
     * Overrides the default endpoint for this client
     * ("https://fms.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "fms.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://fms.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "fms.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://fms.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link FirewallManagementService#setEndpoint(String)},
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
     * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager
     * must be associated with the master account of your AWS organization or
     * associated with a member account that has the appropriate permissions. If
     * the account ID that you submit is not an AWS Organizations master
     * account, AWS Firewall Manager will set the appropriate permissions for
     * the given member account.
     * </p>
     * <p>
     * The account that you associate with AWS Firewall Manager is called the
     * AWS Firewall Manager administrator account.
     * </p>
     * 
     * @param associateAdminAccountRequest
     * @throws InvalidOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void associateAdminAccount(AssociateAdminAccountRequest associateAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an AWS Firewall Manager association with the IAM role and the
     * Amazon Simple Notification Service (SNS) topic that is used to record AWS
     * Firewall Manager SNS logs.
     * </p>
     * 
     * @param deleteNotificationChannelRequest
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteNotificationChannel(DeleteNotificationChannelRequest deleteNotificationChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager policy.
     * </p>
     * 
     * @param deletePolicyRequest
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deletePolicy(DeletePolicyRequest deletePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Disassociates the account that has been set as the AWS Firewall Manager
     * administrator account. To set a different account as the administrator
     * account, you must submit an <code>AssociateAdminAccount</code> request.
     * </p>
     * 
     * @param disassociateAdminAccountRequest
     * @throws InvalidOperationException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void disassociateAdminAccount(DisassociateAdminAccountRequest disassociateAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the AWS Organizations master account that is associated with AWS
     * Firewall Manager as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param getAdminAccountRequest
     * @return getAdminAccountResult The response from the GetAdminAccount
     *         service method, as returned by Firewall Management Service.
     * @throws InvalidOperationException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetAdminAccountResult getAdminAccount(GetAdminAccountRequest getAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns detailed compliance information about the specified member
     * account. Details include resources that are in and out of compliance with
     * the specified policy. Resources are considered noncompliant for AWS WAF
     * and Shield Advanced policies if the specified policy has not been applied
     * to them. Resources are considered noncompliant for security group
     * policies if they are in scope of the policy, they violate one or more of
     * the policy rules, and remediation is disabled or not possible.
     * </p>
     * 
     * @param getComplianceDetailRequest
     * @return getComplianceDetailResult The response from the
     *         GetComplianceDetail service method, as returned by Firewall
     *         Management Service.
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetComplianceDetailResult getComplianceDetail(
            GetComplianceDetailRequest getComplianceDetailRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Information about the Amazon Simple Notification Service (SNS) topic that
     * is used to record AWS Firewall Manager SNS logs.
     * </p>
     * 
     * @param getNotificationChannelRequest
     * @return getNotificationChannelResult The response from the
     *         GetNotificationChannel service method, as returned by Firewall
     *         Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetNotificationChannelResult getNotificationChannel(
            GetNotificationChannelRequest getNotificationChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return getPolicyResult The response from the GetPolicy service method,
     *         as returned by Firewall Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws InvalidTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * If you created a Shield Advanced policy, returns policy-level attack
     * summary information in the event of a potential DDoS attack. Other policy
     * types are currently unsupported.
     * </p>
     * 
     * @param getProtectionStatusRequest
     * @return getProtectionStatusResult The response from the
     *         GetProtectionStatus service method, as returned by Firewall
     *         Management Service.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetProtectionStatusResult getProtectionStatus(
            GetProtectionStatusRequest getProtectionStatusRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns an array of <code>PolicyComplianceStatus</code> objects in the
     * response. Use <code>PolicyComplianceStatus</code> to get a summary of
     * which member accounts are protected by the specified policy.
     * </p>
     * 
     * @param listComplianceStatusRequest
     * @return listComplianceStatusResult The response from the
     *         ListComplianceStatus service method, as returned by Firewall
     *         Management Service.
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListComplianceStatusResult listComplianceStatus(
            ListComplianceStatusRequest listComplianceStatusRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a <code>MemberAccounts</code> object that lists the member
     * accounts in the administrator's AWS organization.
     * </p>
     * <p>
     * The <code>ListMemberAccounts</code> must be submitted by the account that
     * is set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return listMemberAccountsResult The response from the ListMemberAccounts
     *         service method, as returned by Firewall Management Service.
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest listMemberAccountsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of <code>PolicySummary</code> objects in the response.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return listPoliciesResult The response from the ListPolicies service
     *         method, as returned by Firewall Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the list of tags for the specified AWS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Firewall
     *         Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS)
     * topic that AWS Firewall Manager uses to record SNS logs.
     * </p>
     * 
     * @param putNotificationChannelRequest
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void putNotificationChannel(PutNotificationChannelRequest putNotificationChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an AWS Firewall Manager policy.
     * </p>
     * <p>
     * Firewall Manager provides the following types of policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A Shield Advanced policy, which applies Shield Advanced protection to
     * specified accounts and resources
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS WAF policy (type WAFV2), which defines rule groups to run first in
     * the corresponding AWS WAF web ACL and rule groups to run last in the web
     * ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS WAF Classic policy (type WAF), which defines a rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * A security group policy, which manages VPC security groups across your
     * AWS organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each policy is specific to one of the types. If you want to enforce more
     * than one policy type across accounts, create multiple policies. You can
     * create multiple policies for each type.
     * </p>
     * <p>
     * You must be subscribed to Shield Advanced to create a Shield Advanced
     * policy. For more information about subscribing to Shield Advanced, see <a
     * href=
     * "https://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateSubscription.html"
     * >CreateSubscription</a>.
     * </p>
     * 
     * @param putPolicyRequest
     * @return putPolicyResult The response from the PutPolicy service method,
     *         as returned by Firewall Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws InvalidTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PutPolicyResult putPolicy(PutPolicyRequest putPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to an AWS resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Firewall Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from an AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Firewall Management Service.
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws InternalErrorException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Firewall Management Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
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
