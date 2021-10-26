/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.chimesdkidentity.model.*;

/**
 * Interface for accessing Amazon ChimeSDK Identity
 * <p>
 * The Amazon Chime SDK Identity APIs in this section allow software developers
 * to create and manage unique instances of their messaging applications. These
 * APIs provide the overarching framework for creating and sending messages. For
 * more information about the identity APIs, refer to <a href=
 * "https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Identity.html"
 * >Amazon Chime SDK identity</a>.
 * </p>
 **/
public interface AmazonChimeSDKIdentity {

    /**
     * Overrides the default endpoint for this client
     * ("https://identity-chime.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "identity-chime.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://identity-chime.us-east-1.amazonaws.com"). If the
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
     *            "identity-chime.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://identity-chime.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonChimeSDKIdentity#setEndpoint(String)},
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
     * Creates an Amazon Chime SDK messaging <code>AppInstance</code> under an
     * AWS account. Only SDK messaging customers use this API.
     * <code>CreateAppInstance</code> supports idempotency behavior as described
     * in the AWS API Standard.
     * </p>
     * <p>
     * identity
     * </p>
     * 
     * @param createAppInstanceRequest
     * @return createAppInstanceResult The response from the CreateAppInstance
     *         service method, as returned by Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAppInstanceResult createAppInstance(CreateAppInstanceRequest createAppInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> to an
     * <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChannelModerator</code> actions across all channels in the
     * <code>AppInstance</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteChannelMessage</code> actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only an <code>AppInstanceUser</code> can be promoted to an
     * <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @return createAppInstanceAdminResult The response from the
     *         CreateAppInstanceAdmin service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAppInstanceAdminResult createAppInstanceAdmin(
            CreateAppInstanceAdminRequest createAppInstanceAdminRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The
     * request consists of a unique <code>appInstanceUserId</code> and
     * <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @return createAppInstanceUserResult The response from the
     *         CreateAppInstanceUser service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAppInstanceUserResult createAppInstanceUser(
            CreateAppInstanceUserRequest createAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data
     * asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAppInstance(DeleteAppInstanceRequest deleteAppInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an
     * <code>AppInstanceUser</code>. This action does not delete the user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAppInstanceAdmin(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAppInstanceUser(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deregisters an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param deregisterAppInstanceUserEndpointRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deregisterAppInstanceUserEndpoint(
            DeregisterAppInstanceUserEndpointRequest deregisterAppInstanceUserEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @return describeAppInstanceResult The response from the
     *         DescribeAppInstance service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAppInstanceResult describeAppInstance(
            DescribeAppInstanceRequest describeAppInstanceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @return describeAppInstanceAdminResult The response from the
     *         DescribeAppInstanceAdmin service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAppInstanceAdminResult describeAppInstanceAdmin(
            DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @return describeAppInstanceUserResult The response from the
     *         DescribeAppInstanceUser service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAppInstanceUserResult describeAppInstanceUser(
            DescribeAppInstanceUserRequest describeAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param describeAppInstanceUserEndpointRequest
     * @return describeAppInstanceUserEndpointResult The response from the
     *         DescribeAppInstanceUserEndpoint service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAppInstanceUserEndpointResult describeAppInstanceUserEndpoint(
            DescribeAppInstanceUserEndpointRequest describeAppInstanceUserEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @return getAppInstanceRetentionSettingsResult The response from the
     *         GetAppInstanceRetentionSettings service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetAppInstanceRetentionSettingsResult getAppInstanceRetentionSettings(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @return listAppInstanceAdminsResult The response from the
     *         ListAppInstanceAdmins service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAppInstanceAdminsResult listAppInstanceAdmins(
            ListAppInstanceAdminsRequest listAppInstanceAdminsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the <code>AppInstanceUserEndpoints</code> created under a
     * single <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param listAppInstanceUserEndpointsRequest
     * @return listAppInstanceUserEndpointsResult The response from the
     *         ListAppInstanceUserEndpoints service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAppInstanceUserEndpointsResult listAppInstanceUserEndpoints(
            ListAppInstanceUserEndpointsRequest listAppInstanceUserEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single
     * <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @return listAppInstanceUsersResult The response from the
     *         ListAppInstanceUsers service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAppInstanceUsersResult listAppInstanceUsers(
            ListAppInstanceUsersRequest listAppInstanceUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single
     * AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @return listAppInstancesResult The response from the ListAppInstances
     *         service method, as returned by Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAppInstancesResult listAppInstances(ListAppInstancesRequest listAppInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the amount of time in days that a given <code>AppInstance</code>
     * retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @return putAppInstanceRetentionSettingsResult The response from the
     *         PutAppInstanceRetentionSettings service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutAppInstanceRetentionSettingsResult putAppInstanceRetentionSettings(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>.
     * The endpoint receives messages for a user. For push notifications, the
     * endpoint is a mobile device used to receive mobile push notifications for
     * a user.
     * </p>
     * 
     * @param registerAppInstanceUserEndpointRequest
     * @return registerAppInstanceUserEndpointResult The response from the
     *         RegisterAppInstanceUserEndpoint service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RegisterAppInstanceUserEndpointResult registerAppInstanceUserEndpoint(
            RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK identity
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK identity
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @return updateAppInstanceResult The response from the UpdateAppInstance
     *         service method, as returned by Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateAppInstanceResult updateAppInstance(UpdateAppInstanceRequest updateAppInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update
     * names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @return updateAppInstanceUserResult The response from the
     *         UpdateAppInstanceUser service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateAppInstanceUserResult updateAppInstanceUser(
            UpdateAppInstanceUserRequest updateAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can
     * update the name and <code>AllowMessage</code> values.
     * </p>
     * 
     * @param updateAppInstanceUserEndpointRequest
     * @return updateAppInstanceUserEndpointResult The response from the
     *         UpdateAppInstanceUserEndpoint service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateAppInstanceUserEndpointResult updateAppInstanceUserEndpoint(
            UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest)
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
