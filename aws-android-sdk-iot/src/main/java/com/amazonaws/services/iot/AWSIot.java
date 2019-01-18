/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AWS IoT <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected devices (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * device (Registry), configure logging, and create and manage policies and
 * credentials to authenticate devices.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
 * </p>
 * <p>
 * For information about how to use the credentials provider for AWS IoT, see <a
 * href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/authorizing-direct-aws.html"
 * >Authorizing Direct Calls to AWS Services</a>.
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
     * Attaches a policy to the specified target.
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
     * <b>Note:</b> This API is deprecated. Please use <a>AttachPolicy</a>
     * instead.
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
     * Associates a Device Defender security profile with a thing group or with
     * this account. Each thing group or account can have up to five security
     * profiles associated with it.
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
     * Attaches the specified principal to the specified thing.
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
     * Cancels an audit that is in progress. The audit can be either scheduled
     * or on-demand. If the audit is not in progress, an
     * "InvalidRequestException" occurs.
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
     * <a>RejectCertificateTransfer</a> instead.) After transfer, AWS IoT
     * returns the certificate to the source account in the INACTIVE state.
     * After the destination account has accepted the transfer, the transfer
     * cannot be cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate
     * changes from PENDING_TRANSFER to INACTIVE.
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
     * Cancels a job.
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
     * Creates an authorizer.
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
     * file name to the aws iot create-certificate-from-csr AWS CLI command to
     * create a certificate for the corresponding CSR.
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
     * Creates a dynamic thing group.
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
     * Creates a job.
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
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the
     * issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this
     * certificate, so it is important to keep it in a secure location.
     * </p>
     * 
     * @param createKeysAndCertificateRequest <p>
     *            The input for the CreateKeysAndCertificate operation.
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
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
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
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation
     * creates a policy version with a version identifier of <b>1</b> and sets
     * <b>1</b> as the policy's default version.
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
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to five
     * versions. If the policy has five versions, you must use
     * <a>DeletePolicyVersion</a> to delete an existing version before you
     * create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version (that is, the version that
     * is in effect for the certificates to which the policy is attached).
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
     * Creates a role alias.
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
     * 
     * @param createScheduledAuditRequest
     * @return createScheduledAuditResult The response from the
     *         CreateScheduledAudit service method, as returned by AWS IoT.
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
    CreateScheduledAuditResult createScheduledAudit(
            CreateScheduledAuditRequest createScheduledAuditRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a Device Defender security profile.
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
     * with a stream. The total size of a file associated with the stream cannot
     * exceed more than 2 MB. The stream will be created with version 0. If a
     * stream is created with the same streamID as a stream that existed and was
     * deleted within last 90 days, we will resurrect that old stream by
     * incrementing the version by 1.
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
     * Creates a thing record in the registry.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/authorization.html"
     * >Authorization</a> for information about authorizing control plane
     * actions.
     * </p>
     * </note>
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
     * "http://docs.aws.amazon.com/iot/latest/developerguide/authorization.html"
     * >Authorization</a> for information about authorizing control plane
     * actions.
     * </p>
     * </note>
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
     * Restores the default settings for Device Defender audits for this
     * account. Any configuration data you entered is deleted and all audit
     * checks are reset to disabled.
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
     * Deletes an authorizer.
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
     * A certificate cannot be deleted if it has a policy attached to it or if
     * its status is set to ACTIVE. To delete a certificate, first use the
     * <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE
     * status.
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
     * Deletes a dynamic thing group.
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
     * Delete an OTA update.
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
     * To delete a policy, use the DeletePolicyVersion API to delete all
     * non-default versions of the policy; use the DetachPrincipalPolicy API to
     * detach the policy from any certificate; and then use the DeletePolicy API
     * to delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
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
     * the default version of a policy using this API. To delete the default
     * version of a policy, use <a>DeletePolicy</a>. To find out which version
     * of a policy is marked as the default version, use ListPolicyVersions.
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
     * Deletes a CA certificate registration code.
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
     * Deletes a logging level.
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
     * Gets information about a Device Defender audit.
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
     * Describes the default authorizer.
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
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * Describes a search index.
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
     * Describes a role alias.
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
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>DetachPolicy</a>
     * instead.
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
     * Detaches the specified principal from the specified thing.
     * </p>
     * <note>
     * <p>
     * This call is asynchronous. It might take several seconds for the
     * detachment to propagate.
     * </p>
     * </note>
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
     * Gets a list of the policies that have an effect on the authorization
     * behavior of the specified device when it connects to the AWS IoT device
     * gateway.
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
     * Gets the search configuration.
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
     * Gets information about the specified policy with the policy document of
     * the default version.
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
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * Gets information about the rule.
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
     * Gets the fine grained logging options.
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
     * performed during a specified time period. (Findings are retained for 180
     * days.)
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
     * Lists the Device Defender audits that have been performed during a given
     * time period.
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
     * Lists the CA certificates registered for your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the
     * returned marker to retrieve additional results.
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
     * Lists the certificates registered in your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the
     * returned marker to retrieve additional results.
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
     * Lists the search indices.
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
     * Lists jobs.
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
     * Lists OTA updates.
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
     * <b>Note:</b> This API is deprecated. Please use
     * <a>ListTargetsForPolicy</a> instead.
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
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use
     * <a>ListAttachedPolicies</a> instead.
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
     * Lists the things associated with the specified principal.
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
     * Lists the role aliases registered in your account.
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
     * Lists the Device Defender security profiles you have created. You can use
     * filters to list only those security profiles associated with a thing
     * group or only those associated with your account.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return listSecurityProfilesResult The response from the
     *         ListSecurityProfiles service method, as returned by AWS IoT.
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
    ListSecurityProfilesResult listSecurityProfiles(
            ListSecurityProfilesRequest listSecurityProfilesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the Device Defender security profiles attached to a target (thing
     * group).
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
     * Lists all of the streams in your AWS account.
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
     * 
     * @param listThingGroupsRequest
     * @return listThingGroupsResult The response from the ListThingGroups
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException
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
    ListThingGroupsResult listThingGroups(ListThingGroupsRequest listThingGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
     * </p>
     * 
     * @param listThingGroupsForThingRequest
     * @return listThingGroupsForThingResult The response from the
     *         ListThingGroupsForThing service method, as returned by AWS IoT.
     * @throws InvalidRequestException
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
    ListThingGroupsForThingResult listThingGroupsForThing(
            ListThingGroupsForThingRequest listThingGroupsForThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the principals associated with the specified thing.
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
     * 
     * @param listThingsInThingGroupRequest
     * @return listThingsInThingGroupResult The response from the
     *         ListThingsInThingGroup service method, as returned by AWS IoT.
     * @throws InvalidRequestException
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
    ListThingsInThingGroupResult listThingsInThingGroup(
            ListThingsInThingGroupRequest listThingsInThingGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the rules for the specific topic.
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
     * alerts issued for a particular security profile, behavior or thing
     * (device).
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
     * Registers a CA certificate with AWS IoT. This CA certificate can then be
     * used to sign device certificates, which can be then registered with AWS
     * IoT. You can register up to 10 CA certificates per AWS account that have
     * the same subject field. This enables you to have up to 10 certificate
     * authorities sign your device certificates. If you have more than one CA
     * certificate registered, make sure you pass the CA certificate when you
     * register your device certificates with the RegisterCertificate API.
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
     * Registers a device certificate with AWS IoT. If you have more than one CA
     * certificate that has the same subject field, you must specify the CA
     * certificate that was used to sign the device certificate being
     * registered.
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
     * Provisions a thing.
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
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANSFER</b> to <b>INACTIVE</b>.
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
     * attached to, use the ListPrincipalPolicy API.
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
     * 
     * @param setV2LoggingLevelRequest
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
    void setV2LoggingLevel(SetV2LoggingLevelRequest setV2LoggingLevelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
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
     * Starts an on-demand Device Defender audit.
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
     * Tests if a specified principal is authorized to perform an AWS IoT action
     * on a specified resource. Use this to test and debug the authorization
     * behavior of devices that connect to the AWS IoT device gateway.
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
     * of devices that connect to the AWS IoT device gateway.
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
     * Transfers the specified certificate to the specified AWS account.
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
     * can use the UpdateCertificate API to deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use
     * the DetachPrincipalPolicy API to detach them.
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
     * Updates an authorizer.
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
     * Moving a certificate from the ACTIVE state (including REVOKED) will not
     * disconnect currently connected devices, but these devices will be unable
     * to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS
     * IoT using a certificate.
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
     * Updates a dynamic thing group.
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
     * Updates the search configuration.
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
     * Updates a role alias.
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
     * Updates a scheduled audit, including what checks are performed and how
     * often the audit takes place.
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
     * Validates a Device Defender security profile behaviors specification.
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
