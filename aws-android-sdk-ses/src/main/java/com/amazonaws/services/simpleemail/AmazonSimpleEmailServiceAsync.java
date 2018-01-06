/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing Amazon Simple Email Service asynchronously.
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This
 * documentation is intended to be used in conjunction with the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html"
 * >Regions and Amazon SES</a> in the Amazon SES Developer Guide.
 * </p>
 * </note>
 **/
public interface AmazonSimpleEmailServiceAsync extends AmazonSimpleEmailService {
    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest <p>
     *            Represents a request to create a receipt rule set by cloning
     *            an existing one. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CloneReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest <p>
     *            Represents a request to create a receipt rule set by cloning
     *            an existing one. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CloneReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest,
            AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptFilterRequest <p>
     *            Represents a request to create a new IP address filter. You
     *            use IP address filters when you receive email with Amazon SES.
     *            For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            CreateReceiptFilterRequest createReceiptFilterRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptFilterRequest <p>
     *            Represents a request to create a new IP address filter. You
     *            use IP address filters when you receive email with Amazon SES.
     *            For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            CreateReceiptFilterRequest createReceiptFilterRequest,
            AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleRequest <p>
     *            Represents a request to create a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws AlreadyExistsException
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            CreateReceiptRuleRequest createReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleRequest <p>
     *            Represents a request to create a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws AlreadyExistsException
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            CreateReceiptRuleRequest createReceiptRuleRequest,
            AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest <p>
     *            Represents a request to create an empty receipt rule set. You
     *            use receipt rule sets to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest <p>
     *            Represents a request to create an empty receipt rule set. You
     *            use receipt rule sets to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest,
            AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityRequest <p>
     *            Represents a request to delete one of your Amazon SES
     *            identities (an email address or domain).
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityRequest <p>
     *            Represents a request to delete one of your Amazon SES
     *            identities (an email address or domain).
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest,
            AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (an email address or a domain). This API returns successfully even if a
     * policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest <p>
     *            Represents a request to delete a sending authorization policy
     *            for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (an email address or a domain). This API returns successfully even if a
     * policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest <p>
     *            Represents a request to delete a sending authorization policy
     *            for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest,
            AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest <p>
     *            Represents a request to delete an IP address filter. You use
     *            IP address filters when you receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest <p>
     *            Represents a request to delete an IP address filter. You use
     *            IP address filters when you receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest,
            AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest <p>
     *            Represents a request to delete a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            DeleteReceiptRuleRequest deleteReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest <p>
     *            Represents a request to delete a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            DeleteReceiptRuleRequest deleteReceiptRuleRequest,
            AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it
     * contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest <p>
     *            Represents a request to delete a receipt rule set and all of
     *            the receipt rules it contains. You use receipt rule sets to
     *            receive email with Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws CannotDeleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it
     * contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest <p>
     *            Represents a request to delete a receipt rule set and all of
     *            the receipt rules it contains. You use receipt rule sets to
     *            receive email with Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws CannotDeleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest,
            AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified email address from the list of verified addresses.
     * </p>
     * <important>
     * <p>
     * The DeleteVerifiedEmailAddress action is deprecated as of the May 15,
     * 2012 release of Domain Verification. The DeleteIdentity action is now
     * preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest <p>
     *            Represents a request to delete an email address from the list
     *            of email addresses you have attempted to verify under your AWS
     *            account.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<Void> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified email address from the list of verified addresses.
     * </p>
     * <important>
     * <p>
     * The DeleteVerifiedEmailAddress action is deprecated as of the May 15,
     * 2012 release of Domain Verification. The DeleteIdentity action is now
     * preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest <p>
     *            Represents a request to delete an email address from the list
     *            of email addresses you have attempted to verify under your AWS
     *            account.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<Void> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest,
            AsyncHandler<DeleteVerifiedEmailAddressRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest <p>
     *            Represents a request to return the metadata and receipt rules
     *            for the receipt rule set that is currently active. You use
     *            receipt rule sets to receive email with Amazon SES. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeActiveReceiptRuleSet service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest <p>
     *            Represents a request to return the metadata and receipt rules
     *            for the receipt rule set that is currently active. You use
     *            receipt rule sets to receive email with Amazon SES. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeActiveReceiptRuleSet service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest,
            AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest <p>
     *            Represents a request to return the details of a receipt rule.
     *            You use receipt rules to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            DescribeReceiptRuleRequest describeReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest <p>
     *            Represents a request to return the details of a receipt rule.
     *            You use receipt rules to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            DescribeReceiptRuleRequest describeReceiptRuleRequest,
            AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest <p>
     *            Represents a request to return the details of a receipt rule
     *            set. You use receipt rule sets to receive email with Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest <p>
     *            Represents a request to return the details of a receipt rule
     *            set. You use receipt rule sets to receive email with Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest,
            AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain
     * name identities, this action also returns the DKIM tokens that are
     * required for Easy DKIM signing, and whether Amazon SES has successfully
     * verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the following
     * information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an
     * email address, the tokens represent the domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in
     * the domain's DNS. This information is only returned for domain name
     * identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get DKIM
     * attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest <p>
     *            Represents a request for the status of Amazon SES Easy DKIM
     *            signing for an identity. For domain identities, this request
     *            also returns the DKIM tokens that are required for Easy DKIM
     *            signing, and whether Amazon SES successfully verified that
     *            these tokens were published. For more information about Easy
     *            DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain
     * name identities, this action also returns the DKIM tokens that are
     * required for Easy DKIM signing, and whether Amazon SES has successfully
     * verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the following
     * information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an
     * email address, the tokens represent the domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in
     * the domain's DNS. This information is only returned for domain name
     * identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get DKIM
     * attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest <p>
     *            Represents a request for the status of Amazon SES Easy DKIM
     *            signing for an identity. For domain identities, this request
     *            also returns the DKIM tokens that are required for Easy DKIM
     *            signing, and whether Amazon SES successfully verified that
     *            these tokens were published. For more information about Easy
     *            DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email
     * addresses and/or domains).
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * custom MAIL FROM attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest <p>
     *            Represents a request to return the Amazon SES custom MAIL FROM
     *            attributes for a list of identities. For information about
     *            using a custom MAIL FROM domain, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityMailFromDomainAttributes service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email
     * addresses and/or domains).
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * custom MAIL FROM attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest <p>
     *            Represents a request to return the Amazon SES custom MAIL FROM
     *            attributes for a list of identities. For information about
     *            using a custom MAIL FROM domain, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetIdentityMailFromDomainAttributes service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest,
            AsyncHandler<GetIdentityMailFromDomainAttributesRequest, GetIdentityMailFromDomainAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest <p>
     *            Represents a request to return the notification attributes for
     *            a list of identities you verified with Amazon SES. For
     *            information about Amazon SES notifications, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest <p>
     *            Represents a request to return the notification attributes for
     *            a list of identities you verified with Amazon SES. For
     *            information about Amazon SES notifications, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest,
            AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (an email address or a domain). The policies are returned as a
     * map of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest <p>
     *            Represents a request to return the requested sending
     *            authorization policies for an identity. Sending authorization
     *            is an Amazon SES feature that enables you to authorize other
     *            senders to use your identities. For information, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (an email address or a domain). The policies are returned as a
     * map of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest <p>
     *            Represents a request to return the requested sending
     *            authorization policies for an identity. Sending authorization
     *            is an Amazon SES feature that enables you to authorize other
     *            senders to use your identities. For information, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest,
            AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the
     * verification status and (for domain identities) the verification token
     * for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest <p>
     *            Represents a request to return the Amazon SES verification
     *            status of a list of identities. For domain identities, this
     *            request also returns the verification token. For information
     *            about verifying identities with Amazon SES, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the
     * verification status and (for domain identities) the verification token
     * for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest <p>
     *            Represents a request to return the Amazon SES verification
     *            status of a list of identities. For domain identities, this
     *            request also returns the verification token. For information
     *            about verifying identities with Amazon SES, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest,
            AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest,
            AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetSendStatisticsResult> getSendStatisticsAsync(
            GetSendStatisticsRequest getSendStatisticsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<GetSendStatisticsResult> getSendStatisticsAsync(
            GetSendStatisticsRequest getSendStatisticsRequest,
            AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for your AWS account, regardless of verification status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentitiesRequest <p>
     *            Represents a request to return a list of all identities (email
     *            addresses and domains) that you have attempted to verify under
     *            your AWS account, regardless of verification status.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for your AWS account, regardless of verification status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentitiesRequest <p>
     *            Represents a request to return a list of all identities (email
     *            addresses and domains) that you have attempted to verify under
     *            your AWS account, regardless of verification status.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest,
            AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (an email address or a domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest <p>
     *            Represents a request to return a list of sending authorization
     *            policies that are attached to an identity. Sending
     *            authorization is an Amazon SES feature that enables you to
     *            authorize other senders to use your identities. For
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (an email address or a domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest <p>
     *            Represents a request to return a list of sending authorization
     *            policies that are attached to an identity. Sending
     *            authorization is an Amazon SES feature that enables you to
     *            authorize other senders to use your identities. For
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest,
            AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest <p>
     *            : Represents a request to list the IP address filters that
     *            exist under your AWS account. You use IP address filters when
     *            you receive email with Amazon SES. For more information, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListReceiptFilters service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            ListReceiptFiltersRequest listReceiptFiltersRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest <p>
     *            : Represents a request to list the IP address filters that
     *            exist under your AWS account. You use IP address filters when
     *            you receive email with Amazon SES. For more information, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListReceiptFilters service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            ListReceiptFiltersRequest listReceiptFiltersRequest,
            AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If there
     * are additional receipt rule sets to be retrieved, you will receive a
     * <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest <p>
     *            Represents a request to list the receipt rule sets that exist
     *            under your AWS account. You use receipt rule sets to receive
     *            email with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListReceiptRuleSets service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If there
     * are additional receipt rule sets to be retrieved, you will receive a
     * <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest <p>
     *            Represents a request to list the receipt rule sets that exist
     *            under your AWS account. You use receipt rule sets to receive
     *            email with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListReceiptRuleSets service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest,
            AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <important>
     * <p>
     * The ListVerifiedEmailAddresses action is deprecated as of the May 15,
     * 2012 release of Domain Verification. The ListIdentities action is now
     * preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <important>
     * <p>
     * The ListVerifiedEmailAddresses action is deprecated as of the May 15,
     * 2012 release of Domain Verification. The ListIdentities action is now
     * preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest,
            AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest <p>
     *            Represents a request to add or update a sending authorization
     *            policy for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         PutIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            PutIdentityPolicyRequest putIdentityPolicyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest <p>
     *            Represents a request to add or update a sending authorization
     *            policy for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PutIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            PutIdentityPolicyRequest putIdentityPolicyRequest,
            AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request.
     * That is, this API will return an error if the reorder request doesn't
     * explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest <p>
     *            Represents a request to reorder the receipt rules within a
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ReorderReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request.
     * That is, this API will return an error if the reorder request doesn't
     * explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest <p>
     *            Represents a request to reorder the receipt rules within a
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ReorderReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest,
            AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up to
     * 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not
     * received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param sendBounceRequest <p>
     *            Represents a request to send a bounce message to the sender of
     *            an email you received through Amazon SES.
     *            </p>
     * @return A Java Future object containing the response from the SendBounce
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SendBounceResult> sendBounceAsync(SendBounceRequest sendBounceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up to
     * 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not
     * received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param sendBounceRequest <p>
     *            Represents a request to send a bounce message to the sender of
     *            an email you received through Amazon SES.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SendBounce
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SendBounceResult> sendBounceAsync(SendBounceRequest sendBounceRequest,
            AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about <code>SendEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The
     * combined number of To:, CC: and BCC: email addresses cannot exceed 50. If
     * you need to send an email message to a larger audience, you can divide
     * your recipient list into groups of 50 or fewer, and then call Amazon SES
     * repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC:
     * and BCC:) is counted against your sending quota - the maximum number of
     * emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest <p>
     *            Represents a request to send a single formatted email using
     *            Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the SendEmail
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about <code>SendEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The
     * combined number of To:, CC: and BCC: email addresses cannot exceed 50. If
     * you need to send an email message to a larger audience, you can divide
     * your recipient list into groups of 50 or fewer, and then call Amazon SES
     * repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC:
     * and BCC:) is counted against your sending quota - the maximum number of
     * emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest <p>
     *            Represents a request to send a single formatted email using
     *            Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SendEmail
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest,
            AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an email message, with header and content specified by the client.
     * The <code>SendRawEmail</code> action is useful for sending multipart MIME
     * emails. The raw text of the message must comply with Internet email
     * standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The
     * combined number of To:, CC: and BCC: email addresses cannot exceed 50. If
     * you need to send an email message to a larger audience, you can divide
     * your recipient list into groups of 50 or fewer, and then call Amazon SES
     * repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group
     * list. Note that each recipient in a group list counts towards the
     * 50-recipient limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC:
     * and BCC:) is counted against your sending quota - the maximum number of
     * emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user,
     * <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's "Source," "From," and "Return-Path" parameters
     * in one of two ways: you can pass optional parameters
     * <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following
     * X-headers in the header of your raw email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are
     * removed by Amazon SES before sending the email.
     * </p>
     * </important>
     * <p>
     * For the most common sending authorization use case, we recommend that you
     * specify the <code>SourceIdentityArn</code> and do not specify either the
     * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>. (The
     * same note applies to the corresponding X-headers.) If you only specify
     * the <code>SourceIdentityArn</code>, Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code>. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest <p>
     *            Represents a request to send a single raw email using Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by Amazon Simple Email
     *         Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an email message, with header and content specified by the client.
     * The <code>SendRawEmail</code> action is useful for sending multipart MIME
     * emails. The raw text of the message must comply with Internet email
     * standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The
     * combined number of To:, CC: and BCC: email addresses cannot exceed 50. If
     * you need to send an email message to a larger audience, you can divide
     * your recipient list into groups of 50 or fewer, and then call Amazon SES
     * repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group
     * list. Note that each recipient in a group list counts towards the
     * 50-recipient limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC:
     * and BCC:) is counted against your sending quota - the maximum number of
     * emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user,
     * <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's "Source," "From," and "Return-Path" parameters
     * in one of two ways: you can pass optional parameters
     * <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following
     * X-headers in the header of your raw email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are
     * removed by Amazon SES before sending the email.
     * </p>
     * </important>
     * <p>
     * For the most common sending authorization use case, we recommend that you
     * specify the <code>SourceIdentityArn</code> and do not specify either the
     * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>. (The
     * same note applies to the corresponding X-headers.) If you only specify
     * the <code>SourceIdentityArn</code>, Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code>. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest <p>
     *            Represents a request to send a single raw email using Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by Amazon Simple Email
     *         Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest,
            AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can
     * call this API with RuleSetName set to null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest <p>
     *            Represents a request to set a receipt rule set as the active
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetActiveReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can
     * call this API with RuleSetName set to null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest <p>
     *            Represents a request to set a receipt rule set as the active
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetActiveReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest,
            AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code>), then Amazon SES will DKIM-sign all email sent
     * by addresses under that domain name (e.g., <code>user@example.com</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES
     * will DKIM-sign all email sent by that email address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code>), you can only
     * enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code>) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest <p>
     *            Represents a request to enable or disable Amazon SES Easy DKIM
     *            signing for an identity. For more information about setting up
     *            Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code>), then Amazon SES will DKIM-sign all email sent
     * by addresses under that domain name (e.g., <code>user@example.com</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES
     * will DKIM-sign all email sent by that email address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code>), you can only
     * enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code>) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest <p>
     *            Represents a request to enable or disable Amazon SES Easy DKIM
     *            signing for an identity. For more information about setting up
     *            Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest,
            AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (an email address or a domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as email.
     * Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and
     * complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery
     * notifications are only available through Amazon SNS.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest <p>
     *            Represents a request to enable or disable whether Amazon SES
     *            forwards you bounce and complaint notifications through email.
     *            For information about email feedback forwarding, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (an email address or a domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as email.
     * Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and
     * complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery
     * notifications are only available through Amazon SNS.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest <p>
     *            Represents a request to enable or disable whether Amazon SES
     *            forwards you bounce and complaint notifications through email.
     *            For information about email feedback forwarding, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest,
            AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES
     * includes the original email headers in the Amazon Simple Notification
     * Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest <p>
     *            Represents a request to set whether Amazon SES includes the
     *            original email headers in the Amazon SNS notifications of a
     *            specified type. For information about notifications, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityHeadersInNotificationsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES
     * includes the original email headers in the Amazon Simple Notification
     * Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest <p>
     *            Represents a request to set whether Amazon SES includes the
     *            original email headers in the Amazon SNS notifications of a
     *            specified type. For information about notifications, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetIdentityHeadersInNotificationsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest,
            AsyncHandler<SetIdentityHeadersInNotificationsEnabledRequest, SetIdentityHeadersInNotificationsEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified
     * identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX
     * record to your MAIL FROM domain's DNS settings. If you want your emails
     * to pass Sender Policy Framework (SPF) checks, you must also add or update
     * an SPF record. For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest <p>
     *            Represents a request to enable or disable the Amazon SES
     *            custom MAIL FROM domain setup for a verified identity. For
     *            information about using a custom MAIL FROM domain, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityMailFromDomain service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified
     * identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX
     * record to your MAIL FROM domain's DNS settings. If you want your emails
     * to pass Sender Policy Framework (SPF) checks, you must also add or update
     * an SPF record. For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest <p>
     *            Represents a request to enable or disable the Amazon SES
     *            custom MAIL FROM domain setup for a verified identity. For
     *            information about using a custom MAIL FROM domain, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetIdentityMailFromDomain service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest,
            AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (an email address or a domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will publish
     * bounce, complaint, and/or delivery notifications for emails sent with
     * that identity as the <code>Source</code>.
     * </p>
     * <note>
     * <p>
     * Unless feedback forwarding is enabled, you must specify Amazon SNS topics
     * for bounce and complaint notifications. For more information, see
     * <code>SetIdentityFeedbackForwardingEnabled</code>.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest <p>
     *            Represents a request to specify the Amazon SNS topic to which
     *            Amazon SES will publish bounce, complaint, or delivery
     *            notifications for emails sent with that identity as the
     *            Source. For information about Amazon SES notifications, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (an email address or a domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will publish
     * bounce, complaint, and/or delivery notifications for emails sent with
     * that identity as the <code>Source</code>.
     * </p>
     * <note>
     * <p>
     * Unless feedback forwarding is enabled, you must specify Amazon SNS topics
     * for bounce and complaint notifications. For more information, see
     * <code>SetIdentityFeedbackForwardingEnabled</code>.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest <p>
     *            Represents a request to specify the Amazon SNS topic to which
     *            Amazon SES will publish bounce, complaint, or delivery
     *            notifications for emails sent with that identity as the
     *            Source. For information about Amazon SES notifications, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest,
            AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest <p>
     *            Represents a request to set the position of a receipt rule in
     *            a receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetReceiptRulePosition service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest <p>
     *            Represents a request to set the position of a receipt rule in
     *            a receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetReceiptRulePosition service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest,
            AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest <p>
     *            Represents a request to update a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            UpdateReceiptRuleRequest updateReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest <p>
     *            Represents a request to update a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            UpdateReceiptRuleRequest updateReceiptRuleRequest,
            AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process may
     * take up to 72 hours. Upon successful detection, Amazon SES will be able
     * to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest <p>
     *            Represents a request to generate the CNAME records needed to
     *            set up Easy DKIM with Amazon SES. For more information about
     *            setting up Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            VerifyDomainDkimRequest verifyDomainDkimRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process may
     * take up to 72 hours. Upon successful detection, Amazon SES will be able
     * to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest <p>
     *            Represents a request to generate the CNAME records needed to
     *            set up Easy DKIM with Amazon SES. For more information about
     *            setting up Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            VerifyDomainDkimRequest verifyDomainDkimRequest,
            AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest <p>
     *            Represents a request to begin Amazon SES domain verification
     *            and to generate the TXT records that you must publish to the
     *            DNS server of your domain to complete the verification. For
     *            information about domain verification, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest <p>
     *            Represents a request to begin Amazon SES domain verification
     *            and to generate the TXT records that you must publish to the
     *            DNS server of your domain to complete the verification. For
     *            information about domain verification, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <important>
     * <p>
     * The VerifyEmailAddress action is deprecated as of the May 15, 2012
     * release of Domain Verification. The VerifyEmailIdentity action is now
     * preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailAddressRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<Void> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <important>
     * <p>
     * The VerifyEmailAddress action is deprecated as of the May 15, 2012
     * release of Domain Verification. The VerifyEmailIdentity action is now
     * preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailAddressRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<Void> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest,
            AsyncHandler<VerifyEmailAddressRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
