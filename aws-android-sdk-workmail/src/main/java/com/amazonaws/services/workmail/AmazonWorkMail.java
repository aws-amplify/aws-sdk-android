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

package com.amazonaws.services.workmail;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.workmail.model.*;

/**
 * Interface for accessing Amazon WorkMail
 * <p>
 * Amazon WorkMail is a secure, managed business email and calendaring service
 * with support for existing desktop and mobile email clients. You can access
 * your email, contacts, and calendars using Microsoft Outlook, your browser, or
 * other native iOS and Android email applications. You can integrate WorkMail
 * with your existing corporate directory and control both the keys that encrypt
 * your data and the location in which your data is stored.
 * </p>
 * <p>
 * The WorkMail API is designed for the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Listing and describing organizations
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing users
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing groups
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing resources
 * </p>
 * </li>
 * </ul>
 * <p>
 * All WorkMail API operations are Amazon-authenticated and certificate-signed.
 * They not only require the use of the AWS SDK, but also allow for the
 * exclusive use of AWS Identity and Access Management users and roles to help
 * facilitate access, trust, and permission policies. By creating a role and
 * allowing an IAM user to access the WorkMail site, the IAM user gains full
 * administrative visibility into the entire WorkMail organization (or as set in
 * the IAM policy). This includes, but is not limited to, the ability to create,
 * update, and delete users, groups, and resources. This allows developers to
 * perform the scenarios listed above, as well as give users the ability to
 * grant access on a selective basis using the IAM model.
 * </p>
 **/
public interface AmazonWorkMail {

    /**
     * Overrides the default endpoint for this client
     * ("https://workmail.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "workmail.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://workmail.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "workmail.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://workmail.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonWorkMail#setEndpoint(String)}, sets the
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
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @return associateDelegateToResourceResult The response from the
     *         AssociateDelegateToResource service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateDelegateToResourceResult associateDelegateToResource(
            AssociateDelegateToResourceRequest associateDelegateToResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @return associateMemberToGroupResult The response from the
     *         AssociateMemberToGroup service method, as returned by Amazon
     *         WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateMemberToGroupResult associateMemberToGroup(
            AssociateMemberToGroupRequest associateMemberToGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of Amazon
     * WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @return createAliasResult The response from the CreateAlias service
     *         method, as returned by Amazon WorkMail.
     * @throws EmailAddressInUseException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a group that can be used in Amazon WorkMail by calling the
     * <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @return createGroupResult The response from the CreateGroup service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws InvalidParameterException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws ReservedNameException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @return createResourceResult The response from the CreateResource service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws InvalidParameterException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws ReservedNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateResourceResult createResource(CreateResourceRequest createResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a user who can be used in Amazon WorkMail by calling the
     * <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws ReservedNameException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * 
     * @param deleteAccessControlRuleRequest
     * @return deleteAccessControlRuleResult The response from the
     *         DeleteAccessControlRule service method, as returned by Amazon
     *         WorkMail.
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAccessControlRuleResult deleteAccessControlRule(
            DeleteAccessControlRuleRequest deleteAccessControlRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given
     * user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return deleteAliasResult The response from the DeleteAlias service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a group from Amazon WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return deleteGroupResult The response from the DeleteGroup service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @return deleteMailboxPermissionsResult The response from the
     *         DeleteMailboxPermissions service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteMailboxPermissionsResult deleteMailboxPermissions(
            DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return deleteResourceResult The response from the DeleteResource service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteResourceResult deleteResource(DeleteResourceRequest deleteResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a user from Amazon WorkMail and all subsequent systems. Before
     * you can delete a user, the user state must be <code>DISABLED</code>. Use
     * the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user
     * mailboxes for 30 days before they are permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in Amazon WorkMail.
     * This action disassociates the mailbox and schedules it for clean-up.
     * WorkMail keeps mailboxes for 30 days before they are permanently removed.
     * The functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @return deregisterFromWorkMailResult The response from the
     *         DeregisterFromWorkMail service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeregisterFromWorkMailResult deregisterFromWorkMail(
            DeregisterFromWorkMailRequest deregisterFromWorkMailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @return describeGroupResult The response from the DescribeGroup service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides more information regarding a given organization based on its
     * identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return describeOrganizationResult The response from the
     *         DescribeOrganization service method, as returned by Amazon
     *         WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeOrganizationResult describeOrganization(
            DescribeOrganizationRequest describeOrganizationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @return describeResourceResult The response from the DescribeResource
     *         service method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeResourceResult describeResource(DescribeResourceRequest describeResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @return disassociateDelegateFromResourceResult The response from the
     *         DisassociateDelegateFromResource service method, as returned by
     *         Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateDelegateFromResourceResult disassociateDelegateFromResource(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @return disassociateMemberFromGroupResult The response from the
     *         DisassociateMemberFromGroup service method, as returned by Amazon
     *         WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateMemberFromGroupResult disassociateMemberFromGroup(
            DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the effects of an organization's access control rules as they apply
     * to a specified IPv4 address, access protocol action, or user ID.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @return getAccessControlEffectResult The response from the
     *         GetAccessControlEffect service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAccessControlEffectResult getAccessControlEffect(
            GetAccessControlEffectRequest getAccessControlEffectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @return getMailboxDetailsResult The response from the GetMailboxDetails
     *         service method, as returned by Amazon WorkMail.
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMailboxDetailsResult getMailboxDetails(GetMailboxDetailsRequest getMailboxDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @return listAccessControlRulesResult The response from the
     *         ListAccessControlRules service method, as returned by Amazon
     *         WorkMail.
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAccessControlRulesResult listAccessControlRules(
            ListAccessControlRulesRequest listAccessControlRulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given
     * entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @return listAliasesResult The response from the ListAliases service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be
     * members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @return listGroupMembersResult The response from the ListGroupMembers
     *         service method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGroupMembersResult listGroupMembers(ListGroupMembersRequest listGroupMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @return listGroupsResult The response from the ListGroups service method,
     *         as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource
     * mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @return listMailboxPermissionsResult The response from the
     *         ListMailboxPermissions service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMailboxPermissionsResult listMailboxPermissions(
            ListMailboxPermissionsRequest listMailboxPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @return listOrganizationsResult The response from the ListOrganizations
     *         service method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListOrganizationsResult listOrganizations(ListOrganizationsRequest listOrganizationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be
     * resource delegates and answer requests on behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @return listResourceDelegatesResult The response from the
     *         ListResourceDelegates service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListResourceDelegatesResult listResourceDelegates(
            ListResourceDelegatesRequest listResourceDelegatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @return listResourcesResult The response from the ListResources service
     *         method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags applied to an Amazon WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         WorkMail.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds a new access control rule for the specified organization. The rule
     * allows or denies access to the organization for the specified IPv4
     * addresses, access protocol actions, and user IDs. Adding a new rule with
     * the same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @return putAccessControlRuleResult The response from the
     *         PutAccessControlRule service method, as returned by Amazon
     *         WorkMail.
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws EntityNotFoundException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutAccessControlRuleResult putAccessControlRule(
            PutAccessControlRuleRequest putAccessControlRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any
     * pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @return putMailboxPermissionsResult The response from the
     *         PutMailboxPermissions service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutMailboxPermissionsResult putMailboxPermissions(
            PutMailboxPermissionsRequest putMailboxPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for Amazon
     * WorkMail use by associating a mailbox and calendaring capabilities. It
     * performs no change if the user, group, or resource is enabled and fails
     * if the user, group, or resource is deleted. This operation results in the
     * accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The
     * equivalent console functionality for this operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API
     * operation or they can be synchronized from your directory. For more
     * information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @return registerToWorkMailResult The response from the RegisterToWorkMail
     *         service method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EmailAddressInUseException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws EntityAlreadyRegisteredException
     * @throws InvalidParameterException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RegisterToWorkMailResult registerToWorkMail(RegisterToWorkMailRequest registerToWorkMailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @return resetPasswordResult The response from the ResetPassword service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ResetPasswordResult resetPassword(ResetPasswordRequest resetPasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies the specified tags to the specified Amazon WorkMail organization
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon WorkMail.
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Untags the specified tags from the specified Amazon WorkMail organization
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon WorkMail.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a user's current mailbox quota for a specified organization and
     * user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @return updateMailboxQuotaResult The response from the UpdateMailboxQuota
     *         service method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMailboxQuotaResult updateMailboxQuota(UpdateMailboxQuotaRequest updateMailboxQuotaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current
     * email is moved into the list of aliases (or swapped between an existing
     * alias and the current primary email), and the email provided in the input
     * is promoted as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @return updatePrimaryEmailAddressResult The response from the
     *         UpdatePrimaryEmailAddress service method, as returned by Amazon
     *         WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EmailAddressInUseException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdatePrimaryEmailAddressResult updatePrimaryEmailAddress(
            UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be
     * preceded by a <a>DescribeResource</a> call. The dataset in the request
     * should be the one expected when performing another
     * <code>DescribeResource</code> call.
     * </p>
     * 
     * @param updateResourceRequest
     * @return updateResourceResult The response from the UpdateResource service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidConfigurationException
     * @throws EmailAddressInUseException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest)
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
