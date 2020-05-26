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

package com.amazonaws.services.quicksight;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.quicksight.model.*;

/**
 * Interface for accessing Amazon QuickSight <fullname>Amazon QuickSight API
 * Reference</fullname>
 * <p>
 * Amazon QuickSight is a fully managed, serverless business intelligence
 * service for the AWS Cloud that makes it easy to extend data and insights to
 * every user in your organization. This API reference contains documentation
 * for a programming interface that you can use to manage Amazon QuickSight.
 * </p>
 **/
public interface AmazonQuickSight {

    /**
     * Overrides the default endpoint for this client
     * ("https://quicksight.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "quicksight.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://quicksight.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "quicksight.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://quicksight.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonQuickSight#setEndpoint(String)}, sets the
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
     * Cancels an ongoing ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @return cancelIngestionResult The response from the CancelIngestion
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CancelIngestionResult cancelIngestion(CancelIngestionRequest cancelIngestionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a dashboard from a template. To first create a template, see the
     * CreateTemplate API operation.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight that identifies QuickSight
     * reports, created from analyses. You can share QuickSight dashboards. With
     * the right permissions, you can create scheduled email reports from them.
     * The <code>CreateDashboard</code>, <code>DescribeDashboard</code>, and
     * <code>ListDashboardsByUser</code> API operations act on the dashboard
     * entity. If you have the correct permissions, you can create a dashboard
     * from a template that exists in a different AWS account.
     * </p>
     * 
     * @param createDashboardRequest
     * @return createDashboardResult The response from the CreateDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws ConflictException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDashboardResult createDashboard(CreateDashboardRequest createDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a dataset.
     * </p>
     * 
     * @param createDataSetRequest
     * @return createDataSetResult The response from the CreateDataSet service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDataSetResult createDataSet(CreateDataSetRequest createDataSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return createDataSourceResult The response from the CreateDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon QuickSight group.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * 
     * @param createGroupRequest <p>
     *            The request object for this operation.
     *            </p>
     * @return createGroupResult The response from the CreateGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return createGroupMembershipResult The response from the
     *         CreateGroupMembership service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateGroupMembershipResult createGroupMembership(
            CreateGroupMembershipRequest createGroupMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an assignment with one specified IAM policy, identified by its
     * Amazon Resource Name (ARN). This policy will be assigned to specified
     * groups or users of Amazon QuickSight. The users and groups need to be in
     * the same namespace.
     * </p>
     * 
     * @param createIAMPolicyAssignmentRequest
     * @return createIAMPolicyAssignmentResult The response from the
     *         CreateIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateIAMPolicyAssignmentResult createIAMPolicyAssignment(
            CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and starts a new SPICE ingestion on a dataset
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags
     * automatically for use in access control. For an example, see <a href=
     * "https://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/"
     * >How do I create an IAM policy to control access to Amazon EC2 resources
     * using tags?</a> in the AWS Knowledge Center. Tags are visible on the
     * tagged dataset, but not on the ingestion resource.
     * </p>
     * 
     * @param createIngestionRequest
     * @return createIngestionResult The response from the CreateIngestion
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ResourceExistsException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateIngestionResult createIngestion(CreateIngestionRequest createIngestionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a template from an existing QuickSight analysis or template. You
     * can use the resulting template to create a dashboard.
     * </p>
     * <p>
     * A <i>template</i> is an entity in QuickSight that encapsulates the
     * metadata required to create an analysis and that you can use to create s
     * dashboard. A template adds a layer of abstraction by using placeholders
     * to replace the dataset associated with the analysis. You can use
     * templates to create dashboards by replacing dataset placeholders with
     * datasets that follow the same schema that was used to create the source
     * analysis and template.
     * </p>
     * 
     * @param createTemplateRequest
     * @return createTemplateResult The response from the CreateTemplate service
     *         method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws AccessDeniedException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a template alias for a template.
     * </p>
     * 
     * @param createTemplateAliasRequest
     * @return createTemplateAliasResult The response from the
     *         CreateTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws ResourceExistsException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTemplateAliasResult createTemplateAlias(
            CreateTemplateAliasRequest createTemplateAliasRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a dashboard.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return deleteDashboardResult The response from the DeleteDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDashboardResult deleteDashboard(DeleteDashboardRequest deleteDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a dataset.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return deleteDataSetResult The response from the DeleteDataSet service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDataSetResult deleteDataSet(DeleteDataSetRequest deleteDataSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the data source permanently. This action breaks all the datasets
     * that reference the deleted data source.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return deleteDataSourceResult The response from the DeleteDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a user group from Amazon QuickSight.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return deleteGroupResult The response from the DeleteGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a user from a group so that the user is no longer a member of the
     * group.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return deleteGroupMembershipResult The response from the
     *         DeleteGroupMembership service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteGroupMembershipResult deleteGroupMembership(
            DeleteGroupMembershipRequest deleteGroupMembershipRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing IAM policy assignment.
     * </p>
     * 
     * @param deleteIAMPolicyAssignmentRequest
     * @return deleteIAMPolicyAssignmentResult The response from the
     *         DeleteIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteIAMPolicyAssignmentResult deleteIAMPolicyAssignment(
            DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a template.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return deleteTemplateResult The response from the DeleteTemplate service
     *         method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the item that the specified template alias points to. If you
     * provide a specific alias, you delete the version of the template that the
     * alias points to.
     * </p>
     * 
     * @param deleteTemplateAliasRequest
     * @return deleteTemplateAliasResult The response from the
     *         DeleteTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTemplateAliasResult deleteTemplateAlias(
            DeleteTemplateAliasRequest deleteTemplateAliasRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the Amazon QuickSight user that is associated with the identity
     * of the AWS Identity and Access Management (IAM) user or role that's
     * making the call. The IAM user isn't deleted as a result of this call.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a user identified by its principal ID.
     * </p>
     * 
     * @param deleteUserByPrincipalIdRequest <p/>
     * @return deleteUserByPrincipalIdResult The response from the
     *         DeleteUserByPrincipalId service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteUserByPrincipalIdResult deleteUserByPrincipalId(
            DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a summary for a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return describeDashboardResult The response from the DescribeDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDashboardResult describeDashboard(DescribeDashboardRequest describeDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes read and write permissions for a dashboard.
     * </p>
     * 
     * @param describeDashboardPermissionsRequest
     * @return describeDashboardPermissionsResult The response from the
     *         DescribeDashboardPermissions service method, as returned by
     *         Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDashboardPermissionsResult describeDashboardPermissions(
            DescribeDashboardPermissionsRequest describeDashboardPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a dataset.
     * </p>
     * 
     * @param describeDataSetRequest
     * @return describeDataSetResult The response from the DescribeDataSet
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDataSetResult describeDataSet(DescribeDataSetRequest describeDataSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * .
     * </p>
     * 
     * @param describeDataSetPermissionsRequest
     * @return describeDataSetPermissionsResult The response from the
     *         DescribeDataSetPermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDataSetPermissionsResult describeDataSetPermissions(
            DescribeDataSetPermissionsRequest describeDataSetPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return describeDataSourceResult The response from the DescribeDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest describeDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the resource permissions for a data source.
     * </p>
     * 
     * @param describeDataSourcePermissionsRequest
     * @return describeDataSourcePermissionsResult The response from the
     *         DescribeDataSourcePermissions service method, as returned by
     *         Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDataSourcePermissionsResult describeDataSourcePermissions(
            DescribeDataSourcePermissionsRequest describeDataSourcePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an Amazon QuickSight group's description and Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param describeGroupRequest
     * @return describeGroupResult The response from the DescribeGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an existing IAM policy assignment, as specified by the
     * assignment name.
     * </p>
     * 
     * @param describeIAMPolicyAssignmentRequest
     * @return describeIAMPolicyAssignmentResult The response from the
     *         DescribeIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeIAMPolicyAssignmentResult describeIAMPolicyAssignment(
            DescribeIAMPolicyAssignmentRequest describeIAMPolicyAssignmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a SPICE ingestion.
     * </p>
     * 
     * @param describeIngestionRequest
     * @return describeIngestionResult The response from the DescribeIngestion
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeIngestionResult describeIngestion(DescribeIngestionRequest describeIngestionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a template's metadata.
     * </p>
     * 
     * @param describeTemplateRequest
     * @return describeTemplateResult The response from the DescribeTemplate
     *         service method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws AccessDeniedException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeTemplateResult describeTemplate(DescribeTemplateRequest describeTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the template alias for a template.
     * </p>
     * 
     * @param describeTemplateAliasRequest
     * @return describeTemplateAliasResult The response from the
     *         DescribeTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeTemplateAliasResult describeTemplateAlias(
            DescribeTemplateAliasRequest describeTemplateAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes read and write permissions on a template.
     * </p>
     * 
     * @param describeTemplatePermissionsRequest
     * @return describeTemplatePermissionsResult The response from the
     *         DescribeTemplatePermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeTemplatePermissionsResult describeTemplatePermissions(
            DescribeTemplatePermissionsRequest describeTemplatePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a user, given the user name.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a server-side embeddable URL and authorization code. For this
     * process to work properly, first configure the dashboards and user
     * permissions. For more information, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/embedding-dashboards.html"
     * >Embedding Amazon QuickSight Dashboards</a> in the <i>Amazon QuickSight
     * User Guide</i> or <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/APIReference/qs-dev-embedded-dashboards.html"
     * >Embedding Amazon QuickSight Dashboards</a> in the <i>Amazon QuickSight
     * API Reference</i>.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the
     * server, not from the user’s browser.
     * </p>
     * 
     * @param getDashboardEmbedUrlRequest
     * @return getDashboardEmbedUrlResult The response from the
     *         GetDashboardEmbedUrl service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws DomainNotWhitelistedException
     * @throws QuickSightUserNotFoundException
     * @throws IdentityTypeNotSupportedException
     * @throws SessionLifetimeInMinutesInvalidException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDashboardEmbedUrlResult getDashboardEmbedUrl(
            GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the versions of the dashboards in the QuickSight subscription.
     * </p>
     * 
     * @param listDashboardVersionsRequest
     * @return listDashboardVersionsResult The response from the
     *         ListDashboardVersions service method, as returned by Amazon
     *         QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDashboardVersionsResult listDashboardVersions(
            ListDashboardVersionsRequest listDashboardVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists dashboards in an AWS account.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return listDashboardsResult The response from the ListDashboards service
     *         method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of the datasets belonging to the current AWS account in an AWS
     * Region.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return listDataSetsResult The response from the ListDataSets service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDataSetsResult listDataSets(ListDataSetsRequest listDataSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists data sources in current AWS Region that belong to this AWS account.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return listDataSourcesResult The response from the ListDataSources
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists member users in a group.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return listGroupMembershipsResult The response from the
     *         ListGroupMemberships service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGroupMembershipsResult listGroupMemberships(
            ListGroupMembershipsRequest listGroupMembershipsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all user groups in Amazon QuickSight.
     * </p>
     * 
     * @param listGroupsRequest
     * @return listGroupsResult The response from the ListGroups service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists IAM policy assignments in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsRequest
     * @return listIAMPolicyAssignmentsResult The response from the
     *         ListIAMPolicyAssignments service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListIAMPolicyAssignmentsResult listIAMPolicyAssignments(
            ListIAMPolicyAssignmentsRequest listIAMPolicyAssignmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the IAM policy assignments, including the Amazon Resource Names
     * (ARNs) for the IAM policies assigned to the specified user and group or
     * groups that the user belongs to.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsForUserRequest
     * @return listIAMPolicyAssignmentsForUserResult The response from the
     *         ListIAMPolicyAssignmentsForUser service method, as returned by
     *         Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListIAMPolicyAssignmentsForUserResult listIAMPolicyAssignmentsForUser(
            ListIAMPolicyAssignmentsForUserRequest listIAMPolicyAssignmentsForUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the history of SPICE ingestions for a dataset.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return listIngestionsResult The response from the ListIngestions service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListIngestionsResult listIngestions(ListIngestionsRequest listIngestionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the aliases of a template.
     * </p>
     * 
     * @param listTemplateAliasesRequest
     * @return listTemplateAliasesResult The response from the
     *         ListTemplateAliases service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTemplateAliasesResult listTemplateAliases(
            ListTemplateAliasesRequest listTemplateAliasesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the versions of the templates in the current Amazon QuickSight
     * account.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return listTemplateVersionsResult The response from the
     *         ListTemplateVersions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTemplateVersionsResult listTemplateVersions(
            ListTemplateVersionsRequest listTemplateVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return listTemplatesResult The response from the ListTemplates service
     *         method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a
     * member of.
     * </p>
     * 
     * @param listUserGroupsRequest
     * @return listUserGroupsResult The response from the ListUserGroups service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListUserGroupsResult listUserGroups(ListUserGroupsRequest listUserGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all of the Amazon QuickSight users belonging to this
     * account.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon QuickSight user, whose identity is associated with the
     * AWS Identity and Access Management (IAM) identity or role specified in
     * the request.
     * </p>
     * 
     * @param registerUserRequest
     * @return registerUserResult The response from the RegisterUser service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ResourceExistsException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RegisterUserResult registerUser(RegisterUserRequest registerUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searchs for dashboards that belong to a user.
     * </p>
     * 
     * @param searchDashboardsRequest
     * @return searchDashboardsResult The response from the SearchDashboards
     *         service method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws UnsupportedUserEditionException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchDashboardsResult searchDashboards(SearchDashboardsRequest searchDashboardsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified QuickSight
     * resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values. You can use the
     * <code>TagResource</code> operation with a resource that already has tags.
     * If you specify a new tag key for the resource, this tag is appended to
     * the list of tags associated with the resource. If you specify a tag key
     * that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. QuickSight supports
     * tagging on data set, data source, dashboard, and template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar way to tagging for other AWS
     * services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight. This restriction is
     * because QuickSight costs are based on users and SPICE capacity, which
     * aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource
     * Groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon QuickSight.
     * @throws LimitExceededException
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a dashboard in an AWS account.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return updateDashboardResult The response from the UpdateDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDashboardResult updateDashboard(UpdateDashboardRequest updateDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates read and write permissions on a dashboard.
     * </p>
     * 
     * @param updateDashboardPermissionsRequest
     * @return updateDashboardPermissionsResult The response from the
     *         UpdateDashboardPermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws ConflictException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDashboardPermissionsResult updateDashboardPermissions(
            UpdateDashboardPermissionsRequest updateDashboardPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the published version of a dashboard.
     * </p>
     * 
     * @param updateDashboardPublishedVersionRequest
     * @return updateDashboardPublishedVersionResult The response from the
     *         UpdateDashboardPublishedVersion service method, as returned by
     *         Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDashboardPublishedVersionResult updateDashboardPublishedVersion(
            UpdateDashboardPublishedVersionRequest updateDashboardPublishedVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a dataset.
     * </p>
     * 
     * @param updateDataSetRequest
     * @return updateDataSetResult The response from the UpdateDataSet service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDataSetResult updateDataSet(UpdateDataSetRequest updateDataSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * .
     * </p>
     * 
     * @param updateDataSetPermissionsRequest
     * @return updateDataSetPermissionsResult The response from the
     *         UpdateDataSetPermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDataSetPermissionsResult updateDataSetPermissions(
            UpdateDataSetPermissionsRequest updateDataSetPermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return updateDataSourceResult The response from the UpdateDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the permissions to a data source.
     * </p>
     * 
     * @param updateDataSourcePermissionsRequest
     * @return updateDataSourcePermissionsResult The response from the
     *         UpdateDataSourcePermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDataSourcePermissionsResult updateDataSourcePermissions(
            UpdateDataSourcePermissionsRequest updateDataSourcePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes a group description.
     * </p>
     * 
     * @param updateGroupRequest
     * @return updateGroupResult The response from the UpdateGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing IAM policy assignment. This operation updates only
     * the optional parameter or parameters that are specified in the request.
     * </p>
     * 
     * @param updateIAMPolicyAssignmentRequest
     * @return updateIAMPolicyAssignmentResult The response from the
     *         UpdateIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateIAMPolicyAssignmentResult updateIAMPolicyAssignment(
            UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a template from an existing Amazon QuickSight analysis or another
     * template.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return updateTemplateResult The response from the UpdateTemplate service
     *         method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the template alias of a template.
     * </p>
     * 
     * @param updateTemplateAliasRequest
     * @return updateTemplateAliasResult The response from the
     *         UpdateTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTemplateAliasResult updateTemplateAlias(
            UpdateTemplateAliasRequest updateTemplateAliasRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the resource permissions for a template.
     * </p>
     * 
     * @param updateTemplatePermissionsRequest
     * @return updateTemplatePermissionsResult The response from the
     *         UpdateTemplatePermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTemplatePermissionsResult updateTemplatePermissions(
            UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an Amazon QuickSight user.
     * </p>
     * 
     * @param updateUserRequest
     * @return updateUserResult The response from the UpdateUser service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest) throws AmazonClientException,
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
