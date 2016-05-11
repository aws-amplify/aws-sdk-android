/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AWSIot.
 * AWS IoT <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded
 * devices, or smart appliances) and the AWS cloud. You can discover your
 * custom IoT-Data endpoint to communicate with, configure rules for data
 * processing and integration with other services, organize resources
 * associated with each thing (Thing Registry), configure logging, and
 * create and manage policies and credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the
 * <a href="http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"> Developer Guide </a>
 * .
 * </p>
 */
public interface AWSIot {

    /**
     * Overrides the default endpoint for this client ("https://iot.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "iot.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://iot.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "iot.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://iot.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSIot#setEndpoint(String)}, sets the
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
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Creates a thing in the Thing Registry.
     * </p>
     *
     * @param createThingRequest Container for the necessary parameters to
     *           execute the CreateThing service method on AWSIot.
     * 
     * @return The response from the CreateThing service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateThingResult createThing(CreateThingRequest createThingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     *
     * @param listPrincipalThingsRequest Container for the necessary
     *           parameters to execute the ListPrincipalThings service method on
     *           AWSIot.
     * 
     * @return The response from the ListPrincipalThings service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPrincipalThingsResult listPrincipalThings(ListPrincipalThingsRequest listPrincipalThingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANFER</b> to <b>INACTIVE</b> .
     * </p>
     * <p>
     * To check for pending certificate transfers, call ListCertificates to
     * enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After
     * it is called, the certificate will be returned to the source's account
     * in the INACTIVE state.
     * </p>
     *
     * @param rejectCertificateTransferRequest Container for the necessary
     *           parameters to execute the RejectCertificateTransfer service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferAlreadyCompletedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rejectCertificateTransfer(RejectCertificateTransferRequest rejectCertificateTransferRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     *
     * @param attachThingPrincipalRequest Container for the necessary
     *           parameters to execute the AttachThingPrincipal service method on
     *           AWSIot.
     * 
     * @return The response from the AttachThingPrincipal service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachThingPrincipalResult attachThingPrincipal(AttachThingPrincipalRequest attachThingPrincipalRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the specified policy with the policy document
     * of the default version.
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy service method on AWSIot.
     * 
     * @return The response from the GetPolicy service method, as returned by
     *         AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     *
     * @param getPolicyVersionRequest Container for the necessary parameters
     *           to execute the GetPolicyVersion service method on AWSIot.
     * 
     * @return The response from the GetPolicyVersion service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     *
     * @param detachPrincipalPolicyRequest Container for the necessary
     *           parameters to execute the DetachPrincipalPolicy service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the
     * call. You specify the following URI when updating state information
     * for your thing: https:// <i>endpoint</i> /things/ <i>thingName</i>
     * /shadow.
     * </p>
     *
     * @param describeEndpointRequest Container for the necessary parameters
     *           to execute the DescribeEndpoint service method on AWSIot.
     * 
     * @return The response from the DescribeEndpoint service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws UnauthorizedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to
     * five versions. If the policy has five versions, you must use
     * DeletePolicyVersion to delete an existing version before you create a
     * new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default
     * version. The default version is the operative version (that is, the
     * version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     *
     * @param createPolicyVersionRequest Container for the necessary
     *           parameters to execute the CreatePolicyVersion service method on
     *           AWSIot.
     * 
     * @return The response from the CreatePolicyVersion service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws MalformedPolicyException
     * @throws UnauthorizedException
     * @throws VersionsLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     *
     * @param getTopicRuleRequest Container for the necessary parameters to
     *           execute the GetTopicRule service method on AWSIot.
     * 
     * @return The response from the GetTopicRule service method, as returned
     *         by AWSIot.
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTopicRuleResult getTopicRule(GetTopicRuleRequest getTopicRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables the specified rule.
     * </p>
     *
     * @param enableTopicRuleRequest Container for the necessary parameters
     *           to execute the EnableTopicRule service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     *
     * @param describeCertificateRequest Container for the necessary
     *           parameters to execute the DescribeCertificate service method on
     *           AWSIot.
     * 
     * @return The response from the DescribeCertificate service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest describeCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists your certificates.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use
     * the returned marker to retrieve additional results.
     * </p>
     *
     * @param listCertificatesRequest Container for the necessary parameters
     *           to execute the ListCertificates service method on AWSIot.
     * 
     * @return The response from the ListCertificates service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the logging options.
     * </p>
     *
     * @param setLoggingOptionsRequest Container for the necessary parameters
     *           to execute the SetLoggingOptions service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoggingOptions(SetLoggingOptionsRequest setLoggingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or
     * if its status is set to ACTIVE. To delete a certificate, first use the
     * DetachPrincipalPolicy API to detach all policies. Next, use the
     * UpdateCertificate API to set the certificate to the INACTIVE status.
     * </p>
     *
     * @param deleteCertificateRequest Container for the necessary parameters
     *           to execute the DeleteCertificate service method on AWSIot.
     * 
     * 
     * @throws CertificateStateException
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCertificate(DeleteCertificateRequest deleteCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     *
     * @param listTopicRulesRequest Container for the necessary parameters to
     *           execute the ListTopicRules service method on AWSIot.
     * 
     * @return The response from the ListTopicRules service method, as
     *         returned by AWSIot.
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTopicRulesResult listTopicRules(ListTopicRulesRequest listTopicRulesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified thing from the Thing Registry.
     * </p>
     *
     * @param deleteThingRequest Container for the necessary parameters to
     *           execute the DeleteThing service method on AWSIot.
     * 
     * @return The response from the DeleteThing service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteThingResult deleteThing(DeleteThingRequest deleteThingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call ListCertificates to
     * enumerate your certificates.
     * </p>
     *
     * @param acceptCertificateTransferRequest Container for the necessary
     *           parameters to execute the AcceptCertificateTransfer service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferAlreadyCompletedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void acceptCertificateTransfer(AcceptCertificateTransferRequest acceptCertificateTransferRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot
     * delete the default version of a policy using this API. To delete the
     * default version of a policy, use DeletePolicy. To find out which
     * version of a policy is marked as the default version, use
     * ListPolicyVersions.
     * </p>
     *
     * @param deletePolicyVersionRequest Container for the necessary
     *           parameters to execute the DeletePolicyVersion service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the
     * new rule. Creating rules is an administrator-level action. Any user
     * who has permission to create rules will be able to access data
     * processed by the rule.
     * </p>
     *
     * @param replaceTopicRuleRequest Container for the necessary parameters
     *           to execute the ReplaceTopicRule service method on AWSIot.
     * 
     * 
     * @throws SqlParseException
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates to
     * which the policy is attached. To list the principals the policy is
     * attached to, use the ListPrincipalPolicy API.
     * </p>
     *
     * @param setDefaultPolicyVersionRequest Container for the necessary
     *           parameters to execute the SetDefaultPolicyVersion service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Cognito identity, the ID must be in
     * <a href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"> AmazonCognito Identity format </a>
     * .
     * </p>
     *
     * @param listPrincipalPoliciesRequest Container for the necessary
     *           parameters to execute the ListPrincipalPolicies service method on
     *           AWSIot.
     * 
     * @return The response from the ListPrincipalPolicies service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPrincipalPoliciesResult listPrincipalPolicies(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the
     * recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is
     * up to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state.
     * You can use the UpdateCertificate API to deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can
     * use the DetachPrincipalPolicy API to detach them.
     * </p>
     *
     * @param transferCertificateRequest Container for the necessary
     *           parameters to execute the TransferCertificate service method on
     *           AWSIot.
     * 
     * @return The response from the TransferCertificate service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferConflictException
     * @throws CertificateStateException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TransferCertificateResult transferCertificate(TransferCertificateRequest transferCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists your policies.
     * </p>
     *
     * @param listPoliciesRequest Container for the necessary parameters to
     *           execute the ListPolicies service method on AWSIot.
     * 
     * @return The response from the ListPolicies service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

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
     * non-default versions of the policy; use the DetachPrincipalPolicy API
     * to detach the policy from any certificate; and then use the
     * DeletePolicy API to delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy service method on AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     *
     * @param detachThingPrincipalRequest Container for the necessary
     *           parameters to execute the DetachThingPrincipal service method on
     *           AWSIot.
     * 
     * @return The response from the DetachThingPrincipal service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachThingPrincipalResult detachThingPrincipal(DetachThingPrincipalRequest detachThingPrincipalRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     *
     * @param describeThingRequest Container for the necessary parameters to
     *           execute the DescribeThing service method on AWSIot.
     * 
     * @return The response from the DescribeThing service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeThingResult describeThing(DescribeThingRequest describeThingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any
     * user who has permission to create rules will be able to access data
     * processed by the rule.
     * </p>
     *
     * @param createTopicRuleRequest Container for the necessary parameters
     *           to execute the CreateTopicRule service method on AWSIot.
     * 
     * 
     * @throws SqlParseException
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createTopicRule(CreateTopicRuleRequest createTopicRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using
     * the issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for
     * this certificate, so it is important to keep it in a secure location.
     * </p>
     *
     * @param createKeysAndCertificateRequest Container for the necessary
     *           parameters to execute the CreateKeysAndCertificate service method on
     *           AWSIot.
     * 
     * @return The response from the CreateKeysAndCertificate service method,
     *         as returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeysAndCertificateResult createKeysAndCertificate(CreateKeysAndCertificateRequest createKeysAndCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate
     * or other credential).
     * </p>
     *
     * @param attachPrincipalPolicyRequest Container for the necessary
     *           parameters to execute the AttachPrincipalPolicy service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables the specified rule.
     * </p>
     *
     * @param disableTopicRuleRequest Container for the necessary parameters
     *           to execute the DisableTopicRule service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the versions of the specified policy, and identifies the
     * default version.
     * </p>
     *
     * @param listPolicyVersionsRequest Container for the necessary
     *           parameters to execute the ListPolicyVersions service method on AWSIot.
     * 
     * @return The response from the ListPolicyVersions service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Moving a certificate from the ACTIVE state (including REVOKED) will
     * not disconnect currently connected devices, but these devices will be
     * unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to
     * AWS IoT using a certificate.
     * </p>
     *
     * @param updateCertificateRequest Container for the necessary parameters
     *           to execute the UpdateCertificate service method on AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws CertificateStateException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateCertificate(UpdateCertificateRequest updateCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation
     * to cancel a transfer. (Transfer destinations can use
     * RejectCertificateTransfer instead.) After transfer, AWS IoT returns
     * the certificate to the source account in the INACTIVE state. After the
     * destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the
     * certificate changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     *
     * @param cancelCertificateTransferRequest Container for the necessary
     *           parameters to execute the CancelCertificateTransfer service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferAlreadyCompletedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelCertificateTransfer(CancelCertificateTransferRequest cancelCertificateTransferRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     *
     * @param updateThingRequest Container for the necessary parameters to
     *           execute the UpdateThing service method on AWSIot.
     * 
     * @return The response from the UpdateThing service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateThingResult updateThing(UpdateThingRequest updateThingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists your things. You can pass an AttributeName or AttributeValue to
     * filter your things (for example, "ListThings where AttributeName=Color
     * and AttributeValue=Red").
     * </p>
     *
     * @param listThingsRequest Container for the necessary parameters to
     *           execute the ListThings service method on AWSIot.
     * 
     * @return The response from the ListThings service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListThingsResult listThings(ListThingsRequest listThingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This
     * operation creates a policy version with a version identifier of
     * <b>1</b> and sets <b>1</b> as the policy's default version.
     * </p>
     *
     * @param createPolicyRequest Container for the necessary parameters to
     *           execute the CreatePolicy service method on AWSIot.
     * 
     * @return The response from the CreatePolicy service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws MalformedPolicyException
     * @throws UnauthorizedException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the logging options.
     * </p>
     *
     * @param getLoggingOptionsRequest Container for the necessary parameters
     *           to execute the GetLoggingOptions service method on AWSIot.
     * 
     * @return The response from the GetLoggingOptions service method, as
     *         returned by AWSIot.
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     *
     * @param listThingPrincipalsRequest Container for the necessary
     *           parameters to execute the ListThingPrincipals service method on
     *           AWSIot.
     * 
     * @return The response from the ListThingPrincipals service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListThingPrincipalsResult listThingPrincipals(ListThingPrincipalsRequest listThingPrincipalsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR)
     * results in a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a
     * directory, copying multiple .csr files into that directory, and then
     * specifying that directory on the command line. The following commands
     * show how to create a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * <p>
     * >
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each
     * CSR file name to the aws iot create-certificate-from-csr AWS CLI
     * command to create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also
     * be run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * > ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for
     * all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * > forfiles /p my-csr-directory /c "cmd /c aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://@path"
     * </p>
     *
     * @param createCertificateFromCsrRequest Container for the necessary
     *           parameters to execute the CreateCertificateFromCsr service method on
     *           AWSIot.
     * 
     * @return The response from the CreateCertificateFromCsr service method,
     *         as returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCertificateFromCsrResult createCertificateFromCsr(CreateCertificateFromCsrRequest createCertificateFromCsrRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     *
     * @param deleteTopicRuleRequest Container for the necessary parameters
     *           to execute the DeleteTopicRule service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        