/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.sns.model.*;

/**
 * Interface for accessing Amazon Simple Notification Service asynchronously.
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables
 * you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this
 * product see the <a href="http://aws.amazon.com/sns/">Amazon SNS product
 * page</a>. For detailed information about Amazon SNS features and their
 * associated API calls, see the <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * For information on the permissions you need to use this API, see <a href=
 * "https://docs.aws.amazon.com/sns/latest/dg/sns-authentication-and-access-control.html"
 * >Identity and access management in Amazon SNS</a> in the <i>Amazon SNS
 * Developer Guide.</i>
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred
 * programming language. The SDKs contain functionality that automatically takes
 * care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 **/
public interface AmazonSNSAsync extends AmazonSNS {
    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for
     * the specified Amazon Web Services accounts to the specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> addPermissionAsync(AddPermissionRequest addPermissionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for
     * the specified Amazon Web Services accounts to the specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            AsyncHandler<AddPermissionRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted
     * out of receiving SMS messages from your Amazon Web Services account. You
     * cannot send SMS messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the
     * <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest <p>
     *            The input for the <code>CheckIfPhoneNumberIsOptedOut</code>
     *            action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CheckIfPhoneNumberIsOptedOut service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(
            CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted
     * out of receiving SMS messages from your Amazon Web Services account. You
     * cannot send SMS messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the
     * <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest <p>
     *            The input for the <code>CheckIfPhoneNumberIsOptedOut</code>
     *            action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CheckIfPhoneNumberIsOptedOut service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(
            CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest,
            AsyncHandler<CheckIfPhoneNumberIsOptedOutRequest, CheckIfPhoneNumberIsOptedOutResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest <p>
     *            Input for ConfirmSubscription action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            ConfirmSubscriptionRequest confirmSubscriptionRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest <p>
     *            Input for ConfirmSubscription action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            ConfirmSubscriptionRequest confirmSubscriptionRequest,
            AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging),
     * to which devices and mobile apps may register. You must specify
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code>
     * attributes when using the <code>CreatePlatformApplication</code> action.
     * </p>
     * <p>
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code> are
     * received from the notification service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>ADM</code>, <code>PlatformPrincipal</code> is
     * <code>client id</code> and <code>PlatformCredential</code> is
     * <code>client secret</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>Baidu</code>, <code>PlatformPrincipal</code> is
     * <code>API key</code> and <code>PlatformCredential</code> is
     * <code>secret key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code> using certificate
     * credentials, <code>PlatformPrincipal</code> is
     * <code>SSL certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code> using token
     * credentials, <code>PlatformPrincipal</code> is
     * <code>signing key ID</code> and <code>PlatformCredential</code> is
     * <code>signing key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>GCM</code> (Firebase Cloud Messaging), there is no
     * <code>PlatformPrincipal</code> and the <code>PlatformCredential</code> is
     * <code>API key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>MPNS</code>, <code>PlatformPrincipal</code> is
     * <code>TLS certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>WNS</code>, <code>PlatformPrincipal</code> is
     * <code>Package Security Identifier</code> and
     * <code>PlatformCredential</code> is <code>secret key</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use the returned <code>PlatformApplicationArn</code> as an
     * attribute for the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * 
     * @param createPlatformApplicationRequest <p>
     *            Input for CreatePlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreatePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            CreatePlatformApplicationRequest createPlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging),
     * to which devices and mobile apps may register. You must specify
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code>
     * attributes when using the <code>CreatePlatformApplication</code> action.
     * </p>
     * <p>
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code> are
     * received from the notification service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>ADM</code>, <code>PlatformPrincipal</code> is
     * <code>client id</code> and <code>PlatformCredential</code> is
     * <code>client secret</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>Baidu</code>, <code>PlatformPrincipal</code> is
     * <code>API key</code> and <code>PlatformCredential</code> is
     * <code>secret key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code> using certificate
     * credentials, <code>PlatformPrincipal</code> is
     * <code>SSL certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code> using token
     * credentials, <code>PlatformPrincipal</code> is
     * <code>signing key ID</code> and <code>PlatformCredential</code> is
     * <code>signing key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>GCM</code> (Firebase Cloud Messaging), there is no
     * <code>PlatformPrincipal</code> and the <code>PlatformCredential</code> is
     * <code>API key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>MPNS</code>, <code>PlatformPrincipal</code> is
     * <code>TLS certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>WNS</code>, <code>PlatformPrincipal</code> is
     * <code>Package Security Identifier</code> and
     * <code>PlatformCredential</code> is <code>secret key</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use the returned <code>PlatformApplicationArn</code> as an
     * attribute for the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * 
     * @param createPlatformApplicationRequest <p>
     *            Input for CreatePlatformApplication action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreatePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            CreatePlatformApplicationRequest createPlatformApplicationRequest,
            AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. <code>CreatePlatformEndpoint</code> requires the
     * <code>PlatformApplicationArn</code> that is returned from
     * <code>CreatePlatformApplication</code>. You can use the returned
     * <code>EndpointArn</code> to send a message to a mobile app or by the
     * <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the
     * requester already owns an endpoint with the same device token and
     * attributes, that endpoint's ARN is returned without creating a new
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes
     * must be provided: ChannelId and UserId. The token field must also contain
     * the ChannelId. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html"
     * >Creating an Amazon SNS Endpoint for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest <p>
     *            Input for CreatePlatformEndpoint action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreatePlatformEndpoint service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            CreatePlatformEndpointRequest createPlatformEndpointRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. <code>CreatePlatformEndpoint</code> requires the
     * <code>PlatformApplicationArn</code> that is returned from
     * <code>CreatePlatformApplication</code>. You can use the returned
     * <code>EndpointArn</code> to send a message to a mobile app or by the
     * <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the
     * requester already owns an endpoint with the same device token and
     * attributes, that endpoint's ARN is returned without creating a new
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes
     * must be provided: ChannelId and UserId. The token field must also contain
     * the ChannelId. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html"
     * >Creating an Amazon SNS Endpoint for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest <p>
     *            Input for CreatePlatformEndpoint action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreatePlatformEndpoint service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            CreatePlatformEndpointRequest createPlatformEndpointRequest,
            AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a destination phone number to an Amazon Web Services account in the
     * SMS sandbox and sends a one-time password (OTP) to that phone number.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param createSMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         CreateSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptedOutException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateSMSSandboxPhoneNumberResult> createSMSSandboxPhoneNumberAsync(
            CreateSMSSandboxPhoneNumberRequest createSMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a destination phone number to an Amazon Web Services account in the
     * SMS sandbox and sends a one-time password (OTP) to that phone number.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param createSMSSandboxPhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptedOutException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateSMSSandboxPhoneNumberResult> createSMSSandboxPhoneNumberAsync(
            CreateSMSSandboxPhoneNumberRequest createSMSSandboxPhoneNumberRequest,
            AsyncHandler<CreateSMSSandboxPhoneNumberRequest, CreateSMSSandboxPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create
     * at most 100,000 standard topics (at most 1,000 FIFO topics). For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
     * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer
     * Guide</i>. This action is idempotent, so if the requester already owns a
     * topic with the specified name, that topic's ARN is returned without
     * creating a new topic.
     * </p>
     * 
     * @param createTopicRequest <p>
     *            Input for CreateTopic action.
     *            </p>
     * @return A Java Future object containing the response from the CreateTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateTopicResult> createTopicAsync(CreateTopicRequest createTopicRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create
     * at most 100,000 standard topics (at most 1,000 FIFO topics). For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
     * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer
     * Guide</i>. This action is idempotent, so if the requester already owns a
     * topic with the specified name, that topic's ARN is returned without
     * creating a new topic.
     * </p>
     * 
     * @param createTopicRequest <p>
     *            Input for CreateTopic action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateTopicResult> createTopicAsync(CreateTopicRequest createTopicRequest,
            AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This
     * action is idempotent. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you
     * must also unsubscribe the endpoint from the topic.
     * </p>
     * 
     * @param deleteEndpointRequest <p>
     *            Input for DeleteEndpoint action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This
     * action is idempotent. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you
     * must also unsubscribe the endpoint from the topic.
     * </p>
     * 
     * @param deleteEndpointRequest <p>
     *            Input for DeleteEndpoint action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            AsyncHandler<DeleteEndpointRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest <p>
     *            Input for DeletePlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeletePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> deletePlatformApplicationAsync(
            DeletePlatformApplicationRequest deletePlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest <p>
     *            Input for DeletePlatformApplication action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeletePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> deletePlatformApplicationAsync(
            DeletePlatformApplicationRequest deletePlatformApplicationRequest,
            AsyncHandler<DeletePlatformApplicationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Web Services account's verified or pending phone number
     * from the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param deleteSMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         DeleteSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteSMSSandboxPhoneNumberResult> deleteSMSSandboxPhoneNumberAsync(
            DeleteSMSSandboxPhoneNumberRequest deleteSMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Web Services account's verified or pending phone number
     * from the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param deleteSMSSandboxPhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteSMSSandboxPhoneNumberResult> deleteSMSSandboxPhoneNumberAsync(
            DeleteSMSSandboxPhoneNumberRequest deleteSMSSandboxPhoneNumberRequest,
            AsyncHandler<DeleteSMSSandboxPhoneNumberRequest, DeleteSMSSandboxPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent
     * some messages previously sent to the topic from being delivered to
     * subscribers. This action is idempotent, so deleting a topic that does not
     * exist does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @return A Java Future object containing the response from the DeleteTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> deleteTopicAsync(DeleteTopicRequest deleteTopicRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent
     * some messages previously sent to the topic from being delivered to
     * subscribers. This action is idempotent, so deleting a topic that does not
     * exist does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> deleteTopicAsync(DeleteTopicRequest deleteTopicRequest,
            AsyncHandler<DeleteTopicRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest <p>
     *            Input for GetEndpointAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            GetEndpointAttributesRequest getEndpointAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest <p>
     *            Input for GetEndpointAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            GetEndpointAttributesRequest getEndpointAttributesRequest,
            AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the
     * supported push notification services, such as APNS and GCM (Firebase
     * Cloud Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest <p>
     *            Input for GetPlatformApplicationAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the
     * supported push notification services, such as APNS and GCM (Firebase
     * Cloud Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest <p>
     *            Input for GetPlatformApplicationAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest,
            AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the settings for sending SMS messages from your Amazon Web
     * Services account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest <p>
     *            The input for the <code>GetSMSAttributes</code> request.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetSMSAttributesResult> getSMSAttributesAsync(
            GetSMSAttributesRequest getSMSAttributesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns the settings for sending SMS messages from your Amazon Web
     * Services account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest <p>
     *            The input for the <code>GetSMSAttributes</code> request.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetSMSAttributesResult> getSMSAttributesAsync(
            GetSMSAttributesRequest getSMSAttributesRequest,
            AsyncHandler<GetSMSAttributesRequest, GetSMSAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the SMS sandbox status for the calling Amazon Web Services
     * account in the target Amazon Web Services Region.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param getSMSSandboxAccountStatusRequest
     * @return A Java Future object containing the response from the
     *         GetSMSSandboxAccountStatus service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetSMSSandboxAccountStatusResult> getSMSSandboxAccountStatusAsync(
            GetSMSSandboxAccountStatusRequest getSMSSandboxAccountStatusRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the SMS sandbox status for the calling Amazon Web Services
     * account in the target Amazon Web Services Region.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param getSMSSandboxAccountStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetSMSSandboxAccountStatus service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetSMSSandboxAccountStatusResult> getSMSSandboxAccountStatusAsync(
            GetSMSSandboxAccountStatusRequest getSMSSandboxAccountStatusRequest,
            AsyncHandler<GetSMSSandboxAccountStatusRequest, GetSMSSandboxAccountStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest <p>
     *            Input for GetSubscriptionAttributes.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            GetSubscriptionAttributesRequest getSubscriptionAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest <p>
     *            Input for GetSubscriptionAttributes.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            GetSubscriptionAttributesRequest getSubscriptionAttributesRequest,
            AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might
     * differ based on the authorization of the user.
     * </p>
     * 
     * @param getTopicAttributesRequest <p>
     *            Input for GetTopicAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetTopicAttributesResult> getTopicAttributesAsync(
            GetTopicAttributesRequest getTopicAttributesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might
     * differ based on the authorization of the user.
     * </p>
     * 
     * @param getTopicAttributesRequest <p>
     *            Input for GetTopicAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetTopicAttributesResult> getTopicAttributesAsync(
            GetTopicAttributesRequest getTopicAttributesRequest,
            AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported
     * push notification service, such as GCM (Firebase Cloud Messaging) and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are
     * paginated and return a limited list of endpoints, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the NextToken
     * string received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest <p>
     *            Input for ListEndpointsByPlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported
     * push notification service, such as GCM (Firebase Cloud Messaging) and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are
     * paginated and return a limited list of endpoints, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the NextToken
     * string received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest <p>
     *            Input for ListEndpointsByPlatformApplication action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest,
            AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the calling Amazon Web Services account's dedicated origination
     * numbers and their metadata. For more information about origination
     * numbers, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/channels-sms-originating-identities-origination-numbers.html"
     * >Origination numbers</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listOriginationNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListOriginationNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws ThrottledException
     * @throws InvalidParameterException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListOriginationNumbersResult> listOriginationNumbersAsync(
            ListOriginationNumbersRequest listOriginationNumbersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the calling Amazon Web Services account's dedicated origination
     * numbers and their metadata. For more information about origination
     * numbers, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/channels-sms-originating-identities-origination-numbers.html"
     * >Origination numbers</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listOriginationNumbersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListOriginationNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws ThrottledException
     * @throws InvalidParameterException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListOriginationNumbersResult> listOriginationNumbersAsync(
            ListOriginationNumbersRequest listOriginationNumbersRequest,
            AsyncHandler<ListOriginationNumbersRequest, ListOriginationNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot
     * send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and
     * each page returns up to 100 phone numbers. If additional phone numbers
     * are available after the first page of results, then a
     * <code>NextToken</code> string will be returned. To receive the next page,
     * you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there
     * are no more records to return, <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest <p>
     *            The input for the <code>ListPhoneNumbersOptedOut</code>
     *            action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersOptedOut service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(
            ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot
     * send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and
     * each page returns up to 100 phone numbers. If additional phone numbers
     * are available after the first page of results, then a
     * <code>NextToken</code> string will be returned. To receive the next page,
     * you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there
     * are no more records to return, <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest <p>
     *            The input for the <code>ListPhoneNumbersOptedOut</code>
     *            action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersOptedOut service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(
            ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest,
            AsyncHandler<ListPhoneNumbersOptedOutRequest, ListPhoneNumbersOptedOutResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the platform application objects for the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * The results for <code>ListPlatformApplications</code> are paginated and
     * return a limited list of applications, up to 100. If additional records
     * are available after the first page results, then a NextToken string will
     * be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string received
     * from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest <p>
     *            Input for ListPlatformApplications action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListPlatformApplications service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            ListPlatformApplicationsRequest listPlatformApplicationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the platform application objects for the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * The results for <code>ListPlatformApplications</code> are paginated and
     * return a limited list of applications, up to 100. If additional records
     * are available after the first page results, then a NextToken string will
     * be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string received
     * from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest <p>
     *            Input for ListPlatformApplications action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListPlatformApplications service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            ListPlatformApplicationsRequest listPlatformApplicationsRequest,
            AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the calling Amazon Web Services account's current verified and
     * pending destination phone numbers in the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listSMSSandboxPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListSMSSandboxPhoneNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListSMSSandboxPhoneNumbersResult> listSMSSandboxPhoneNumbersAsync(
            ListSMSSandboxPhoneNumbersRequest listSMSSandboxPhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the calling Amazon Web Services account's current verified and
     * pending destination phone numbers in the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listSMSSandboxPhoneNumbersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSMSSandboxPhoneNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListSMSSandboxPhoneNumbersResult> listSMSSandboxPhoneNumbersAsync(
            ListSMSSandboxPhoneNumbersRequest listSMSSandboxPhoneNumbersRequest,
            AsyncHandler<ListSMSSandboxPhoneNumbersRequest, ListSMSSandboxPhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest <p>
     *            Input for ListSubscriptions action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListSubscriptionsResult> listSubscriptionsAsync(
            ListSubscriptionsRequest listSubscriptionsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest <p>
     *            Input for ListSubscriptions action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListSubscriptionsResult> listSubscriptionsAsync(
            ListSubscriptionsRequest listSubscriptionsRequest,
            AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest <p>
     *            Input for ListSubscriptionsByTopic action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest <p>
     *            Input for ListSubscriptionsByTopic action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest,
            AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all tags added to the specified Amazon SNS topic. For an overview,
     * see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon Simple Notification Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * List all tags added to the specified Amazon SNS topic. For an overview,
     * see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon Simple Notification Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @return A Java Future object containing the response from the ListTopics
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest listTopicsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListTopics
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest listTopicsRequest,
            AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which
     * enables you to resume sending SMS messages to the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest <p>
     *            Input for the OptInPhoneNumber action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         OptInPhoneNumber service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<OptInPhoneNumberResult> optInPhoneNumberAsync(
            OptInPhoneNumberRequest optInPhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which
     * enables you to resume sending SMS messages to the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest <p>
     *            Input for the OptInPhoneNumber action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         OptInPhoneNumber service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<OptInPhoneNumberResult> optInPhoneNumberAsync(
            OptInPhoneNumberRequest optInPhoneNumberRequest,
            AsyncHandler<OptInPhoneNumberRequest, OptInPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message is saved and
     * Amazon SNS immediately delivers it to subscribers.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for publishing a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone, you
     * must specify the EndpointArn for the TargetArn parameter. The EndpointArn
     * is returned when making a call with the
     * <code>CreatePlatformEndpoint</code> action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Amazon
     * Web Services Region.
     * </p>
     * </important>
     * 
     * @param publishRequest <p>
     *            Input for Publish action.
     *            </p>
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PublishResult> publishAsync(PublishRequest publishRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message is saved and
     * Amazon SNS immediately delivers it to subscribers.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for publishing a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone, you
     * must specify the EndpointArn for the TargetArn parameter. The EndpointArn
     * is returned when making a call with the
     * <code>CreatePlatformEndpoint</code> action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Amazon
     * Web Services Region.
     * </p>
     * </important>
     * 
     * @param publishRequest <p>
     *            Input for Publish action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PublishResult> publishAsync(PublishRequest publishRequest,
            AsyncHandler<PublishRequest, PublishResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Publishes up to ten messages to the specified topic. This is a batch
     * version of <code>Publish</code>. For FIFO topics, multiple messages
     * within a single batch are published in the order they are sent, and
     * messages are deduplicated within the batch and across batches for 5
     * minutes.
     * </p>
     * <p>
     * The result of publishing each message is reported individually in the
     * response. Because the batch request can result in a combination of
     * successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * <p>
     * The maximum allowed individual message size and the maximum total payload
     * size (the sum of the individual lengths of all of the batched messages)
     * are both 256 KB (262,144 bytes).
     * </p>
     * <p>
     * Some actions take lists of parameters. These lists are specified using
     * the <code>param.n</code> notation. Values of <code>n</code> are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * &amp;AttributeName.1=first
     * </p>
     * <p>
     * &amp;AttributeName.2=second
     * </p>
     * <p>
     * If you send a batch message to a topic, Amazon SNS publishes the batch
     * message to each endpoint that is subscribed to the topic. The format of
     * the batch message depends on the notification protocol for each
     * subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the batch message is saved and
     * Amazon SNS immediately delivers the message to subscribers.
     * </p>
     * 
     * @param publishBatchRequest
     * @return A Java Future object containing the response from the
     *         PublishBatch service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws BatchEntryIdsNotDistinctException
     * @throws BatchRequestTooLongException
     * @throws EmptyBatchRequestException
     * @throws InvalidBatchEntryIdException
     * @throws TooManyEntriesInBatchRequestException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PublishBatchResult> publishBatchAsync(PublishBatchRequest publishBatchRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Publishes up to ten messages to the specified topic. This is a batch
     * version of <code>Publish</code>. For FIFO topics, multiple messages
     * within a single batch are published in the order they are sent, and
     * messages are deduplicated within the batch and across batches for 5
     * minutes.
     * </p>
     * <p>
     * The result of publishing each message is reported individually in the
     * response. Because the batch request can result in a combination of
     * successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * <p>
     * The maximum allowed individual message size and the maximum total payload
     * size (the sum of the individual lengths of all of the batched messages)
     * are both 256 KB (262,144 bytes).
     * </p>
     * <p>
     * Some actions take lists of parameters. These lists are specified using
     * the <code>param.n</code> notation. Values of <code>n</code> are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * &amp;AttributeName.1=first
     * </p>
     * <p>
     * &amp;AttributeName.2=second
     * </p>
     * <p>
     * If you send a batch message to a topic, Amazon SNS publishes the batch
     * message to each endpoint that is subscribed to the topic. The format of
     * the batch message depends on the notification protocol for each
     * subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the batch message is saved and
     * Amazon SNS immediately delivers the message to subscribers.
     * </p>
     * 
     * @param publishBatchRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PublishBatch service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws BatchEntryIdsNotDistinctException
     * @throws BatchRequestTooLongException
     * @throws EmptyBatchRequestException
     * @throws InvalidBatchEntryIdException
     * @throws TooManyEntriesInBatchRequestException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PublishBatchResult> publishBatchAsync(PublishBatchRequest publishBatchRequest,
            AsyncHandler<PublishBatchRequest, PublishBatchResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest <p>
     *            Input for RemovePermission action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest <p>
     *            Input for RemovePermission action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest <p>
     *            Input for SetEndpointAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setEndpointAttributesAsync(
            SetEndpointAttributesRequest setEndpointAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest <p>
     *            Input for SetEndpointAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setEndpointAttributesAsync(
            SetEndpointAttributesRequest setEndpointAttributesRequest,
            AsyncHandler<SetEndpointAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported
     * push notification services, such as APNS and GCM (Firebase Cloud
     * Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring
     * attributes for message delivery status, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html"
     * >Using Amazon SNS Application Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest <p>
     *            Input for SetPlatformApplicationAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported
     * push notification services, such as APNS and GCM (Firebase Cloud
     * Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring
     * attributes for message delivery status, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html"
     * >Using Amazon SNS Application Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest <p>
     *            Input for SetPlatformApplicationAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest,
            AsyncHandler<SetPlatformApplicationAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and
     * receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use
     * the <code>Publish</code> action with the
     * <code>MessageAttributes.entry.N</code> parameter. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html"
     * >Publishing to a mobile phone</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this operation, you must grant the Amazon SNS service principal (
     * <code>sns.amazonaws.com</code>) permission to perform the
     * <code>s3:ListBucket</code> action.
     * </p>
     * </note>
     * 
     * @param setSMSAttributesRequest <p>
     *            The input for the SetSMSAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SetSMSAttributesResult> setSMSAttributesAsync(
            SetSMSAttributesRequest setSMSAttributesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and
     * receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use
     * the <code>Publish</code> action with the
     * <code>MessageAttributes.entry.N</code> parameter. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html"
     * >Publishing to a mobile phone</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this operation, you must grant the Amazon SNS service principal (
     * <code>sns.amazonaws.com</code>) permission to perform the
     * <code>s3:ListBucket</code> action.
     * </p>
     * </note>
     * 
     * @param setSMSAttributesRequest <p>
     *            The input for the SetSMSAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SetSMSAttributesResult> setSMSAttributesAsync(
            SetSMSAttributesRequest setSMSAttributesRequest,
            AsyncHandler<SetSMSAttributesRequest, SetSMSAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a
     * new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest <p>
     *            Input for SetSubscriptionAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws FilterPolicyLimitExceededException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setSubscriptionAttributesAsync(
            SetSubscriptionAttributesRequest setSubscriptionAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a
     * new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest <p>
     *            Input for SetSubscriptionAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws FilterPolicyLimitExceededException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setSubscriptionAttributesAsync(
            SetSubscriptionAttributesRequest setSubscriptionAttributesRequest,
            AsyncHandler<SetSubscriptionAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest <p>
     *            Input for SetTopicAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setTopicAttributesAsync(SetTopicAttributesRequest setTopicAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest <p>
     *            Input for SetTopicAttributes action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> setTopicAttributesAsync(SetTopicAttributesRequest setTopicAttributesRequest,
            AsyncHandler<SetTopicAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is
     * HTTP/S or email, or if the endpoint and the topic are not in the same
     * Amazon Web Services account, the endpoint owner must run the
     * <code>ConfirmSubscription</code> action to confirm the subscription.
     * </p>
     * <p>
     * You call the <code>ConfirmSubscription</code> action with the token from
     * the subscription response. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest <p>
     *            Input for Subscribe action.
     *            </p>
     * @return A Java Future object containing the response from the Subscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws SubscriptionLimitExceededException
     * @throws FilterPolicyLimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SubscribeResult> subscribeAsync(SubscribeRequest subscribeRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is
     * HTTP/S or email, or if the endpoint and the topic are not in the same
     * Amazon Web Services account, the endpoint owner must run the
     * <code>ConfirmSubscription</code> action to confirm the subscription.
     * </p>
     * <p>
     * You call the <code>ConfirmSubscription</code> action with the token from
     * the subscription response. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest <p>
     *            Input for Subscribe action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the Subscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws SubscriptionLimitExceededException
     * @throws FilterPolicyLimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SubscribeResult> subscribeAsync(SubscribeRequest subscribeRequest,
            AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Add tags to the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * When you use topic tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a topic isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SNS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tagging actions are limited to 10 TPS per Amazon Web Services account,
     * per Amazon Web Services Region. If your application requires a higher
     * throughput, file a <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=technical"
     * >technical support request</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Add tags to the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * When you use topic tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a topic isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SNS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tagging actions are limited to 10 TPS per Amazon Web Services account,
     * per Amazon Web Services Region. If your application requires a higher
     * throughput, file a <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=technical"
     * >technical support request</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for
     * deletion, only the owner of the subscription or the topic's owner can
     * unsubscribe, and an Amazon Web Services signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the
     * requester is not the subscription owner, a final cancellation message is
     * delivered to the endpoint, so that the endpoint owner can easily
     * resubscribe to the topic if the <code>Unsubscribe</code> request was
     * unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest <p>
     *            Input for Unsubscribe action.
     *            </p>
     * @return A Java Future object containing the response from the Unsubscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> unsubscribeAsync(UnsubscribeRequest unsubscribeRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for
     * deletion, only the owner of the subscription or the topic's owner can
     * unsubscribe, and an Amazon Web Services signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the
     * requester is not the subscription owner, a final cancellation message is
     * delivered to the endpoint, so that the endpoint owner can easily
     * resubscribe to the topic if the <code>Unsubscribe</code> request was
     * unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest <p>
     *            Input for Unsubscribe action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the Unsubscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<Void> unsubscribeAsync(UnsubscribeRequest unsubscribeRequest,
            AsyncHandler<UnsubscribeRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Remove tags from the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Remove tags from the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies a destination phone number with a one-time password (OTP) for
     * the calling Amazon Web Services account.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param verifySMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         VerifySMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws VerificationException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<VerifySMSSandboxPhoneNumberResult> verifySMSSandboxPhoneNumberAsync(
            VerifySMSSandboxPhoneNumberRequest verifySMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies a destination phone number with a one-time password (OTP) for
     * the calling Amazon Web Services account.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your Amazon Web
     * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
     * safe environment for you to try Amazon SNS features without risking your
     * reputation as an SMS sender. While your Amazon Web Services account is in
     * the SMS sandbox, you can use all of the features of Amazon SNS. However,
     * you can send SMS messages only to verified destination phone numbers. For
     * more information, including how to move out of the sandbox to send
     * messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param verifySMSSandboxPhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         VerifySMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws VerificationException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<VerifySMSSandboxPhoneNumberResult> verifySMSSandboxPhoneNumberAsync(
            VerifySMSSandboxPhoneNumberRequest verifySMSSandboxPhoneNumberRequest,
            AsyncHandler<VerifySMSSandboxPhoneNumberRequest, VerifySMSSandboxPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
