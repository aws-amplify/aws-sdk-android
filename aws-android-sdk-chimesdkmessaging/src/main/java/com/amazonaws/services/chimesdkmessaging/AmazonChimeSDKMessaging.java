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

package com.amazonaws.services.chimesdkmessaging;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.chimesdkmessaging.model.*;

/**
 * Interface for accessing Amazon ChimeSDK Messaging
 * <p>
 * The Amazon Chime SDK Messaging APIs in this section allow software developers
 * to send and receive messages in custom messaging applications. These APIs
 * depend on the frameworks provided by the Amazon Chime SDK Identity APIs. For
 * more information about the messaging APIs, see <a href=
 * "https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Messaging"
 * >Amazon Chime SDK messaging</a>
 * </p>
 **/
public interface AmazonChimeSDKMessaging {

    /**
     * Overrides the default endpoint for this client
     * ("https://messaging-chime.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "messaging-chime.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://messaging-chime.us-east-1.amazonaws.com"). If the
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
     *            "messaging-chime.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://messaging-chime.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonChimeSDKMessaging#setEndpoint(String)},
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
     * Associates a channel flow with a channel. Once associated, all messages
     * to that channel go through channel flow processors. To stop processing,
     * use the <code>DisassociateChannelFlow</code> API.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can associate a channel flow.
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param associateChannelFlowRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void associateChannelFlow(AssociateChannelFlowRequest associateChannelFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @return batchCreateChannelMembershipResult The response from the
     *         BatchCreateChannelMembership service method, as returned by
     *         Amazon ChimeSDK Messaging.
     * @throws ServiceFailureException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedClientException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    BatchCreateChannelMembershipResult batchCreateChannelMembership(
            BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Calls back Chime SDK Messaging with a processing response message. This
     * should be invoked from the processor Lambda. This is a developer API.
     * </p>
     * <p>
     * You can return one of the following processing responses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update message content or metadata
     * </p>
     * </li>
     * <li>
     * <p>
     * Deny a message
     * </p>
     * </li>
     * <li>
     * <p>
     * Make no changes to the message
     * </p>
     * </li>
     * </ul>
     * 
     * @param channelFlowCallbackRequest
     * @return channelFlowCallbackResult The response from the
     *         ChannelFlowCallback service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ChannelFlowCallbackResult channelFlowCallback(
            ChannelFlowCallbackRequest channelFlowCallbackRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a channel to which you can add users and send messages.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelRequest
     * @return createChannelResult The response from the CreateChannel service
     *         method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Permanently bans a member from a channel. Moderators can't add banned
     * members to a channel. To undo a ban, you first have to
     * <code>DeleteChannelBan</code>, and then
     * <code>CreateChannelMembership</code>. Bans are cleaned up when you delete
     * users or channels.
     * </p>
     * <p>
     * If you ban a user who is already part of a channel, that user is
     * automatically kicked from the channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelBanRequest
     * @return createChannelBanResult The response from the CreateChannelBan
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateChannelBanResult createChannelBan(CreateChannelBanRequest createChannelBanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a channel flow, a container for processors. Processors are AWS
     * Lambda functions that perform actions on chat messages, such as stripping
     * out profanity. You can associate channel flows with channels, and the
     * processors in the channel flow then take action on all messages sent to
     * that channel. This is a developer API.
     * </p>
     * <p>
     * Channel flows process the following items:
     * </p>
     * <ol>
     * <li>
     * <p>
     * New and updated messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Persistent and non-persistent messages
     * </p>
     * </li>
     * <li>
     * <p>
     * The Standard message type
     * </p>
     * </li>
     * </ol>
     * <note>
     * <p>
     * Channel flows don't process Control or System messages. For more
     * information about the message types provided by Chime SDK Messaging,
     * refer to <a href=
     * "https://docs.aws.amazon.com/chime/latest/dg/using-the-messaging-sdk.html#msg-types"
     * >Message types</a> in the <i>Amazon Chime developer guide</i>.
     * </p>
     * </note>
     * 
     * @param createChannelFlowRequest
     * @return createChannelFlowResult The response from the CreateChannelFlow
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateChannelFlowResult createChannelFlow(CreateChannelFlowRequest createChannelFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a user to a channel. The <code>InvitedBy</code> field in
     * <code>ChannelMembership</code> is derived from the request header. A
     * channel member can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Send messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Receive messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Edit their own messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Leave the channel
     * </p>
     * </li>
     * </ul>
     * <p>
     * Privacy settings impact this action as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Public Channels: You do not need to be a member to list messages, but you
     * must be a member to send messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Private Channels: You must be a member to list or send messages.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelMembershipRequest
     * @return createChannelMembershipResult The response from the
     *         CreateChannelMembership service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateChannelMembershipResult createChannelMembership(
            CreateChannelMembershipRequest createChannelMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new <code>ChannelModerator</code>. A channel moderator can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add and remove other members of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove other moderators of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove user bans for the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redact messages in the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * List messages in the channel.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelModeratorRequest
     * @return createChannelModeratorResult The response from the
     *         CreateChannelModerator service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateChannelModeratorResult createChannelModerator(
            CreateChannelModeratorRequest createChannelModeratorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Immediately makes a channel and its memberships inaccessible and marks
     * them for deletion. This is an irreversible process.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelRequest
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteChannel(DeleteChannelRequest deleteChannelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes a user from a channel's ban list.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelBanRequest
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteChannelBan(DeleteChannelBanRequest deleteChannelBanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a channel flow, an irreversible process. This is a developer API.
     * </p>
     * <note>
     * <p>
     * This API works only when the channel flow is not associated with any
     * channel. To get a list of all channels that a channel flow is associated
     * with, use the <code>ListChannelsAssociatedWithChannelFlow</code> API. Use
     * the <code>DisassociateChannelFlow</code> API to disassociate a channel
     * flow from all channels.
     * </p>
     * </note>
     * 
     * @param deleteChannelFlowRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ConflictException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteChannelFlow(DeleteChannelFlowRequest deleteChannelFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a member from a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMembershipRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteChannelMembership(DeleteChannelMembershipRequest deleteChannelMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a channel message. Only admins can perform this action. Deletion
     * makes messages inaccessible immediately. A background process deletes any
     * revisions created by <code>UpdateChannelMessage</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMessageRequest
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteChannelMessage(DeleteChannelMessageRequest deleteChannelMessageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a channel moderator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelModeratorRequest
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteChannelModerator(DeleteChannelModeratorRequest deleteChannelModeratorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of a channel in an Amazon Chime
     * <code>AppInstance</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelRequest
     * @return describeChannelResult The response from the DescribeChannel
     *         service method, as returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of a channel ban.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelBanRequest
     * @return describeChannelBanResult The response from the DescribeChannelBan
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelBanResult describeChannelBan(DescribeChannelBanRequest describeChannelBanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of a channel flow in an Amazon Chime
     * <code>AppInstance</code>. This is a developer API.
     * </p>
     * 
     * @param describeChannelFlowRequest
     * @return describeChannelFlowResult The response from the
     *         DescribeChannelFlow service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelFlowResult describeChannelFlow(
            DescribeChannelFlowRequest describeChannelFlowRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the full details of a user's channel membership.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipRequest
     * @return describeChannelMembershipResult The response from the
     *         DescribeChannelMembership service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelMembershipResult describeChannelMembership(
            DescribeChannelMembershipRequest describeChannelMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the details of a channel based on the membership of the specified
     * <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipForAppInstanceUserRequest
     * @return describeChannelMembershipForAppInstanceUserResult The response
     *         from the DescribeChannelMembershipForAppInstanceUser service
     *         method, as returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelMembershipForAppInstanceUserResult describeChannelMembershipForAppInstanceUser(
            DescribeChannelMembershipForAppInstanceUserRequest describeChannelMembershipForAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of a channel moderated by the specified
     * <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratedByAppInstanceUserRequest
     * @return describeChannelModeratedByAppInstanceUserResult The response from
     *         the DescribeChannelModeratedByAppInstanceUser service method, as
     *         returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelModeratedByAppInstanceUserResult describeChannelModeratedByAppInstanceUser(
            DescribeChannelModeratedByAppInstanceUserRequest describeChannelModeratedByAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the full details of a single ChannelModerator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratorRequest
     * @return describeChannelModeratorResult The response from the
     *         DescribeChannelModerator service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelModeratorResult describeChannelModerator(
            DescribeChannelModeratorRequest describeChannelModeratorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a channel flow from all its channels. Once disassociated,
     * all messages to that channel stop going through the channel flow
     * processor.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can disassociate a channel
     * flow. The <code>x-amz-chime-bearer</code> request header is mandatory.
     * Use the <code>AppInstanceUserArn</code> of the user that makes the API
     * call as the value in the header.
     * </p>
     * </note>
     * 
     * @param disassociateChannelFlowRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void disassociateChannelFlow(DisassociateChannelFlowRequest disassociateChannelFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the membership preferences of an <code>AppInstanceUser</code> for
     * the specified channel. The <code>AppInstanceUser</code> must be a member
     * of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can retrieve preferences. Users in the
     * <code>AppInstanceAdmin</code> and channel moderator roles can't retrieve
     * preferences for other users. Banned users can't retrieve membership
     * preferences for the channel from which they are banned.
     * </p>
     * 
     * @param getChannelMembershipPreferencesRequest
     * @return getChannelMembershipPreferencesResult The response from the
     *         GetChannelMembershipPreferences service method, as returned by
     *         Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetChannelMembershipPreferencesResult getChannelMembershipPreferences(
            GetChannelMembershipPreferencesRequest getChannelMembershipPreferencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the full details of a channel message.
     * </p>
     * <note>
     * <p>
     * The x-amz-chime-bearer request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param getChannelMessageRequest
     * @return getChannelMessageResult The response from the GetChannelMessage
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetChannelMessageResult getChannelMessage(GetChannelMessageRequest getChannelMessageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets message status for a specified <code>messageId</code>. Use this API
     * to determine the intermediate status of messages going through channel
     * flow processing. The API provides an alternative to retrieving message
     * status if the event was not received because a client wasn't connected to
     * a websocket.
     * </p>
     * <p>
     * Messages can have any one of these statuses.
     * </p>
     * <dl>
     * <dt>SENT</dt>
     * <dd>
     * <p>
     * Message processed successfully
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * Ongoing processing
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * Processing failed
     * </p>
     * </dd>
     * <dt>DENIED</dt>
     * <dd>
     * <p>
     * Messasge denied by the processor
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API does not return statuses for denied messages, because we don't
     * store them once the processor denies them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only the message sender can invoke this API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getChannelMessageStatusRequest
     * @return getChannelMessageStatusResult The response from the
     *         GetChannelMessageStatus service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetChannelMessageStatusResult getChannelMessageStatus(
            GetChannelMessageStatusRequest getChannelMessageStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @return getMessagingSessionEndpointResult The response from the
     *         GetMessagingSessionEndpoint service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetMessagingSessionEndpointResult getMessagingSessionEndpoint(
            GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the users banned from a particular channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelBansRequest
     * @return listChannelBansResult The response from the ListChannelBans
     *         service method, as returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelBansResult listChannelBans(ListChannelBansRequest listChannelBansRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a paginated lists of all the channel flows created under a single
     * Chime. This is a developer API.
     * </p>
     * 
     * @param listChannelFlowsRequest
     * @return listChannelFlowsResult The response from the ListChannelFlows
     *         service method, as returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelFlowsResult listChannelFlows(ListChannelFlowsRequest listChannelFlowsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all channel memberships in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * <p>
     * If you want to list the channels to which a specific app instance user
     * belongs, see the <a href=
     * "https://docs.aws.amazon.com/chime/latest/APIReference/API_messaging-chime_ListChannelMembershipsForAppInstanceUser.html"
     * >ListChannelMembershipsForAppInstanceUser</a> API.
     * </p>
     * 
     * @param listChannelMembershipsRequest
     * @return listChannelMembershipsResult The response from the
     *         ListChannelMemberships service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelMembershipsResult listChannelMemberships(
            ListChannelMembershipsRequest listChannelMembershipsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all channels that a particular <code>AppInstanceUser</code> is a
     * part of. Only an <code>AppInstanceAdmin</code> can call the API with a
     * user ARN that is not their own.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMembershipsForAppInstanceUserRequest
     * @return listChannelMembershipsForAppInstanceUserResult The response from
     *         the ListChannelMembershipsForAppInstanceUser service method, as
     *         returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelMembershipsForAppInstanceUserResult listChannelMembershipsForAppInstanceUser(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List all the messages in a channel. Returns a paginated list of
     * <code>ChannelMessages</code>. By default, sorted by creation timestamp in
     * descending order.
     * </p>
     * <note>
     * <p>
     * Redacted messages appear in the results as empty, since they are only
     * redacted, not deleted. Deleted messages do not appear in the results.
     * This action always returns the latest version of an edited message.
     * </p>
     * <p>
     * Also, the x-amz-chime-bearer request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMessagesRequest
     * @return listChannelMessagesResult The response from the
     *         ListChannelMessages service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelMessagesResult listChannelMessages(
            ListChannelMessagesRequest listChannelMessagesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the moderators for a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelModeratorsRequest
     * @return listChannelModeratorsResult The response from the
     *         ListChannelModerators service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelModeratorsResult listChannelModerators(
            ListChannelModeratorsRequest listChannelModeratorsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all Channels created under a single Chime App as a paginated list.
     * You can specify filters to narrow results.
     * </p>
     * <p class="title">
     * <b>Functionality &amp; restrictions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use privacy = <code>PUBLIC</code> to retrieve all public channels in the
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only an <code>AppInstanceAdmin</code> can set privacy =
     * <code>PRIVATE</code> to list the private channels in an account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsRequest
     * @return listChannelsResult The response from the ListChannels service
     *         method, as returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all channels associated with a specified channel flow. You can
     * associate a channel flow with multiple channels, but you can only
     * associate a channel with one channel flow. This is a developer API.
     * </p>
     * 
     * @param listChannelsAssociatedWithChannelFlowRequest
     * @return listChannelsAssociatedWithChannelFlowResult The response from the
     *         ListChannelsAssociatedWithChannelFlow service method, as returned
     *         by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelsAssociatedWithChannelFlowResult listChannelsAssociatedWithChannelFlow(
            ListChannelsAssociatedWithChannelFlowRequest listChannelsAssociatedWithChannelFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A list of the channels moderated by an <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsModeratedByAppInstanceUserRequest
     * @return listChannelsModeratedByAppInstanceUserResult The response from
     *         the ListChannelsModeratedByAppInstanceUser service method, as
     *         returned by Amazon ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelsModeratedByAppInstanceUserResult listChannelsModeratedByAppInstanceUser(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the membership preferences of an <code>AppInstanceUser</code> for
     * the specified channel. The <code>AppInstanceUser</code> must be a member
     * of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can set preferences. Users in the
     * <code>AppInstanceAdmin</code> and channel moderator roles can't set
     * preferences for other users. Banned users can't set membership
     * preferences for the channel from which they are banned.
     * </p>
     * 
     * @param putChannelMembershipPreferencesRequest
     * @return putChannelMembershipPreferencesResult The response from the
     *         PutChannelMembershipPreferences service method, as returned by
     *         Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutChannelMembershipPreferencesResult putChannelMembershipPreferences(
            PutChannelMembershipPreferencesRequest putChannelMembershipPreferencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Redacts message content, but not metadata. The message exists in the back
     * end, but the action returns null content, and the state shows as
     * redacted.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param redactChannelMessageRequest
     * @return redactChannelMessageResult The response from the
     *         RedactChannelMessage service method, as returned by Amazon
     *         ChimeSDK Messaging.
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RedactChannelMessageResult redactChannelMessage(
            RedactChannelMessageRequest redactChannelMessageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sends a message to a particular channel that the member is a part of.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * <p>
     * Also, <code>STANDARD</code> messages can contain 4KB of data and the 1KB
     * of metadata. <code>CONTROL</code> messages can contain 30 bytes of data
     * and no metadata.
     * </p>
     * </note>
     * 
     * @param sendChannelMessageRequest
     * @return sendChannelMessageResult The response from the SendChannelMessage
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ConflictException
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    SendChannelMessageResult sendChannelMessage(SendChannelMessageRequest sendChannelMessageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK messaging
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK messaging
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Update a channel's attributes.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelRequest
     * @return updateChannelResult The response from the UpdateChannel service
     *         method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates channel flow attributes. This is a developer API.
     * </p>
     * 
     * @param updateChannelFlowRequest
     * @return updateChannelFlowResult The response from the UpdateChannelFlow
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateChannelFlowResult updateChannelFlow(UpdateChannelFlowRequest updateChannelFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the content of a message.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelMessageRequest
     * @return updateChannelMessageResult The response from the
     *         UpdateChannelMessage service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ConflictException
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
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateChannelMessageResult updateChannelMessage(
            UpdateChannelMessageRequest updateChannelMessageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * The details of the time when a user last read messages in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelReadMarkerRequest
     * @return updateChannelReadMarkerResult The response from the
     *         UpdateChannelReadMarker service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateChannelReadMarkerResult updateChannelReadMarker(
            UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest)
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
