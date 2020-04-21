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

package com.amazonaws.services.amazonguardduty;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonguardduty.model.*;

/**
 * Interface for accessing Amazon GuardDuty
 * <p>
 * Amazon GuardDuty is a continuous security monitoring service that analyzes
 * and processes the following data sources: VPC Flow Logs, AWS CloudTrail event
 * logs, and DNS logs. It uses threat intelligence feeds (such as lists of
 * malicious IPs and domains) and machine learning to identify unexpected,
 * potentially unauthorized, and malicious activity within your AWS environment.
 * This can include issues like escalations of privileges, uses of exposed
 * credentials, or communication with malicious IPs, URLs, or domains. For
 * example, GuardDuty can detect compromised EC2 instances that serve malware or
 * mine bitcoin.
 * </p>
 * <p>
 * GuardDuty also monitors AWS account access behavior for signs of compromise.
 * Some examples of this are unauthorized infrastructure deployments such as EC2
 * instances deployed in a Region that has never been used, or unusual API calls
 * like a password policy change to reduce password strength.
 * </p>
 * <p>
 * GuardDuty informs you of the status of your AWS environment by producing
 * security findings that you can view in the GuardDuty console or through
 * Amazon CloudWatch events. For more information, see the <i> <a href=
 * "https://docs.aws.amazon.com/guardduty/latest/ug/what-is-guardduty.html"
 * >Amazon GuardDuty User Guide</a> </i>.
 * </p>
 **/
public interface AmazonGuardDuty {

    /**
     * Overrides the default endpoint for this client
     * ("https://guardduty.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "guardduty.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://guardduty.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "guardduty.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://guardduty.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonGuardDuty#setEndpoint(String)}, sets the
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
     * Accepts the invitation to be monitored by a master GuardDuty account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return acceptInvitationResult The response from the AcceptInvitation
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Archives GuardDuty findings that are specified by the list of finding
     * IDs.
     * </p>
     * <note>
     * <p>
     * Only the master account can archive findings. Member accounts don't have
     * permission to archive findings from their accounts.
     * </p>
     * </note>
     * 
     * @param archiveFindingsRequest
     * @return archiveFindingsResult The response from the ArchiveFindings
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ArchiveFindingsResult archiveFindings(ArchiveFindingsRequest archiveFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a single Amazon GuardDuty detector. A detector is a resource that
     * represents the GuardDuty service. To start using GuardDuty, you must
     * create a detector in each Region where you enable the service. You can
     * have only one detector per account per Region.
     * </p>
     * 
     * @param createDetectorRequest
     * @return createDetectorResult The response from the CreateDetector service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDetectorResult createDetector(CreateDetectorRequest createDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a filter using the specified finding criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @return createFilterResult The response from the CreateFilter service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console
     * user interface. An IPSet is a list of IP addresses that are trusted for
     * secure communication with AWS infrastructure and applications. GuardDuty
     * doesn't generate findings for IP addresses that are included in IPSets.
     * Only users from the master account can use this operation.
     * </p>
     * 
     * @param createIPSetRequest
     * @return createIPSetResult The response from the CreateIPSet service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates member accounts of the current AWS account by specifying a list
     * of AWS account IDs. The current AWS account can then invite these members
     * to manage GuardDuty in their accounts.
     * </p>
     * 
     * @param createMembersRequest
     * @return createMembersResult The response from the CreateMembers service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a publishing destination to export findings to. The resource to
     * export findings to must exist before you use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @return createPublishingDestinationResult The response from the
     *         CreatePublishingDestination service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreatePublishingDestinationResult createPublishingDestination(
            CreatePublishingDestinationRequest createPublishingDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates example findings of types specified by the list of finding
     * types. If 'NULL' is specified for <code>findingTypes</code>, the API
     * generates example findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return createSampleFindingsResult The response from the
     *         CreateSampleFindings service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSampleFindingsResult createSampleFindings(
            CreateSampleFindingsRequest createSampleFindingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious
     * IP addresses. GuardDuty generates findings based on ThreatIntelSets. Only
     * users of the master account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
     * @return createThreatIntelSetResult The response from the
     *         CreateThreatIntelSet service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateThreatIntelSetResult createThreatIntelSet(
            CreateThreatIntelSetRequest createThreatIntelSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Declines invitations sent to the current member account by AWS accounts
     * specified by their account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return declineInvitationsResult The response from the DeclineInvitations
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector
     * ID.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return deleteDetectorResult The response from the DeleteDetector service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return deleteFilterResult The response from the DeleteFilter service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteFilterResult deleteFilter(DeleteFilterRequest deleteFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are
     * called trusted IP lists in the console user interface.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return deleteIPSetResult The response from the DeleteIPSet service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes invitations sent to the current member account by AWS accounts
     * specified by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return deleteInvitationsResult The response from the DeleteInvitations
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes GuardDuty member accounts (to the current GuardDuty master
     * account) specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return deleteMembersResult The response from the DeleteMembers service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the publishing definition with the specified
     * <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @return deletePublishingDestinationResult The response from the
     *         DeletePublishingDestination service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeletePublishingDestinationResult deletePublishingDestination(
            DeletePublishingDestinationRequest deletePublishingDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param deleteThreatIntelSetRequest
     * @return deleteThreatIntelSetResult The response from the
     *         DeleteThreatIntelSet service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteThreatIntelSetResult deleteThreatIntelSet(
            DeleteThreatIntelSetRequest deleteThreatIntelSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about the account selected as the delegated
     * administrator for GuardDuty.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return describeOrganizationConfigurationResult The response from the
     *         DescribeOrganizationConfiguration service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the publishing destination specified by the
     * provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @return describePublishingDestinationResult The response from the
     *         DescribePublishingDestination service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribePublishingDestinationResult describePublishingDestination(
            DescribePublishingDestinationRequest describePublishingDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables GuardDuty administrator permissions for an AWS account within
     * the Organization.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return disableOrganizationAdminAccountResult The response from the
     *         DisableOrganizationAdminAccount service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the current GuardDuty member account from its master
     * account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return disassociateFromMasterAccountResult The response from the
     *         DisassociateFromMasterAccount service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates GuardDuty member accounts (to the current GuardDuty master
     * account) specified by the account IDs.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return disassociateMembersResult The response from the
     *         DisassociateMembers service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateMembersResult disassociateMembers(
            DisassociateMembersRequest disassociateMembersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Enables GuardDuty administrator permissions for an AWS account within the
     * organization.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return enableOrganizationAdminAccountResult The response from the
     *         EnableOrganizationAdminAccount service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param getDetectorRequest
     * @return getDetectorResult The response from the GetDetector service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDetectorResult getDetector(GetDetectorRequest getDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
     * 
     * @param getFilterRequest
     * @return getFilterResult The response from the GetFilter service method,
     *         as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFilterResult getFilter(GetFilterRequest getFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
     * @return getFindingsResult The response from the GetFindings service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists Amazon GuardDuty findings statistics for the specified detector ID.
     * </p>
     * 
     * @param getFindingsStatisticsRequest
     * @return getFindingsStatisticsResult The response from the
     *         GetFindingsStatistics service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingsStatisticsResult getFindingsStatistics(
            GetFindingsStatisticsRequest getFindingsStatisticsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return getIPSetResult The response from the GetIPSet service method, as
     *         returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent
     * to the current member account except the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return getInvitationsCountResult The response from the
     *         GetInvitationsCount service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInvitationsCountResult getInvitationsCount(
            GetInvitationsCountRequest getInvitationsCountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides the details for the GuardDuty master account associated with the
     * current GuardDuty member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return getMasterAccountResult The response from the GetMasterAccount
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves GuardDuty member accounts (to the current GuardDuty master
     * account) specified by the account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return getMembersResult The response from the GetMembers service method,
     *         as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param getThreatIntelSetRequest
     * @return getThreatIntelSetResult The response from the GetThreatIntelSet
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest getThreatIntelSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Invites other AWS accounts (created as members of the current AWS account
     * by CreateMembers) to enable GuardDuty, and allow the current AWS account
     * to view and manage these accounts' GuardDuty findings on their behalf as
     * the master account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return inviteMembersResult The response from the InviteMembers service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector
     * resources.
     * </p>
     * 
     * @param listDetectorsRequest
     * @return listDetectorsResult The response from the ListDetectors service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDetectorsResult listDetectors(ListDetectorsRequest listDetectorsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
     * 
     * @param listFiltersRequest
     * @return listFiltersResult The response from the ListFilters service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * </p>
     * 
     * @param listFindingsRequest
     * @return listFindingsResult The response from the ListFindings service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     * If you use this operation from a member account, the IPSets returned are
     * the IPSets from the associated master account.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return listIPSetsResult The response from the ListIPSets service method,
     *         as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current
     * AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return listInvitationsResult The response from the ListInvitations
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists details about associated member accounts for the current GuardDuty
     * master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return listMembersResult The response from the ListMembers service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the accounts configured as AWS Organization delegated
     * administrators.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return listOrganizationAdminAccountsResult The response from the
     *         ListOrganizationAdminAccounts service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified
     * <code>dectectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @return listPublishingDestinationsResult The response from the
     *         ListPublishingDestinations service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPublishingDestinationsResult listPublishingDestinations(
            ListPublishingDestinationsRequest listPublishingDestinationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors,
     * finding filters, IP sets, and threat intel sets, with a limit of 50 tags
     * per resource. When invoked, this operation returns all assigned tags for
     * a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the
     * detector ID. If you use this operation from a member account, the
     * ThreatIntelSets associated with the master account are returned.
     * </p>
     * 
     * @param listThreatIntelSetsRequest
     * @return listThreatIntelSetsResult The response from the
     *         ListThreatIntelSets service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListThreatIntelSetsResult listThreatIntelSets(
            ListThreatIntelSetsRequest listThreatIntelSetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this
     * operation to restart monitoring of accounts that you stopped monitoring
     * with the <code>StopMonitoringMembers</code> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
     * @return startMonitoringMembersResult The response from the
     *         StartMonitoringMembers service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartMonitoringMembersResult startMonitoringMembers(
            StartMonitoringMembersRequest startMonitoringMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops GuardDuty monitoring for the specified member accounts. Use the
     * <code>StartMonitoringMembers</code> operation to restart monitoring for
     * those accounts.
     * </p>
     * 
     * @param stopMonitoringMembersRequest
     * @return stopMonitoringMembersResult The response from the
     *         StopMonitoringMembers service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopMonitoringMembersResult stopMonitoringMembers(
            StopMonitoringMembersRequest stopMonitoringMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return unarchiveFindingsResult The response from the UnarchiveFindings
     *         service method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UnarchiveFindingsResult unarchiveFindings(UnarchiveFindingsRequest unarchiveFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * 
     * @param updateDetectorRequest
     * @return updateDetectorResult The response from the UpdateDetector service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDetectorResult updateDetector(UpdateDetectorRequest updateDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
     * @return updateFilterResult The response from the UpdateFilter service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateFilterResult updateFilter(UpdateFilterRequest updateFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
     * @return updateFindingsFeedbackResult The response from the
     *         UpdateFindingsFeedback service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateFindingsFeedbackResult updateFindingsFeedback(
            UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return updateIPSetResult The response from the UpdateIPSet service
     *         method, as returned by Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the delegated administrator account with the values provided.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return updateOrganizationConfigurationResult The response from the
     *         UpdateOrganizationConfiguration service method, as returned by
     *         Amazon GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates information about the publishing destination specified by the
     * <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @return updatePublishingDestinationResult The response from the
     *         UpdatePublishingDestination service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdatePublishingDestinationResult updatePublishingDestination(
            UpdatePublishingDestinationRequest updatePublishingDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
     * @return updateThreatIntelSetResult The response from the
     *         UpdateThreatIntelSet service method, as returned by Amazon
     *         GuardDuty.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             GuardDuty indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateThreatIntelSetResult updateThreatIntelSet(
            UpdateThreatIntelSetRequest updateThreatIntelSetRequest) throws AmazonClientException,
            AmazonServiceException;

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
