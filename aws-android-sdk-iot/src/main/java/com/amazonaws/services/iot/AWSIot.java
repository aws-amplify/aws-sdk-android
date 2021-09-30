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

package com.amazonaws.services.iot;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.iot.model.*;

/**
 * Interface for accessing AWS IoT <fullname>IoT</fullname>
 * <p>
 * IoT provides secure, bi-directional communication between Internet-connected
 * devices (such as sensors, actuators, embedded devices, or smart appliances)
 * and the Amazon Web Services cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * device (Registry), configure logging, and create and manage policies and
 * credentials to authenticate devices.
 * </p>
 * <p>
 * The service endpoints that expose this API are listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html">Amazon Web
 * Services IoT Core Endpoints and Quotas</a>. You must use the endpoint for the
 * region that has the resources you want to access.
 * </p>
 * <p>
 * The service name used by <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Amazon Web Services Signature Version 4</a> to sign the request is:
 * <i>execute-api</i>.
 * </p>
 * <p>
 * For more information about how IoT works, see the <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
 * </p>
 * <p>
 * For information about how to use the credentials provider for IoT, see <a
 * href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/authorizing-direct-aws.html"
 * >Authorizing Direct Calls to Amazon Web Services Services</a>.
 * </p>
 **/
public interface AWSIot {

    /**
     * Overrides the default endpoint for this client
     * ("https://iot.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "iot.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://iot.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "iot.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://iot.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSIot#setEndpoint(String)}, sets the regional
     * endpoint for this client's service calls. Callers can use this method to
     * control which AWS region they want to work with.
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
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AcceptCertificateTransfer</a> action.
     * </p>
     * 
     * @param acceptCertificateTransferRequest <p>
     *            The input for the AcceptCertificateTransfer operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws TransferAlreadyCompletedException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void acceptCertificateTransfer(AcceptCertificateTransferRequest acceptCertificateTransferRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a thing to a billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AddThingToBillingGroup</a> action.
     * </p>
     * 
     * @param addThingToBillingGroupRequest
     * @return addThingToBillingGroupResult The response from the
     *         AddThingToBillingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    AddThingToBillingGroupResult addThingToBillingGroup(
            AddThingToBillingGroupRequest addThingToBillingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a thing to a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AddThingToThingGroup</a> action.
     * </p>
     * 
     * @param addThingToThingGroupRequest
     * @return addThingToThingGroupResult The response from the
     *         AddThingToThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    AddThingToThingGroupResult addThingToThingGroup(
            AddThingToThingGroupRequest addThingToThingGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates a group with a continuous job. The following criteria must be
     * met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The job must have been created with the <code>targetSelection</code>
     * field set to "CONTINUOUS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The job status must currently be "IN_PROGRESS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of targets associated with a job must not exceed 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AssociateTargetsWithJob</a> action.
     * </p>
     * 
     * @param associateTargetsWithJobRequest
     * @return associateTargetsWithJobResult The response from the
     *         AssociateTargetsWithJob service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    AssociateTargetsWithJobResult associateTargetsWithJob(
            AssociateTargetsWithJobRequest associateTargetsWithJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachPolicy</a> action.
     * </p>
     * 
     * @param attachPolicyRequest
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void attachPolicy(AttachPolicyRequest attachPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated. Please use <a>AttachPolicy</a>
     * instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachPrincipalPolicy</a> action.
     * </p>
     * 
     * @param attachPrincipalPolicyRequest <p>
     *            The input for the AttachPrincipalPolicy operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    @Deprecated
    void attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a Device Defender security profile with a thing group or this
     * account. Each thing group or account can have up to five security
     * profiles associated with it.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachSecurityProfile</a> action.
     * </p>
     * 
     * @param attachSecurityProfileRequest
     * @return attachSecurityProfileResult The response from the
     *         AttachSecurityProfile service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    AttachSecurityProfileResult attachSecurityProfile(
            AttachSecurityProfileRequest attachSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches the specified principal to the specified thing. A principal can
     * be X.509 certificates, IAM users, groups, and roles, Amazon Cognito
     * identities or federated identities.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >AttachThingPrincipal</a> action.
     * </p>
     * 
     * @param attachThingPrincipalRequest <p>
     *            The input for the AttachThingPrincipal operation.
     *            </p>
     * @return attachThingPrincipalResult The response from the
     *         AttachThingPrincipal service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    AttachThingPrincipalResult attachThingPrincipal(
            AttachThingPrincipalRequest attachThingPrincipalRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Cancels a mitigation action task that is in progress. If the task is not
     * in progress, an InvalidRequestException occurs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelAuditMitigationActionsTask</a> action.
     * </p>
     * 
     * @param cancelAuditMitigationActionsTaskRequest
     * @return cancelAuditMitigationActionsTaskResult The response from the
     *         CancelAuditMitigationActionsTask service method, as returned by
     *         AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CancelAuditMitigationActionsTaskResult cancelAuditMitigationActionsTask(
            CancelAuditMitigationActionsTaskRequest cancelAuditMitigationActionsTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels an audit that is in progress. The audit can be either scheduled
     * or on demand. If the audit isn't in progress, an
     * "InvalidRequestException" occurs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelAuditTask</a> action.
     * </p>
     * 
     * @param cancelAuditTaskRequest
     * @return cancelAuditTaskResult The response from the CancelAuditTask
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CancelAuditTaskResult cancelAuditTask(CancelAuditTaskRequest cancelAuditTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to
     * cancel a transfer. (Transfer destinations can use
     * <a>RejectCertificateTransfer</a> instead.) After transfer, IoT returns
     * the certificate to the source account in the INACTIVE state. After the
     * destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate
     * changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelCertificateTransfer</a> action.
     * </p>
     * 
     * @param cancelCertificateTransferRequest <p>
     *            The input for the CancelCertificateTransfer operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws TransferAlreadyCompletedException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void cancelCertificateTransfer(CancelCertificateTransferRequest cancelCertificateTransferRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a Device Defender ML Detect mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelDetectMitigationActionsTask</a> action.
     * </p>
     * 
     * @param cancelDetectMitigationActionsTaskRequest
     * @return cancelDetectMitigationActionsTaskResult The response from the
     *         CancelDetectMitigationActionsTask service method, as returned by
     *         AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CancelDetectMitigationActionsTaskResult cancelDetectMitigationActionsTask(
            CancelDetectMitigationActionsTaskRequest cancelDetectMitigationActionsTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelJob</a> action.
     * </p>
     * 
     * @param cancelJobRequest
     * @return cancelJobResult The response from the CancelJob service method,
     *         as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Cancels the execution of a job for a given thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CancelJobExecution</a> action.
     * </p>
     * 
     * @param cancelJobExecutionRequest
     * @throws InvalidRequestException
     * @throws InvalidStateTransitionException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws VersionConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void cancelJobExecution(CancelJobExecutionRequest cancelJobExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Clears the default authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ClearDefaultAuthorizer</a> action.
     * </p>
     * 
     * @param clearDefaultAuthorizerRequest
     * @return clearDefaultAuthorizerResult The response from the
     *         ClearDefaultAuthorizer service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ClearDefaultAuthorizerResult clearDefaultAuthorizer(
            ClearDefaultAuthorizerRequest clearDefaultAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Confirms a topic rule destination. When you create a rule requiring a
     * destination, IoT sends a confirmation message to the endpoint or base
     * address you specify. The message includes a token which you pass back
     * when calling <code>ConfirmTopicRuleDestination</code> to confirm that you
     * own or have access to the endpoint.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ConfirmTopicRuleDestination</a> action.
     * </p>
     * 
     * @param confirmTopicRuleDestinationRequest
     * @return confirmTopicRuleDestinationResult The response from the
     *         ConfirmTopicRuleDestination service method, as returned by AWS
     *         IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ConfirmTopicRuleDestinationResult confirmTopicRuleDestination(
            ConfirmTopicRuleDestinationRequest confirmTopicRuleDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Device Defender audit suppression.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateAuditSuppression</a> action.
     * </p>
     * 
     * @param createAuditSuppressionRequest
     * @return createAuditSuppressionResult The response from the
     *         CreateAuditSuppression service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateAuditSuppressionResult createAuditSuppression(
            CreateAuditSuppressionRequest createAuditSuppressionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateAuthorizer</a> action.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return createAuthorizerResult The response from the CreateAuthorizer
     *         service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateBillingGroup</a> action.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return createBillingGroupResult The response from the CreateBillingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateBillingGroupResult createBillingGroup(CreateBillingGroupRequest createBillingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note:</b> The CSR must include a public key that is either an RSA key
     * with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST
     * P-384 curves.
     * </p>
     * <p>
     * <b>Note:</b> Reusing the same certificate signing request (CSR) results
     * in a distinct certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateCertificateFromCsr</a> action.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory,
     * copying multiple .csr files into that directory, and then specifying that
     * directory on the command line. The following commands show how to create
     * a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR
     * file name to the aws iot create-certificate-from-csr Amazon Web Services
     * CLI command to create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be
     * run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in
     * my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest <p>
     *            The input for the CreateCertificateFromCsr operation.
     *            </p>
     * @return createCertificateFromCsrResult The response from the
     *         CreateCertificateFromCsr service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateCertificateFromCsrResult createCertificateFromCsr(
            CreateCertificateFromCsrRequest createCertificateFromCsrRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use this API to define a Custom Metric published by your devices to
     * Device Defender.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateCustomMetric</a> action.
     * </p>
     * 
     * @param createCustomMetricRequest
     * @return createCustomMetricResult The response from the CreateCustomMetric
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateCustomMetricResult createCustomMetric(CreateCustomMetricRequest createCustomMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Create a dimension that you can use to limit the scope of a metric used
     * in a security profile for IoT Device Defender. For example, using a
     * <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the
     * metric only to MQTT topics whose name match the pattern specified in the
     * dimension.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateDimension</a> action.
     * </p>
     * 
     * @param createDimensionRequest
     * @return createDimensionResult The response from the CreateDimension
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateDimensionResult createDimension(CreateDimensionRequest createDimensionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a domain configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateDomainConfiguration</a> action.
     * </p>
     * 
     * @param createDomainConfigurationRequest
     * @return createDomainConfigurationResult The response from the
     *         CreateDomainConfiguration service method, as returned by AWS IoT.
     * @throws LimitExceededException
     * @throws CertificateValidationException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateDomainConfigurationResult createDomainConfiguration(
            CreateDomainConfigurationRequest createDomainConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a dynamic thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateDynamicThingGroup</a> action.
     * </p>
     * 
     * @param createDynamicThingGroupRequest
     * @return createDynamicThingGroupResult The response from the
     *         CreateDynamicThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidQueryException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateDynamicThingGroupResult createDynamicThingGroup(
            CreateDynamicThingGroupRequest createDynamicThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a fleet metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateFleetMetric</a> action.
     * </p>
     * 
     * @param createFleetMetricRequest
     * @return createFleetMetricResult The response from the CreateFleetMetric
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws InvalidAggregationException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateFleetMetricResult createFleetMetric(CreateFleetMetricRequest createFleetMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateJob</a> action.
     * </p>
     * 
     * @param createJobRequest
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a job template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateJobTemplate</a> action.
     * </p>
     * 
     * @param createJobTemplateRequest
     * @return createJobTemplateResult The response from the CreateJobTemplate
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateJobTemplateResult createJobTemplate(CreateJobTemplateRequest createJobTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the
     * issued public key. You can also call
     * <code>CreateKeysAndCertificate</code> over MQTT from a device, for more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-wo-cert.html#provision-mqtt-api"
     * >Provisioning MQTT API</a>.
     * </p>
     * <p>
     * <b>Note</b> This is the only time IoT issues the private key for this
     * certificate, so it is important to keep it in a secure location.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateKeysAndCertificate</a> action.
     * </p>
     * 
     * @param createKeysAndCertificateRequest <p>
     *            The input for the CreateKeysAndCertificate operation.
     *            </p>
     *            <p>
     *            Requires permission to access the <a href=
     *            "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     *            >CreateKeysAndCertificateRequest</a> action.
     *            </p>
     * @return createKeysAndCertificateResult The response from the
     *         CreateKeysAndCertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateKeysAndCertificateResult createKeysAndCertificate(
            CreateKeysAndCertificateRequest createKeysAndCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Defines an action that can be applied to audit findings by using
     * StartAuditMitigationActionsTask. Only certain types of mitigation actions
     * can be applied to specific check names. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-mitigation-actions.html"
     * >Mitigation actions</a>. Each mitigation action can apply only one type
     * of change.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateMitigationAction</a> action.
     * </p>
     * 
     * @param createMitigationActionRequest
     * @return createMitigationActionResult The response from the
     *         CreateMitigationAction service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateMitigationActionResult createMitigationAction(
            CreateMitigationActionRequest createMitigationActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an IoT OTA update on a target group of things or groups.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateOTAUpdate</a> action.
     * </p>
     * 
     * @param createOTAUpdateRequest
     * @return createOTAUpdateResult The response from the CreateOTAUpdate
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateOTAUpdateResult createOTAUpdate(CreateOTAUpdateRequest createOTAUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation
     * creates a policy version with a version identifier of <b>1</b> and sets
     * <b>1</b> as the policy's default version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreatePolicy</a> action.
     * </p>
     * 
     * @param createPolicyRequest <p>
     *            The input for the CreatePolicy operation.
     *            </p>
     * @return createPolicyResult The response from the CreatePolicy service
     *         method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException
     * @throws MalformedPolicyException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new version of the specified IoT policy. To update a policy,
     * create a new policy version. A managed policy can have up to five
     * versions. If the policy has five versions, you must use
     * <a>DeletePolicyVersion</a> to delete an existing version before you
     * create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version (that is, the version that
     * is in effect for the certificates to which the policy is attached).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreatePolicyVersion</a> action.
     * </p>
     * 
     * @param createPolicyVersionRequest <p>
     *            The input for the CreatePolicyVersion operation.
     *            </p>
     * @return createPolicyVersionResult The response from the
     *         CreatePolicyVersion service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws MalformedPolicyException
     * @throws VersionsLimitExceededException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreatePolicyVersionResult createPolicyVersion(
            CreatePolicyVersionRequest createPolicyVersionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a provisioning claim.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateProvisioningClaim</a> action.
     * </p>
     * 
     * @param createProvisioningClaimRequest
     * @return createProvisioningClaimResult The response from the
     *         CreateProvisioningClaim service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateProvisioningClaimResult createProvisioningClaim(
            CreateProvisioningClaimRequest createProvisioningClaimRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a fleet provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateProvisioningTemplate</a> action.
     * </p>
     * 
     * @param createProvisioningTemplateRequest
     * @return createProvisioningTemplateResult The response from the
     *         CreateProvisioningTemplate service method, as returned by AWS
     *         IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateProvisioningTemplateResult createProvisioningTemplate(
            CreateProvisioningTemplateRequest createProvisioningTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new version of a fleet provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateProvisioningTemplateVersion</a> action.
     * </p>
     * 
     * @param createProvisioningTemplateVersionRequest
     * @return createProvisioningTemplateVersionResult The response from the
     *         CreateProvisioningTemplateVersion service method, as returned by
     *         AWS IoT.
     * @throws VersionsLimitExceededException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateProvisioningTemplateVersionResult createProvisioningTemplateVersion(
            CreateProvisioningTemplateVersionRequest createProvisioningTemplateVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a role alias.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateRoleAlias</a> action.
     * </p>
     * 
     * @param createRoleAliasRequest
     * @return createRoleAliasResult The response from the CreateRoleAlias
     *         service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateRoleAliasResult createRoleAlias(CreateRoleAliasRequest createRoleAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a scheduled audit that is run at a specified time interval.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateScheduledAudit</a> action.
     * </p>
     * 
     * @param createScheduledAuditRequest
     * @return createScheduledAuditResult The response from the
     *         CreateScheduledAudit service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateScheduledAuditResult createScheduledAudit(
            CreateScheduledAuditRequest createScheduledAuditRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateSecurityProfile</a> action.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return createSecurityProfileResult The response from the
     *         CreateSecurityProfile service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateSecurityProfileResult createSecurityProfile(
            CreateSecurityProfileRequest createSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a stream for delivering one or more large files in chunks over
     * MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT
     * messages from a source like S3. You can have one or more files associated
     * with a stream.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateStream</a> action.
     * </p>
     * 
     * @param createStreamRequest
     * @return createStreamResult The response from the CreateStream service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateStreamResult createStream(CreateStreamRequest createStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a thing record in the registry. If this call is made multiple
     * times using the same thing name and configuration, the call will succeed.
     * If this call is made with the same thing name but different configuration
     * a <code>ResourceAlreadyExistsException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-authorization.html"
     * >Authorization</a> for information about authorizing control plane
     * actions.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateThing</a> action.
     * </p>
     * 
     * @param createThingRequest <p>
     *            The input for the CreateThing operation.
     *            </p>
     * @return createThingResult The response from the CreateThing service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateThingResult createThing(CreateThingRequest createThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Create a thing group.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-authorization.html"
     * >Authorization</a> for information about authorizing control plane
     * actions.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateThingGroup</a> action.
     * </p>
     * 
     * @param createThingGroupRequest
     * @return createThingGroupResult The response from the CreateThingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateThingGroupResult createThingGroup(CreateThingGroupRequest createThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateThingType</a> action.
     * </p>
     * 
     * @param createThingTypeRequest <p>
     *            The input for the CreateThingType operation.
     *            </p>
     * @return createThingTypeResult The response from the CreateThingType
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateThingTypeResult createThingType(CreateThingTypeRequest createThingTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any user
     * who has permission to create rules will be able to access data processed
     * by the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateTopicRule</a> action.
     * </p>
     * 
     * @param createTopicRuleRequest <p>
     *            The input for the CreateTopicRule operation.
     *            </p>
     * @throws SqlParseException
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void createTopicRule(CreateTopicRuleRequest createTopicRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a topic rule destination. The destination must be confirmed prior
     * to use.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CreateTopicRuleDestination</a> action.
     * </p>
     * 
     * @param createTopicRuleDestinationRequest
     * @return createTopicRuleDestinationResult The response from the
     *         CreateTopicRuleDestination service method, as returned by AWS
     *         IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateTopicRuleDestinationResult createTopicRuleDestination(
            CreateTopicRuleDestinationRequest createTopicRuleDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restores the default settings for Device Defender audits for this
     * account. Any configuration data you entered is deleted and all audit
     * checks are reset to disabled.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteAccountAuditConfiguration</a> action.
     * </p>
     * 
     * @param deleteAccountAuditConfigurationRequest
     * @return deleteAccountAuditConfigurationResult The response from the
     *         DeleteAccountAuditConfiguration service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteAccountAuditConfigurationResult deleteAccountAuditConfiguration(
            DeleteAccountAuditConfigurationRequest deleteAccountAuditConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Device Defender audit suppression.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteAuditSuppression</a> action.
     * </p>
     * 
     * @param deleteAuditSuppressionRequest
     * @return deleteAuditSuppressionResult The response from the
     *         DeleteAuditSuppression service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteAuditSuppressionResult deleteAuditSuppression(
            DeleteAuditSuppressionRequest deleteAuditSuppressionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteAuthorizer</a> action.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return deleteAuthorizerResult The response from the DeleteAuthorizer
     *         service method, as returned by AWS IoT.
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteAuthorizerResult deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteBillingGroup</a> action.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return deleteBillingGroupResult The response from the DeleteBillingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteBillingGroupResult deleteBillingGroup(DeleteBillingGroupRequest deleteBillingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a registered CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteCACertificate</a> action.
     * </p>
     * 
     * @param deleteCACertificateRequest <p>
     *            Input for the DeleteCACertificate operation.
     *            </p>
     * @return deleteCACertificateResult The response from the
     *         DeleteCACertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws CertificateStateException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteCACertificateResult deleteCACertificate(
            DeleteCACertificateRequest deleteCACertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy or IoT thing attached
     * to it or if its status is set to ACTIVE. To delete a certificate, first
     * use the <a>DetachPolicy</a> action to detach all policies. Next, use the
     * <a>UpdateCertificate</a> action to set the certificate to the INACTIVE
     * status.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteCertificate</a> action.
     * </p>
     * 
     * @param deleteCertificateRequest <p>
     *            The input for the DeleteCertificate operation.
     *            </p>
     * @throws CertificateStateException
     * @throws DeleteConflictException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteCertificate(DeleteCertificateRequest deleteCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Device Defender detect custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteCustomMetric</a> action.
     * </p>
     * <note>
     * <p>
     * Before you can delete a custom metric, you must first remove the custom
     * metric from all security profiles it's a part of. The security profile
     * associated with the custom metric can be found using the <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_ListSecurityProfiles.html"
     * >ListSecurityProfiles</a> API with <code>metricName</code> set to your
     * custom metric name.
     * </p>
     * </note>
     * 
     * @param deleteCustomMetricRequest
     * @return deleteCustomMetricResult The response from the DeleteCustomMetric
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteCustomMetricResult deleteCustomMetric(DeleteCustomMetricRequest deleteCustomMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified dimension from your Amazon Web Services accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteDimension</a> action.
     * </p>
     * 
     * @param deleteDimensionRequest
     * @return deleteDimensionResult The response from the DeleteDimension
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteDimensionResult deleteDimension(DeleteDimensionRequest deleteDimensionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified domain configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteDomainConfiguration</a> action.
     * </p>
     * 
     * @param deleteDomainConfigurationRequest
     * @return deleteDomainConfigurationResult The response from the
     *         DeleteDomainConfiguration service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteDomainConfigurationResult deleteDomainConfiguration(
            DeleteDomainConfigurationRequest deleteDomainConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a dynamic thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteDynamicThingGroup</a> action.
     * </p>
     * 
     * @param deleteDynamicThingGroupRequest
     * @return deleteDynamicThingGroupResult The response from the
     *         DeleteDynamicThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteDynamicThingGroupResult deleteDynamicThingGroup(
            DeleteDynamicThingGroupRequest deleteDynamicThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified fleet metric. Returns successfully with no error if
     * the deletion is successful or you specify a fleet metric that doesn't
     * exist.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteFleetMetric</a> action.
     * </p>
     * 
     * @param deleteFleetMetricRequest
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws VersionConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteFleetMetric(DeleteFleetMetricRequest deleteFleetMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a job and its related job executions.
     * </p>
     * <p>
     * Deleting a job may take time, depending on the number of job executions
     * created for the job and various other factors. While the job is being
     * deleted, the status of the job will be shown as "DELETION_IN_PROGRESS".
     * Attempting to delete or cancel a job whose status is already
     * "DELETION_IN_PROGRESS" will result in an error.
     * </p>
     * <p>
     * Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or
     * a LimitExceededException will occur.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteJob</a> action.
     * </p>
     * 
     * @param deleteJobRequest
     * @throws InvalidRequestException
     * @throws InvalidStateTransitionException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteJob(DeleteJobRequest deleteJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a job execution.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteJobExecution</a> action.
     * </p>
     * 
     * @param deleteJobExecutionRequest
     * @throws InvalidRequestException
     * @throws InvalidStateTransitionException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteJobExecution(DeleteJobExecutionRequest deleteJobExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified job template.
     * </p>
     * 
     * @param deleteJobTemplateRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteJobTemplate(DeleteJobTemplateRequest deleteJobTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a defined mitigation action from your Amazon Web Services
     * accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteMitigationAction</a> action.
     * </p>
     * 
     * @param deleteMitigationActionRequest
     * @return deleteMitigationActionResult The response from the
     *         DeleteMitigationAction service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteMitigationActionResult deleteMitigationAction(
            DeleteMitigationActionRequest deleteMitigationActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete an OTA update.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteOTAUpdate</a> action.
     * </p>
     * 
     * @param deleteOTAUpdateRequest
     * @return deleteOTAUpdateResult The response from the DeleteOTAUpdate
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws VersionConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteOTAUpdateResult deleteOTAUpdate(DeleteOTAUpdateRequest deleteOTAUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is
     * attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the <a>DeletePolicyVersion</a> action to delete
     * all non-default versions of the policy; use the <a>DetachPolicy</a>
     * action to detach the policy from any certificate; and then use the
     * DeletePolicy action to delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     * <note>
     * <p>
     * Because of the distributed nature of Amazon Web Services, it can take up
     * to five minutes after a policy is detached before it's ready to be
     * deleted.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeletePolicy</a> action.
     * </p>
     * 
     * @param deletePolicyRequest <p>
     *            The input for the DeletePolicy operation.
     *            </p>
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deletePolicy(DeletePolicyRequest deletePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete
     * the default version of a policy using this action. To delete the default
     * version of a policy, use <a>DeletePolicy</a>. To find out which version
     * of a policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeletePolicyVersion</a> action.
     * </p>
     * 
     * @param deletePolicyVersionRequest <p>
     *            The input for the DeletePolicyVersion operation.
     *            </p>
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a fleet provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteProvisioningTemplate</a> action.
     * </p>
     * 
     * @param deleteProvisioningTemplateRequest
     * @return deleteProvisioningTemplateResult The response from the
     *         DeleteProvisioningTemplate service method, as returned by AWS
     *         IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws DeleteConflictException
     * @throws ThrottlingException
     * @throws ConflictingResourceUpdateException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteProvisioningTemplateResult deleteProvisioningTemplate(
            DeleteProvisioningTemplateRequest deleteProvisioningTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a fleet provisioning template version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteProvisioningTemplateVersion</a> action.
     * </p>
     * 
     * @param deleteProvisioningTemplateVersionRequest
     * @return deleteProvisioningTemplateVersionResult The response from the
     *         DeleteProvisioningTemplateVersion service method, as returned by
     *         AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws DeleteConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteProvisioningTemplateVersionResult deleteProvisioningTemplateVersion(
            DeleteProvisioningTemplateVersionRequest deleteProvisioningTemplateVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a CA certificate registration code.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteRegistrationCode</a> action.
     * </p>
     * 
     * @param deleteRegistrationCodeRequest <p>
     *            The input for the DeleteRegistrationCode operation.
     *            </p>
     * @return deleteRegistrationCodeResult The response from the
     *         DeleteRegistrationCode service method, as returned by AWS IoT.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRegistrationCodeResult deleteRegistrationCode(
            DeleteRegistrationCodeRequest deleteRegistrationCodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a role alias
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteRoleAlias</a> action.
     * </p>
     * 
     * @param deleteRoleAliasRequest
     * @return deleteRoleAliasResult The response from the DeleteRoleAlias
     *         service method, as returned by AWS IoT.
     * @throws DeleteConflictException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteRoleAliasResult deleteRoleAlias(DeleteRoleAliasRequest deleteRoleAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a scheduled audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteScheduledAudit</a> action.
     * </p>
     * 
     * @param deleteScheduledAuditRequest
     * @return deleteScheduledAuditResult The response from the
     *         DeleteScheduledAudit service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteScheduledAuditResult deleteScheduledAudit(
            DeleteScheduledAuditRequest deleteScheduledAuditRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteSecurityProfile</a> action.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return deleteSecurityProfileResult The response from the
     *         DeleteSecurityProfile service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws VersionConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteSecurityProfileResult deleteSecurityProfile(
            DeleteSecurityProfileRequest deleteSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a stream.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteStream</a> action.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return deleteStreamResult The response from the DeleteStream service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws DeleteConflictException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified thing. Returns successfully with no error if the
     * deletion is successful or you specify a thing that doesn't exist.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThing</a> action.
     * </p>
     * 
     * @param deleteThingRequest <p>
     *            The input for the DeleteThing operation.
     *            </p>
     * @return deleteThingResult The response from the DeleteThing service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws VersionConflictException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteThingResult deleteThing(DeleteThingRequest deleteThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingGroup</a> action.
     * </p>
     * 
     * @param deleteThingGroupRequest
     * @return deleteThingGroupResult The response from the DeleteThingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteThingGroupResult deleteThingGroup(DeleteThingGroupRequest deleteThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified thing type. You cannot delete a thing type if it
     * has things associated with it. To delete a thing type, first mark it as
     * deprecated by calling <a>DeprecateThingType</a>, then remove any
     * associated things by calling <a>UpdateThing</a> to change the thing type
     * on any associated thing, and finally use <a>DeleteThingType</a> to delete
     * the thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingType</a> action.
     * </p>
     * 
     * @param deleteThingTypeRequest <p>
     *            The input for the DeleteThingType operation.
     *            </p>
     * @return deleteThingTypeResult The response from the DeleteThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteThingTypeResult deleteThingType(DeleteThingTypeRequest deleteThingTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteTopicRule</a> action.
     * </p>
     * 
     * @param deleteTopicRuleRequest <p>
     *            The input for the DeleteTopicRule operation.
     *            </p>
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a topic rule destination.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteTopicRuleDestination</a> action.
     * </p>
     * 
     * @param deleteTopicRuleDestinationRequest
     * @return deleteTopicRuleDestinationResult The response from the
     *         DeleteTopicRuleDestination service method, as returned by AWS
     *         IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteTopicRuleDestinationResult deleteTopicRuleDestination(
            DeleteTopicRuleDestinationRequest deleteTopicRuleDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a logging level.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteV2LoggingLevel</a> action.
     * </p>
     * 
     * @param deleteV2LoggingLevelRequest
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void deleteV2LoggingLevel(DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deprecates a thing type. You can not associate new things with deprecated
     * thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeprecateThingType</a> action.
     * </p>
     * 
     * @param deprecateThingTypeRequest <p>
     *            The input for the DeprecateThingType operation.
     *            </p>
     * @return deprecateThingTypeResult The response from the DeprecateThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeprecateThingTypeResult deprecateThingType(DeprecateThingTypeRequest deprecateThingTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the Device Defender audit settings for this
     * account. Settings include how audit notifications are sent and which
     * audit checks are enabled or disabled.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAccountAuditConfiguration</a> action.
     * </p>
     * 
     * @param describeAccountAuditConfigurationRequest
     * @return describeAccountAuditConfigurationResult The response from the
     *         DescribeAccountAuditConfiguration service method, as returned by
     *         AWS IoT.
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeAccountAuditConfigurationResult describeAccountAuditConfiguration(
            DescribeAccountAuditConfigurationRequest describeAccountAuditConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a single audit finding. Properties include the
     * reason for noncompliance, the severity of the issue, and the start time
     * when the audit that returned the finding.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAuditFinding</a> action.
     * </p>
     * 
     * @param describeAuditFindingRequest
     * @return describeAuditFindingResult The response from the
     *         DescribeAuditFinding service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeAuditFindingResult describeAuditFinding(
            DescribeAuditFindingRequest describeAuditFindingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about an audit mitigation task that is used to apply
     * mitigation actions to a set of audit findings. Properties include the
     * actions being applied, the audit checks to which they're being applied,
     * the task status, and aggregated task statistics.
     * </p>
     * 
     * @param describeAuditMitigationActionsTaskRequest
     * @return describeAuditMitigationActionsTaskResult The response from the
     *         DescribeAuditMitigationActionsTask service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeAuditMitigationActionsTaskResult describeAuditMitigationActionsTask(
            DescribeAuditMitigationActionsTaskRequest describeAuditMitigationActionsTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a Device Defender audit suppression.
     * </p>
     * 
     * @param describeAuditSuppressionRequest
     * @return describeAuditSuppressionResult The response from the
     *         DescribeAuditSuppression service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeAuditSuppressionResult describeAuditSuppression(
            DescribeAuditSuppressionRequest describeAuditSuppressionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a Device Defender audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAuditTask</a> action.
     * </p>
     * 
     * @param describeAuditTaskRequest
     * @return describeAuditTaskResult The response from the DescribeAuditTask
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeAuditTaskResult describeAuditTask(DescribeAuditTaskRequest describeAuditTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeAuthorizer</a> action.
     * </p>
     * 
     * @param describeAuthorizerRequest
     * @return describeAuthorizerResult The response from the DescribeAuthorizer
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeAuthorizerResult describeAuthorizer(DescribeAuthorizerRequest describeAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeBillingGroup</a> action.
     * </p>
     * 
     * @param describeBillingGroupRequest
     * @return describeBillingGroupResult The response from the
     *         DescribeBillingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeBillingGroupResult describeBillingGroup(
            DescribeBillingGroupRequest describeBillingGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes a registered CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeCACertificate</a> action.
     * </p>
     * 
     * @param describeCACertificateRequest <p>
     *            The input for the DescribeCACertificate operation.
     *            </p>
     * @return describeCACertificateResult The response from the
     *         DescribeCACertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeCACertificateResult describeCACertificate(
            DescribeCACertificateRequest describeCACertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeCertificate</a> action.
     * </p>
     * 
     * @param describeCertificateRequest <p>
     *            The input for the DescribeCertificate operation.
     *            </p>
     * @return describeCertificateResult The response from the
     *         DescribeCertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeCertificateResult describeCertificate(
            DescribeCertificateRequest describeCertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a Device Defender detect custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeCustomMetric</a> action.
     * </p>
     * 
     * @param describeCustomMetricRequest
     * @return describeCustomMetricResult The response from the
     *         DescribeCustomMetric service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeCustomMetricResult describeCustomMetric(
            DescribeCustomMetricRequest describeCustomMetricRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the default authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDefaultAuthorizer</a> action.
     * </p>
     * 
     * @param describeDefaultAuthorizerRequest
     * @return describeDefaultAuthorizerResult The response from the
     *         DescribeDefaultAuthorizer service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeDefaultAuthorizerResult describeDefaultAuthorizer(
            DescribeDefaultAuthorizerRequest describeDefaultAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a Device Defender ML Detect mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDetectMitigationActionsTask</a> action.
     * </p>
     * 
     * @param describeDetectMitigationActionsTaskRequest
     * @return describeDetectMitigationActionsTaskResult The response from the
     *         DescribeDetectMitigationActionsTask service method, as returned
     *         by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeDetectMitigationActionsTaskResult describeDetectMitigationActionsTask(
            DescribeDetectMitigationActionsTaskRequest describeDetectMitigationActionsTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides details about a dimension that is defined in your Amazon Web
     * Services accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDimension</a> action.
     * </p>
     * 
     * @param describeDimensionRequest
     * @return describeDimensionResult The response from the DescribeDimension
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeDimensionResult describeDimension(DescribeDimensionRequest describeDimensionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets summary information about a domain configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeDomainConfiguration</a> action.
     * </p>
     * 
     * @param describeDomainConfigurationRequest
     * @return describeDomainConfigurationResult The response from the
     *         DescribeDomainConfiguration service method, as returned by AWS
     *         IoT.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeDomainConfigurationResult describeDomainConfiguration(
            DescribeDomainConfigurationRequest describeDomainConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a unique endpoint specific to the Amazon Web Services account
     * making the call.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeEndpoint</a> action.
     * </p>
     * 
     * @param describeEndpointRequest <p>
     *            The input for the DescribeEndpoint operation.
     *            </p>
     * @return describeEndpointResult The response from the DescribeEndpoint
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes event configurations.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeEventConfigurations</a> action.
     * </p>
     * 
     * @param describeEventConfigurationsRequest
     * @return describeEventConfigurationsResult The response from the
     *         DescribeEventConfigurations service method, as returned by AWS
     *         IoT.
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeEventConfigurationsResult describeEventConfigurations(
            DescribeEventConfigurationsRequest describeEventConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified fleet metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeFleetMetric</a> action.
     * </p>
     * 
     * @param describeFleetMetricRequest
     * @return describeFleetMetricResult The response from the
     *         DescribeFleetMetric service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeFleetMetricResult describeFleetMetric(
            DescribeFleetMetricRequest describeFleetMetricRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes a search index.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeIndex</a> action.
     * </p>
     * 
     * @param describeIndexRequest
     * @return describeIndexResult The response from the DescribeIndex service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeIndexResult describeIndex(DescribeIndexRequest describeIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeJob</a> action.
     * </p>
     * 
     * @param describeJobRequest
     * @return describeJobResult The response from the DescribeJob service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a job execution.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeJobExecution</a> action.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return describeJobExecutionResult The response from the
     *         DescribeJobExecution service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeJobExecutionResult describeJobExecution(
            DescribeJobExecutionRequest describeJobExecutionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a job template.
     * </p>
     * 
     * @param describeJobTemplateRequest
     * @return describeJobTemplateResult The response from the
     *         DescribeJobTemplate service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeJobTemplateResult describeJobTemplate(
            DescribeJobTemplateRequest describeJobTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeMitigationAction</a> action.
     * </p>
     * 
     * @param describeMitigationActionRequest
     * @return describeMitigationActionResult The response from the
     *         DescribeMitigationAction service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeMitigationActionResult describeMitigationAction(
            DescribeMitigationActionRequest describeMitigationActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a fleet provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeProvisioningTemplate</a> action.
     * </p>
     * 
     * @param describeProvisioningTemplateRequest
     * @return describeProvisioningTemplateResult The response from the
     *         DescribeProvisioningTemplate service method, as returned by AWS
     *         IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeProvisioningTemplateResult describeProvisioningTemplate(
            DescribeProvisioningTemplateRequest describeProvisioningTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a fleet provisioning template version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeProvisioningTemplateVersion</a> action.
     * </p>
     * 
     * @param describeProvisioningTemplateVersionRequest
     * @return describeProvisioningTemplateVersionResult The response from the
     *         DescribeProvisioningTemplateVersion service method, as returned
     *         by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeProvisioningTemplateVersionResult describeProvisioningTemplateVersion(
            DescribeProvisioningTemplateVersionRequest describeProvisioningTemplateVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a role alias.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeRoleAlias</a> action.
     * </p>
     * 
     * @param describeRoleAliasRequest
     * @return describeRoleAliasResult The response from the DescribeRoleAlias
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeRoleAliasResult describeRoleAlias(DescribeRoleAliasRequest describeRoleAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a scheduled audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeScheduledAudit</a> action.
     * </p>
     * 
     * @param describeScheduledAuditRequest
     * @return describeScheduledAuditResult The response from the
     *         DescribeScheduledAudit service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeScheduledAuditResult describeScheduledAudit(
            DescribeScheduledAuditRequest describeScheduledAuditRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeSecurityProfile</a> action.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return describeSecurityProfileResult The response from the
     *         DescribeSecurityProfile service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeSecurityProfileResult describeSecurityProfile(
            DescribeSecurityProfileRequest describeSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a stream.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeStream</a> action.
     * </p>
     * 
     * @param describeStreamRequest
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThing</a> action.
     * </p>
     * 
     * @param describeThingRequest <p>
     *            The input for the DescribeThing operation.
     *            </p>
     * @return describeThingResult The response from the DescribeThing service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeThingResult describeThing(DescribeThingRequest describeThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describe a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThingGroup</a> action.
     * </p>
     * 
     * @param describeThingGroupRequest
     * @return describeThingGroupResult The response from the DescribeThingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeThingGroupResult describeThingGroup(DescribeThingGroupRequest describeThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a bulk thing provisioning task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThingRegistrationTask</a> action.
     * </p>
     * 
     * @param describeThingRegistrationTaskRequest
     * @return describeThingRegistrationTaskResult The response from the
     *         DescribeThingRegistrationTask service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeThingRegistrationTaskResult describeThingRegistrationTask(
            DescribeThingRegistrationTaskRequest describeThingRegistrationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified thing type.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeThingType</a> action.
     * </p>
     * 
     * @param describeThingTypeRequest <p>
     *            The input for the DescribeThingType operation.
     *            </p>
     * @return describeThingTypeResult The response from the DescribeThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeThingTypeResult describeThingType(DescribeThingTypeRequest describeThingTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches a policy from the specified target.
     * </p>
     * <note>
     * <p>
     * Because of the distributed nature of Amazon Web Services, it can take up
     * to five minutes after a policy is detached before it's ready to be
     * deleted.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachPolicy</a> action.
     * </p>
     * 
     * @param detachPolicyRequest
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void detachPolicy(DetachPolicyRequest detachPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * <note>
     * <p>
     * This action is deprecated. Please use <a>DetachPolicy</a> instead.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachPrincipalPolicy</a> action.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest <p>
     *            The input for the DetachPrincipalPolicy operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    @Deprecated
    void detachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a Device Defender security profile from a thing group or
     * from this account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachSecurityProfile</a> action.
     * </p>
     * 
     * @param detachSecurityProfileRequest
     * @return detachSecurityProfileResult The response from the
     *         DetachSecurityProfile service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DetachSecurityProfileResult detachSecurityProfile(
            DetachSecurityProfileRequest detachSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches the specified principal from the specified thing. A principal
     * can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito
     * identities or federated identities.
     * </p>
     * <note>
     * <p>
     * This call is asynchronous. It might take several seconds for the
     * detachment to propagate.
     * </p>
     * </note>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DetachThingPrincipal</a> action.
     * </p>
     * 
     * @param detachThingPrincipalRequest <p>
     *            The input for the DetachThingPrincipal operation.
     *            </p>
     * @return detachThingPrincipalResult The response from the
     *         DetachThingPrincipal service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DetachThingPrincipalResult detachThingPrincipal(
            DetachThingPrincipalRequest detachThingPrincipalRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Disables the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DisableTopicRule</a> action.
     * </p>
     * 
     * @param disableTopicRuleRequest <p>
     *            The input for the DisableTopicRuleRequest operation.
     *            </p>
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void disableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >EnableTopicRule</a> action.
     * </p>
     * 
     * @param enableTopicRuleRequest <p>
     *            The input for the EnableTopicRuleRequest operation.
     *            </p>
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void enableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a Device Defender's ML Detect Security Profile training model's
     * status.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetBehaviorModelTrainingSummaries</a> action.
     * </p>
     * 
     * @param getBehaviorModelTrainingSummariesRequest
     * @return getBehaviorModelTrainingSummariesResult The response from the
     *         GetBehaviorModelTrainingSummaries service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetBehaviorModelTrainingSummariesResult getBehaviorModelTrainingSummaries(
            GetBehaviorModelTrainingSummariesRequest getBehaviorModelTrainingSummariesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Aggregates on indexed data with search queries pertaining to particular
     * fields.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetBucketsAggregation</a> action.
     * </p>
     * 
     * @param getBucketsAggregationRequest
     * @return getBucketsAggregationResult The response from the
     *         GetBucketsAggregation service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws InvalidAggregationException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetBucketsAggregationResult getBucketsAggregation(
            GetBucketsAggregationRequest getBucketsAggregationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the approximate count of unique values that match the query.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetCardinality</a> action.
     * </p>
     * 
     * @param getCardinalityRequest
     * @return getCardinalityResult The response from the GetCardinality service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws InvalidAggregationException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetCardinalityResult getCardinality(GetCardinalityRequest getCardinalityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of the policies that have an effect on the authorization
     * behavior of the specified device when it connects to the IoT device
     * gateway.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetEffectivePolicies</a> action.
     * </p>
     * 
     * @param getEffectivePoliciesRequest
     * @return getEffectivePoliciesResult The response from the
     *         GetEffectivePolicies service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetEffectivePoliciesResult getEffectivePolicies(
            GetEffectivePoliciesRequest getEffectivePoliciesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the indexing configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetIndexingConfiguration</a> action.
     * </p>
     * 
     * @param getIndexingConfigurationRequest
     * @return getIndexingConfigurationResult The response from the
     *         GetIndexingConfiguration service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetIndexingConfigurationResult getIndexingConfiguration(
            GetIndexingConfigurationRequest getIndexingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a job document.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetJobDocument</a> action.
     * </p>
     * 
     * @param getJobDocumentRequest
     * @return getJobDocumentResult The response from the GetJobDocument service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetJobDocumentResult getJobDocument(GetJobDocumentRequest getJobDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use
     * <code>GetV2LoggingOptions</code> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetLoggingOptions</a> action.
     * </p>
     * 
     * @param getLoggingOptionsRequest <p>
     *            The input for the GetLoggingOptions operation.
     *            </p>
     * @return getLoggingOptionsResult The response from the GetLoggingOptions
     *         service method, as returned by AWS IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an OTA update.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetOTAUpdate</a> action.
     * </p>
     * 
     * @param getOTAUpdateRequest
     * @return getOTAUpdateResult The response from the GetOTAUpdate service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetOTAUpdateResult getOTAUpdate(GetOTAUpdateRequest getOTAUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Groups the aggregated values that match the query into percentile
     * groupings. The default percentile groupings are: 1,5,25,50,75,95,99,
     * although you can specify your own when you call
     * <code>GetPercentiles</code>. This function returns a value for each
     * percentile group specified (or the default percentile groupings). The
     * percentile group "1" contains the aggregated field value that occurs in
     * approximately one percent of the values that match the query. The
     * percentile group "5" contains the aggregated field value that occurs in
     * approximately five percent of the values that match the query, and so on.
     * The result is an approximation, the more values that match the query, the
     * more accurate the percentile values.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetPercentiles</a> action.
     * </p>
     * 
     * @param getPercentilesRequest
     * @return getPercentilesResult The response from the GetPercentiles service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws InvalidAggregationException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetPercentilesResult getPercentiles(GetPercentilesRequest getPercentilesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified policy with the policy document of
     * the default version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetPolicy</a> action.
     * </p>
     * 
     * @param getPolicyRequest <p>
     *            The input for the GetPolicy operation.
     *            </p>
     * @return getPolicyResult The response from the GetPolicy service method,
     *         as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetPolicyVersion</a> action.
     * </p>
     * 
     * @param getPolicyVersionRequest <p>
     *            The input for the GetPolicyVersion operation.
     *            </p>
     * @return getPolicyVersionResult The response from the GetPolicyVersion
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a registration code used to register a CA certificate with IoT.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetRegistrationCode</a> action.
     * </p>
     * 
     * @param getRegistrationCodeRequest <p>
     *            The input to the GetRegistrationCode operation.
     *            </p>
     * @return getRegistrationCodeResult The response from the
     *         GetRegistrationCode service method, as returned by AWS IoT.
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetRegistrationCodeResult getRegistrationCode(
            GetRegistrationCodeRequest getRegistrationCodeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the count, average, sum, minimum, maximum, sum of squares,
     * variance, and standard deviation for the specified aggregated field. If
     * the aggregation field is of type <code>String</code>, only the count
     * statistic is returned.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetStatistics</a> action.
     * </p>
     * 
     * @param getStatisticsRequest
     * @return getStatisticsResult The response from the GetStatistics service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws InvalidAggregationException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetStatisticsResult getStatistics(GetStatisticsRequest getStatisticsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetTopicRule</a> action.
     * </p>
     * 
     * @param getTopicRuleRequest <p>
     *            The input for the GetTopicRule operation.
     *            </p>
     * @return getTopicRuleResult The response from the GetTopicRule service
     *         method, as returned by AWS IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetTopicRuleResult getTopicRule(GetTopicRuleRequest getTopicRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a topic rule destination.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetTopicRuleDestination</a> action.
     * </p>
     * 
     * @param getTopicRuleDestinationRequest
     * @return getTopicRuleDestinationResult The response from the
     *         GetTopicRuleDestination service method, as returned by AWS IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetTopicRuleDestinationResult getTopicRuleDestination(
            GetTopicRuleDestinationRequest getTopicRuleDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the fine grained logging options.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetV2LoggingOptions</a> action.
     * </p>
     * 
     * @param getV2LoggingOptionsRequest
     * @return getV2LoggingOptionsResult The response from the
     *         GetV2LoggingOptions service method, as returned by AWS IoT.
     * @throws InternalException
     * @throws NotConfiguredException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    GetV2LoggingOptionsResult getV2LoggingOptions(
            GetV2LoggingOptionsRequest getV2LoggingOptionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the active violations for a given Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListActiveViolations</a> action.
     * </p>
     * 
     * @param listActiveViolationsRequest
     * @return listActiveViolationsResult The response from the
     *         ListActiveViolations service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListActiveViolationsResult listActiveViolations(
            ListActiveViolationsRequest listActiveViolationsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the policies attached to the specified thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAttachedPolicies</a> action.
     * </p>
     * 
     * @param listAttachedPoliciesRequest
     * @return listAttachedPoliciesResult The response from the
     *         ListAttachedPolicies service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAttachedPoliciesResult listAttachedPolicies(
            ListAttachedPoliciesRequest listAttachedPoliciesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the findings (results) of a Device Defender audit or of the audits
     * performed during a specified time period. (Findings are retained for 90
     * days.)
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditFindings</a> action.
     * </p>
     * 
     * @param listAuditFindingsRequest
     * @return listAuditFindingsResult The response from the ListAuditFindings
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAuditFindingsResult listAuditFindings(ListAuditFindingsRequest listAuditFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the status of audit mitigation action tasks that were executed.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditMitigationActionsExecutions</a> action.
     * </p>
     * 
     * @param listAuditMitigationActionsExecutionsRequest
     * @return listAuditMitigationActionsExecutionsResult The response from the
     *         ListAuditMitigationActionsExecutions service method, as returned
     *         by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAuditMitigationActionsExecutionsResult listAuditMitigationActionsExecutions(
            ListAuditMitigationActionsExecutionsRequest listAuditMitigationActionsExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of audit mitigation action tasks that match the specified
     * filters.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditMitigationActionsTasks</a> action.
     * </p>
     * 
     * @param listAuditMitigationActionsTasksRequest
     * @return listAuditMitigationActionsTasksResult The response from the
     *         ListAuditMitigationActionsTasks service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAuditMitigationActionsTasksResult listAuditMitigationActionsTasks(
            ListAuditMitigationActionsTasksRequest listAuditMitigationActionsTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists your Device Defender audit listings.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditSuppressions</a> action.
     * </p>
     * 
     * @param listAuditSuppressionsRequest
     * @return listAuditSuppressionsResult The response from the
     *         ListAuditSuppressions service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAuditSuppressionsResult listAuditSuppressions(
            ListAuditSuppressionsRequest listAuditSuppressionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the Device Defender audits that have been performed during a given
     * time period.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuditTasks</a> action.
     * </p>
     * 
     * @param listAuditTasksRequest
     * @return listAuditTasksResult The response from the ListAuditTasks service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAuditTasksResult listAuditTasks(ListAuditTasksRequest listAuditTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the authorizers registered in your account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListAuthorizers</a> action.
     * </p>
     * 
     * @param listAuthorizersRequest
     * @return listAuthorizersResult The response from the ListAuthorizers
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListAuthorizersResult listAuthorizers(ListAuthorizersRequest listAuthorizersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the billing groups you have created.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListBillingGroups</a> action.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return listBillingGroupsResult The response from the ListBillingGroups
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListBillingGroupsResult listBillingGroups(ListBillingGroupsRequest listBillingGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the CA certificates registered for your Amazon Web Services
     * account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the
     * returned marker to retrieve additional results.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCACertificates</a> action.
     * </p>
     * 
     * @param listCACertificatesRequest <p>
     *            Input for the ListCACertificates operation.
     *            </p>
     * @return listCACertificatesResult The response from the ListCACertificates
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListCACertificatesResult listCACertificates(ListCACertificatesRequest listCACertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the certificates registered in your Amazon Web Services account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the
     * returned marker to retrieve additional results.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCertificates</a> action.
     * </p>
     * 
     * @param listCertificatesRequest <p>
     *            The input for the ListCertificates operation.
     *            </p>
     * @return listCertificatesResult The response from the ListCertificates
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the device certificates signed by the specified CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCertificatesByCA</a> action.
     * </p>
     * 
     * @param listCertificatesByCARequest <p>
     *            The input to the ListCertificatesByCA operation.
     *            </p>
     * @return listCertificatesByCAResult The response from the
     *         ListCertificatesByCA service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListCertificatesByCAResult listCertificatesByCA(
            ListCertificatesByCARequest listCertificatesByCARequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists your Device Defender detect custom metrics.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListCustomMetrics</a> action.
     * </p>
     * 
     * @param listCustomMetricsRequest
     * @return listCustomMetricsResult The response from the ListCustomMetrics
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListCustomMetricsResult listCustomMetrics(ListCustomMetricsRequest listCustomMetricsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists mitigation actions executions for a Device Defender ML Detect
     * Security Profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDetectMitigationActionsExecutions</a> action.
     * </p>
     * 
     * @param listDetectMitigationActionsExecutionsRequest
     * @return listDetectMitigationActionsExecutionsResult The response from the
     *         ListDetectMitigationActionsExecutions service method, as returned
     *         by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListDetectMitigationActionsExecutionsResult listDetectMitigationActionsExecutions(
            ListDetectMitigationActionsExecutionsRequest listDetectMitigationActionsExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List of Device Defender ML Detect mitigation actions tasks.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDetectMitigationActionsTasks</a> action.
     * </p>
     * 
     * @param listDetectMitigationActionsTasksRequest
     * @return listDetectMitigationActionsTasksResult The response from the
     *         ListDetectMitigationActionsTasks service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListDetectMitigationActionsTasksResult listDetectMitigationActionsTasks(
            ListDetectMitigationActionsTasksRequest listDetectMitigationActionsTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the set of dimensions that are defined for your Amazon Web Services
     * accounts.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDimensions</a> action.
     * </p>
     * 
     * @param listDimensionsRequest
     * @return listDimensionsResult The response from the ListDimensions service
     *         method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListDimensionsResult listDimensions(ListDimensionsRequest listDimensionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of domain configurations for the user. This list is sorted
     * alphabetically by domain configuration name.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListDomainConfigurations</a> action.
     * </p>
     * 
     * @param listDomainConfigurationsRequest
     * @return listDomainConfigurationsResult The response from the
     *         ListDomainConfigurations service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListDomainConfigurationsResult listDomainConfigurations(
            ListDomainConfigurationsRequest listDomainConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all your fleet metrics.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListFleetMetrics</a> action.
     * </p>
     * 
     * @param listFleetMetricsRequest
     * @return listFleetMetricsResult The response from the ListFleetMetrics
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListFleetMetricsResult listFleetMetrics(ListFleetMetricsRequest listFleetMetricsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the search indices.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListIndices</a> action.
     * </p>
     * 
     * @param listIndicesRequest
     * @return listIndicesResult The response from the ListIndices service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListIndicesResult listIndices(ListIndicesRequest listIndicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the job executions for a job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobExecutionsForJob</a> action.
     * </p>
     * 
     * @param listJobExecutionsForJobRequest
     * @return listJobExecutionsForJobResult The response from the
     *         ListJobExecutionsForJob service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListJobExecutionsForJobResult listJobExecutionsForJob(
            ListJobExecutionsForJobRequest listJobExecutionsForJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the job executions for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobExecutionsForThing</a> action.
     * </p>
     * 
     * @param listJobExecutionsForThingRequest
     * @return listJobExecutionsForThingResult The response from the
     *         ListJobExecutionsForThing service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListJobExecutionsForThingResult listJobExecutionsForThing(
            ListJobExecutionsForThingRequest listJobExecutionsForThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of job templates.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobTemplates</a> action.
     * </p>
     * 
     * @param listJobTemplatesRequest
     * @return listJobTemplatesResult The response from the ListJobTemplates
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListJobTemplatesResult listJobTemplates(ListJobTemplatesRequest listJobTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists jobs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListJobs</a> action.
     * </p>
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a list of all mitigation actions that match the specified filter
     * criteria.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListMitigationActions</a> action.
     * </p>
     * 
     * @param listMitigationActionsRequest
     * @return listMitigationActionsResult The response from the
     *         ListMitigationActions service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListMitigationActionsResult listMitigationActions(
            ListMitigationActionsRequest listMitigationActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists OTA updates.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListOTAUpdates</a> action.
     * </p>
     * 
     * @param listOTAUpdatesRequest
     * @return listOTAUpdatesResult The response from the ListOTAUpdates service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListOTAUpdatesResult listOTAUpdates(ListOTAUpdatesRequest listOTAUpdatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists certificates that are being transferred but not yet accepted.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListOutgoingCertificates</a> action.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest <p>
     *            The input to the ListOutgoingCertificates operation.
     *            </p>
     * @return listOutgoingCertificatesResult The response from the
     *         ListOutgoingCertificates service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListOutgoingCertificatesResult listOutgoingCertificates(
            ListOutgoingCertificatesRequest listOutgoingCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists your policies.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPolicies</a> action.
     * </p>
     * 
     * @param listPoliciesRequest <p>
     *            The input for the ListPolicies operation.
     *            </p>
     * @return listPoliciesResult The response from the ListPolicies service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated. Please use
     * <a>ListTargetsForPolicy</a> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPolicyPrincipals</a> action.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest <p>
     *            The input for the ListPolicyPrincipals operation.
     *            </p>
     * @return listPolicyPrincipalsResult The response from the
     *         ListPolicyPrincipals service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    @Deprecated
    ListPolicyPrincipalsResult listPolicyPrincipals(
            ListPolicyPrincipalsRequest listPolicyPrincipalsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the versions of the specified policy and identifies the default
     * version.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPolicyVersions</a> action.
     * </p>
     * 
     * @param listPolicyVersionsRequest <p>
     *            The input for the ListPolicyVersions operation.
     *            </p>
     * @return listPolicyVersionsResult The response from the ListPolicyVersions
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Cognito identity, the ID must be in <a href=
     * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This action is deprecated. Please use
     * <a>ListAttachedPolicies</a> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPrincipalPolicies</a> action.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest <p>
     *            The input for the ListPrincipalPolicies operation.
     *            </p>
     * @return listPrincipalPoliciesResult The response from the
     *         ListPrincipalPolicies service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    @Deprecated
    ListPrincipalPoliciesResult listPrincipalPolicies(
            ListPrincipalPoliciesRequest listPrincipalPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the things associated with the specified principal. A principal can
     * be X.509 certificates, IAM users, groups, and roles, Amazon Cognito
     * identities or federated identities.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListPrincipalThings</a> action.
     * </p>
     * 
     * @param listPrincipalThingsRequest <p>
     *            The input for the ListPrincipalThings operation.
     *            </p>
     * @return listPrincipalThingsResult The response from the
     *         ListPrincipalThings service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListPrincipalThingsResult listPrincipalThings(
            ListPrincipalThingsRequest listPrincipalThingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * A list of fleet provisioning template versions.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListProvisioningTemplateVersions</a> action.
     * </p>
     * 
     * @param listProvisioningTemplateVersionsRequest
     * @return listProvisioningTemplateVersionsResult The response from the
     *         ListProvisioningTemplateVersions service method, as returned by
     *         AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListProvisioningTemplateVersionsResult listProvisioningTemplateVersions(
            ListProvisioningTemplateVersionsRequest listProvisioningTemplateVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the fleet provisioning templates in your Amazon Web Services
     * account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListProvisioningTemplates</a> action.
     * </p>
     * 
     * @param listProvisioningTemplatesRequest
     * @return listProvisioningTemplatesResult The response from the
     *         ListProvisioningTemplates service method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListProvisioningTemplatesResult listProvisioningTemplates(
            ListProvisioningTemplatesRequest listProvisioningTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the role aliases registered in your account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListRoleAliases</a> action.
     * </p>
     * 
     * @param listRoleAliasesRequest
     * @return listRoleAliasesResult The response from the ListRoleAliases
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListRoleAliasesResult listRoleAliases(ListRoleAliasesRequest listRoleAliasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of your scheduled audits.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListScheduledAudits</a> action.
     * </p>
     * 
     * @param listScheduledAuditsRequest
     * @return listScheduledAuditsResult The response from the
     *         ListScheduledAudits service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListScheduledAuditsResult listScheduledAudits(
            ListScheduledAuditsRequest listScheduledAuditsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the Device Defender security profiles you've created. You can
     * filter security profiles by dimension or custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListSecurityProfiles</a> action.
     * </p>
     * <note>
     * <p>
     * <code>dimensionName</code> and <code>metricName</code> cannot be used in
     * the same request.
     * </p>
     * </note>
     * 
     * @param listSecurityProfilesRequest
     * @return listSecurityProfilesResult The response from the
     *         ListSecurityProfiles service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListSecurityProfilesResult listSecurityProfiles(
            ListSecurityProfilesRequest listSecurityProfilesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the Device Defender security profiles attached to a target (thing
     * group).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListSecurityProfilesForTarget</a> action.
     * </p>
     * 
     * @param listSecurityProfilesForTargetRequest
     * @return listSecurityProfilesForTargetResult The response from the
     *         ListSecurityProfilesForTarget service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListSecurityProfilesForTargetResult listSecurityProfilesForTarget(
            ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of the streams in your Amazon Web Services account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListStreams</a> action.
     * </p>
     * 
     * @param listStreamsRequest
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTagsForResource</a> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * List targets for the specified policy.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTargetsForPolicy</a> action.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return listTargetsForPolicyResult The response from the
     *         ListTargetsForPolicy service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTargetsForPolicyResult listTargetsForPolicy(
            ListTargetsForPolicyRequest listTargetsForPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the targets (thing groups) associated with a given Device Defender
     * security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTargetsForSecurityProfile</a> action.
     * </p>
     * 
     * @param listTargetsForSecurityProfileRequest
     * @return listTargetsForSecurityProfileResult The response from the
     *         ListTargetsForSecurityProfile service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTargetsForSecurityProfileResult listTargetsForSecurityProfile(
            ListTargetsForSecurityProfileRequest listTargetsForSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the thing groups in your account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingGroups</a> action.
     * </p>
     * 
     * @param listThingGroupsRequest
     * @return listThingGroupsResult The response from the ListThingGroups
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingGroupsResult listThingGroups(ListThingGroupsRequest listThingGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingGroupsForThing</a> action.
     * </p>
     * 
     * @param listThingGroupsForThingRequest
     * @return listThingGroupsForThingResult The response from the
     *         ListThingGroupsForThing service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingGroupsForThingResult listThingGroupsForThing(
            ListThingGroupsForThingRequest listThingGroupsForThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the principals associated with the specified thing. A principal can
     * be X.509 certificates, IAM users, groups, and roles, Amazon Cognito
     * identities or federated identities.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingPrincipals</a> action.
     * </p>
     * 
     * @param listThingPrincipalsRequest <p>
     *            The input for the ListThingPrincipal operation.
     *            </p>
     * @return listThingPrincipalsResult The response from the
     *         ListThingPrincipals service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingPrincipalsResult listThingPrincipals(
            ListThingPrincipalsRequest listThingPrincipalsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Information about the thing registration tasks.
     * </p>
     * 
     * @param listThingRegistrationTaskReportsRequest
     * @return listThingRegistrationTaskReportsResult The response from the
     *         ListThingRegistrationTaskReports service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingRegistrationTaskReportsResult listThingRegistrationTaskReports(
            ListThingRegistrationTaskReportsRequest listThingRegistrationTaskReportsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List bulk thing provisioning tasks.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingRegistrationTasks</a> action.
     * </p>
     * 
     * @param listThingRegistrationTasksRequest
     * @return listThingRegistrationTasksResult The response from the
     *         ListThingRegistrationTasks service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingRegistrationTasksResult listThingRegistrationTasks(
            ListThingRegistrationTasksRequest listThingRegistrationTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the existing thing types.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingTypes</a> action.
     * </p>
     * 
     * @param listThingTypesRequest <p>
     *            The input for the ListThingTypes operation.
     *            </p>
     * @return listThingTypesResult The response from the ListThingTypes service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingTypesResult listThingTypes(ListThingTypesRequest listThingTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b>
     * parameters to filter your things. For example, calling
     * <code>ListThings</code> with attributeName=Color and attributeValue=Red
     * retrieves all things in the registry that contain an attribute
     * <b>Color</b> with the value <b>Red</b>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThings</a> action.
     * </p>
     * <note>
     * <p>
     * You will not be charged for calling this API if an
     * <code>Access denied</code> error is returned. You will also not be
     * charged if no attributes or pagination token was provided in request and
     * no pagination token and no results were returned.
     * </p>
     * </note>
     * 
     * @param listThingsRequest <p>
     *            The input for the ListThings operation.
     *            </p>
     * @return listThingsResult The response from the ListThings service method,
     *         as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingsResult listThings(ListThingsRequest listThingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the things you have added to the given billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingsInBillingGroup</a> action.
     * </p>
     * 
     * @param listThingsInBillingGroupRequest
     * @return listThingsInBillingGroupResult The response from the
     *         ListThingsInBillingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingsInBillingGroupResult listThingsInBillingGroup(
            ListThingsInBillingGroupRequest listThingsInBillingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the things in the specified group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListThingsInThingGroup</a> action.
     * </p>
     * 
     * @param listThingsInThingGroupRequest
     * @return listThingsInThingGroupResult The response from the
     *         ListThingsInThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListThingsInThingGroupResult listThingsInThingGroup(
            ListThingsInThingGroupRequest listThingsInThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the topic rule destinations in your Amazon Web Services
     * account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTopicRuleDestinations</a> action.
     * </p>
     * 
     * @param listTopicRuleDestinationsRequest
     * @return listTopicRuleDestinationsResult The response from the
     *         ListTopicRuleDestinations service method, as returned by AWS IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTopicRuleDestinationsResult listTopicRuleDestinations(
            ListTopicRuleDestinationsRequest listTopicRuleDestinationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTopicRules</a> action.
     * </p>
     * 
     * @param listTopicRulesRequest <p>
     *            The input for the ListTopicRules operation.
     *            </p>
     * @return listTopicRulesResult The response from the ListTopicRules service
     *         method, as returned by AWS IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTopicRulesResult listTopicRules(ListTopicRulesRequest listTopicRulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists logging levels.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListV2LoggingLevels</a> action.
     * </p>
     * 
     * @param listV2LoggingLevelsRequest
     * @return listV2LoggingLevelsResult The response from the
     *         ListV2LoggingLevels service method, as returned by AWS IoT.
     * @throws InternalException
     * @throws NotConfiguredException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListV2LoggingLevelsResult listV2LoggingLevels(
            ListV2LoggingLevelsRequest listV2LoggingLevelsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the Device Defender security profile violations discovered during
     * the given time period. You can use filters to limit the results to those
     * alerts issued for a particular security profile, behavior, or thing
     * (device).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListViolationEvents</a> action.
     * </p>
     * 
     * @param listViolationEventsRequest
     * @return listViolationEventsResult The response from the
     *         ListViolationEvents service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListViolationEventsResult listViolationEvents(
            ListViolationEventsRequest listViolationEventsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Set a verification state and provide a description of that verification
     * state on a violation (detect alarm).
     * </p>
     * 
     * @param putVerificationStateOnViolationRequest
     * @return putVerificationStateOnViolationResult The response from the
     *         PutVerificationStateOnViolation service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    PutVerificationStateOnViolationResult putVerificationStateOnViolation(
            PutVerificationStateOnViolationRequest putVerificationStateOnViolationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a CA certificate with IoT. This CA certificate can then be used
     * to sign device certificates, which can be then registered with IoT. You
     * can register up to 10 CA certificates per Amazon Web Services account
     * that have the same subject field. This enables you to have up to 10
     * certificate authorities sign your device certificates. If you have more
     * than one CA certificate registered, make sure you pass the CA certificate
     * when you register your device certificates with the
     * <a>RegisterCertificate</a> action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RegisterCACertificate</a> action.
     * </p>
     * 
     * @param registerCACertificateRequest <p>
     *            The input to the RegisterCACertificate operation.
     *            </p>
     * @return registerCACertificateResult The response from the
     *         RegisterCACertificate service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException
     * @throws RegistrationCodeValidationException
     * @throws InvalidRequestException
     * @throws CertificateValidationException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    RegisterCACertificateResult registerCACertificate(
            RegisterCACertificateRequest registerCACertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a device certificate with IoT. If you have more than one CA
     * certificate that has the same subject field, you must specify the CA
     * certificate that was used to sign the device certificate being
     * registered.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RegisterCertificate</a> action.
     * </p>
     * 
     * @param registerCertificateRequest <p>
     *            The input to the RegisterCertificate operation.
     *            </p>
     * @return registerCertificateResult The response from the
     *         RegisterCertificate service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException
     * @throws InvalidRequestException
     * @throws CertificateValidationException
     * @throws CertificateStateException
     * @throws CertificateConflictException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    RegisterCertificateResult registerCertificate(
            RegisterCertificateRequest registerCertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Register a certificate that does not have a certificate authority (CA).
     * </p>
     * 
     * @param registerCertificateWithoutCARequest
     * @return registerCertificateWithoutCAResult The response from the
     *         RegisterCertificateWithoutCA service method, as returned by AWS
     *         IoT.
     * @throws ResourceAlreadyExistsException
     * @throws InvalidRequestException
     * @throws CertificateStateException
     * @throws CertificateValidationException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    RegisterCertificateWithoutCAResult registerCertificateWithoutCA(
            RegisterCertificateWithoutCARequest registerCertificateWithoutCARequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions a thing in the device registry. RegisterThing calls other IoT
     * control plane APIs. These calls might exceed your account level <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_iot"
     * > IoT Throttling Limits</a> and cause throttle errors. Please contact <a
     * href="https://console.aws.amazon.com/support/home">Amazon Web Services
     * Customer Support</a> to raise your throttling limits if necessary.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RegisterThing</a> action.
     * </p>
     * 
     * @param registerThingRequest
     * @return registerThingResult The response from the RegisterThing service
     *         method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ThrottlingException
     * @throws ConflictingResourceUpdateException
     * @throws ResourceRegistrationFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    RegisterThingResult registerThing(RegisterThingRequest registerThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects a pending certificate transfer. After IoT rejects a certificate
     * transfer, the certificate status changes from <b>PENDING_TRANSFER</b> to
     * <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After it
     * is called, the certificate will be returned to the source's account in
     * the INACTIVE state.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RejectCertificateTransfer</a> action.
     * </p>
     * 
     * @param rejectCertificateTransferRequest <p>
     *            The input for the RejectCertificateTransfer operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws TransferAlreadyCompletedException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void rejectCertificateTransfer(RejectCertificateTransferRequest rejectCertificateTransferRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the given thing from the billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RemoveThingFromBillingGroup</a> action.
     * </p>
     * 
     * @param removeThingFromBillingGroupRequest
     * @return removeThingFromBillingGroupResult The response from the
     *         RemoveThingFromBillingGroup service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    RemoveThingFromBillingGroupResult removeThingFromBillingGroup(
            RemoveThingFromBillingGroupRequest removeThingFromBillingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Remove the specified thing from the specified group.
     * </p>
     * <p>
     * You must specify either a <code>thingGroupArn</code> or a
     * <code>thingGroupName</code> to identify the thing group and either a
     * <code>thingArn</code> or a <code>thingName</code> to identify the thing
     * to remove from the thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RemoveThingFromThingGroup</a> action.
     * </p>
     * 
     * @param removeThingFromThingGroupRequest
     * @return removeThingFromThingGroupResult The response from the
     *         RemoveThingFromThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    RemoveThingFromThingGroupResult removeThingFromThingGroup(
            RemoveThingFromThingGroupRequest removeThingFromThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Replaces the rule. You must specify all parameters for the new rule.
     * Creating rules is an administrator-level action. Any user who has
     * permission to create rules will be able to access data processed by the
     * rule.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ReplaceTopicRule</a> action.
     * </p>
     * 
     * @param replaceTopicRuleRequest <p>
     *            The input for the ReplaceTopicRule operation.
     *            </p>
     * @throws SqlParseException
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The query search index.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SearchIndex</a> action.
     * </p>
     * 
     * @param searchIndexRequest
     * @return searchIndexResult The response from the SearchIndex service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    SearchIndexResult searchIndex(SearchIndexRequest searchIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the default authorizer. This will be used if a websocket connection
     * is made without specifying an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetDefaultAuthorizer</a> action.
     * </p>
     * 
     * @param setDefaultAuthorizerRequest
     * @return setDefaultAuthorizerResult The response from the
     *         SetDefaultAuthorizer service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    SetDefaultAuthorizerResult setDefaultAuthorizer(
            SetDefaultAuthorizerRequest setDefaultAuthorizerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates to
     * which the policy is attached. To list the principals the policy is
     * attached to, use the <a>ListPrincipalPolicies</a> action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetDefaultPolicyVersion</a> action.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest <p>
     *            The input for the SetDefaultPolicyVersion operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use
     * <code>SetV2LoggingOptions</code> instead.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetLoggingOptions</a> action.
     * </p>
     * 
     * @param setLoggingOptionsRequest <p>
     *            The input for the SetLoggingOptions operation.
     *            </p>
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void setLoggingOptions(SetLoggingOptionsRequest setLoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the logging level.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetV2LoggingLevel</a> action.
     * </p>
     * 
     * @param setV2LoggingLevelRequest
     * @throws InternalException
     * @throws NotConfiguredException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void setV2LoggingLevel(SetV2LoggingLevelRequest setV2LoggingLevelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >SetV2LoggingOptions</a> action.
     * </p>
     * 
     * @param setV2LoggingOptionsRequest
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void setV2LoggingOptions(SetV2LoggingOptionsRequest setV2LoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a task that applies a set of mitigation actions to the specified
     * target.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartAuditMitigationActionsTask</a> action.
     * </p>
     * 
     * @param startAuditMitigationActionsTaskRequest
     * @return startAuditMitigationActionsTaskResult The response from the
     *         StartAuditMitigationActionsTask service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws TaskAlreadyExistsException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    StartAuditMitigationActionsTaskResult startAuditMitigationActionsTask(
            StartAuditMitigationActionsTaskRequest startAuditMitigationActionsTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a Device Defender ML Detect mitigation actions task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartDetectMitigationActionsTask</a> action.
     * </p>
     * 
     * @param startDetectMitigationActionsTaskRequest
     * @return startDetectMitigationActionsTaskResult The response from the
     *         StartDetectMitigationActionsTask service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws TaskAlreadyExistsException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    StartDetectMitigationActionsTaskResult startDetectMitigationActionsTask(
            StartDetectMitigationActionsTaskRequest startDetectMitigationActionsTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an on-demand Device Defender audit.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartOnDemandAuditTask</a> action.
     * </p>
     * 
     * @param startOnDemandAuditTaskRequest
     * @return startOnDemandAuditTaskResult The response from the
     *         StartOnDemandAuditTask service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    StartOnDemandAuditTaskResult startOnDemandAuditTask(
            StartOnDemandAuditTaskRequest startOnDemandAuditTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a bulk thing provisioning task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StartThingRegistrationTask</a> action.
     * </p>
     * 
     * @param startThingRegistrationTaskRequest
     * @return startThingRegistrationTaskResult The response from the
     *         StartThingRegistrationTask service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    StartThingRegistrationTaskResult startThingRegistrationTask(
            StartThingRegistrationTaskRequest startThingRegistrationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a bulk thing provisioning task.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >StopThingRegistrationTask</a> action.
     * </p>
     * 
     * @param stopThingRegistrationTaskRequest
     * @return stopThingRegistrationTaskResult The response from the
     *         StopThingRegistrationTask service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    StopThingRegistrationTaskResult stopThingRegistrationTask(
            StopThingRegistrationTaskRequest stopThingRegistrationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata
     * which can be used to manage a resource.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TagResource</a> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Tests if a specified principal is authorized to perform an IoT action on
     * a specified resource. Use this to test and debug the authorization
     * behavior of devices that connect to the IoT device gateway.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TestAuthorization</a> action.
     * </p>
     * 
     * @param testAuthorizationRequest
     * @return testAuthorizationResult The response from the TestAuthorization
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    TestAuthorizationResult testAuthorization(TestAuthorizationRequest testAuthorizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Tests a custom authorization behavior by invoking a specified custom
     * authorizer. Use this to test and debug the custom authorization behavior
     * of devices that connect to the IoT device gateway.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TestInvokeAuthorizer</a> action.
     * </p>
     * 
     * @param testInvokeAuthorizerRequest
     * @return testInvokeAuthorizerResult The response from the
     *         TestInvokeAuthorizer service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws InvalidResponseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    TestInvokeAuthorizerResult testInvokeAuthorizer(
            TestInvokeAuthorizerRequest testInvokeAuthorizerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Transfers the specified certificate to the specified Amazon Web Services
     * account.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >TransferCertificate</a> action.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is up
     * to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. You
     * can use the <a>UpdateCertificate</a> action to deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use
     * the <a>DetachPolicy</a> action to detach them.
     * </p>
     * 
     * @param transferCertificateRequest <p>
     *            The input for the TransferCertificate operation.
     *            </p>
     * @return transferCertificateResult The response from the
     *         TransferCertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws CertificateStateException
     * @throws TransferConflictException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    TransferCertificateResult transferCertificate(
            TransferCertificateRequest transferCertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UntagResource</a> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Configures or reconfigures the Device Defender audit settings for this
     * account. Settings include how audit notifications are sent and which
     * audit checks are enabled or disabled.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateAccountAuditConfiguration</a> action.
     * </p>
     * 
     * @param updateAccountAuditConfigurationRequest
     * @return updateAccountAuditConfigurationResult The response from the
     *         UpdateAccountAuditConfiguration service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateAccountAuditConfigurationResult updateAccountAuditConfiguration(
            UpdateAccountAuditConfigurationRequest updateAccountAuditConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Device Defender audit suppression.
     * </p>
     * 
     * @param updateAuditSuppressionRequest
     * @return updateAuditSuppressionResult The response from the
     *         UpdateAuditSuppression service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateAuditSuppressionResult updateAuditSuppression(
            UpdateAuditSuppressionRequest updateAuditSuppressionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an authorizer.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateAuthorizer</a> action.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return updateAuthorizerResult The response from the UpdateAuthorizer
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates information about the billing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateBillingGroup</a> action.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return updateBillingGroupResult The response from the UpdateBillingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateBillingGroupResult updateBillingGroup(UpdateBillingGroupRequest updateBillingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a registered CA certificate.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateCACertificate</a> action.
     * </p>
     * 
     * @param updateCACertificateRequest <p>
     *            The input to the UpdateCACertificate operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void updateCACertificate(UpdateCACertificateRequest updateCACertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateCertificate</a> action.
     * </p>
     * <p>
     * Certificates must be in the ACTIVE state to authenticate devices that use
     * a certificate to connect to IoT.
     * </p>
     * <p>
     * Within a few minutes of updating a certificate from the ACTIVE state to
     * any other state, IoT disconnects all devices that used that certificate
     * to connect. Devices cannot use a certificate that is not in the ACTIVE
     * state to reconnect.
     * </p>
     * 
     * @param updateCertificateRequest <p>
     *            The input for the UpdateCertificate operation.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws CertificateStateException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void updateCertificate(UpdateCertificateRequest updateCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Device Defender detect custom metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateCustomMetric</a> action.
     * </p>
     * 
     * @param updateCustomMetricRequest
     * @return updateCustomMetricResult The response from the UpdateCustomMetric
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateCustomMetricResult updateCustomMetric(UpdateCustomMetricRequest updateCustomMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the definition for a dimension. You cannot change the type of a
     * dimension after it is created (you can delete it and recreate it).
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateDimension</a> action.
     * </p>
     * 
     * @param updateDimensionRequest
     * @return updateDimensionResult The response from the UpdateDimension
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateDimensionResult updateDimension(UpdateDimensionRequest updateDimensionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates values stored in the domain configuration. Domain configurations
     * for default endpoints can't be updated.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateDomainConfiguration</a> action.
     * </p>
     * 
     * @param updateDomainConfigurationRequest
     * @return updateDomainConfigurationResult The response from the
     *         UpdateDomainConfiguration service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws CertificateValidationException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateDomainConfigurationResult updateDomainConfiguration(
            UpdateDomainConfigurationRequest updateDomainConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a dynamic thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateDynamicThingGroup</a> action.
     * </p>
     * 
     * @param updateDynamicThingGroupRequest
     * @return updateDynamicThingGroupResult The response from the
     *         UpdateDynamicThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateDynamicThingGroupResult updateDynamicThingGroup(
            UpdateDynamicThingGroupRequest updateDynamicThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the event configurations.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateEventConfigurations</a> action.
     * </p>
     * 
     * @param updateEventConfigurationsRequest
     * @return updateEventConfigurationsResult The response from the
     *         UpdateEventConfigurations service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateEventConfigurationsResult updateEventConfigurations(
            UpdateEventConfigurationsRequest updateEventConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the data for a fleet metric.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateFleetMetric</a> action.
     * </p>
     * 
     * @param updateFleetMetricRequest
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws InvalidQueryException
     * @throws InvalidAggregationException
     * @throws VersionConflictException
     * @throws IndexNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void updateFleetMetric(UpdateFleetMetricRequest updateFleetMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the search configuration.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateIndexingConfiguration</a> action.
     * </p>
     * 
     * @param updateIndexingConfigurationRequest
     * @return updateIndexingConfigurationResult The response from the
     *         UpdateIndexingConfiguration service method, as returned by AWS
     *         IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateIndexingConfigurationResult updateIndexingConfiguration(
            UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates supported fields of the specified job.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateJob</a> action.
     * </p>
     * 
     * @param updateJobRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void updateJob(UpdateJobRequest updateJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the definition for the specified mitigation action.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateMitigationAction</a> action.
     * </p>
     * 
     * @param updateMitigationActionRequest
     * @return updateMitigationActionResult The response from the
     *         UpdateMitigationAction service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateMitigationActionResult updateMitigationAction(
            UpdateMitigationActionRequest updateMitigationActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a fleet provisioning template.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateProvisioningTemplate</a> action.
     * </p>
     * 
     * @param updateProvisioningTemplateRequest
     * @return updateProvisioningTemplateResult The response from the
     *         UpdateProvisioningTemplate service method, as returned by AWS
     *         IoT.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateProvisioningTemplateResult updateProvisioningTemplate(
            UpdateProvisioningTemplateRequest updateProvisioningTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a role alias.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateRoleAlias</a> action.
     * </p>
     * 
     * @param updateRoleAliasRequest
     * @return updateRoleAliasResult The response from the UpdateRoleAlias
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateRoleAliasResult updateRoleAlias(UpdateRoleAliasRequest updateRoleAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a scheduled audit, including which checks are performed and how
     * often the audit takes place.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateScheduledAudit</a> action.
     * </p>
     * 
     * @param updateScheduledAuditRequest
     * @return updateScheduledAuditResult The response from the
     *         UpdateScheduledAudit service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateScheduledAuditResult updateScheduledAudit(
            UpdateScheduledAuditRequest updateScheduledAuditRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a Device Defender security profile.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateSecurityProfile</a> action.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return updateSecurityProfileResult The response from the
     *         UpdateSecurityProfile service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateSecurityProfileResult updateSecurityProfile(
            UpdateSecurityProfileRequest updateSecurityProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing stream. The stream version will be incremented by
     * one.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateStream</a> action.
     * </p>
     * 
     * @param updateStreamRequest
     * @return updateStreamResult The response from the UpdateStream service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateStreamResult updateStream(UpdateStreamRequest updateStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThing</a> action.
     * </p>
     * 
     * @param updateThingRequest <p>
     *            The input for the UpdateThing operation.
     *            </p>
     * @return updateThingResult The response from the UpdateThing service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateThingResult updateThing(UpdateThingRequest updateThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Update a thing group.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingGroup</a> action.
     * </p>
     * 
     * @param updateThingGroupRequest
     * @return updateThingGroupResult The response from the UpdateThingGroup
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws VersionConflictException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateThingGroupResult updateThingGroup(UpdateThingGroupRequest updateThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the groups to which the thing belongs.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingGroupsForThing</a> action.
     * </p>
     * 
     * @param updateThingGroupsForThingRequest
     * @return updateThingGroupsForThingResult The response from the
     *         UpdateThingGroupsForThing service method, as returned by AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateThingGroupsForThingResult updateThingGroupsForThing(
            UpdateThingGroupsForThingRequest updateThingGroupsForThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a topic rule destination. You use this to change the status,
     * endpoint URL, or confirmation URL of the destination.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateTopicRuleDestination</a> action.
     * </p>
     * 
     * @param updateTopicRuleDestinationRequest
     * @return updateTopicRuleDestinationResult The response from the
     *         UpdateTopicRuleDestination service method, as returned by AWS
     *         IoT.
     * @throws InternalException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedException
     * @throws ConflictingResourceUpdateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateTopicRuleDestinationResult updateTopicRuleDestination(
            UpdateTopicRuleDestinationRequest updateTopicRuleDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Validates a Device Defender security profile behaviors specification.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ValidateSecurityProfileBehaviors</a> action.
     * </p>
     * 
     * @param validateSecurityProfileBehaviorsRequest
     * @return validateSecurityProfileBehaviorsResult The response from the
     *         ValidateSecurityProfileBehaviors service method, as returned by
     *         AWS IoT.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ValidateSecurityProfileBehaviorsResult validateSecurityProfileBehaviors(
            ValidateSecurityProfileBehaviorsRequest validateSecurityProfileBehaviorsRequest)
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
