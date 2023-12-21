/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect asynchronously.
 * <p>
 * Amazon Connect is a cloud-based contact center solution that you use to set
 * up and manage a customer contact center and provide reliable customer
 * engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to
 * optimize contact routing. You can also resolve customer issues more
 * efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can
 * create. There are also limits to the number of requests that you can make per
 * second. For more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an Amazon Web Services service by using
 * an endpoint. For a list of Amazon Connect endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html"
 * >Amazon Connect Endpoints</a>.
 * </p>
 **/
public interface AmazonConnectAsync extends AmazonConnect {
    /**
     * <p>
     * Activates an evaluation form in the specified Amazon Connect instance.
     * After the evaluation form is activated, it is available to start new
     * evaluations based on the form.
     * </p>
     * 
     * @param activateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         ActivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ActivateEvaluationFormResult> activateEvaluationFormAsync(
            ActivateEvaluationFormRequest activateEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Activates an evaluation form in the specified Amazon Connect instance.
     * After the evaluation form is activated, it is available to start new
     * evaluations based on the form.
     * </p>
     * 
     * @param activateEvaluationFormRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ActivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ActivateEvaluationFormResult> activateEvaluationFormAsync(
            ActivateEvaluationFormRequest activateEvaluationFormRequest,
            AsyncHandler<ActivateEvaluationFormRequest, ActivateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return A Java Future object containing the response from the
     *         AssociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateApprovedOriginAsync(
            AssociateApprovedOriginRequest associateApprovedOriginRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateApprovedOriginAsync(
            AssociateApprovedOriginRequest associateApprovedOriginRequest,
            AsyncHandler<AssociateApprovedOriginRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @return A Java Future object containing the response from the
     *         AssociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateBotAsync(AssociateBotRequest associateBotRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateBotAsync(AssociateBotRequest associateBotRequest,
            AsyncHandler<AssociateBotRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon
     * Connect uses the vocabulary in post-call and real-time analysis sessions
     * for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return A Java Future object containing the response from the
     *         AssociateDefaultVocabulary service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(
            AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon
     * Connect uses the vocabulary in post-call and real-time analysis sessions
     * for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateDefaultVocabulary service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(
            AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest,
            AsyncHandler<AssociateDefaultVocabularyRequest, AssociateDefaultVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only
     * associate one type of storage configuration in a single call. This means,
     * for example, that you can't define an instance with multiple S3 buckets
     * for storing chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only
     * associates it to the instance. Ensure that the resource being specified
     * in the storage configuration, like an S3 bucket, exists when being used
     * for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         AssociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only
     * associate one type of storage configuration in a single call. This means,
     * for example, that you can't define an instance with multiple S3 buckets
     * for storing chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only
     * associates it to the instance. Ensure that the resource being specified
     * in the storage configuration, like an S3 bucket, exists when being used
     * for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest,
            AsyncHandler<AssociateInstanceStorageConfigRequest, AssociateInstanceStorageConfigResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return A Java Future object containing the response from the
     *         AssociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateLambdaFunctionAsync(
            AssociateLambdaFunctionRequest associateLambdaFunctionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateLambdaFunctionAsync(
            AssociateLambdaFunctionRequest associateLambdaFunctionRequest,
            AsyncHandler<AssociateLambdaFunctionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex V1 bot. This API only supports the association of Amazon Lex
     * V1 bots.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return A Java Future object containing the response from the
     *         AssociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateLexBotAsync(AssociateLexBotRequest associateLexBotRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex V1 bot. This API only supports the association of Amazon Lex
     * V1 bots.
     * </p>
     * 
     * @param associateLexBotRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateLexBotAsync(AssociateLexBotRequest associateLexBotRequest,
            AsyncHandler<AssociateLexBotRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect
     * instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @return A Java Future object containing the response from the
     *         AssociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associatePhoneNumberContactFlowAsync(
            AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect
     * instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associatePhoneNumberContactFlowAsync(
            AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest,
            AsyncHandler<AssociatePhoneNumberContactFlowRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         AssociateQueueQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateQueueQuickConnectsAsync(
            AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateQueueQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateQueueQuickConnectsAsync(
            AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest,
            AsyncHandler<AssociateQueueQuickConnectsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         AssociateRoutingProfileQueues service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateRoutingProfileQueuesAsync(
            AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateRoutingProfileQueues service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> associateRoutingProfileQueuesAsync(
            AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest,
            AsyncHandler<AssociateRoutingProfileQueuesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return A Java Future object containing the response from the
     *         AssociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(
            AssociateSecurityKeyRequest associateSecurityKeyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(
            AssociateSecurityKeyRequest associateSecurityKeyRequest,
            AsyncHandler<AssociateSecurityKeyRequest, AssociateSecurityKeyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates an agent with a traffic distribution group.
     * </p>
     * 
     * @param associateTrafficDistributionGroupUserRequest
     * @return A Java Future object containing the response from the
     *         AssociateTrafficDistributionGroupUser service method, as returned
     *         by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateTrafficDistributionGroupUserResult> associateTrafficDistributionGroupUserAsync(
            AssociateTrafficDistributionGroupUserRequest associateTrafficDistributionGroupUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates an agent with a traffic distribution group.
     * </p>
     * 
     * @param associateTrafficDistributionGroupUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AssociateTrafficDistributionGroupUser service method, as returned
     *         by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<AssociateTrafficDistributionGroupUserResult> associateTrafficDistributionGroupUserAsync(
            AssociateTrafficDistributionGroupUserRequest associateTrafficDistributionGroupUserRequest,
            AsyncHandler<AssociateTrafficDistributionGroupUserRequest, AssociateTrafficDistributionGroupUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or
     * traffic distribution group. You can call this API only in the same Amazon
     * Web Services Region where the Amazon Connect instance or traffic
     * distribution group was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html"
     * >Claim a phone number in your country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you
     * can claim. Call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html"
     * >ClaimPhoneNumber</a> operation.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param claimPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ClaimPhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(
            ClaimPhoneNumberRequest claimPhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or
     * traffic distribution group. You can call this API only in the same Amazon
     * Web Services Region where the Amazon Connect instance or traffic
     * distribution group was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html"
     * >Claim a phone number in your country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you
     * can claim. Call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html"
     * >ClaimPhoneNumber</a> operation.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param claimPhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ClaimPhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(
            ClaimPhoneNumberRequest claimPhoneNumberRequest,
            AsyncHandler<ClaimPhoneNumberRequest, ClaimPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         CreateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateAgentStatusResult> createAgentStatusAsync(
            CreateAgentStatusRequest createAgentStatusRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateAgentStatusResult> createAgentStatusAsync(
            CreateAgentStatusRequest createAgentStatusRequest,
            AsyncHandler<CreateAgentStatusRequest, CreateAgentStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return A Java Future object containing the response from the
     *         CreateContactFlow service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateContactFlowResult> createContactFlowAsync(
            CreateContactFlowRequest createContactFlowRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateContactFlow service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateContactFlowResult> createContactFlowAsync(
            CreateContactFlowRequest createContactFlowRequest,
            AsyncHandler<CreateContactFlowRequest, CreateContactFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         CreateContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(
            CreateContactFlowModuleRequest createContactFlowModuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(
            CreateContactFlowModuleRequest createContactFlowModuleRequest,
            AsyncHandler<CreateContactFlowModuleRequest, CreateContactFlowModuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an evaluation form in the specified Amazon Connect instance. The
     * form can be used to define questions related to agent performance, and
     * create sections to organize such questions. Question and section
     * identifiers cannot be duplicated within the same evaluation form.
     * </p>
     * 
     * @param createEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         CreateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateEvaluationFormResult> createEvaluationFormAsync(
            CreateEvaluationFormRequest createEvaluationFormRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates an evaluation form in the specified Amazon Connect instance. The
     * form can be used to define questions related to agent performance, and
     * create sections to organize such questions. Question and section
     * identifiers cannot be duplicated within the same evaluation form.
     * </p>
     * 
     * @param createEvaluationFormRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateEvaluationFormResult> createEvaluationFormAsync(
            CreateEvaluationFormRequest createEvaluationFormRequest,
            AsyncHandler<CreateEvaluationFormRequest, CreateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         CreateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(
            CreateHoursOfOperationRequest createHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(
            CreateHoursOfOperationRequest createHoursOfOperationRequest,
            AsyncHandler<CreateHoursOfOperationRequest, CreateHoursOfOperationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels
     * enabled. It does not attach any storage, such as Amazon Simple Storage
     * Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels
     * enabled. It does not attach any storage, such as Amazon Simple Storage
     * Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest,
            AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon
     * Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreateIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(
            CreateIntegrationAssociationRequest createIntegrationAssociationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon
     * Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(
            CreateIntegrationAssociationRequest createIntegrationAssociationRequest,
            AsyncHandler<CreateIntegrationAssociationRequest, CreateIntegrationAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a new participant into an on-going chat contact. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-customize-flow.html"
     * >Customize chat flow experiences by integrating custom participants</a>.
     * </p>
     * 
     * @param createParticipantRequest
     * @return A Java Future object containing the response from the
     *         CreateParticipant service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateParticipantResult> createParticipantAsync(
            CreateParticipantRequest createParticipantRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Adds a new participant into an on-going chat contact. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-customize-flow.html"
     * >Customize chat flow experiences by integrating custom participants</a>.
     * </p>
     * 
     * @param createParticipantRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateParticipant service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateParticipantResult> createParticipantAsync(
            CreateParticipantRequest createParticipantRequest,
            AsyncHandler<CreateParticipantRequest, CreateParticipantResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a prompt. For more information about prompts, such as supported
     * file types and maximum length, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/prompts.html"
     * >Create prompts</a> in the <i>Amazon Connect Administrator's Guide</i>.
     * </p>
     * 
     * @param createPromptRequest
     * @return A Java Future object containing the response from the
     *         CreatePrompt service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreatePromptResult> createPromptAsync(CreatePromptRequest createPromptRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a prompt. For more information about prompts, such as supported
     * file types and maximum length, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/prompts.html"
     * >Create prompts</a> in the <i>Amazon Connect Administrator's Guide</i>.
     * </p>
     * 
     * @param createPromptRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreatePrompt service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreatePromptResult> createPromptAsync(CreatePromptRequest createPromptRequest,
            AsyncHandler<CreatePromptRequest, CreatePromptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic
     * distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was
     * created, you can use either a full phone number ARN or UUID value for the
     * <code>OutboundCallerIdNumberId</code> value of the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig"
     * >OutboundCallerConfig</a> request body parameter. However, if the number
     * is claimed to a traffic distribution group and you are calling this API
     * using an instance in the alternate Amazon Web Services Region associated
     * with the traffic distribution group, you must provide a full phone number
     * ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </important>
     * 
     * @param createQueueRequest
     * @return A Java Future object containing the response from the CreateQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic
     * distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was
     * created, you can use either a full phone number ARN or UUID value for the
     * <code>OutboundCallerIdNumberId</code> value of the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig"
     * >OutboundCallerConfig</a> request body parameter. However, if the number
     * is claimed to a traffic distribution group and you are calling this API
     * using an instance in the alternate Amazon Web Services Region associated
     * with the traffic distribution group, you must provide a full phone number
     * ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </important>
     * 
     * @param createQueueRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest,
            AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         CreateQuickConnect service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateQuickConnectResult> createQuickConnectAsync(
            CreateQuickConnectRequest createQuickConnectRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateQuickConnect service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateQuickConnectResult> createQuickConnectAsync(
            CreateQuickConnectRequest createQuickConnectRequest,
            AsyncHandler<CreateQuickConnectRequest, CreateQuickConnectResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         CreateRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateRoutingProfileResult> createRoutingProfileAsync(
            CreateRoutingProfileRequest createRoutingProfileRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateRoutingProfileResult> createRoutingProfileAsync(
            CreateRoutingProfileRequest createRoutingProfileRequest,
            AsyncHandler<CreateRoutingProfileRequest, CreateRoutingProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future object containing the response from the CreateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         CreateSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateSecurityProfileResult> createSecurityProfileAsync(
            CreateSecurityProfileRequest createSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateSecurityProfileResult> createSecurityProfileAsync(
            CreateSecurityProfileRequest createSecurityProfileRequest,
            AsyncHandler<CreateSecurityProfileRequest, CreateSecurityProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         CreateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateTaskTemplateResult> createTaskTemplateAsync(
            CreateTaskTemplateRequest createTaskTemplateRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateTaskTemplateResult> createTaskTemplateAsync(
            CreateTaskTemplateRequest createTaskTemplateRequest,
            AsyncHandler<CreateTaskTemplateRequest, CreateTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance
     * that has been replicated.
     * </p>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html"
     * >Set up traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         CreateTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance
     * that has been replicated.
     * </p>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html"
     * >Set up traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest,
            AsyncHandler<CreateTrafficDistributionGroupRequest, CreateTrafficDistributionGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return A Java Future object containing the response from the
     *         CreateUseCase service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUseCaseResult> createUseCaseAsync(CreateUseCaseRequest createUseCaseRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateUseCase service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUseCaseResult> createUseCaseAsync(CreateUseCaseRequest createUseCaseRequest,
            AsyncHandler<CreateUseCaseRequest, CreateUseCaseResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about how to create user accounts using the Amazon
     * Connect console, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html"
     * >Add Users</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future object containing the response from the CreateUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about how to create user accounts using the Amazon
     * Connect console, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html"
     * >Add Users</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         CreateUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(
            CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(
            CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest,
            AsyncHandler<CreateUserHierarchyGroupRequest, CreateUserHierarchyGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance.
     * You can set a custom vocabulary to be your default vocabulary for a given
     * language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateVocabularyResult> createVocabularyAsync(
            CreateVocabularyRequest createVocabularyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance.
     * You can set a custom vocabulary to be your default vocabulary for a given
     * language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateVocabularyResult> createVocabularyAsync(
            CreateVocabularyRequest createVocabularyRequest,
            AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deactivates an evaluation form in the specified Amazon Connect instance.
     * After a form is deactivated, it is no longer available for users to start
     * new evaluations based on the form.
     * </p>
     * 
     * @param deactivateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DeactivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeactivateEvaluationFormResult> deactivateEvaluationFormAsync(
            DeactivateEvaluationFormRequest deactivateEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deactivates an evaluation form in the specified Amazon Connect instance.
     * After a form is deactivated, it is no longer available for users to start
     * new evaluations based on the form.
     * </p>
     * 
     * @param deactivateEvaluationFormRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeactivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeactivateEvaluationFormResult> deactivateEvaluationFormAsync(
            DeactivateEvaluationFormRequest deactivateEvaluationFormRequest,
            AsyncHandler<DeactivateEvaluationFormRequest, DeactivateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteContactEvaluationAsync(
            DeleteContactEvaluationRequest deleteContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactEvaluationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteContactEvaluationAsync(
            DeleteContactEvaluationRequest deleteContactEvaluationRequest,
            AsyncHandler<DeleteContactEvaluationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteContactFlowResult> deleteContactFlowAsync(
            DeleteContactFlowRequest deleteContactFlowRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteContactFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteContactFlowResult> deleteContactFlowAsync(
            DeleteContactFlowRequest deleteContactFlowRequest,
            AsyncHandler<DeleteContactFlowRequest, DeleteContactFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(
            DeleteContactFlowModuleRequest deleteContactFlowModuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(
            DeleteContactFlowModuleRequest deleteContactFlowModuleRequest,
            AsyncHandler<DeleteContactFlowModuleRequest, DeleteContactFlowModuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an evaluation form in the specified Amazon Connect instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the version property is provided, only the specified version of the
     * evaluation form is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If no version is provided, then the full form (all versions) is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DeleteEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteEvaluationFormAsync(DeleteEvaluationFormRequest deleteEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an evaluation form in the specified Amazon Connect instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the version property is provided, only the specified version of the
     * evaluation form is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If no version is provided, then the full form (all versions) is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEvaluationFormRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteEvaluationFormAsync(DeleteEvaluationFormRequest deleteEvaluationFormRequest,
            AsyncHandler<DeleteEvaluationFormRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         DeleteHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteHoursOfOperationAsync(
            DeleteHoursOfOperationRequest deleteHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteHoursOfOperationAsync(
            DeleteHoursOfOperationRequest deleteHoursOfOperationRequest,
            AsyncHandler<DeleteHoursOfOperationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            AsyncHandler<DeleteInstanceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon
     * Connect instance. The association must not have any use cases associated
     * with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @return A Java Future object containing the response from the
     *         DeleteIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteIntegrationAssociationAsync(
            DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon
     * Connect instance. The association must not have any use cases associated
     * with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteIntegrationAssociationAsync(
            DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest,
            AsyncHandler<DeleteIntegrationAssociationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a prompt.
     * </p>
     * 
     * @param deletePromptRequest
     * @return A Java Future object containing the response from the
     *         DeletePrompt service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deletePromptAsync(DeletePromptRequest deletePromptRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a prompt.
     * </p>
     * 
     * @param deletePromptRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeletePrompt service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deletePromptAsync(DeletePromptRequest deletePromptRequest,
            AsyncHandler<DeletePromptRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return A Java Future object containing the response from the DeleteQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest,
            AsyncHandler<DeleteQueueRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         DeleteQuickConnect service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteQuickConnectAsync(DeleteQuickConnectRequest deleteQuickConnectRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteQuickConnect service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteQuickConnectAsync(DeleteQuickConnectRequest deleteQuickConnectRequest,
            AsyncHandler<DeleteQuickConnectRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a routing profile.
     * </p>
     * 
     * @param deleteRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         DeleteRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteRoutingProfileAsync(DeleteRoutingProfileRequest deleteRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a routing profile.
     * </p>
     * 
     * @param deleteRoutingProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteRoutingProfileAsync(DeleteRoutingProfileRequest deleteRoutingProfileRequest,
            AsyncHandler<DeleteRoutingProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future object containing the response from the DeleteRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            AsyncHandler<DeleteRuleRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         DeleteSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteSecurityProfileAsync(
            DeleteSecurityProfileRequest deleteSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteSecurityProfileAsync(
            DeleteSecurityProfileRequest deleteSecurityProfileRequest,
            AsyncHandler<DeleteSecurityProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         DeleteTaskTemplate service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(
            DeleteTaskTemplateRequest deleteTaskTemplateRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteTaskTemplate service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(
            DeleteTaskTemplateRequest deleteTaskTemplateRequest,
            AsyncHandler<DeleteTaskTemplateRequest, DeleteTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the
     * Region where the traffic distribution group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html"
     * >Delete traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         DeleteTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the
     * Region where the traffic distribution group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html"
     * >Delete traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest,
            AsyncHandler<DeleteTrafficDistributionGroupRequest, DeleteTrafficDistributionGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @return A Java Future object containing the response from the
     *         DeleteUseCase service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUseCaseAsync(DeleteUseCaseRequest deleteUseCaseRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteUseCase service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUseCaseAsync(DeleteUseCaseRequest deleteUseCaseRequest,
            AsyncHandler<DeleteUseCaseRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is
     * deleted, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html"
     * >Delete Users from Your Amazon Connect Instance</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future object containing the response from the DeleteUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUserAsync(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is
     * deleted, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html"
     * >Delete Users from Your Amazon Connect Instance</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            AsyncHandler<DeleteUserRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with
     * any agents or have any active child groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DeleteUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUserHierarchyGroupAsync(
            DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with
     * any agents or have any active child groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUserHierarchyGroupAsync(
            DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest,
            AsyncHandler<DeleteUserHierarchyGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteVocabularyResult> deleteVocabularyAsync(
            DeleteVocabularyRequest deleteVocabularyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteVocabularyResult> deleteVocabularyAsync(
            DeleteVocabularyRequest deleteVocabularyRequest,
            AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         DescribeAgentStatus service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeAgentStatusResult> describeAgentStatusAsync(
            DescribeAgentStatusRequest describeAgentStatusRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAgentStatus service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeAgentStatusResult> describeAgentStatusAsync(
            DescribeAgentStatusRequest describeAgentStatusRequest,
            AsyncHandler<DescribeAgentStatusRequest, DescribeAgentStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months,
     * and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @return A Java Future object containing the response from the
     *         DescribeContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactResult> describeContactAsync(DescribeContactRequest describeContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months,
     * and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactResult> describeContactAsync(
            DescribeContactRequest describeContactRequest,
            AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactEvaluationResult> describeContactEvaluationAsync(
            DescribeContactEvaluationRequest describeContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeContactEvaluationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactEvaluationResult> describeContactEvaluationAsync(
            DescribeContactEvaluationRequest describeContactEvaluationRequest,
            AsyncHandler<DescribeContactEvaluationRequest, DescribeContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactFlow service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ContactFlowNotPublishedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactFlowResult> describeContactFlowAsync(
            DescribeContactFlowRequest describeContactFlowRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeContactFlow service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ContactFlowNotPublishedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactFlowResult> describeContactFlowAsync(
            DescribeContactFlowRequest describeContactFlowRequest,
            AsyncHandler<DescribeContactFlowRequest, DescribeContactFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(
            DescribeContactFlowModuleRequest describeContactFlowModuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(
            DescribeContactFlowModuleRequest describeContactFlowModuleRequest,
            AsyncHandler<DescribeContactFlowModuleRequest, DescribeContactFlowModuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an evaluation form in the specified Amazon Connect instance. If
     * the version property is not provided, the latest version of the
     * evaluation form is described.
     * </p>
     * 
     * @param describeEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DescribeEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEvaluationFormResult> describeEvaluationFormAsync(
            DescribeEvaluationFormRequest describeEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an evaluation form in the specified Amazon Connect instance. If
     * the version property is not provided, the latest version of the
     * evaluation form is described.
     * </p>
     * 
     * @param describeEvaluationFormRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEvaluationFormResult> describeEvaluationFormAsync(
            DescribeEvaluationFormRequest describeEvaluationFormRequest,
            AsyncHandler<DescribeEvaluationFormRequest, DescribeEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         DescribeHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(
            DescribeHoursOfOperationRequest describeHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(
            DescribeHoursOfOperationRequest describeHoursOfOperationRequest,
            AsyncHandler<DescribeHoursOfOperationRequest, DescribeHoursOfOperationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks
     * the instance while it is being created and returns an error status, if
     * applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason
     * field returns details relevant to the reason. The instance in a failed
     * state is returned only for 24 hours after the CreateInstance API was
     * invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeInstanceResult> describeInstanceAsync(
            DescribeInstanceRequest describeInstanceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks
     * the instance while it is being created and returns an error status, if
     * applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason
     * field returns details relevant to the reason. The instance in a failed
     * state is returned only for 24 hours after the CreateInstance API was
     * invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeInstanceResult> describeInstanceAsync(
            DescribeInstanceRequest describeInstanceRequest,
            AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest,
            AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource
     * type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource
     * type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest,
            AsyncHandler<DescribeInstanceStorageConfigRequest, DescribeInstanceStorageConfigResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling in the Amazon Web Services Region where the traffic distribution
     * group was created, you can use either a phone number ARN or UUID value
     * for the <code>PhoneNumberId</code> URI request parameter. However, if the
     * number is claimed to a traffic distribution group and you are calling
     * this API in the alternate Amazon Web Services Region associated with the
     * traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         DescribePhoneNumber service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribePhoneNumberResult> describePhoneNumberAsync(
            DescribePhoneNumberRequest describePhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling in the Amazon Web Services Region where the traffic distribution
     * group was created, you can use either a phone number ARN or UUID value
     * for the <code>PhoneNumberId</code> URI request parameter. However, if the
     * number is claimed to a traffic distribution group and you are calling
     * this API in the alternate Amazon Web Services Region associated with the
     * traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePhoneNumber service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribePhoneNumberResult> describePhoneNumberAsync(
            DescribePhoneNumberRequest describePhoneNumberRequest,
            AsyncHandler<DescribePhoneNumberRequest, DescribePhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the prompt.
     * </p>
     * 
     * @param describePromptRequest
     * @return A Java Future object containing the response from the
     *         DescribePrompt service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribePromptResult> describePromptAsync(DescribePromptRequest describePromptRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the prompt.
     * </p>
     * 
     * @param describePromptRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePrompt service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribePromptResult> describePromptAsync(DescribePromptRequest describePromptRequest,
            AsyncHandler<DescribePromptRequest, DescribePromptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @return A Java Future object containing the response from the
     *         DescribeQueue service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeQueueResult> describeQueueAsync(DescribeQueueRequest describeQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeQueue service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeQueueResult> describeQueueAsync(DescribeQueueRequest describeQueueRequest,
            AsyncHandler<DescribeQueueRequest, DescribeQueueResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         DescribeQuickConnect service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeQuickConnectResult> describeQuickConnectAsync(
            DescribeQuickConnectRequest describeQuickConnectRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeQuickConnect service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeQuickConnectResult> describeQuickConnectAsync(
            DescribeQuickConnectRequest describeQuickConnectRequest,
            AsyncHandler<DescribeQuickConnectRequest, DescribeQuickConnectResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         DescribeRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(
            DescribeRoutingProfileRequest describeRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(
            DescribeRoutingProfileRequest describeRoutingProfileRequest,
            AsyncHandler<DescribeRoutingProfileRequest, DescribeRoutingProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @return A Java Future object containing the response from the
     *         DescribeRule service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeRule service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest,
            AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         DescribeSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(
            DescribeSecurityProfileRequest describeSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(
            DescribeSecurityProfileRequest describeSecurityProfileRequest,
            AsyncHandler<DescribeSecurityProfileRequest, DescribeSecurityProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest,
            AsyncHandler<DescribeTrafficDistributionGroupRequest, DescribeTrafficDistributionGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified user account. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID in the Amazon Connect console</a> (it’s the final
     * part of the ARN). The console does not display the user IDs. Instead,
     * list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future object containing the response from the
     *         DescribeUser service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified user account. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID in the Amazon Connect console</a> (it’s the final
     * part of the ARN). The console does not display the user IDs. Instead,
     * list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeUser service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest,
            AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest,
            AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DescribeVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeVocabularyResult> describeVocabularyAsync(
            DescribeVocabularyRequest describeVocabularyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeVocabularyResult> describeVocabularyAsync(
            DescribeVocabularyRequest describeVocabularyRequest,
            AsyncHandler<DescribeVocabularyRequest, DescribeVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return A Java Future object containing the response from the
     *         DisassociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateApprovedOriginAsync(
            DisassociateApprovedOriginRequest disassociateApprovedOriginRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateApprovedOriginAsync(
            DisassociateApprovedOriginRequest disassociateApprovedOriginRequest,
            AsyncHandler<DisassociateApprovedOriginRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @return A Java Future object containing the response from the
     *         DisassociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateBotAsync(DisassociateBotRequest disassociateBotRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateBotAsync(DisassociateBotRequest disassociateBotRequest,
            AsyncHandler<DisassociateBotRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type
     * and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         DisassociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateInstanceStorageConfigAsync(
            DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type
     * and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateInstanceStorageConfigAsync(
            DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest,
            AsyncHandler<DisassociateInstanceStorageConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the
     * relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return A Java Future object containing the response from the
     *         DisassociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateLambdaFunctionAsync(
            DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the
     * relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateLambdaFunctionAsync(
            DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest,
            AsyncHandler<DisassociateLambdaFunctionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return A Java Future object containing the response from the
     *         DisassociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateLexBotAsync(DisassociateLexBotRequest disassociateLexBotRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateLexBotAsync(DisassociateLexBotRequest disassociateLexBotRequest,
            AsyncHandler<DisassociateLexBotRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon
     * Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DisassociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociatePhoneNumberContactFlowAsync(
            DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon
     * Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociatePhoneNumberContactFlowAsync(
            DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest,
            AsyncHandler<DisassociatePhoneNumberContactFlowRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         DisassociateQueueQuickConnects service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateQueueQuickConnectsAsync(
            DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateQueueQuickConnects service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateQueueQuickConnectsAsync(
            DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest,
            AsyncHandler<DisassociateQueueQuickConnectsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         DisassociateRoutingProfileQueues service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateRoutingProfileQueues service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest,
            AsyncHandler<DisassociateRoutingProfileQueuesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return A Java Future object containing the response from the
     *         DisassociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateSecurityKeyAsync(
            DisassociateSecurityKeyRequest disassociateSecurityKeyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> disassociateSecurityKeyAsync(
            DisassociateSecurityKeyRequest disassociateSecurityKeyRequest,
            AsyncHandler<DisassociateSecurityKeyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an agent from a traffic distribution group.
     * </p>
     * 
     * @param disassociateTrafficDistributionGroupUserRequest
     * @return A Java Future object containing the response from the
     *         DisassociateTrafficDistributionGroupUser service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DisassociateTrafficDistributionGroupUserResult> disassociateTrafficDistributionGroupUserAsync(
            DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an agent from a traffic distribution group.
     * </p>
     * 
     * @param disassociateTrafficDistributionGroupUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisassociateTrafficDistributionGroupUser service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DisassociateTrafficDistributionGroupUserResult> disassociateTrafficDistributionGroupUserAsync(
            DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest,
            AsyncHandler<DisassociateTrafficDistributionGroupUserRequest, DisassociateTrafficDistributionGroupUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an
     * available state, which allows the agent to receive a new routed contact.
     * Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @return A Java Future object containing the response from the
     *         DismissUserContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DismissUserContactResult> dismissUserContactAsync(
            DismissUserContactRequest dismissUserContactRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an
     * available state, which allows the agent to receive a new routed contact.
     * Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DismissUserContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DismissUserContactResult> dismissUserContactAsync(
            DismissUserContactRequest dismissUserContactRequest,
            AsyncHandler<DismissUserContactRequest, DismissUserContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetContactAttributesResult> getContactAttributesAsync(
            GetContactAttributesRequest getContactAttributesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetContactAttributesResult> getContactAttributesAsync(
            GetContactAttributesRequest getContactAttributesRequest,
            AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For a description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For a description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest,
            AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the real-time active user data from the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentUserData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCurrentUserDataResult> getCurrentUserDataAsync(
            GetCurrentUserDataRequest getCurrentUserDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets the real-time active user data from the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCurrentUserData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCurrentUserDataResult> getCurrentUserDataAsync(
            GetCurrentUserDataRequest getCurrentUserDataRequest,
            AsyncHandler<GetCurrentUserDataRequest, GetCurrentUserDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke
     * GetFederationToken with root credentials, an error message similar to the
     * following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
     * 
     * @param getFederationTokenRequest
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetFederationTokenResult> getFederationTokenAsync(
            GetFederationTokenRequest getFederationTokenRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke
     * GetFederationToken with root credentials, an error message similar to the
     * following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
     * 
     * @param getFederationTokenRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetFederationTokenResult> getFederationTokenAsync(
            GetFederationTokenRequest getFederationTokenRequest,
            AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical Metrics Definitions</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetMetricData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical Metrics Definitions</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMetricData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest,
            AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * <code>GetMetricDataV2</code> offers more features than <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html"
     * >GetMetricData</a>, the previous version of this API. It has new metrics,
     * offers filtering at a metric level, and offers the ability to filter and
     * group data by channels, queues, routing profiles, agents, and agent
     * hierarchy levels. It can retrieve historical data for the last 35 days,
     * in 24-hour intervals.
     * </p>
     * <p>
     * For a description of the historical metrics that are supported by
     * <code>GetMetricDataV2</code> and <code>GetMetricData</code>, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * 
     * @param getMetricDataV2Request
     * @return A Java Future object containing the response from the
     *         GetMetricDataV2 service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMetricDataV2Result> getMetricDataV2Async(GetMetricDataV2Request getMetricDataV2Request)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * <code>GetMetricDataV2</code> offers more features than <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html"
     * >GetMetricData</a>, the previous version of this API. It has new metrics,
     * offers filtering at a metric level, and offers the ability to filter and
     * group data by channels, queues, routing profiles, agents, and agent
     * hierarchy levels. It can retrieve historical data for the last 35 days,
     * in 24-hour intervals.
     * </p>
     * <p>
     * For a description of the historical metrics that are supported by
     * <code>GetMetricDataV2</code> and <code>GetMetricData</code>, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * 
     * @param getMetricDataV2Request
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMetricDataV2 service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMetricDataV2Result> getMetricDataV2Async(
            GetMetricDataV2Request getMetricDataV2Request,
            AsyncHandler<GetMetricDataV2Request, GetMetricDataV2Result> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the prompt file.
     * </p>
     * 
     * @param getPromptFileRequest
     * @return A Java Future object containing the response from the
     *         GetPromptFile service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetPromptFileResult> getPromptFileAsync(GetPromptFileRequest getPromptFileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the prompt file.
     * </p>
     * 
     * @param getPromptFileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetPromptFile service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetPromptFileResult> getPromptFileAsync(GetPromptFileRequest getPromptFileRequest,
            AsyncHandler<GetPromptFileRequest, GetPromptFileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         GetTaskTemplate service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTaskTemplateResult> getTaskTemplateAsync(GetTaskTemplateRequest getTaskTemplateRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetTaskTemplate service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTaskTemplateResult> getTaskTemplateAsync(
            GetTaskTemplateRequest getTaskTemplateRequest,
            AsyncHandler<GetTaskTemplateRequest, GetTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic
     * distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @return A Java Future object containing the response from the
     *         GetTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTrafficDistributionResult> getTrafficDistributionAsync(
            GetTrafficDistributionRequest getTrafficDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic
     * distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTrafficDistributionResult> getTrafficDistributionAsync(
            GetTrafficDistributionRequest getTrafficDistributionRequest,
            AsyncHandler<GetTrafficDistributionRequest, GetTrafficDistributionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @return A Java Future object containing the response from the
     *         ListAgentStatuses service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListAgentStatusesResult> listAgentStatusesAsync(
            ListAgentStatusesRequest listAgentStatusesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListAgentStatuses service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListAgentStatusesResult> listAgentStatusesAsync(
            ListAgentStatusesRequest listAgentStatusesRequest,
            AsyncHandler<ListAgentStatusesRequest, ListAgentStatusesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the
     * instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return A Java Future object containing the response from the
     *         ListApprovedOrigins service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListApprovedOriginsResult> listApprovedOriginsAsync(
            ListApprovedOriginsRequest listApprovedOriginsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the
     * instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListApprovedOrigins service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListApprovedOriginsResult> listApprovedOriginsAsync(
            ListApprovedOriginsRequest listApprovedOriginsRequest,
            AsyncHandler<ListApprovedOriginsRequest, ListApprovedOriginsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all
     * the Amazon Lex bots currently associated with the instance. Use this API
     * to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return A Java Future object containing the response from the ListBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all
     * the Amazon Lex bots currently associated with the instance. Use this API
     * to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest,
            AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists contact evaluations in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactEvaluationsRequest
     * @return A Java Future object containing the response from the
     *         ListContactEvaluations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactEvaluationsResult> listContactEvaluationsAsync(
            ListContactEvaluationsRequest listContactEvaluationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists contact evaluations in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactEvaluationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListContactEvaluations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactEvaluationsResult> listContactEvaluationsAsync(
            ListContactEvaluationsRequest listContactEvaluationsRequest,
            AsyncHandler<ListContactEvaluationsRequest, ListContactEvaluationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlowModules service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactFlowModulesResult> listContactFlowModulesAsync(
            ListContactFlowModulesRequest listContactFlowModulesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListContactFlowModules service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactFlowModulesResult> listContactFlowModulesAsync(
            ListContactFlowModulesRequest listContactFlowModulesRequest,
            AsyncHandler<ListContactFlowModulesRequest, ListContactFlowModulesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html"
     * >Flows</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlows service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactFlowsResult> listContactFlowsAsync(
            ListContactFlowsRequest listContactFlowsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html"
     * >Flows</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListContactFlows service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactFlowsResult> listContactFlowsAsync(
            ListContactFlowsRequest listContactFlowsRequest,
            AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of
     * references associated with the contact.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @return A Java Future object containing the response from the
     *         ListContactReferences service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactReferencesResult> listContactReferencesAsync(
            ListContactReferencesRequest listContactReferencesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of
     * references associated with the contact.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListContactReferences service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactReferencesResult> listContactReferencesAsync(
            ListContactReferencesRequest listContactReferencesRequest,
            AsyncHandler<ListContactReferencesRequest, ListContactReferencesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListDefaultVocabularies service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(
            ListDefaultVocabulariesRequest listDefaultVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDefaultVocabularies service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(
            ListDefaultVocabulariesRequest listDefaultVocabulariesRequest,
            AsyncHandler<ListDefaultVocabulariesRequest, ListDefaultVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists versions of an evaluation form in the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listEvaluationFormVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListEvaluationFormVersions service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEvaluationFormVersionsResult> listEvaluationFormVersionsAsync(
            ListEvaluationFormVersionsRequest listEvaluationFormVersionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists versions of an evaluation form in the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listEvaluationFormVersionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEvaluationFormVersions service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEvaluationFormVersionsResult> listEvaluationFormVersionsAsync(
            ListEvaluationFormVersionsRequest listEvaluationFormVersionsRequest,
            AsyncHandler<ListEvaluationFormVersionsRequest, ListEvaluationFormVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists evaluation forms in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormsRequest
     * @return A Java Future object containing the response from the
     *         ListEvaluationForms service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEvaluationFormsResult> listEvaluationFormsAsync(
            ListEvaluationFormsRequest listEvaluationFormsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists evaluation forms in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEvaluationForms service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEvaluationFormsResult> listEvaluationFormsAsync(
            ListEvaluationFormsRequest listEvaluationFormsRequest,
            AsyncHandler<ListEvaluationFormsRequest, ListEvaluationFormsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html"
     * >Set the Hours of Operation for a Queue</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(
            ListHoursOfOperationsRequest listHoursOfOperationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html"
     * >Set the Hours of Operation for a Queue</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(
            ListHoursOfOperationsRequest listHoursOfOperationsRequest,
            AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return A Java Future object containing the response from the
     *         ListInstanceAttributes service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListInstanceAttributesResult> listInstanceAttributesAsync(
            ListInstanceAttributesRequest listInstanceAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListInstanceAttributes service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListInstanceAttributesResult> listInstanceAttributesAsync(
            ListInstanceAttributesRequest listInstanceAttributesRequest,
            AsyncHandler<ListInstanceAttributesRequest, ListInstanceAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance
     * and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return A Java Future object containing the response from the
     *         ListInstanceStorageConfigs service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(
            ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance
     * and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListInstanceStorageConfigs service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(
            ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest,
            AsyncHandler<ListInstanceStorageConfigsRequest, ListInstanceStorageConfigsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Return a list of instances which are in active state,
     * creation-in-progress state, and failed state. Instances that aren't
     * successfully created (they are in a failed state) are returned only for
     * 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Return a list of instances which are in active state,
     * creation-in-progress state, and failed state. Instances that aren't
     * successfully created (they are in a failed state) are returned only for
     * 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource
     * associations for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListIntegrationAssociations service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(
            ListIntegrationAssociationsRequest listIntegrationAssociationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource
     * associations for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListIntegrationAssociations service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(
            ListIntegrationAssociationsRequest listIntegrationAssociationsRequest,
            AsyncHandler<ListIntegrationAssociationsRequest, ListIntegrationAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the
     * dropdown options in the relevant flow blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return A Java Future object containing the response from the
     *         ListLambdaFunctions service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(
            ListLambdaFunctionsRequest listLambdaFunctionsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the
     * dropdown options in the relevant flow blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListLambdaFunctions service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(
            ListLambdaFunctionsRequest listLambdaFunctionsRequest,
            AsyncHandler<ListLambdaFunctionsRequest, ListLambdaFunctionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently
     * associated with the instance. To return both Amazon Lex V1 and V2 bots,
     * use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html"
     * >ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return A Java Future object containing the response from the ListLexBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLexBotsResult> listLexBotsAsync(ListLexBotsRequest listLexBotsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently
     * associated with the instance. To return both Amazon Lex V1 and V2 bots,
     * use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html"
     * >ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListLexBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLexBotsResult> listLexBotsAsync(ListLexBotsRequest listLexBotsRequest,
            AsyncHandler<ListLexBotsRequest, ListLexBotsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the
     * items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources.
     * It will fail with a <code>ResourceNotFoundException</code>. Instead, use
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API. It returns the new phone number ARN that can
     * be used to tag phone number resources.
     * </p>
     * </important>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbers service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPhoneNumbersResult> listPhoneNumbersAsync(
            ListPhoneNumbersRequest listPhoneNumbersRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the
     * items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources.
     * It will fail with a <code>ResourceNotFoundException</code>. Instead, use
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API. It returns the new phone number ARN that can
     * be used to tag phone number resources.
     * </p>
     * </important>
     * 
     * @param listPhoneNumbersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbers service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPhoneNumbersResult> listPhoneNumbersAsync(
            ListPhoneNumbersRequest listPhoneNumbersRequest,
            AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists phone numbers claimed to your Amazon Connect instance or traffic
     * distribution group. If the provided <code>TargetArn</code> is a traffic
     * distribution group, you can call this API in both Amazon Web Services
     * Regions associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When given an instance ARN, <code>ListPhoneNumbersV2</code> returns only
     * the phone numbers claimed to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * When given a traffic distribution group ARN
     * <code>ListPhoneNumbersV2</code> returns only the phone numbers claimed to
     * the traffic distribution group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listPhoneNumbersV2Request
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersV2 service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(
            ListPhoneNumbersV2Request listPhoneNumbersV2Request) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists phone numbers claimed to your Amazon Connect instance or traffic
     * distribution group. If the provided <code>TargetArn</code> is a traffic
     * distribution group, you can call this API in both Amazon Web Services
     * Regions associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When given an instance ARN, <code>ListPhoneNumbersV2</code> returns only
     * the phone numbers claimed to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * When given a traffic distribution group ARN
     * <code>ListPhoneNumbersV2</code> returns only the phone numbers claimed to
     * the traffic distribution group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listPhoneNumbersV2Request
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersV2 service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(
            ListPhoneNumbersV2Request listPhoneNumbersV2Request,
            AsyncHandler<ListPhoneNumbersV2Request, ListPhoneNumbersV2Result> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return A Java Future object containing the response from the ListPrompts
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest listPromptsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListPrompts
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest listPromptsRequest,
            AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         ListQueueQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(
            ListQueueQuickConnectsRequest listQueueQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListQueueQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(
            ListQueueQuickConnectsRequest listQueueQuickConnectsRequest,
            AsyncHandler<ListQueueQuickConnectsRequest, ListQueueQuickConnectsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard
     * and agent queues are returned. This might cause an unexpected truncation
     * of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html"
     * >Queues: Standard and Agent</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard
     * and agent queues are returned. This might cause an unexpected truncation
     * of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html"
     * >Queues: Standard and Agent</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         ListQuickConnects service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQuickConnectsResult> listQuickConnectsAsync(
            ListQuickConnectsRequest listQuickConnectsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListQuickConnects service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQuickConnectsResult> listQuickConnectsAsync(
            ListQuickConnectsRequest listQuickConnectsRequest,
            AsyncHandler<ListQuickConnectsRequest, ListQuickConnectsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfileQueues service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(
            ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListRoutingProfileQueues service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(
            ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest,
            AsyncHandler<ListRoutingProfileQueuesRequest, ListRoutingProfileQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html"
     * >Routing Profiles</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html"
     * >Create a Routing Profile</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRoutingProfilesResult> listRoutingProfilesAsync(
            ListRoutingProfilesRequest listRoutingProfilesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html"
     * >Routing Profiles</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html"
     * >Create a Routing Profile</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRoutingProfilesResult> listRoutingProfilesAsync(
            ListRoutingProfilesRequest listRoutingProfilesRequest,
            AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future object containing the response from the ListRules
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListRules
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the
     * instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityKeys service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityKeysResult> listSecurityKeysAsync(
            ListSecurityKeysRequest listSecurityKeysRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the
     * instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSecurityKeys service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityKeysResult> listSecurityKeysAsync(
            ListSecurityKeysRequest listSecurityKeysRequest,
            AsyncHandler<ListSecurityKeysRequest, ListSecurityKeysResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfilePermissions service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSecurityProfilePermissions service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest,
            AsyncHandler<ListSecurityProfilePermissionsRequest, ListSecurityProfilePermissionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html"
     * >Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityProfilesResult> listSecurityProfilesAsync(
            ListSecurityProfilesRequest listSecurityProfilesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html"
     * >Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityProfilesResult> listSecurityProfilesAsync(
            ListSecurityProfilesRequest listSecurityProfilesRequest,
            AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @return A Java Future object containing the response from the
     *         ListTaskTemplates service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTaskTemplatesResult> listTaskTemplatesAsync(
            ListTaskTemplatesRequest listTaskTemplatesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTaskTemplates service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTaskTemplatesResult> listTaskTemplatesAsync(
            ListTaskTemplatesRequest listTaskTemplatesRequest,
            AsyncHandler<ListTaskTemplatesRequest, ListTaskTemplatesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists traffic distribution group users.
     * </p>
     * 
     * @param listTrafficDistributionGroupUsersRequest
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroupUsers service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTrafficDistributionGroupUsersResult> listTrafficDistributionGroupUsersAsync(
            ListTrafficDistributionGroupUsersRequest listTrafficDistributionGroupUsersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists traffic distribution group users.
     * </p>
     * 
     * @param listTrafficDistributionGroupUsersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroupUsers service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTrafficDistributionGroupUsersResult> listTrafficDistributionGroupUsersAsync(
            ListTrafficDistributionGroupUsersRequest listTrafficDistributionGroupUsersRequest,
            AsyncHandler<ListTrafficDistributionGroupUsersRequest, ListTrafficDistributionGroupUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroups service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroups service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest,
            AsyncHandler<ListTrafficDistributionGroupsRequest, ListTrafficDistributionGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest <p>
     *            Provides summary information about the use cases for the
     *            specified integration association.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListUseCases service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest listUseCasesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest <p>
     *            Provides summary information about the use cases for the
     *            specified integration association.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListUseCases service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest listUseCasesRequest,
            AsyncHandler<ListUseCasesRequest, ListUseCasesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html"
     * >Set Up Agent Hierarchies</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(
            ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html"
     * >Set Up Agent Hierarchies</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(
            ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest,
            AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future object containing the response from the ListUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP)
     * of the user specified by <i>userId</i> will be set to silent monitoring
     * mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @return A Java Future object containing the response from the
     *         MonitorContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<MonitorContactResult> monitorContactAsync(MonitorContactRequest monitorContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP)
     * of the user specified by <i>userId</i> will be set to silent monitoring
     * mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         MonitorContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<MonitorContactResult> monitorContactAsync(MonitorContactRequest monitorContactRequest,
            AsyncHandler<MonitorContactRequest, MonitorContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the
     * agent is currently handling a contact, this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html"
     * >Agent status</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html"
     * >Set your next status</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @return A Java Future object containing the response from the
     *         PutUserStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<PutUserStatusResult> putUserStatusAsync(PutUserStatusRequest putUserStatusRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the
     * agent is currently handling a contact, this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html"
     * >Agent status</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html"
     * >Set your next status</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PutUserStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<PutUserStatusResult> putUserStatusAsync(PutUserStatusRequest putUserStatusRequest,
            AsyncHandler<PutUserStatusRequest, PutUserStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance
     * or traffic distribution group. You can call this API only in the Amazon
     * Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the
     * <code>ReleasePhoneNumber</code> API, not the Amazon Connect console.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown
     * period of 30 days. It cannot be searched for or claimed again until the
     * period has ended. If you accidentally release a phone number, contact
     * Amazon Web Services Support.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ReleasePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> releasePhoneNumberAsync(ReleasePhoneNumberRequest releasePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance
     * or traffic distribution group. You can call this API only in the Amazon
     * Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the
     * <code>ReleasePhoneNumber</code> API, not the Amazon Connect console.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown
     * period of 30 days. It cannot be searched for or claimed again until the
     * period has ended. If you accidentally release a phone number, contact
     * Amazon Web Services Support.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ReleasePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> releasePhoneNumberAsync(ReleasePhoneNumberRequest releasePhoneNumberRequest,
            AsyncHandler<ReleasePhoneNumberRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web
     * Services Region.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html"
     * >Create a replica of your existing Amazon Connect instance</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @return A Java Future object containing the response from the
     *         ReplicateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceNotReadyException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ReplicateInstanceResult> replicateInstanceAsync(
            ReplicateInstanceRequest replicateInstanceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web
     * Services Region.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html"
     * >Create a replica of your existing Amazon Connect instance</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ReplicateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceNotReadyException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ReplicateInstanceResult> replicateInstanceAsync(
            ReplicateInstanceRequest replicateInstanceRequest,
            AsyncHandler<ReplicateInstanceRequest, ReplicateInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended
     * using SuspendContactRecording, this API resumes recording the call or
     * screen.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         ResumeContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ResumeContactRecordingResult> resumeContactRecordingAsync(
            ResumeContactRecordingRequest resumeContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended
     * using SuspendContactRecording, this API resumes recording the call or
     * screen.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ResumeContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ResumeContactRecordingResult> resumeContactRecordingAsync(
            ResumeContactRecordingRequest resumeContactRecordingRequest,
            AsyncHandler<ResumeContactRecordingRequest, ResumeContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this
     * API in both Amazon Web Services Regions associated with the traffic
     * distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         SearchAvailablePhoneNumbers service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this
     * API in both Amazon Web Services Regions associated with the traffic
     * distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchAvailablePhoneNumbers service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest,
            AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches the hours of operation in an Amazon Connect instance, with
     * optional filtering.
     * </p>
     * 
     * @param searchHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         SearchHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchHoursOfOperationsResult> searchHoursOfOperationsAsync(
            SearchHoursOfOperationsRequest searchHoursOfOperationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches the hours of operation in an Amazon Connect instance, with
     * optional filtering.
     * </p>
     * 
     * @param searchHoursOfOperationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchHoursOfOperationsResult> searchHoursOfOperationsAsync(
            SearchHoursOfOperationsRequest searchHoursOfOperationsRequest,
            AsyncHandler<SearchHoursOfOperationsRequest, SearchHoursOfOperationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches prompts in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchPromptsRequest
     * @return A Java Future object containing the response from the
     *         SearchPrompts service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchPromptsResult> searchPromptsAsync(SearchPromptsRequest searchPromptsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches prompts in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchPromptsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchPrompts service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchPromptsResult> searchPromptsAsync(SearchPromptsRequest searchPromptsRequest,
            AsyncHandler<SearchPromptsRequest, SearchPromptsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @return A Java Future object containing the response from the
     *         SearchQueues service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchQueuesResult> searchQueuesAsync(SearchQueuesRequest searchQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchQueues service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchQueuesResult> searchQueuesAsync(SearchQueuesRequest searchQueuesRequest,
            AsyncHandler<SearchQueuesRequest, SearchQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches quick connects in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         SearchQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchQuickConnectsResult> searchQuickConnectsAsync(
            SearchQuickConnectsRequest searchQuickConnectsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Searches quick connects in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchQuickConnectsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchQuickConnectsResult> searchQuickConnectsAsync(
            SearchQuickConnectsRequest searchQuickConnectsRequest,
            AsyncHandler<SearchQuickConnectsRequest, SearchQuickConnectsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches tags used in an Amazon Connect instance using optional search
     * criteria.
     * </p>
     * 
     * @param searchResourceTagsRequest
     * @return A Java Future object containing the response from the
     *         SearchResourceTags service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws MaximumResultReturnedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchResourceTagsResult> searchResourceTagsAsync(
            SearchResourceTagsRequest searchResourceTagsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Searches tags used in an Amazon Connect instance using optional search
     * criteria.
     * </p>
     * 
     * @param searchResourceTagsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchResourceTags service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws MaximumResultReturnedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchResourceTagsResult> searchResourceTagsAsync(
            SearchResourceTagsRequest searchResourceTagsRequest,
            AsyncHandler<SearchResourceTagsRequest, SearchResourceTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         SearchRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(
            SearchRoutingProfilesRequest searchRoutingProfilesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(
            SearchRoutingProfilesRequest searchRoutingProfilesRequest,
            AsyncHandler<SearchRoutingProfilesRequest, SearchRoutingProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         SearchSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(
            SearchSecurityProfilesRequest searchSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(
            SearchSecurityProfilesRequest searchSecurityProfilesRequest,
            AsyncHandler<SearchSecurityProfilesRequest, SearchSecurityProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @return A Java Future object containing the response from the SearchUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest searchUsersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SearchUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest searchUsersRequest,
            AsyncHandler<SearchUsersRequest, SearchUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using
     * <code>State</code>, <code>NameStartsWith</code>, and
     * <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         SearchVocabularies service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchVocabulariesResult> searchVocabulariesAsync(
            SearchVocabulariesRequest searchVocabulariesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using
     * <code>State</code>, <code>NameStartsWith</code>, and
     * <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SearchVocabularies service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SearchVocabulariesResult> searchVocabulariesAsync(
            SearchVocabulariesRequest searchVocabulariesRequest,
            AsyncHandler<SearchVocabulariesRequest, SearchVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this
     * API provides a token required to obtain credentials from the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant
     * Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe
     * to the participant’s connection for the created chat within 5 minutes.
     * This is achieved by invoking <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and
     * CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a
     * <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >quota for concurrent active chats</a> is exceeded. Active chat
     * throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a
     * 400 error, your account may not support the ability to configure custom
     * chat durations. For more information, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html"
     * >Chat</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return A Java Future object containing the response from the
     *         StartChatContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartChatContactResult> startChatContactAsync(
            StartChatContactRequest startChatContactRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this
     * API provides a token required to obtain credentials from the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant
     * Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe
     * to the participant’s connection for the created chat within 5 minutes.
     * This is achieved by invoking <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and
     * CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a
     * <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >quota for concurrent active chats</a> is exceeded. Active chat
     * throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a
     * 400 error, your account may not support the ability to configure custom
     * chat durations. For more information, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html"
     * >Chat</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartChatContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartChatContactResult> startChatContactAsync(
            StartChatContactRequest startChatContactRequest,
            AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an empty evaluation in the specified Amazon Connect instance,
     * using the given evaluation form for the particular contact. The
     * evaluation form version used for the contact evaluation corresponds to
     * the currently activated version. If no version is activated for the
     * evaluation form, the contact evaluation cannot be started.
     * </p>
     * <note>
     * <p>
     * Evaluations created through the public API do not contain answer values
     * suggested from automation.
     * </p>
     * </note>
     * 
     * @param startContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         StartContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartContactEvaluationResult> startContactEvaluationAsync(
            StartContactEvaluationRequest startContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an empty evaluation in the specified Amazon Connect instance,
     * using the given evaluation form for the particular contact. The
     * evaluation form version used for the contact evaluation corresponds to
     * the currently activated version. If no version is activated for the
     * evaluation form, the contact evaluation cannot be started.
     * </p>
     * <note>
     * <p>
     * Evaluations created through the public API do not contain answer values
     * suggested from automation.
     * </p>
     * </note>
     * 
     * @param startContactEvaluationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartContactEvaluationResult> startContactEvaluationAsync(
            StartContactEvaluationRequest startContactEvaluationRequest,
            AsyncHandler<StartContactEvaluationRequest, StartContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording
     * starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording
     * starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend and resume it, such as when
     * collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html"
     * >Set recording behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         StartContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartContactRecordingResult> startContactRecordingAsync(
            StartContactRecordingRequest startContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording
     * starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording
     * starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend and resume it, such as when
     * collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html"
     * >Set recording behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartContactRecordingResult> startContactRecordingAsync(
            StartContactRecordingRequest startContactRecordingRequest,
            AsyncHandler<StartContactRecordingRequest, StartContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html"
     * >Enable real-time chat message streaming</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @return A Java Future object containing the response from the
     *         StartContactStreaming service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartContactStreamingResult> startContactStreamingAsync(
            StartContactStreamingRequest startContactStreamingRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html"
     * >Enable real-time chat message streaming</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartContactStreaming service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartContactStreamingResult> startContactStreamingAsync(
            StartContactStreamingRequest startContactStreamingRequest,
            AsyncHandler<StartContactStreamingRequest, StartContactStreamingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It
     * performs the actions in the flow that's specified (in
     * <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not
     * dial the contact. If the flow places an outbound call to a contact, and
     * then puts the contact in queue, the call is then routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can
     * dial these UK mobile numbers, you must submit a service quota increase
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call
     * with <code>TrafficType</code> = <code>CAMPAIGN</code>, you must submit a
     * service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @return A Java Future object containing the response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It
     * performs the actions in the flow that's specified (in
     * <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not
     * dial the contact. If the flow places an outbound call to a contact, and
     * then puts the contact in queue, the call is then routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can
     * dial these UK mobile numbers, you must submit a service quota increase
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call
     * with <code>TrafficType</code> = <code>CAMPAIGN</code>, you must submit a
     * service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest,
            AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a flow to start a new task.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return A Java Future object containing the response from the
     *         StartTaskContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTaskContactResult> startTaskContactAsync(
            StartTaskContactRequest startTaskContactRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Initiates a flow to start a new task.
     * </p>
     * 
     * @param startTaskContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartTaskContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTaskContactResult> startTaskContactAsync(
            StartTaskContactRequest startTaskContactRequest,
            AsyncHandler<StartTaskContactRequest, StartTaskContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Ends the specified contact. This call does not work for the following
     * initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopContactRequest
     * @return A Java Future object containing the response from the StopContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Ends the specified contact. This call does not work for the following
     * initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the StopContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest,
            AsyncHandler<StopContactRequest, StopContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops recording a call when a contact is being recorded.
     * StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         StopContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactRecordingResult> stopContactRecordingAsync(
            StopContactRecordingRequest stopContactRecordingRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Stops recording a call when a contact is being recorded.
     * StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactRecordingResult> stopContactRecordingAsync(
            StopContactRecordingRequest stopContactRecordingRequest,
            AsyncHandler<StopContactRecordingRequest, StopContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message
     * streaming on that contact, call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return A Java Future object containing the response from the
     *         StopContactStreaming service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactStreamingResult> stopContactStreamingAsync(
            StopContactStreamingRequest stopContactStreamingRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message
     * streaming on that contact, call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopContactStreaming service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactStreamingResult> stopContactStreamingAsync(
            StopContactStreamingRequest stopContactStreamingRequest,
            AsyncHandler<StopContactStreamingRequest, StopContactStreamingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits a contact evaluation in the specified Amazon Connect instance.
     * Answers included in the request are merged with existing answers for the
     * given evaluation. If no answers or notes are passed, the evaluation is
     * submitted with the existing answers and notes. You can delete an answer
     * or note by passing an empty object (<code>{}</code>) to the question
     * identifier.
     * </p>
     * <p>
     * If a contact evaluation is already in submitted state, this operation
     * will trigger a resubmission.
     * </p>
     * 
     * @param submitContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         SubmitContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SubmitContactEvaluationResult> submitContactEvaluationAsync(
            SubmitContactEvaluationRequest submitContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits a contact evaluation in the specified Amazon Connect instance.
     * Answers included in the request are merged with existing answers for the
     * given evaluation. If no answers or notes are passed, the evaluation is
     * submitted with the existing answers and notes. You can delete an answer
     * or note by passing an empty object (<code>{}</code>) to the question
     * identifier.
     * </p>
     * <p>
     * If a contact evaluation is already in submitted state, this operation
     * will trigger a resubmission.
     * </p>
     * 
     * @param submitContactEvaluationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SubmitContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SubmitContactEvaluationResult> submitContactEvaluationAsync(
            SubmitContactEvaluationRequest submitContactEvaluationRequest,
            AsyncHandler<SubmitContactEvaluationRequest, SubmitContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording the call or
     * screen. For example, you might suspend the call or screen recording while
     * collecting sensitive information, such as a credit card number. Then use
     * ResumeContactRecording to restart recording.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence
     * in the final recording.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         SuspendContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SuspendContactRecordingResult> suspendContactRecordingAsync(
            SuspendContactRecordingRequest suspendContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording the call or
     * screen. For example, you might suspend the call or screen recording while
     * collecting sensitive information, such as a credit card number. Then use
     * ResumeContactRecording to restart recording.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence
     * in the final recording.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SuspendContactRecording service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<SuspendContactRecordingResult> suspendContactRecordingAsync(
            SuspendContactRecordingRequest suspendContactRecordingRequest,
            AsyncHandler<SuspendContactRecordingRequest, SuspendContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles,
     * queues, quick connects, contact flows, agent statuses, hours of
     * operation, phone numbers, security profiles, and task templates. For a
     * complete list, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html"
     * >Tagging resources in Amazon Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles,
     * queues, quick connects, contact flows, agent statuses, hours of
     * operation, phone numbers, security profiles, and task templates. For a
     * complete list, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html"
     * >Tagging resources in Amazon Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Transfers contacts from one agent or queue to another agent or queue at
     * any point after a contact is created. You can transfer a contact to
     * another queue by providing the flow which orchestrates the contact to the
     * destination queue. This gives you more control over contact handling and
     * helps you adhere to the service level agreement (SLA) guaranteed to your
     * customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same
     * call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent
     * flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active
     * contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @return A Java Future object containing the response from the
     *         TransferContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TransferContactResult> transferContactAsync(TransferContactRequest transferContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Transfers contacts from one agent or queue to another agent or queue at
     * any point after a contact is created. You can transfer a contact to
     * another queue by providing the flow which orchestrates the contact to the
     * destination queue. This gives you more control over contact handling and
     * helps you adhere to the service level agreement (SLA) guaranteed to your
     * customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same
     * call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent
     * flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active
     * contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         TransferContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TransferContactResult> transferContactAsync(
            TransferContactRequest transferContactRequest,
            AsyncHandler<TransferContactRequest, TransferContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateAgentStatusAsync(UpdateAgentStatusRequest updateAgentStatusRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateAgentStatusAsync(UpdateAgentStatusRequest updateAgentStatusRequest,
            AsyncHandler<UpdateAgentStatusRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the
     * specified contact. At least one field to be updated must be present in
     * the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing
     * and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @return A Java Future object containing the response from the
     *         UpdateContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the
     * specified contact. At least one field to be updated must be present in
     * the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing
     * and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest,
            AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates user-defined contact attributes associated with the
     * specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and
     * completed contacts. For example, while the call is active, you can update
     * the customer's name or the reason the customer called. You can add notes
     * about steps that the agent took during the call that display to the next
     * agent that takes the call. You can also update attributes for a contact
     * using data from your CRM application and save the data with the contact
     * in Amazon Connect. You could also flag calls for additional analysis,
     * such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted. For information about contact record retention and the
     * maximum size of the contact record attributes section, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactAttributesResult> updateContactAttributesAsync(
            UpdateContactAttributesRequest updateContactAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates user-defined contact attributes associated with the
     * specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and
     * completed contacts. For example, while the call is active, you can update
     * the customer's name or the reason the customer called. You can add notes
     * about steps that the agent took during the call that display to the next
     * agent that takes the call. You can also update attributes for a contact
     * using data from your CRM application and save the data with the contact
     * in Amazon Connect. You could also flag calls for additional analysis,
     * such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted. For information about contact record retention and the
     * maximum size of the contact record attributes section, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactAttributesResult> updateContactAttributesAsync(
            UpdateContactAttributesRequest updateContactAttributesRequest,
            AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates details about a contact evaluation in the specified Amazon
     * Connect instance. A contact evaluation must be in draft state. Answers
     * included in the request are merged with existing answers for the given
     * evaluation. An answer or note can be deleted by passing an empty object (
     * <code>{}</code>) to the question identifier.
     * </p>
     * 
     * @param updateContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactEvaluationResult> updateContactEvaluationAsync(
            UpdateContactEvaluationRequest updateContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates details about a contact evaluation in the specified Amazon
     * Connect instance. A contact evaluation must be in draft state. Answers
     * included in the request are merged with existing answers for the given
     * evaluation. An answer or note can be deleted by passing an empty object (
     * <code>{}</code>) to the question identifier.
     * </p>
     * 
     * @param updateContactEvaluationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactEvaluationResult> updateContactEvaluationAsync(
            UpdateContactEvaluationRequest updateContactEvaluationRequest,
            AsyncHandler<UpdateContactEvaluationRequest, UpdateContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowContent service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(
            UpdateContactFlowContentRequest updateContactFlowContentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowContent service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(
            UpdateContactFlowContentRequest updateContactFlowContentRequest,
            AsyncHandler<UpdateContactFlowContentRequest, UpdateContactFlowContentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowMetadata service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(
            UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowMetadata service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(
            UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest,
            AsyncHandler<UpdateContactFlowMetadataRequest, UpdateContactFlowMetadataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleContent service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleContent service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest,
            AsyncHandler<UpdateContactFlowModuleContentRequest, UpdateContactFlowModuleContentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleMetadata service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleMetadata service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest,
            AsyncHandler<UpdateContactFlowModuleMetadataRequest, UpdateContactFlowModuleMetadataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowName service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(
            UpdateContactFlowNameRequest updateContactFlowNameRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowName service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(
            UpdateContactFlowNameRequest updateContactFlowNameRequest,
            AsyncHandler<UpdateContactFlowNameRequest, UpdateContactFlowNameResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactSchedule service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactScheduleResult> updateContactScheduleAsync(
            UpdateContactScheduleRequest updateContactScheduleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactSchedule service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactScheduleResult> updateContactScheduleAsync(
            UpdateContactScheduleRequest updateContactScheduleRequest,
            AsyncHandler<UpdateContactScheduleRequest, UpdateContactScheduleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates details about a specific evaluation form version in the specified
     * Amazon Connect instance. Question and section identifiers cannot be
     * duplicated within the same evaluation form.
     * </p>
     * <p>
     * This operation does not support partial updates. Instead it does a full
     * update of evaluation form content.
     * </p>
     * 
     * @param updateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         UpdateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateEvaluationFormResult> updateEvaluationFormAsync(
            UpdateEvaluationFormRequest updateEvaluationFormRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates details about a specific evaluation form version in the specified
     * Amazon Connect instance. Question and section identifiers cannot be
     * duplicated within the same evaluation form.
     * </p>
     * <p>
     * This operation does not support partial updates. Instead it does a full
     * update of evaluation form content.
     * </p>
     * 
     * @param updateEvaluationFormRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateEvaluationFormResult> updateEvaluationFormAsync(
            UpdateEvaluationFormRequest updateEvaluationFormRequest,
            AsyncHandler<UpdateEvaluationFormRequest, UpdateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         UpdateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateHoursOfOperationAsync(
            UpdateHoursOfOperationRequest updateHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateHoursOfOperationAsync(
            UpdateHoursOfOperationRequest updateHoursOfOperationRequest,
            AsyncHandler<UpdateHoursOfOperationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return A Java Future object containing the response from the
     *         UpdateInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateInstanceAttributeAsync(
            UpdateInstanceAttributeRequest updateInstanceAttributeRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateInstanceAttributeAsync(
            UpdateInstanceAttributeRequest updateInstanceAttributeRequest,
            AsyncHandler<UpdateInstanceAttributeRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is
     * idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateInstanceStorageConfig service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateInstanceStorageConfigAsync(
            UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is
     * idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateInstanceStorageConfig service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateInstanceStorageConfigAsync(
            UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest,
            AsyncHandler<UpdateInstanceStorageConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered
     * idle, and when agents are automatically disconnected from a chat due to
     * idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html"
     * >Set up chat timeouts for human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateParticipantRoleConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(
            UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered
     * idle, and when agents are automatically disconnected from a chat due to
     * idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html"
     * >Set up chat timeouts for human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateParticipantRoleConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(
            UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest,
            AsyncHandler<UpdateParticipantRoleConfigRequest, UpdateParticipantRoleConfigResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect
     * instance or traffic distribution group to another Amazon Connect instance
     * or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * After using this API, you must verify that the phone number is attached
     * to the correct flow in the target instance or traffic distribution group.
     * You need to do this because the API switches only the phone number to a
     * new instance or traffic distribution group. It doesn't migrate the flow
     * configuration of the phone number, too.
     * </p>
     * <p>
     * You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         UpdatePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(
            UpdatePhoneNumberRequest updatePhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect
     * instance or traffic distribution group to another Amazon Connect instance
     * or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * After using this API, you must verify that the phone number is attached
     * to the correct flow in the target instance or traffic distribution group.
     * You need to do this because the API switches only the phone number to a
     * new instance or traffic distribution group. It doesn't migrate the flow
     * configuration of the phone number, too.
     * </p>
     * <p>
     * You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdatePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(
            UpdatePhoneNumberRequest updatePhoneNumberRequest,
            AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a prompt.
     * </p>
     * 
     * @param updatePromptRequest
     * @return A Java Future object containing the response from the
     *         UpdatePrompt service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdatePromptResult> updatePromptAsync(UpdatePromptRequest updatePromptRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a prompt.
     * </p>
     * 
     * @param updatePromptRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdatePrompt service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdatePromptResult> updatePromptAsync(UpdatePromptRequest updatePromptRequest,
            AsyncHandler<UpdatePromptRequest, UpdatePromptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueHoursOfOperationAsync(
            UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQueueHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueHoursOfOperationAsync(
            UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest,
            AsyncHandler<UpdateQueueHoursOfOperationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is
     * considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueMaxContacts service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueMaxContactsAsync(
            UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is
     * considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQueueMaxContacts service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueMaxContactsAsync(
            UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest,
            AsyncHandler<UpdateQueueMaxContactsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code>
     * or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueName service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueNameAsync(UpdateQueueNameRequest updateQueueNameRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code>
     * or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQueueName service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueNameAsync(UpdateQueueNameRequest updateQueueNameRequest,
            AsyncHandler<UpdateQueueNameRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow
     * for a specified queue.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic
     * distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was
     * created, you can use either a full phone number ARN or UUID value for the
     * <code>OutboundCallerIdNumberId</code> value of the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig"
     * >OutboundCallerConfig</a> request body parameter. However, if the number
     * is claimed to a traffic distribution group and you are calling this API
     * using an instance in the alternate Amazon Web Services Region associated
     * with the traffic distribution group, you must provide a full phone number
     * ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueOutboundCallerConfig service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueOutboundCallerConfigAsync(
            UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow
     * for a specified queue.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic
     * distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was
     * created, you can use either a full phone number ARN or UUID value for the
     * <code>OutboundCallerIdNumberId</code> value of the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig"
     * >OutboundCallerConfig</a> request body parameter. However, if the number
     * is claimed to a traffic distribution group and you are calling this API
     * using an instance in the alternate Amazon Web Services Region associated
     * with the traffic distribution group, you must provide a full phone number
     * ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQueueOutboundCallerConfig service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueOutboundCallerConfigAsync(
            UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest,
            AsyncHandler<UpdateQueueOutboundCallerConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueStatusAsync(UpdateQueueStatusRequest updateQueueStatusRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQueueStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQueueStatusAsync(UpdateQueueStatusRequest updateQueueStatusRequest,
            AsyncHandler<UpdateQueueStatusRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQuickConnectConfigAsync(
            UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQuickConnectConfigAsync(
            UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest,
            AsyncHandler<UpdateQuickConnectConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts
     * the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectName service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQuickConnectNameAsync(
            UpdateQuickConnectNameRequest updateQuickConnectNameRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts
     * the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectName service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateQuickConnectNameAsync(
            UpdateQuickConnectNameRequest updateQuickConnectNameRequest,
            AsyncHandler<UpdateQuickConnectNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * 
     * @param updateRoutingProfileAgentAvailabilityTimerRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileAgentAvailabilityTimer service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileAgentAvailabilityTimerAsync(
            UpdateRoutingProfileAgentAvailabilityTimerRequest updateRoutingProfileAgentAvailabilityTimerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * 
     * @param updateRoutingProfileAgentAvailabilityTimerRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileAgentAvailabilityTimer service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileAgentAvailabilityTimerAsync(
            UpdateRoutingProfileAgentAvailabilityTimerRequest updateRoutingProfileAgentAvailabilityTimerRequest,
            AsyncHandler<UpdateRoutingProfileAgentAvailabilityTimerRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel
     * (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileConcurrency service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel
     * (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileConcurrency service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest,
            AsyncHandler<UpdateRoutingProfileConcurrencyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileDefaultOutboundQueue service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileDefaultOutboundQueue service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest,
            AsyncHandler<UpdateRoutingProfileDefaultOutboundQueueRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and description of a routing profile. The request
     * accepts the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileName service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileNameAsync(
            UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and description of a routing profile. The request
     * accepts the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileName service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileNameAsync(
            UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest,
            AsyncHandler<UpdateRoutingProfileNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing
     * profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileQueues service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileQueuesAsync(
            UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing
     * profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileQueues service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRoutingProfileQueuesAsync(
            UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest,
            AsyncHandler<UpdateRoutingProfileQueuesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @return A Java Future object containing the response from the UpdateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRuleAsync(UpdateRuleRequest updateRuleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the UpdateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateRuleAsync(UpdateRuleRequest updateRuleRequest,
            AsyncHandler<UpdateRuleRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateSecurityProfileAsync(
            UpdateSecurityProfileRequest updateSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateSecurityProfileAsync(
            UpdateSecurityProfileRequest updateSecurityProfileRequest,
            AsyncHandler<UpdateSecurityProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon
     * Connect instance. This operation does not support partial updates.
     * Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         UpdateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(
            UpdateTaskTemplateRequest updateTaskTemplateRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon
     * Connect instance. This operation does not support partial updates.
     * Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(
            UpdateTaskTemplateRequest updateTaskTemplateRequest,
            AsyncHandler<UpdateTaskTemplateRequest, UpdateTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html"
     * >Update telephony traffic distribution across Amazon Web Services Regions
     * </a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @return A Java Future object containing the response from the
     *         UpdateTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(
            UpdateTrafficDistributionRequest updateTrafficDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html"
     * >Update telephony traffic distribution across Amazon Web Services Regions
     * </a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(
            UpdateTrafficDistributionRequest updateTrafficDistributionRequest,
            AsyncHandler<UpdateTrafficDistributionRequest, UpdateTrafficDistributionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchy service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyAsync(UpdateUserHierarchyRequest updateUserHierarchyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchy service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyAsync(UpdateUserHierarchyRequest updateUserHierarchyRequest,
            AsyncHandler<UpdateUserHierarchyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyGroupName service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyGroupNameAsync(
            UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyGroupName service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyGroupNameAsync(
            UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest,
            AsyncHandler<UpdateUserHierarchyGroupNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user
     * hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyStructureAsync(
            UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user
     * hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyStructureAsync(
            UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest,
            AsyncHandler<UpdateUserHierarchyStructureRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke
     * <code>UpdateUserIdentityInfo</code>. Someone with that ability can change
     * the login credentials of other users by changing their email address.
     * This poses a security risk to your organization. They can change the
     * email address of a user to the attacker's email address, and then reset
     * the password through email. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html"
     * >Best Practices for Security Profiles</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserIdentityInfo service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserIdentityInfoAsync(
            UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke
     * <code>UpdateUserIdentityInfo</code>. Someone with that ability can change
     * the login credentials of other users by changing their email address.
     * This poses a security risk to your organization. They can change the
     * email address of a user to the attacker's email address, and then reset
     * the password through email. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html"
     * >Best Practices for Security Profiles</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserIdentityInfo service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserIdentityInfoAsync(
            UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest,
            AsyncHandler<UpdateUserIdentityInfoRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserPhoneConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserPhoneConfigAsync(
            UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserPhoneConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserPhoneConfigAsync(
            UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest,
            AsyncHandler<UpdateUserPhoneConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserRoutingProfileAsync(
            UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserRoutingProfileAsync(
            UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest,
            AsyncHandler<UpdateUserRoutingProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserSecurityProfilesAsync(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserSecurityProfilesAsync(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest,
            AsyncHandler<UpdateUserSecurityProfilesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
