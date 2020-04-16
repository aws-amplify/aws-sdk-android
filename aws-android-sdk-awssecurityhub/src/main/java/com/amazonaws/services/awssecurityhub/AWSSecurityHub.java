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

package com.amazonaws.services.awssecurityhub;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awssecurityhub.model.*;

/**
 * Interface for accessing AWS SecurityHub
 * <p>
 * Security Hub provides you with a comprehensive view of the security state of
 * your AWS environment and resources. It also provides you with the readiness
 * status of your environment based on controls from supported security
 * standards. Security Hub collects security data from AWS accounts, services,
 * and integrated third-party products and helps you analyze security trends in
 * your environment to identify the highest priority security issues. For more
 * information about Security Hub, see the <i> <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html"
 * >AWS Security Hub User Guide</a> </i>.
 * </p>
 * <p>
 * When you use operations in the Security Hub API, the requests are executed
 * only in the AWS Region that is currently active or in the specific AWS Region
 * that you specify in your request. Any configuration or settings change that
 * results from the operation is applied only to that Region. To make the same
 * change in other Regions, execute the same command for each Region to apply
 * the change to.
 * </p>
 * <p>
 * For example, if your Region is set to <code>us-west-2</code>, when you use
 * <code> <a>CreateMembers</a> </code> to add a member account to Security Hub,
 * the association of the member account with the master account is created only
 * in the <code>us-west-2</code> Region. Security Hub must be enabled for the
 * member account in the same Region that the invitation was sent from.
 * </p>
 * <p>
 * The following throttling limits apply to using Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <a>GetFindings</a> </code> - <code>RateLimit</code> of 3 requests per
 * second. <code>BurstLimit</code> of 6 requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>UpdateFindings</a> </code> - <code>RateLimit</code> of 1 request
 * per second. <code>BurstLimit</code> of 5 requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other operations - <code>RateLimit</code> of 10 requests per second.
 * <code>BurstLimit</code> of 30 requests per second.
 * </p>
 * </li>
 * </ul>
 **/
public interface AWSSecurityHub {

    /**
     * Overrides the default endpoint for this client
     * ("https://securityhub.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "securityhub.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://securityhub.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "securityhub.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://securityhub.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSSecurityHub#setEndpoint(String)}, sets the
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
     * Accepts the invitation to be a member account and be monitored by the
     * Security Hub master account that the invitation was sent from.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to
     * the master account to view findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return acceptInvitationResult The response from the AcceptInvitation
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the standards specified by the provided
     * <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html"
     * >Security Standards</a> section of the <i>AWS Security Hub User
     * Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return batchDisableStandardsResult The response from the
     *         BatchDisableStandards service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDisableStandardsResult batchDisableStandards(
            BatchDisableStandardsRequest batchDisableStandardsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the standards specified by the provided <code>StandardsArn</code>
     * . To obtain the ARN for a standard, use the
     * <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * For more information, see the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html"
     * >Security Standards</a> section of the <i>AWS Security Hub User
     * Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return batchEnableStandardsResult The response from the
     *         BatchEnableStandards service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchEnableStandardsResult batchEnableStandards(
            BatchEnableStandardsRequest batchEnableStandardsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Imports security findings generated from an integrated third-party
     * product into Security Hub. This action is requested by the integrated
     * product to import its findings into Security Hub.
     * </p>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned
     * for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be
     * used to update the following finding fields and objects, which Security
     * Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchImportFindingsRequest
     * @return batchImportFindingsResult The response from the
     *         BatchImportFindings service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchImportFindingsResult batchImportFindings(
            BatchImportFindingsRequest batchImportFindingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Used by Security Hub customers to update information about their
     * investigation into a finding. Requested by master accounts or member
     * accounts. Master accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of
     * <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Master accounts can use <code>BatchUpdateFindings</code> to update the
     * following finding fields and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts can only use <code>BatchUpdateFindings</code> to update
     * the Note object.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @return batchUpdateFindingsResult The response from the
     *         BatchUpdateFindings service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchUpdateFindingsResult batchUpdateFindings(
            BatchUpdateFindingsRequest batchUpdateFindingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to
     * trigger target actions in Amazon CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @return createActionTargetResult The response from the CreateActionTarget
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateActionTargetResult createActionTarget(CreateActionTargetRequest createActionTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation
     * of findings that relate to a security issue that requires attention or
     * remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the
     * <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @return createInsightResult The response from the CreateInsight service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateInsightResult createInsight(CreateInsightRequest createInsightRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a member association in Security Hub between the specified
     * accounts and the account used to make the request, which is the master
     * account. To successfully create a member, you must use this action from
     * an account that already has Security Hub enabled. To enable Security Hub,
     * you can use the <code> <a>EnableSecurityHub</a> </code> operation.
     * </p>
     * <p>
     * After you use <code>CreateMembers</code> to create member account
     * associations in Security Hub, you must use the
     * <code> <a>InviteMembers</a> </code> operation to invite the accounts to
     * enable Security Hub and become member accounts in Security Hub.
     * </p>
     * <p>
     * If the account owner accepts the invitation, the account becomes a member
     * account in Security Hub, and a permission policy is added that permits
     * the master account to view the findings generated in the member account.
     * When Security Hub is enabled in the invited account, findings start to be
     * sent to both the member and master accounts.
     * </p>
     * <p>
     * To remove the association between the master and member accounts, use the
     * <code> <a>DisassociateFromMasterAccount</a> </code> or
     * <code> <a>DisassociateMembers</a> </code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @return createMembersResult The response from the CreateMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return declineInvitationsResult The response from the DeclineInvitations
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights
     * that were already sent to Amazon CloudWatch Events using the custom
     * action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @return deleteActionTargetResult The response from the DeleteActionTarget
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteActionTargetResult deleteActionTarget(DeleteActionTargetRequest deleteActionTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return deleteInsightResult The response from the DeleteInsight service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInsightResult deleteInsight(DeleteInsightRequest deleteInsightRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes invitations received by the AWS account to become a member
     * account.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return deleteInvitationsResult The response from the DeleteInvitations
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return deleteMembersResult The response from the DeleteMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your
     * account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return describeActionTargetsResult The response from the
     *         DescribeActionTargets service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeActionTargetsResult describeActionTargets(
            DescribeActionTargetsRequest describeActionTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the
     * <code>HubArn</code> and the time when you enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return describeHubResult The response from the DescribeHub service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeHubResult describeHub(DescribeHubRequest describeHubRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the available products that you can subscribe
     * to and integrate with Security Hub in order to consolidate findings.
     * </p>
     * 
     * @param describeProductsRequest
     * @return describeProductsResult The response from the DescribeProducts
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeProductsResult describeProducts(DescribeProductsRequest describeProductsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a
     * description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @return describeStandardsResult The response from the DescribeStandards
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeStandardsResult describeStandards(DescribeStandardsRequest describeStandardsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is
     * currently enabled, the severity, and a link to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @return describeStandardsControlsResult The response from the
     *         DescribeStandardsControls service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeStandardsControlsResult describeStandardsControls(
            DescribeStandardsControlsRequest describeStandardsControlsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub.
     * After the integration is disabled, findings from that product are no
     * longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return disableImportFindingsForProductResult The response from the
     *         DisableImportFindingsForProduct service method, as returned by
     *         AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableImportFindingsForProductResult disableImportFindingsForProduct(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables Security Hub in your account only in the current Region. To
     * disable Security Hub in all Regions, you must submit one request per
     * Region where you have enabled Security Hub.
     * </p>
     * <p>
     * When you disable Security Hub for a master account, it doesn't disable
     * Security Hub for any associated member accounts.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and
     * any Security Hub configuration settings are deleted after 90 days and
     * cannot be recovered. Any standards that were enabled are disabled, and
     * your master and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before
     * you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return disableSecurityHubResult The response from the DisableSecurityHub
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableSecurityHubResult disableSecurityHub(DisableSecurityHubRequest disableSecurityHubRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated
     * master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return disassociateFromMasterAccountResult The response from the
     *         DisassociateFromMasterAccount service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified member accounts from the associated master
     * account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return disassociateMembersResult The response from the
     *         DisassociateMembers service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateMembersResult disassociateMembers(
            DisassociateMembersRequest disassociateMembersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub.
     * Integrated products send findings to Security Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permission policy that grants
     * permission for the product to send findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return enableImportFindingsForProductResult The response from the
     *         EnableImportFindingsForProduct service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableImportFindingsForProductResult enableImportFindingsForProduct(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables Security Hub for your account in the current Region or the Region
     * you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions
     * necessary to gather findings from other services that are integrated with
     * Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable
     * Security Hub, you also automatically enable the CIS AWS Foundations
     * standard. You do not enable the Payment Card Industry Data Security
     * Standard (PCI DSS) standard. To not enable the CIS AWS Foundations
     * standard, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the
     * <code> <a>BatchEnableStandards</a> </code> operation. To disable a
     * standard, use the <code> <a>BatchDisableStandards</a> </code> operation.
     * </p>
     * <p>
     * To learn more, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html"
     * >Setting Up AWS Security Hub</a> in the <i>AWS Security Hub User
     * Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return enableSecurityHubResult The response from the EnableSecurityHub
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableSecurityHubResult enableSecurityHub(EnableSecurityHubRequest enableSecurityHubRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return getEnabledStandardsResult The response from the
     *         GetEnabledStandards service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetEnabledStandardsResult getEnabledStandards(
            GetEnabledStandardsRequest getEnabledStandardsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * 
     * @param getFindingsRequest
     * @return getFindingsResult The response from the GetFindings service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight
     * ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return getInsightResultsResult The response from the GetInsightResults
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInsightResultsResult getInsightResults(GetInsightResultsRequest getInsightResultsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return getInsightsResult The response from the GetInsights service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInsightsResult getInsights(GetInsightsRequest getInsightsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were
     * sent to the current member account, not including the currently accepted
     * invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return getInvitationsCountResult The response from the
     *         GetInvitationsCount service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInvitationsCountResult getInvitationsCount(
            GetInvitationsCountRequest getInvitationsCountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides the details for the Security Hub master account for the current
     * member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return getMasterAccountResult The response from the GetMasterAccount
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the details for the Security Hub member accounts for the
     * specified account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return getMembersResult The response from the GetMembers service method,
     *         as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Invites other AWS accounts to become member accounts for the Security Hub
     * master account that the invitation is sent from.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the
     * <code> <a>CreateMembers</a> </code> action to create the member account
     * in Security Hub.
     * </p>
     * <p>
     * When the account owner accepts the invitation to become a member account
     * and enables Security Hub, the master account can view the findings
     * generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return inviteMembersResult The response from the InviteMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are
     * subscribed to receive findings from in Security Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return listEnabledProductsForImportResult The response from the
     *         ListEnabledProductsForImport service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListEnabledProductsForImportResult listEnabledProductsForImport(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the
     * current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return listInvitationsResult The response from the ListInvitations
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub
     * master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return listMembersResult The response from the ListMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and description of a custom action target in Security
     * Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return updateActionTargetResult The response from the UpdateActionTarget
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateActionTargetResult updateActionTarget(UpdateActionTargetRequest updateActionTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * <code>UpdateFindings</code> is deprecated. Instead of
     * <code>UpdateFindings</code>, use <code>BatchUpdateFindings</code>.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the
     * Security Hub-aggregated findings that the filter attributes specify. Any
     * member account that can view the finding also sees the update to the
     * finding.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return updateFindingsResult The response from the UpdateFindings service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateFindingsResult updateFindings(UpdateFindingsRequest updateFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return updateInsightResult The response from the UpdateInsight service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateInsightResult updateInsight(UpdateInsightRequest updateInsightRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Used to control whether an individual security standard control is
     * enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @return updateStandardsControlResult The response from the
     *         UpdateStandardsControl service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateStandardsControlResult updateStandardsControl(
            UpdateStandardsControlRequest updateStandardsControlRequest)
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
