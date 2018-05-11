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

package com.amazonaws.services.iot;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.iot.model.*;

/**
 * Interface for accessing AWS IoT <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * thing (Thing Registry), configure logging, and create and manage policies and
 * credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws TransferAlreadyCompletedException <p>
     *             You can't revert the certificate transfer because the
     *             transfer is already complete.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest <p>
     *            The input for the AttachPrincipalPolicy operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws LimitExceededException <p>
     *             The number of attached entities exceeds the limit.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest)
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws TransferAlreadyCompletedException <p>
     *             You can't revert the certificate transfer because the
     *             transfer is already complete.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in
     * a distinct certificate.
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws MalformedPolicyException <p>
     *             The policy documentation is not valid.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws MalformedPolicyException <p>
     *             The policy documentation is not valid.
     *             </p>
     * @throws VersionsLimitExceededException <p>
     *             The number of policy versions exceeds the limit.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Creates a thing record in the thing registry.
     * </p>
     * 
     * @param createThingRequest <p>
     *            The input for the CreateThing operation.
     *            </p>
     * @return createThingResult The response from the CreateThing service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * Creates a new thing type.
     * </p>
     * 
     * @param createThingTypeRequest <p>
     *            The input for the CreateThingType operation.
     *            </p>
     * @return createThingTypeResult The response from the CreateThingType
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
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
     * @throws SqlParseException <p>
     *             The Rule-SQL expression can't be parsed correctly.
     *             </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
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
     * Deletes a registered CA certificate.
     * </p>
     * 
     * @param deleteCACertificateRequest <p>
     *            Input for the DeleteCACertificate operation.
     *            </p>
     * @return deleteCACertificateResult The response from the
     *         DeleteCACertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws DeleteConflictException <p>
     *             You can't delete the resource because it is attached to one
     *             or more resources.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * @throws DeleteConflictException <p>
     *             You can't delete the resource because it is attached to one
     *             or more resources.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws DeleteConflictException <p>
     *             You can't delete the resource because it is attached to one
     *             or more resources.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Deletes the specified thing.
     * </p>
     * 
     * @param deleteThingRequest <p>
     *            The input for the DeleteThing operation.
     *            </p>
     * @return deleteThingResult The response from the DeleteThing service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws VersionConflictException <p>
     *             An exception thrown when the version of a thing passed to a
     *             command is different than the version specified with the
     *             --version parameter.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Deletes the specified thing type . You cannot delete a thing type if it
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest <p>
     *            The input for the DeleteTopicRule operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
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
     * Deprecates a thing type. You can not associate new things with deprecated
     * thing type.
     * </p>
     * 
     * @param deprecateThingTypeRequest <p>
     *            The input for the DeprecateThingType operation.
     *            </p>
     * @return deprecateThingTypeResult The response from the DeprecateThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Describes a registered CA certificate.
     * </p>
     * 
     * @param describeCACertificateRequest <p>
     *            The input for the DescribeCACertificate operation.
     *            </p>
     * @return describeCACertificateResult The response from the
     *         DescribeCACertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * Returns a unique endpoint specific to the AWS account making the call.
     * </p>
     * 
     * @param describeEndpointRequest <p>
     *            The input for the DescribeEndpoint operation.
     *            </p>
     * @return describeEndpointResult The response from the DescribeEndpoint
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
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
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest <p>
     *            The input for the DescribeThing operation.
     *            </p>
     * @return describeThingResult The response from the DescribeThing service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Gets information about the specified thing type.
     * </p>
     * 
     * @param describeThingTypeRequest <p>
     *            The input for the DescribeThingType operation.
     *            </p>
     * @return describeThingTypeResult The response from the DescribeThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest <p>
     *            The input for the DetachPrincipalPolicy operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    void detachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest <p>
     *            The input for the DetachThingPrincipal operation.
     *            </p>
     * @return detachThingPrincipalResult The response from the
     *         DetachThingPrincipal service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Disables the specified rule.
     * </p>
     * 
     * @param disableTopicRuleRequest <p>
     *            The input for the DisableTopicRuleRequest operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
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
     * Enables the specified rule.
     * </p>
     * 
     * @param enableTopicRuleRequest <p>
     *            The input for the EnableTopicRuleRequest operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
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
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest <p>
     *            The input for the GetLoggingOptions operation.
     *            </p>
     * @return getLoggingOptionsResult The response from the GetLoggingOptions
     *         service method, as returned by AWS IoT.
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
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
     * Gets information about the specified policy with the policy document of
     * the default version.
     * </p>
     * 
     * @param getPolicyRequest <p>
     *            The input for the GetPolicy operation.
     *            </p>
     * @return getPolicyResult The response from the GetPolicy service method,
     *         as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
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
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest <p>
     *            The input for the GetTopicRule operation.
     *            </p>
     * @return getTopicRuleResult The response from the GetTopicRule service
     *         method, as returned by AWS IoT.
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Lists certificates that are being transfered but not yet accepted.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest <p>
     *            The input to the ListOutgoingCertificates operation.
     *            </p>
     * @return listOutgoingCertificatesResult The response from the
     *         ListOutgoingCertificates service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * 
     * @param listPolicyPrincipalsRequest <p>
     *            The input for the ListPolicyPrincipals operation.
     *            </p>
     * @return listPolicyPrincipalsResult The response from the
     *         ListPolicyPrincipals service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * 
     * @param listPrincipalPoliciesRequest <p>
     *            The input for the ListPrincipalPolicies operation.
     *            </p>
     * @return listPrincipalPoliciesResult The response from the
     *         ListPrincipalPolicies service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest <p>
     *            The input for the ListThingPrincipal operation.
     *            </p>
     * @return listThingPrincipalsResult The response from the
     *         ListThingPrincipals service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
     * Lists the existing thing types.
     * </p>
     * 
     * @param listThingTypesRequest <p>
     *            The input for the ListThingTypes operation.
     *            </p>
     * @return listThingTypesResult The response from the ListThingTypes service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest <p>
     *            The input for the ListTopicRules operation.
     *            </p>
     * @return listTopicRulesResult The response from the ListTopicRules service
     *         method, as returned by AWS IoT.
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
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
     * Registers a CA certificate with AWS IoT. This CA certificate can then be
     * used to sign device certificates, which can be then registered with AWS
     * IoT. You can register up to 10 CA certificates per AWS account that have
     * the same subject field and public key. This enables you to have up to 10
     * certificate authorities sign your device certificates. If you have more
     * than one CA certificate registered, make sure you pass the CA certificate
     * when you register your device certificates with the RegisterCertificate
     * API.
     * </p>
     * 
     * @param registerCACertificateRequest <p>
     *            The input to the RegisterCACertificate operation.
     *            </p>
     * @return registerCACertificateResult The response from the
     *         RegisterCACertificate service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws RegistrationCodeValidationException <p>
     *             The registration code is invalid.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws CertificateValidationException <p>
     *             The certificate is invalid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws LimitExceededException <p>
     *             The number of attached entities exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws CertificateValidationException <p>
     *             The certificate is invalid.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws CertificateConflictException <p>
     *             Unable to verify the CA certificate used to sign the device
     *             certificate you are attempting to register. This is happens
     *             when you have registered more than one CA certificate that
     *             has the same subject field and public key.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws TransferAlreadyCompletedException <p>
     *             You can't revert the certificate transfer because the
     *             transfer is already complete.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Replaces the specified rule. You must specify all parameters for the new
     * rule. Creating rules is an administrator-level action. Any user who has
     * permission to create rules will be able to access data processed by the
     * rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest <p>
     *            The input for the ReplaceTopicRule operation.
     *            </p>
     * @throws SqlParseException <p>
     *             The Rule-SQL expression can't be parsed correctly.
     *             </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
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
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates to
     * which the policy is attached. To list the principals the policy is
     * attached to, use the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest <p>
     *            The input for the SetDefaultPolicyVersion operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * 
     * @param setLoggingOptionsRequest <p>
     *            The input for the SetLoggingOptions operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
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
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws TransferConflictException <p>
     *             You can't transfer the certificate because authorization
     *             policies are still attached.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Updates a registered CA certificate.
     * </p>
     * 
     * @param updateCACertificateRequest <p>
     *            The input to the UpdateCACertificate operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
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
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest <p>
     *            The input for the UpdateThing operation.
     *            </p>
     * @return updateThingResult The response from the UpdateThing service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws VersionConflictException <p>
     *             An exception thrown when the version of a thing passed to a
     *             command is different than the version specified with the
     *             --version parameter.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
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
