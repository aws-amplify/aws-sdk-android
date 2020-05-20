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

package com.amazonaws.services.chime;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.chime.model.*;

/**
 * Interface for accessing Amazon Chime
 * <p>
 * The Amazon Chime API (application programming interface) is designed for
 * developers to perform key tasks, such as creating and managing Amazon Chime
 * accounts, users, and Voice Connectors. This guide provides detailed
 * information about the Amazon Chime API, including operations, types, inputs
 * and outputs, and error codes. It also includes some server-side API actions
 * to use with the Amazon Chime SDK. For more information about the Amazon Chime
 * SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using
 * the Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
 * </p>
 * <p>
 * You can use an AWS SDK, the AWS Command Line Interface (AWS CLI), or the REST
 * API to make API calls. We recommend using an AWS SDK or the AWS CLI. Each API
 * operation includes links to information about using it with a
 * language-specific AWS SDK or the AWS CLI.
 * </p>
 * <dl>
 * <dt>Using an AWS SDK</dt>
 * <dd>
 * <p>
 * You don't need to write code to calculate a signature for request
 * authentication. The SDK clients authenticate your requests by using access
 * keys that you provide. For more information about AWS SDKs, see the <a
 * href="http://aws.amazon.com/developer/">AWS Developer Center</a>.
 * </p>
 * </dd>
 * <dt>Using the AWS CLI</dt>
 * <dd>
 * <p>
 * Use your access keys with the AWS CLI to make API calls. For information
 * about setting up the AWS CLI, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/installing.html"
 * >Installing the AWS Command Line Interface</a> in the <i>AWS Command Line
 * Interface User Guide</i>. For a list of available Amazon Chime commands, see
 * the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/chime/index.html"
 * >Amazon Chime commands</a> in the <i>AWS CLI Command Reference</i>.
 * </p>
 * </dd>
 * <dt>Using REST API</dt>
 * <dd>
 * <p>
 * If you use REST to make API calls, you must authenticate your request by
 * providing a signature. Amazon Chime supports signature version 4. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a> in the <i>Amazon Web Services
 * General Reference</i>.
 * </p>
 * <p>
 * When making REST API calls, use the service name <code>chime</code> and REST
 * endpoint <code>https://service.chime.aws.amazon.com</code>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * Administrative permissions are controlled using AWS Identity and Access
 * Management (IAM). For more information, see <a
 * href="https://docs.aws.amazon.com/chime/latest/ag/security-iam.html">Identity
 * and Access Management for Amazon Chime</a> in the <i>Amazon Chime
 * Administration Guide</i>.
 * </p>
 **/
public interface AmazonChime {

    /**
     * Overrides the default endpoint for this client
     * ("https://chime.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "chime.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://chime.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "chime.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://chime.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonChime#setEndpoint(String)}, sets the
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
     * Associates a phone number with the specified Amazon Chime user.
     * </p>
     * 
     * @param associatePhoneNumberWithUserRequest
     * @return associatePhoneNumberWithUserResult The response from the
     *         AssociatePhoneNumberWithUser service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociatePhoneNumberWithUserResult associatePhoneNumberWithUser(
            AssociatePhoneNumberWithUserRequest associatePhoneNumberWithUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return associatePhoneNumbersWithVoiceConnectorResult The response from
     *         the AssociatePhoneNumbersWithVoiceConnector service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector
     * group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return associatePhoneNumbersWithVoiceConnectorGroupResult The response
     *         from the AssociatePhoneNumbersWithVoiceConnectorGroup service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociatePhoneNumbersWithVoiceConnectorGroupResult associatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified sign-in delegate groups with the specified
     * Amazon Chime account.
     * </p>
     * 
     * @param associateSigninDelegateGroupsWithAccountRequest
     * @return associateSigninDelegateGroupsWithAccountResult The response from
     *         the AssociateSigninDelegateGroupsWithAccount service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(
            AssociateSigninDelegateGroupsWithAccountRequest associateSigninDelegateGroupsWithAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates up to 100 new attendees for an active Amazon Chime SDK meeting.
     * For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return batchCreateAttendeeResult The response from the
     *         BatchCreateAttendee service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchCreateAttendeeResult batchCreateAttendee(
            BatchCreateAttendeeRequest batchCreateAttendeeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds up to 50 members to a chat room in an Amazon Chime Enterprise
     * account. Members can be either users or bots. The member role designates
     * whether the member is a chat room administrator or a general chat room
     * member.
     * </p>
     * 
     * @param batchCreateRoomMembershipRequest
     * @return batchCreateRoomMembershipResult The response from the
     *         BatchCreateRoomMembership service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchCreateRoomMembershipResult batchCreateRoomMembership(
            BatchCreateRoomMembershipRequest batchCreateRoomMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be
     * disassociated from any users or Amazon Chime Voice Connectors before they
     * can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they
     * are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @return batchDeletePhoneNumberResult The response from the
     *         BatchDeletePhoneNumber service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDeletePhoneNumberResult batchDeletePhoneNumber(
            BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Suspends up to 50 users from a <code>Team</code> or
     * <code>EnterpriseLWA</code> Amazon Chime account. For more information
     * about different account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * Users suspended from a <code>Team</code> account are disassociated from
     * the account, but they can continue to use Amazon Chime as free users. To
     * remove the suspension from suspended <code>Team</code> account users,
     * invite them to the <code>Team</code> account again. You can use the
     * <a>InviteUsers</a> action to do so.
     * </p>
     * <p>
     * Users suspended from an <code>EnterpriseLWA</code> account are
     * immediately signed out of Amazon Chime and can no longer sign in. To
     * remove the suspension from suspended <code>EnterpriseLWA</code> account
     * users, use the <a>BatchUnsuspendUser</a> action.
     * </p>
     * <p>
     * To sign out users without suspending them, use the <a>LogoutUser</a>
     * action.
     * </p>
     * 
     * @param batchSuspendUserRequest
     * @return batchSuspendUserResult The response from the BatchSuspendUser
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchSuspendUserResult batchSuspendUser(BatchSuspendUserRequest batchSuspendUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the suspension from up to 50 previously suspended users for the
     * specified Amazon Chime <code>EnterpriseLWA</code> account. Only users on
     * <code>EnterpriseLWA</code> accounts can be unsuspended using this action.
     * For more information about different account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * Previously suspended users who are unsuspended using this action are
     * returned to <code>Registered</code> status. Users who are not previously
     * suspended are ignored.
     * </p>
     * 
     * @param batchUnsuspendUserRequest
     * @return batchUnsuspendUserResult The response from the BatchUnsuspendUser
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchUnsuspendUserResult batchUnsuspendUser(BatchUnsuspendUserRequest batchUnsuspendUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates phone number product types or calling names. You can update one
     * attribute at a time for each <code>UpdatePhoneNumberRequestItem</code>.
     * For example, you can update either the product type or the calling name.
     * </p>
     * <p>
     * For product types, choose from Amazon Chime Business Calling and Amazon
     * Chime Voice Connector. For toll-free numbers, you must use the Amazon
     * Chime Voice Connector product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete.
     * Pending updates to outbound calling names must be complete before you can
     * request another update.
     * </p>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @return batchUpdatePhoneNumberResult The response from the
     *         BatchUpdatePhoneNumber service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(
            BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates user details within the <a>UpdateUserRequestItem</a> object for
     * up to 20 users for the specified Amazon Chime account. Currently, only
     * <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param batchUpdateUserRequest
     * @return batchUpdateUserResult The response from the BatchUpdateUser
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchUpdateUserResult batchUpdateUser(BatchUpdateUserRequest batchUpdateUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Chime account under the administrator's AWS account.
     * Only <code>Team</code> account types are currently supported for this
     * action. For more information about different account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param createAccountRequest
     * @return createAccountResult The response from the CreateAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAccountResult createAccount(CreateAccountRequest createAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more
     * information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return createAttendeeResult The response from the CreateAttendee service
     *         method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAttendeeResult createAttendee(CreateAttendeeRequest createAttendeeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a bot for an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createBotRequest
     * @return createBotResult The response from the CreateBot service method,
     *         as returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBotResult createBot(CreateBotRequest createBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with
     * no initial attendees. For more information about the Amazon Chime SDK,
     * see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @return createMeetingResult The response from the CreateMeeting service
     *         method, as returned by Amazon Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateMeetingResult createMeeting(CreateMeetingRequest createMeetingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. Choose from Amazon
     * Chime Business Calling and Amazon Chime Voice Connector product types.
     * For toll-free numbers, you must use the Amazon Chime Voice Connector
     * product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return createPhoneNumberOrderResult The response from the
     *         CreatePhoneNumberOrder service method, as returned by Amazon
     *         Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreatePhoneNumberOrderResult createPhoneNumberOrder(
            CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a proxy session on the specified Amazon Chime Voice Connector for
     * the specified participant phone numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @return createProxySessionResult The response from the CreateProxySession
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateProxySessionResult createProxySession(CreateProxySessionRequest createProxySessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a chat room for the specified Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createRoomRequest
     * @return createRoomResult The response from the CreateRoom service method,
     *         as returned by Amazon Chime.
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRoomResult createRoom(CreateRoomRequest createRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds a member to a chat room in an Amazon Chime Enterprise account. A
     * member can be either a user or a bot. The member role designates whether
     * the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param createRoomMembershipRequest
     * @return createRoomMembershipResult The response from the
     *         CreateRoomMembership service method, as returned by Amazon Chime.
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRoomMembershipResult createRoomMembership(
            CreateRoomMembershipRequest createRoomMembershipRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a user under the specified Amazon Chime account.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector under the administrator's AWS
     * account. You can choose to create an Amazon Chime Voice Connector in a
     * specific AWS Region.
     * </p>
     * <p>
     * Enabling <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures
     * your Amazon Chime Voice Connector to use TLS transport for SIP signaling
     * and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and
     * unencrypted outbound calls are blocked.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return createVoiceConnectorResult The response from the
     *         CreateVoiceConnector service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVoiceConnectorResult createVoiceConnector(
            CreateVoiceConnectorRequest createVoiceConnectorRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector group under the administrator's
     * AWS account. You can associate Amazon Chime Voice Connectors with the
     * Amazon Chime Voice Connector group by including
     * <code>VoiceConnectorItems</code> in the request.
     * </p>
     * <p>
     * You can include Amazon Chime Voice Connectors from different AWS Regions
     * in your group. This creates a fault tolerant mechanism for fallback in
     * case of availability events.
     * </p>
     * 
     * @param createVoiceConnectorGroupRequest
     * @return createVoiceConnectorGroupResult The response from the
     *         CreateVoiceConnectorGroup service method, as returned by Amazon
     *         Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVoiceConnectorGroupResult createVoiceConnectorGroup(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Amazon Chime account. You must suspend all users
     * before deleting a <code>Team</code> account. You can use the
     * <a>BatchSuspendUser</a> action to do so.
     * </p>
     * <p>
     * For <code>EnterpriseLWA</code> and <code>EnterpriseAD</code> accounts,
     * you must release the claimed domains for your Amazon Chime account before
     * deletion. As soon as you release the domain, all users under that account
     * are suspended.
     * </p>
     * <p>
     * Deleted accounts appear in your <code>Disabled</code> accounts list for
     * 90 days. To restore a deleted account from your <code>Disabled</code>
     * accounts list, you must contact AWS Support.
     * </p>
     * <p>
     * After 90 days, deleted accounts are permanently removed from your
     * <code>Disabled</code> accounts list.
     * </p>
     * 
     * @param deleteAccountRequest
     * @return deleteAccountResult The response from the DeleteAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws UnprocessableEntityException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAccountResult deleteAccount(DeleteAccountRequest deleteAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and
     * deletes their <code>JoinToken</code>. Attendees are automatically deleted
     * when a Amazon Chime SDK meeting is deleted. For more information about
     * the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteAttendee(DeleteAttendeeRequest deleteAttendeeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the events configuration that allows a bot to receive outgoing
     * events.
     * </p>
     * 
     * @param deleteEventsConfigurationRequest
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteEventsConfiguration(DeleteEventsConfigurationRequest deleteEventsConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. When a meeting is
     * deleted, its attendees are also deleted and clients can no longer join
     * it. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteMeeting(DeleteMeetingRequest deleteMeetingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletion queue</b>. A phone
     * number must be disassociated from any users or Amazon Chime Voice
     * Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> for 7 days
     * before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteProxySession(DeleteProxySessionRequest deleteProxySessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomRequest
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteRoom(DeleteRoomRequest deleteRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes a member from a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomMembershipRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteRoomMembership(DeleteRoomMembershipRequest deleteRoomMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers
     * associated with the Amazon Chime Voice Connector must be disassociated
     * from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector group. Any
     * <code>VoiceConnectorItems</code> and phone numbers associated with the
     * group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnectorGroup(DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnectorOrigination(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnectorProxy(DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the streaming configuration for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnectorStreamingConfiguration(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnectorTermination(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to
     * authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the primary provisioned phone number from the specified
     * Amazon Chime user.
     * </p>
     * 
     * @param disassociatePhoneNumberFromUserRequest
     * @return disassociatePhoneNumberFromUserResult The response from the
     *         DisassociatePhoneNumberFromUser service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociatePhoneNumberFromUserResult disassociatePhoneNumberFromUser(
            DisassociatePhoneNumberFromUserRequest disassociatePhoneNumberFromUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return disassociatePhoneNumbersFromVoiceConnectorResult The response
     *         from the DisassociatePhoneNumbersFromVoiceConnector service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime
     * Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return disassociatePhoneNumbersFromVoiceConnectorGroupResult The
     *         response from the DisassociatePhoneNumbersFromVoiceConnectorGroup
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociatePhoneNumbersFromVoiceConnectorGroupResult disassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified sign-in delegate groups from the specified
     * Amazon Chime account.
     * </p>
     * 
     * @param disassociateSigninDelegateGroupsFromAccountRequest
     * @return disassociateSigninDelegateGroupsFromAccountResult The response
     *         from the DisassociateSigninDelegateGroupsFromAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateSigninDelegateGroupsFromAccountResult disassociateSigninDelegateGroupsFromAccount(
            DisassociateSigninDelegateGroupsFromAccountRequest disassociateSigninDelegateGroupsFromAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime account, such as account
     * type and supported licenses.
     * </p>
     * 
     * @param getAccountRequest
     * @return getAccountResult The response from the GetAccount service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves account settings for the specified Amazon Chime account ID,
     * such as remote control and dial out settings. For more information about
     * these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the
     * Policies Page</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return getAccountSettingsResult The response from the GetAccountSettings
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and
     * attendee ID. For more information about the Amazon Chime SDK, see <a
     * href=
     * "https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @return getAttendeeResult The response from the GetAttendee service
     *         method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAttendeeResult getAttendee(GetAttendeeRequest getAttendeeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified bot, such as bot email address, bot
     * type, status, and display name.
     * </p>
     * 
     * @param getBotRequest
     * @return getBotResult The response from the GetBot service method, as
     *         returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBotResult getBot(GetBotRequest getBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets details for an events configuration that allows a bot to receive
     * outgoing events, such as an HTTPS endpoint or Lambda function ARN.
     * </p>
     * 
     * @param getEventsConfigurationRequest
     * @return getEventsConfigurationResult The response from the
     *         GetEventsConfiguration service method, as returned by Amazon
     *         Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetEventsConfigurationResult getEventsConfiguration(
            GetEventsConfigurationRequest getEventsConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves global settings for the administrator's AWS account, such as
     * Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return getGlobalSettingsResult The response from the GetGlobalSettings
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID.
     * For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @return getMeetingResult The response from the GetMeeting service method,
     *         as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMeetingResult getMeeting(GetMeetingRequest getMeetingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as
     * associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return getPhoneNumberResult The response from the GetPhoneNumber service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as order
     * creation timestamp, phone numbers in E.164 format, product type, and
     * order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return getPhoneNumberOrderResult The response from the
     *         GetPhoneNumberOrder service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPhoneNumberOrderResult getPhoneNumberOrder(
            GetPhoneNumberOrderRequest getPhoneNumberOrderRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account,
     * such as the default outbound calling name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return getPhoneNumberSettingsResult The response from the
     *         GetPhoneNumberSettings service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPhoneNumberSettingsResult getPhoneNumberSettings(
            GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the specified proxy session details for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @return getProxySessionResult The response from the GetProxySession
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetProxySessionResult getProxySession(GetProxySessionRequest getProxySessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the retention settings for the specified Amazon Chime Enterprise
     * account. For more information about retention settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html"
     * >Managing Chat Retention Policies</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param getRetentionSettingsRequest
     * @return getRetentionSettingsResult The response from the
     *         GetRetentionSettings service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRetentionSettingsResult getRetentionSettings(
            GetRetentionSettingsRequest getRetentionSettingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves room details, such as the room name, for a room in an Amazon
     * Chime Enterprise account.
     * </p>
     * 
     * @param getRoomRequest
     * @return getRoomResult The response from the GetRoom service method, as
     *         returned by Amazon Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRoomResult getRoom(GetRoomRequest getRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified user ID, such as primary email
     * address, license type, and personal meeting PIN.
     * </p>
     * <p>
     * To retrieve user details with an email address instead of a user ID, use
     * the <a>ListUsers</a> action, and then filter by email address.
     * </p>
     * 
     * @param getUserRequest
     * @return getUserResult The response from the GetUser service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUserResult getUser(GetUserRequest getUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves settings for the specified user ID, such as any associated
     * phone number settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return getUserSettingsResult The response from the GetUserSettings
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUserSettingsResult getUserSettings(GetUserSettingsRequest getUserSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector, such as
     * timestamps, name, outbound host, and encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return getVoiceConnectorResult The response from the GetVoiceConnector
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorResult getVoiceConnector(GetVoiceConnectorRequest getVoiceConnectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector group,
     * such as timestamps, name, and associated <code>VoiceConnectorItems</code>
     * .
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return getVoiceConnectorGroupResult The response from the
     *         GetVoiceConnectorGroup service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorGroupResult getVoiceConnectorGroup(
            GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the logging configuration details for the specified Amazon
     * Chime Voice Connector. Shows whether SIP message logs are enabled for
     * sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return getVoiceConnectorLoggingConfigurationResult The response from the
     *         GetVoiceConnectorLoggingConfiguration service method, as returned
     *         by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorLoggingConfigurationResult getVoiceConnectorLoggingConfiguration(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves origination setting details for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return getVoiceConnectorOriginationResult The response from the
     *         GetVoiceConnectorOrigination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(
            GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the proxy configuration details for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @return getVoiceConnectorProxyResult The response from the
     *         GetVoiceConnectorProxy service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorProxyResult getVoiceConnectorProxy(
            GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon
     * Chime Voice Connector. Shows whether media streaming is enabled for
     * sending to Amazon Kinesis. It also shows the retention period, in hours,
     * for the Amazon Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return getVoiceConnectorStreamingConfigurationResult The response from
     *         the GetVoiceConnectorStreamingConfiguration service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfiguration(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves termination setting details for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return getVoiceConnectorTerminationResult The response from the
     *         GetVoiceConnectorTermination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorTerminationResult getVoiceConnectorTermination(
            GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the last time a SIP <code>OPTIONS</code> ping
     * was received from your SIP infrastructure for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return getVoiceConnectorTerminationHealthResult The response from the
     *         GetVoiceConnectorTerminationHealth service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends email to a maximum of 50 users, inviting them to the specified
     * Amazon Chime <code>Team</code> account. Only <code>Team</code> account
     * types are currently supported for this action.
     * </p>
     * 
     * @param inviteUsersRequest
     * @return inviteUsersResult The response from the InviteUsers service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    InviteUsersResult inviteUsers(InviteUsersRequest inviteUsersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the Amazon Chime accounts under the administrator's AWS account.
     * You can filter accounts by account name prefix. To find out which Amazon
     * Chime account a user belongs to, you can filter by the user's email
     * address, which returns one account result.
     * </p>
     * 
     * @param listAccountsRequest
     * @return listAccountsResult The response from the ListAccounts service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAccountsResult listAccounts(ListAccountsRequest listAccountsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK attendee resource.
     * </p>
     * 
     * @param listAttendeeTagsRequest
     * @return listAttendeeTagsResult The response from the ListAttendeeTags
     *         service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAttendeeTagsResult listAttendeeTags(ListAttendeeTagsRequest listAttendeeTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more
     * information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @return listAttendeesResult The response from the ListAttendees service
     *         method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAttendeesResult listAttendees(ListAttendeesRequest listAttendeesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the bots associated with the administrator's Amazon Chime
     * Enterprise account ID.
     * </p>
     * 
     * @param listBotsRequest
     * @return listBotsResult The response from the ListBots service method, as
     *         returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBotsResult listBots(ListBotsRequest listBotsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listMeetingTagsRequest
     * @return listMeetingTagsResult The response from the ListMeetingTags
     *         service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMeetingTagsResult listMeetingTags(ListMeetingTagsRequest listMeetingTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists up to 100 active Amazon Chime SDK meetings. For more information
     * about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param listMeetingsRequest
     * @return listMeetingsResult The response from the ListMeetings service
     *         method, as returned by Amazon Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMeetingsResult listMeetings(ListMeetingsRequest listMeetingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the phone number orders for the administrator's Amazon Chime
     * account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return listPhoneNumberOrdersResult The response from the
     *         ListPhoneNumberOrders service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPhoneNumberOrdersResult listPhoneNumberOrders(
            ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime account, Amazon
     * Chime user, Amazon Chime Voice Connector, or Amazon Chime Voice Connector
     * group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return listPhoneNumbersResult The response from the ListPhoneNumbers
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @return listProxySessionsResult The response from the ListProxySessions
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListProxySessionsResult listProxySessions(ListProxySessionsRequest listProxySessionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the membership details for the specified room in an Amazon Chime
     * Enterprise account, such as the members' IDs, email addresses, and names.
     * </p>
     * 
     * @param listRoomMembershipsRequest
     * @return listRoomMembershipsResult The response from the
     *         ListRoomMemberships service method, as returned by Amazon Chime.
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRoomMembershipsResult listRoomMemberships(
            ListRoomMembershipsRequest listRoomMembershipsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the room details for the specified Amazon Chime Enterprise account.
     * Optionally, filter the results by a member ID (user ID or bot ID) to see
     * a list of rooms that the member belongs to.
     * </p>
     * 
     * @param listRoomsRequest
     * @return listRoomsResult The response from the ListRooms service method,
     *         as returned by Amazon Chime.
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRoomsResult listRooms(ListRoomsRequest listRoomsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the users that belong to the specified Amazon Chime account. You
     * can specify an email address to list only the user that the email address
     * belongs to.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the Amazon Chime Voice Connector groups for the administrator's AWS
     * account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return listVoiceConnectorGroupsResult The response from the
     *         ListVoiceConnectorGroups service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVoiceConnectorGroupsResult listVoiceConnectorGroups(
            ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return listVoiceConnectorTerminationCredentialsResult The response from
     *         the ListVoiceConnectorTerminationCredentials service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the Amazon Chime Voice Connectors for the administrator's AWS
     * account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return listVoiceConnectorsResult The response from the
     *         ListVoiceConnectors service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVoiceConnectorsResult listVoiceConnectors(
            ListVoiceConnectorsRequest listVoiceConnectorsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Logs out the specified user from all of the devices they are currently
     * logged into.
     * </p>
     * 
     * @param logoutUserRequest
     * @return logoutUserResult The response from the LogoutUser service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    LogoutUserResult logoutUser(LogoutUserRequest logoutUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an events configuration that allows a bot to receive outgoing
     * events sent by Amazon Chime. Choose either an HTTPS endpoint or a Lambda
     * function ARN. For more information, see <a>Bot</a>.
     * </p>
     * 
     * @param putEventsConfigurationRequest
     * @return putEventsConfigurationResult The response from the
     *         PutEventsConfiguration service method, as returned by Amazon
     *         Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutEventsConfigurationResult putEventsConfiguration(
            PutEventsConfigurationRequest putEventsConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Puts retention settings for the specified Amazon Chime Enterprise
     * account. We recommend using AWS CloudTrail to monitor usage of this API
     * for your account. For more information, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/cloudtrail.html"
     * >Logging Amazon Chime API Calls with AWS CloudTrail</a> in the <i>Amazon
     * Chime Administration Guide</i>.
     * </p>
     * <p>
     * To turn off existing retention settings, remove the number of days from
     * the corresponding <b>RetentionDays</b> field in the
     * <b>RetentionSettings</b> object. For more information about retention
     * settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html"
     * >Managing Chat Retention Policies</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param putRetentionSettingsRequest
     * @return putRetentionSettingsResult The response from the
     *         PutRetentionSettings service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutRetentionSettingsResult putRetentionSettings(
            PutRetentionSettingsRequest putRetentionSettingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds a logging configuration for the specified Amazon Chime Voice
     * Connector. The logging configuration specifies whether SIP message logs
     * are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return putVoiceConnectorLoggingConfigurationResult The response from the
     *         PutVoiceConnectorLoggingConfiguration service method, as returned
     *         by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutVoiceConnectorLoggingConfigurationResult putVoiceConnectorLoggingConfiguration(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return putVoiceConnectorOriginationResult The response from the
     *         PutVoiceConnectorOrigination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(
            PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @return putVoiceConnectorProxyResult The response from the
     *         PutVoiceConnectorProxy service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutVoiceConnectorProxyResult putVoiceConnectorProxy(
            PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a streaming configuration for the specified Amazon Chime Voice
     * Connector. The streaming configuration specifies whether media streaming
     * is enabled for sending to Amazon Kinesis. It also sets the retention
     * period, in hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return putVoiceConnectorStreamingConfigurationResult The response from
     *         the PutVoiceConnectorStreamingConfiguration service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return putVoiceConnectorTerminationResult The response from the
     *         PutVoiceConnectorTermination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutVoiceConnectorTerminationResult putVoiceConnectorTermination(
            PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds termination SIP credentials for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void putVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Redacts the specified message from the specified Amazon Chime
     * conversation.
     * </p>
     * 
     * @param redactConversationMessageRequest
     * @return redactConversationMessageResult The response from the
     *         RedactConversationMessage service method, as returned by Amazon
     *         Chime.
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws BadRequestException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RedactConversationMessageResult redactConversationMessage(
            RedactConversationMessageRequest redactConversationMessageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Redacts the specified message from the specified Amazon Chime chat room.
     * </p>
     * 
     * @param redactRoomMessageRequest
     * @return redactRoomMessageResult The response from the RedactRoomMessage
     *         service method, as returned by Amazon Chime.
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws BadRequestException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RedactRoomMessageResult redactRoomMessage(RedactRoomMessageRequest redactRoomMessageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Regenerates the security token for a bot.
     * </p>
     * 
     * @param regenerateSecurityTokenRequest
     * @return regenerateSecurityTokenResult The response from the
     *         RegenerateSecurityToken service method, as returned by Amazon
     *         Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RegenerateSecurityTokenResult regenerateSecurityToken(
            RegenerateSecurityTokenRequest regenerateSecurityTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets the personal meeting PIN for the specified user on an Amazon Chime
     * account. Returns the <a>User</a> object with the updated personal meeting
     * PIN.
     * </p>
     * 
     * @param resetPersonalPINRequest
     * @return resetPersonalPINResult The response from the ResetPersonalPIN
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ResetPersonalPINResult resetPersonalPIN(ResetPersonalPINRequest resetPersonalPINRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Moves a phone number from the <b>Deletion queue</b> back into the phone
     * number <b>Inventory</b>.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return restorePhoneNumberResult The response from the RestorePhoneNumber
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RestorePhoneNumberResult restorePhoneNumber(RestorePhoneNumberRequest restorePhoneNumberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches phone numbers that can be ordered.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return searchAvailablePhoneNumbersResult The response from the
     *         SearchAvailablePhoneNumbers service method, as returned by Amazon
     *         Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param tagAttendeeRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagAttendee(TagAttendeeRequest tagAttendeeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param tagMeetingRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagMeeting(TagMeetingRequest tagMeetingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK meeting
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param untagAttendeeRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagAttendee(UntagAttendeeRequest untagAttendeeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param untagMeetingRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagMeeting(UntagMeetingRequest untagMeetingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK meeting
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates account details for the specified Amazon Chime account.
     * Currently, only account name updates are supported for this action.
     * </p>
     * 
     * @param updateAccountRequest
     * @return updateAccountResult The response from the UpdateAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAccountResult updateAccount(UpdateAccountRequest updateAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime account. You can
     * update settings for remote control of shared screens, or for the dial-out
     * option. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the
     * Policies Page</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return updateAccountSettingsResult The response from the
     *         UpdateAccountSettings service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAccountSettingsResult updateAccountSettings(
            UpdateAccountSettingsRequest updateAccountSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the status of the specified bot, such as starting or stopping the
     * bot from running in your Amazon Chime Enterprise account.
     * </p>
     * 
     * @param updateBotRequest
     * @return updateBotResult The response from the UpdateBot service method,
     *         as returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateBotResult updateBot(UpdateBotRequest updateBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates global settings for the administrator's AWS account, such as
     * Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates phone number details, such as product type or calling name, for
     * the specified phone number ID. You can update one phone number detail at
     * a time. For example, you can update either the product type or the
     * calling name in one action.
     * </p>
     * <p>
     * For toll-free numbers, you must use the Amazon Chime Voice Connector
     * product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete.
     * Pending updates to outbound calling names must be complete before you can
     * request another update.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return updatePhoneNumberResult The response from the UpdatePhoneNumber
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account,
     * such as the default outbound calling name. You can update the default
     * outbound calling name once every seven days. Outbound calling names can
     * take up to 72 hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updatePhoneNumberSettings(UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS
     * capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @return updateProxySessionResult The response from the UpdateProxySession
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateProxySessionResult updateProxySession(UpdateProxySessionRequest updateProxySessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates room details, such as the room name, for a room in an Amazon
     * Chime Enterprise account.
     * </p>
     * 
     * @param updateRoomRequest
     * @return updateRoomResult The response from the UpdateRoom service method,
     *         as returned by Amazon Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRoomResult updateRoom(UpdateRoomRequest updateRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates room membership details, such as the member role, for a room in
     * an Amazon Chime Enterprise account. The member role designates whether
     * the member is a chat room administrator or a general chat room member.
     * The member role can be updated only for user IDs.
     * </p>
     * 
     * @param updateRoomMembershipRequest
     * @return updateRoomMembershipResult The response from the
     *         UpdateRoomMembership service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRoomMembershipResult updateRoomMembership(
            UpdateRoomMembershipRequest updateRoomMembershipRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates user details for a specified user ID. Currently, only
     * <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param updateUserRequest
     * @return updateUserResult The response from the UpdateUser service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the settings for the specified user, such as phone number
     * settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateUserSettings(UpdateUserSettingsRequest updateUserSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return updateVoiceConnectorResult The response from the
     *         UpdateVoiceConnector service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateVoiceConnectorResult updateVoiceConnector(
            UpdateVoiceConnectorRequest updateVoiceConnectorRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector group,
     * such as the name and Amazon Chime Voice Connector priority ranking.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return updateVoiceConnectorGroupResult The response from the
     *         UpdateVoiceConnectorGroup service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateVoiceConnectorGroupResult updateVoiceConnectorGroup(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest)
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
