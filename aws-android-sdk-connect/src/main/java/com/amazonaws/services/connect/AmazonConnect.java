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

package com.amazonaws.services.connect;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect
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
 * <note>
 * <p>
 * Working with contact flows? Check out the <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
 * >Amazon Connect Flow language</a>.
 * </p>
 * </note>
 **/
public interface AmazonConnect {

    /**
     * Overrides the default endpoint for this client
     * ("https://connect.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "connect.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://connect.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "connect.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://connect.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonConnect#setEndpoint(String)}, sets the
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
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
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
    void associateApprovedOrigin(AssociateApprovedOriginRequest associateApprovedOriginRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void associateBot(AssociateBotRequest associateBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon
     * Connect uses the vocabulary in post-call and real-time analysis sessions
     * for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return associateDefaultVocabularyResult The response from the
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
    AssociateDefaultVocabularyResult associateDefaultVocabulary(
            AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return associateInstanceStorageConfigResult The response from the
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
    AssociateInstanceStorageConfigResult associateInstanceStorageConfig(
            AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void associateLambdaFunction(AssociateLambdaFunctionRequest associateLambdaFunctionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex bot.
     * </p>
     * 
     * @param associateLexBotRequest
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
    void associateLexBot(AssociateLexBotRequest associateLexBotRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void associateQueueQuickConnects(
            AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
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
    void associateRoutingProfileQueues(
            AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return associateSecurityKeyResult The response from the
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
    AssociateSecurityKeyResult associateSecurityKey(
            AssociateSecurityKeyRequest associateSecurityKeyRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return createAgentStatusResult The response from the CreateAgentStatus
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
    CreateAgentStatusResult createAgentStatus(CreateAgentStatusRequest createAgentStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a contact flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return createContactFlowResult The response from the CreateContactFlow
     *         service method, as returned by Amazon Connect.
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
    CreateContactFlowResult createContactFlow(CreateContactFlowRequest createContactFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a contact flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return createContactFlowModuleResult The response from the
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
    CreateContactFlowModuleResult createContactFlowModule(
            CreateContactFlowModuleRequest createContactFlowModuleRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createHoursOfOperationResult The response from the
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
    CreateHoursOfOperationResult createHoursOfOperation(
            CreateHoursOfOperationRequest createHoursOfOperationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createInstanceResult The response from the CreateInstance service
     *         method, as returned by Amazon Connect.
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
    CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon
     * Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return createIntegrationAssociationResult The response from the
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
    CreateIntegrationAssociationResult createIntegrationAssociation(
            CreateIntegrationAssociationRequest createIntegrationAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQueueRequest
     * @return createQueueResult The response from the CreateQueue service
     *         method, as returned by Amazon Connect.
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
    CreateQueueResult createQueue(CreateQueueRequest createQueueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return createQuickConnectResult The response from the CreateQuickConnect
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
    CreateQuickConnectResult createQuickConnect(CreateQuickConnectRequest createQuickConnectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return createRoutingProfileResult The response from the
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
    CreateRoutingProfileResult createRoutingProfile(
            CreateRoutingProfileRequest createRoutingProfileRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return createSecurityProfileResult The response from the
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
    CreateSecurityProfileResult createSecurityProfile(
            CreateSecurityProfileRequest createSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return createUseCaseResult The response from the CreateUseCase service
     *         method, as returned by Amazon Connect.
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
    CreateUseCaseResult createUseCase(CreateUseCaseRequest createUseCaseRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon Connect.
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
    CreateUserResult createUser(CreateUserRequest createUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return createUserHierarchyGroupResult The response from the
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
    CreateUserHierarchyGroupResult createUserHierarchyGroup(
            CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance.
     * You can set a custom vocabulary to be your default vocabulary for a given
     * language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return createVocabularyResult The response from the CreateVocabulary
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
    CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a contact flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
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
    void deleteContactFlow(DeleteContactFlowRequest deleteContactFlowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified contact flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return deleteContactFlowModuleResult The response from the
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
    DeleteContactFlowModuleResult deleteContactFlowModule(
            DeleteContactFlowModuleRequest deleteContactFlowModuleRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteHoursOfOperation(DeleteHoursOfOperationRequest deleteHoursOfOperationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteInstance(DeleteInstanceRequest deleteInstanceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon
     * Connect instance. The association must not have any use cases associated
     * with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
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
    void deleteIntegrationAssociation(
            DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
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
    void deleteQuickConnect(DeleteQuickConnectRequest deleteQuickConnectRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteSecurityProfile(DeleteSecurityProfileRequest deleteSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
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
    void deleteUseCase(DeleteUseCaseRequest deleteUseCaseRequest) throws AmazonClientException,
            AmazonServiceException;

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
    void deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with
     * any agents or have any active child groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
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
    void deleteUserHierarchyGroup(DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return deleteVocabularyResult The response from the DeleteVocabulary
     *         service method, as returned by Amazon Connect.
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
    DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeAgentStatusResult The response from the
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
    DescribeAgentStatusResult describeAgentStatus(
            DescribeAgentStatusRequest describeAgentStatusRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * </important>
     * 
     * @param describeContactRequest
     * @return describeContactResult The response from the DescribeContact
     *         service method, as returned by Amazon Connect.
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
    DescribeContactResult describeContact(DescribeContactRequest describeContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return describeContactFlowResult The response from the
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
    DescribeContactFlowResult describeContactFlow(
            DescribeContactFlowRequest describeContactFlowRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the specified contact flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return describeContactFlowModuleResult The response from the
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
    DescribeContactFlowModuleResult describeContactFlowModule(
            DescribeContactFlowModuleRequest describeContactFlowModuleRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeHoursOfOperationResult The response from the
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
    DescribeHoursOfOperationResult describeHoursOfOperation(
            DescribeHoursOfOperationRequest describeHoursOfOperationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeInstanceResult The response from the DescribeInstance
     *         service method, as returned by Amazon Connect.
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
    DescribeInstanceResult describeInstance(DescribeInstanceRequest describeInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeInstanceAttributeResult The response from the
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
    DescribeInstanceAttributeResult describeInstanceAttribute(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeInstanceStorageConfigResult The response from the
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
    DescribeInstanceStorageConfigResult describeInstanceStorageConfig(
            DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeQueueResult The response from the DescribeQueue service
     *         method, as returned by Amazon Connect.
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
    DescribeQueueResult describeQueue(DescribeQueueRequest describeQueueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return describeQuickConnectResult The response from the
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
    DescribeQuickConnectResult describeQuickConnect(
            DescribeQuickConnectRequest describeQuickConnectRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return describeRoutingProfileResult The response from the
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
    DescribeRoutingProfileResult describeRoutingProfile(
            DescribeRoutingProfileRequest describeRoutingProfileRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeSecurityProfileResult The response from the
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
    DescribeSecurityProfileResult describeSecurityProfile(
            DescribeSecurityProfileRequest describeSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the
     * console (it’s the final part of the ARN). The console does not display
     * the user IDs. Instead, list the users and note the IDs provided in the
     * output.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by Amazon Connect.
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
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return describeUserHierarchyGroupResult The response from the
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
    DescribeUserHierarchyGroupResult describeUserHierarchyGroup(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return describeUserHierarchyStructureResult The response from the
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
    DescribeUserHierarchyStructureResult describeUserHierarchyStructure(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return describeVocabularyResult The response from the DescribeVocabulary
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
    DescribeVocabularyResult describeVocabulary(DescribeVocabularyRequest describeVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateApprovedOrigin(
            DisassociateApprovedOriginRequest disassociateApprovedOriginRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateBot(DisassociateBotRequest disassociateBotRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateInstanceStorageConfig(
            DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the
     * relevant contact flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
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
    void disassociateLambdaFunction(
            DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateLexBot(DisassociateLexBotRequest disassociateLexBotRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateQueueQuickConnects(
            DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
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
    void disassociateRoutingProfileQueues(
            DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateSecurityKey(DisassociateSecurityKeyRequest disassociateSecurityKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return getContactAttributesResult The response from the
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
    GetContactAttributesResult getContactAttributes(
            GetContactAttributesRequest getContactAttributesRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return getCurrentMetricDataResult The response from the
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
    GetCurrentMetricDataResult getCurrentMetricData(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return getFederationTokenResult The response from the GetFederationToken
     *         service method, as returned by Amazon Connect.
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
    GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getMetricDataResult The response from the GetMetricData service
     *         method, as returned by Amazon Connect.
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
    GetMetricDataResult getMetricData(GetMetricDataRequest getMetricDataRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listAgentStatusesResult The response from the ListAgentStatuses
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
    ListAgentStatusesResult listAgentStatuses(ListAgentStatusesRequest listAgentStatusesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listApprovedOriginsResult The response from the
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
    ListApprovedOriginsResult listApprovedOrigins(
            ListApprovedOriginsRequest listApprovedOriginsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all
     * the Amazon Lex bots currently associated with the instance.
     * </p>
     * 
     * @param listBotsRequest
     * @return listBotsResult The response from the ListBots service method, as
     *         returned by Amazon Connect.
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
    ListBotsResult listBots(ListBotsRequest listBotsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides information about the contact flow modules for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return listContactFlowModulesResult The response from the
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
    ListContactFlowModulesResult listContactFlowModules(
            ListContactFlowModulesRequest listContactFlowModulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about the contact flows for the specified Amazon
     * Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about contact flows, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html"
     * >Contact Flows</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return listContactFlowsResult The response from the ListContactFlows
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
    ListContactFlowsResult listContactFlows(ListContactFlowsRequest listContactFlowsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listContactReferencesResult The response from the
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
    ListContactReferencesResult listContactReferences(
            ListContactReferencesRequest listContactReferencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return listDefaultVocabulariesResult The response from the
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
    ListDefaultVocabulariesResult listDefaultVocabularies(
            ListDefaultVocabulariesRequest listDefaultVocabulariesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listHoursOfOperationsResult The response from the
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
    ListHoursOfOperationsResult listHoursOfOperations(
            ListHoursOfOperationsRequest listHoursOfOperationsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listInstanceAttributesResult The response from the
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
    ListInstanceAttributesResult listInstanceAttributes(
            ListInstanceAttributesRequest listInstanceAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listInstanceStorageConfigsResult The response from the
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
    ListInstanceStorageConfigsResult listInstanceStorageConfigs(
            ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listInstancesResult The response from the ListInstances service
     *         method, as returned by Amazon Connect.
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
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource
     * associations for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return listIntegrationAssociationsResult The response from the
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
    ListIntegrationAssociationsResult listIntegrationAssociations(
            ListIntegrationAssociationsRequest listIntegrationAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the
     * dropdown options in the relevant contact flow blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return listLambdaFunctionsResult The response from the
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
    ListLambdaFunctionsResult listLambdaFunctions(
            ListLambdaFunctionsRequest listLambdaFunctionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex bots currently associated
     * with the instance.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return listLexBotsResult The response from the ListLexBots service
     *         method, as returned by Amazon Connect.
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
    ListLexBotsResult listLexBots(ListLexBotsRequest listLexBotsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * 
     * @param listPhoneNumbersRequest
     * @return listPhoneNumbersResult The response from the ListPhoneNumbers
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
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return listPromptsResult The response from the ListPrompts service
     *         method, as returned by Amazon Connect.
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
    ListPromptsResult listPrompts(ListPromptsRequest listPromptsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listQueueQuickConnectsResult The response from the
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
    ListQueueQuickConnectsResult listQueueQuickConnects(
            ListQueueQuickConnectsRequest listQueueQuickConnectsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by Amazon Connect.
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
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return listQuickConnectsResult The response from the ListQuickConnects
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
    ListQuickConnectsResult listQuickConnects(ListQuickConnectsRequest listQuickConnectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return listRoutingProfileQueuesResult The response from the
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
    ListRoutingProfileQueuesResult listRoutingProfileQueues(
            ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listRoutingProfilesResult The response from the
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
    ListRoutingProfilesResult listRoutingProfiles(
            ListRoutingProfilesRequest listRoutingProfilesRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return listSecurityKeysResult The response from the ListSecurityKeys
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
    ListSecurityKeysResult listSecurityKeys(ListSecurityKeysRequest listSecurityKeysRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listSecurityProfilePermissionsResult The response from the
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
    ListSecurityProfilePermissionsResult listSecurityProfilePermissions(
            ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listSecurityProfilesResult The response from the
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
    ListSecurityProfilesResult listSecurityProfiles(
            ListSecurityProfilesRequest listSecurityProfilesRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return listTagsForResourceResult The response from the
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
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest <p>
     *            Provides summary information about the use cases for the
     *            specified integration association.
     *            </p>
     * @return listUseCasesResult The response from the ListUseCases service
     *         method, as returned by Amazon Connect.
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
    ListUseCasesResult listUseCases(ListUseCasesRequest listUseCasesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listUserHierarchyGroupsResult The response from the
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
    ListUserHierarchyGroupsResult listUserHierarchyGroups(
            ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Connect.
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
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended
     * using SuspendContactRecording, this API resumes recording the call.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return resumeContactRecordingResult The response from the
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
    ResumeContactRecordingResult resumeContactRecording(
            ResumeContactRecordingRequest resumeContactRecordingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using
     * <code>State</code>, <code>NameStartsWith</code>, and
     * <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return searchVocabulariesResult The response from the SearchVocabularies
     *         service method, as returned by Amazon Connect.
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
    SearchVocabulariesResult searchVocabularies(SearchVocabulariesRequest searchVocabulariesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates a contact flow to start a new chat for the customer. Response
     * of this API provides a token required to obtain credentials from the <a
     * href=
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
     * @return startChatContactResult The response from the StartChatContact
     *         service method, as returned by Amazon Connect.
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
    StartChatContactResult startChatContact(StartChatContactRequest startChatContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts recording the contact when the agent joins the call.
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
     * @return startContactRecordingResult The response from the
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
    StartContactRecordingResult startContactRecording(
            StartContactRecordingRequest startContactRecordingRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return startContactStreamingResult The response from the
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
    StartContactStreamingResult startContactStreaming(
            StartContactStreamingRequest startContactStreamingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the contact
     * flow. It performs the actions in the contact flow that's specified (in
     * <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not
     * dial the contact. If the contact flow places an outbound call to a
     * contact, and then puts the contact in queue, the call is then routed to
     * the agent, like any other inbound case.
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
     * service quota increase request. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @return startOutboundVoiceContactResult The response from the
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
    StartOutboundVoiceContactResult startOutboundVoiceContact(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates a contact flow to start a new task.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return startTaskContactResult The response from the StartTaskContact
     *         service method, as returned by Amazon Connect.
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
    StartTaskContactResult startTaskContact(StartTaskContactRequest startTaskContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @return stopContactResult The response from the StopContact service
     *         method, as returned by Amazon Connect.
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
    StopContactResult stopContact(StopContactRequest stopContactRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return stopContactRecordingResult The response from the
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
    StopContactRecordingResult stopContactRecording(
            StopContactRecordingRequest stopContactRecordingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message
     * streaming on that contact, call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return stopContactStreamingResult The response from the
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
    StopContactStreamingResult stopContactStreaming(
            StopContactStreamingRequest stopContactStreamingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording the call.
     * For example, you might suspend the call recording while collecting
     * sensitive information, such as a credit card number. Then use
     * ResumeContactRecording to restart recording.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence
     * in the final recording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return suspendContactRecordingResult The response from the
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
    SuspendContactRecordingResult suspendContactRecording(
            SuspendContactRecordingRequest suspendContactRecordingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource types are users, routing profiles, queues, quick
     * connects, contact flows, agent status, and hours of operation.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
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
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
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
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

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
    void updateAgentStatus(UpdateAgentStatusRequest updateAgentStatusRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateContactResult The response from the UpdateContact service
     *         method, as returned by Amazon Connect.
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
    UpdateContactResult updateContact(UpdateContactRequest updateContactRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * then deleted. For information about CTR retention and the maximum size of
     * the CTR attributes section, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for
     * contacts that occurred prior to the release of the API, which was
     * September 12, 2018. You can update attributes only for contacts that
     * started after the release of the API. If you attempt to update attributes
     * for a contact that occurred prior to the release of the API, a 400 error
     * is returned. This applies also to queued callbacks that were initiated
     * prior to the release of the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return updateContactAttributesResult The response from the
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
    UpdateContactAttributesResult updateContactAttributes(
            UpdateContactAttributesRequest updateContactAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
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
    void updateContactFlowContent(UpdateContactFlowContentRequest updateContactFlowContentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates metadata about specified contact flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
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
    void updateContactFlowMetadata(UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates specified contact flow module for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return updateContactFlowModuleContentResult The response from the
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
    UpdateContactFlowModuleContentResult updateContactFlowModuleContent(
            UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates metadata about specified contact flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return updateContactFlowModuleMetadataResult The response from the
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
    UpdateContactFlowModuleMetadataResult updateContactFlowModuleMetadata(
            UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
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
    void updateContactFlowName(UpdateContactFlowNameRequest updateContactFlowNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return updateContactScheduleResult The response from the
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
    UpdateContactScheduleResult updateContactSchedule(
            UpdateContactScheduleRequest updateContactScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateHoursOfOperation(UpdateHoursOfOperationRequest updateHoursOfOperationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateInstanceAttribute(UpdateInstanceAttributeRequest updateInstanceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateInstanceStorageConfig(
            UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateQueueHoursOfOperation(
            UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateQueueMaxContacts(UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateQueueName(UpdateQueueNameRequest updateQueueNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow
     * for a specified queue.
     * </p>
     * 
     * @param updateQueueOutboundCallerConfigRequest
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
    void updateQueueOutboundCallerConfig(
            UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateQueueStatus(UpdateQueueStatusRequest updateQueueStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
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
    void updateQuickConnectConfig(UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts
     * the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
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
    void updateQuickConnectName(UpdateQuickConnectNameRequest updateQuickConnectNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel
     * (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
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
    void updateRoutingProfileConcurrency(
            UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
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
    void updateRoutingProfileDefaultOutboundQueue(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and description of a routing profile. The request
     * accepts the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
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
    void updateRoutingProfileName(UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing
     * profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
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
    void updateRoutingProfileQueues(
            UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateSecurityProfile(UpdateSecurityProfileRequest updateSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
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
    void updateUserHierarchy(UpdateUserHierarchyRequest updateUserHierarchyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
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
    void updateUserHierarchyGroupName(
            UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user
     * hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
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
    void updateUserHierarchyStructure(
            UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateUserIdentityInfo(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
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
    void updateUserPhoneConfig(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
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
    void updateUserRoutingProfile(UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
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
    void updateUserSecurityProfiles(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest)
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
