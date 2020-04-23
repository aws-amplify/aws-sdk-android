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

package com.amazonaws.services.awsresourceaccessmanager;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsresourceaccessmanager.model.*;

/**
 * Interface for accessing AWS Resource Access Manager
 * <p>
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts.
 * To share a resource, you create a resource share, associate the resource with
 * the resource share, and specify the principals that can access the resources
 * associated with the resource share. The following principals are supported:
 * AWS accounts, organizational units (OU) from AWS Organizations, and
 * organizations from AWS Organizations.
 * </p>
 * <p>
 * For more information, see the <a
 * href="https://docs.aws.amazon.com/ram/latest/userguide/">AWS Resource Access
 * Manager User Guide</a>.
 * </p>
 **/
public interface AWSResourceAccessManager {

    /**
     * Overrides the default endpoint for this client
     * ("https://ram.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ram.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://ram.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "ram.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://ram.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSResourceAccessManager#setEndpoint(String)},
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
     * Accepts an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return acceptResourceShareInvitationResult The response from the
     *         AcceptResourceShareInvitation service method, as returned by AWS
     *         Resource Access Manager.
     * @throws MalformedArnException
     * @throws OperationNotPermittedException
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws ResourceShareInvitationAlreadyAcceptedException
     * @throws ResourceShareInvitationAlreadyRejectedException
     * @throws ResourceShareInvitationExpiredException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws InvalidClientTokenException
     * @throws IdempotentParameterMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AcceptResourceShareInvitationResult acceptResourceShareInvitation(
            AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified resource share with the specified principals and
     * resources.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return associateResourceShareResult The response from the
     *         AssociateResourceShare service method, as returned by AWS
     *         Resource Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws UnknownResourceException
     * @throws InvalidStateTransitionException
     * @throws ResourceShareLimitExceededException
     * @throws MalformedArnException
     * @throws InvalidStateTransitionException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws UnknownResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateResourceShareResult associateResourceShare(
            AssociateResourceShareRequest associateResourceShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a permission with a resource share.
     * </p>
     * 
     * @param associateResourceSharePermissionRequest
     * @return associateResourceSharePermissionResult The response from the
     *         AssociateResourceSharePermission service method, as returned by
     *         AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidParameterException
     * @throws InvalidClientTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateResourceSharePermissionResult associateResourceSharePermission(
            AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a resource share.
     * </p>
     * 
     * @param createResourceShareRequest
     * @return createResourceShareResult The response from the
     *         CreateResourceShare service method, as returned by AWS Resource
     *         Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws InvalidStateTransitionException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ResourceShareLimitExceededException
     * @throws TagPolicyViolationException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateResourceShareResult createResourceShare(
            CreateResourceShareRequest createResourceShareRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified resource share.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @return deleteResourceShareResult The response from the
     *         DeleteResourceShare service method, as returned by AWS Resource
     *         Access Manager.
     * @throws OperationNotPermittedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidStateTransitionException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteResourceShareResult deleteResourceShare(
            DeleteResourceShareRequest deleteResourceShareRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified principals or resources from the specified
     * resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return disassociateResourceShareResult The response from the
     *         DisassociateResourceShare service method, as returned by AWS
     *         Resource Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws ResourceShareLimitExceededException
     * @throws MalformedArnException
     * @throws InvalidStateTransitionException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws UnknownResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateResourceShareResult disassociateResourceShare(
            DisassociateResourceShareRequest disassociateResourceShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates an AWS RAM permission from a resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @return disassociateResourceSharePermissionResult The response from the
     *         DisassociateResourceSharePermission service method, as returned
     *         by AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidParameterException
     * @throws InvalidClientTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateResourceSharePermissionResult disassociateResourceSharePermission(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables resource sharing within your AWS Organization.
     * </p>
     * <p>
     * The caller must be the master account for the AWS Organization.
     * </p>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return enableSharingWithAwsOrganizationResult The response from the
     *         EnableSharingWithAwsOrganization service method, as returned by
     *         AWS Resource Access Manager.
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    EnableSharingWithAwsOrganizationResult enableSharingWithAwsOrganization(
            EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the contents of an AWS RAM permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @return getPermissionResult The response from the GetPermission service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetPermissionResult getPermission(GetPermissionRequest getPermissionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the policies for the specified resources that you own and have
     * shared.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return getResourcePoliciesResult The response from the
     *         GetResourcePolicies service method, as returned by AWS Resource
     *         Access Manager.
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ResourceArnNotFoundException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetResourcePoliciesResult getResourcePolicies(
            GetResourcePoliciesRequest getResourcePoliciesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the resources or principals for the resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return getResourceShareAssociationsResult The response from the
     *         GetResourceShareAssociations service method, as returned by AWS
     *         Resource Access Manager.
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetResourceShareAssociationsResult getResourceShareAssociations(
            GetResourceShareAssociationsRequest getResourceShareAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the invitations for resource sharing that you've received.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return getResourceShareInvitationsResult The response from the
     *         GetResourceShareInvitations service method, as returned by AWS
     *         Resource Access Manager.
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws InvalidMaxResultsException
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetResourceShareInvitationsResult getResourceShareInvitations(
            GetResourceShareInvitationsRequest getResourceShareInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the resource shares that you own or the resource shares that are
     * shared with you.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return getResourceSharesResult The response from the GetResourceShares
     *         service method, as returned by AWS Resource Access Manager.
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetResourceSharesResult getResourceShares(GetResourceSharesRequest getResourceSharesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the resources in a resource share that is shared with you but that
     * the invitation is still pending for.
     * </p>
     * 
     * @param listPendingInvitationResourcesRequest
     * @return listPendingInvitationResourcesResult The response from the
     *         ListPendingInvitationResources service method, as returned by AWS
     *         Resource Access Manager.
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws MissingRequiredParameterException
     * @throws ResourceShareInvitationAlreadyRejectedException
     * @throws ResourceShareInvitationExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListPendingInvitationResourcesResult listPendingInvitationResources(
            ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the AWS RAM permissions.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return listPermissionsResult The response from the ListPermissions
     *         service method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the principals that you have shared resources with or that have
     * shared resources with you.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return listPrincipalsResult The response from the ListPrincipals service
     *         method, as returned by AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListPrincipalsResult listPrincipals(ListPrincipalsRequest listPrincipalsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the AWS RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @return listResourceSharePermissionsResult The response from the
     *         ListResourceSharePermissions service method, as returned by AWS
     *         Resource Access Manager.
     * @throws InvalidParameterException
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidNextTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListResourceSharePermissionsResult listResourceSharePermissions(
            ListResourceSharePermissionsRequest listResourceSharePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the shareable resource types supported by AWS RAM.
     * </p>
     * 
     * @param listResourceTypesRequest
     * @return listResourceTypesResult The response from the ListResourceTypes
     *         service method, as returned by AWS Resource Access Manager.
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListResourceTypesResult listResourceTypes(ListResourceTypesRequest listResourceTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the resources that you added to a resource shares or the resources
     * that are shared with you.
     * </p>
     * 
     * @param listResourcesRequest
     * @return listResourcesResult The response from the ListResources service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidResourceTypeException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resource shares that were created by attaching a policy to a resource are
     * visible only to the resource share owner, and the resource share cannot
     * be modified in AWS RAM.
     * </p>
     * <p>
     * Use this API action to promote the resource share. When you promote the
     * resource share, it becomes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Visible to all principals that it is shared with.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifiable in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @return promoteResourceShareCreatedFromPolicyResult The response from the
     *         PromoteResourceShareCreatedFromPolicy service method, as returned
     *         by AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws OperationNotPermittedException
     * @throws InvalidParameterException
     * @throws MissingRequiredParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws UnknownResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PromoteResourceShareCreatedFromPolicyResult promoteResourceShareCreatedFromPolicy(
            PromoteResourceShareCreatedFromPolicyRequest promoteResourceShareCreatedFromPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return rejectResourceShareInvitationResult The response from the
     *         RejectResourceShareInvitation service method, as returned by AWS
     *         Resource Access Manager.
     * @throws MalformedArnException
     * @throws OperationNotPermittedException
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws ResourceShareInvitationAlreadyAcceptedException
     * @throws ResourceShareInvitationAlreadyRejectedException
     * @throws ResourceShareInvitationExpiredException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws InvalidClientTokenException
     * @throws IdempotentParameterMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RejectResourceShareInvitationResult rejectResourceShareInvitation(
            RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds the specified tags to the specified resource share that you own.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws MalformedArnException
     * @throws TagLimitExceededException
     * @throws ResourceArnNotFoundException
     * @throws TagPolicyViolationException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the specified resource share that you
     * own.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified resource share that you own.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return updateResourceShareResult The response from the
     *         UpdateResourceShare service method, as returned by AWS Resource
     *         Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws MissingRequiredParameterException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateResourceShareResult updateResourceShare(
            UpdateResourceShareRequest updateResourceShareRequest) throws AmazonClientException,
            AmazonServiceException;

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
