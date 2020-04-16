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

package com.amazonaws.services.awsmigrationhub;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsmigrationhub.model.*;

/**
 * Interface for accessing AWS Migration Hub
 * <p>
 * The AWS Migration Hub API methods help to obtain server and application
 * migration status and integrate your resource-specific migration tool by
 * providing a programmatic interface to Migration Hub.
 * </p>
 * <p>
 * Remember that you must set your AWS Migration Hub home region before you call
 * any of these APIs, or a <code>HomeRegionNotSetException</code> error will be
 * returned. Also, you must make the API calls while in your home region.
 * </p>
 **/
public interface AWSMigrationHub {

    /**
     * Overrides the default endpoint for this client
     * ("https://mgh.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "mgh.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://mgh.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "mgh.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://mgh.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSMigrationHub#setEndpoint(String)}, sets the
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
     * Associates a created artifact of an AWS cloud resource, the target
     * receiving the migration, with the migration task performed by a migration
     * tool. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools can call the <code>AssociateCreatedArtifact</code>
     * operation to indicate which AWS artifact is associated with a migration
     * task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name)
     * format which will contain information about type and region; for example:
     * <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2
     * instance, or DMS endpoint, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateCreatedArtifactRequest
     * @return associateCreatedArtifactResult The response from the
     *         AssociateCreatedArtifact service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateCreatedArtifactResult associateCreatedArtifact(
            AssociateCreatedArtifactRequest associateCreatedArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a discovered resource ID from Application Discovery Service
     * with a migration task.
     * </p>
     * 
     * @param associateDiscoveredResourceRequest
     * @return associateDiscoveredResourceResult The response from the
     *         AssociateDiscoveredResource service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateDiscoveredResourceResult associateDiscoveredResource(
            AssociateDiscoveredResourceRequest associateDiscoveredResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a progress update stream which is an AWS resource used for access
     * control as well as a namespace for migration task names that is
     * implicitly linked to your AWS account. It must uniquely identify the
     * migration tool as it is used for all updates made by the tool; however,
     * it does not need to be unique for each AWS account because it is scoped
     * to the AWS account.
     * </p>
     * 
     * @param createProgressUpdateStreamRequest
     * @return createProgressUpdateStreamResult The response from the
     *         CreateProgressUpdateStream service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateProgressUpdateStreamResult createProgressUpdateStream(
            CreateProgressUpdateStreamRequest createProgressUpdateStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a progress update stream, including all of its tasks, which was
     * previously created as an AWS resource used for access control. This API
     * has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The only parameter needed for <code>DeleteProgressUpdateStream</code> is
     * the stream name (same as a <code>CreateProgressUpdateStream</code> call).
     * </p>
     * </li>
     * <li>
     * <p>
     * The call will return, and a background process will asynchronously delete
     * the stream and all of its resources (tasks, associated resources,
     * resource attributes, created artifacts).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the stream takes time to be deleted, it might still show up on a
     * <code>ListProgressUpdateStreams</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateProgressUpdateStream</code>, <code>ImportMigrationTask</code>, <code>NotifyMigrationTaskState</code>, and all Associate[*] APIs
     * related to the tasks belonging to the stream will throw
     * "InvalidInputException" if the stream of the same name is in the process
     * of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the stream and all of its resources are deleted,
     * <code>CreateProgressUpdateStream</code> for a stream of the same name
     * will succeed, and that stream will be an entirely new logical resource
     * (without any resources associated with the old stream).
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteProgressUpdateStreamRequest
     * @return deleteProgressUpdateStreamResult The response from the
     *         DeleteProgressUpdateStream service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteProgressUpdateStreamResult deleteProgressUpdateStream(
            DeleteProgressUpdateStreamRequest deleteProgressUpdateStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the migration status of an application.
     * </p>
     * 
     * @param describeApplicationStateRequest
     * @return describeApplicationStateResult The response from the
     *         DescribeApplicationState service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeApplicationStateResult describeApplicationState(
            DescribeApplicationStateRequest describeApplicationStateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of all attributes associated with a specific migration
     * task.
     * </p>
     * 
     * @param describeMigrationTaskRequest
     * @return describeMigrationTaskResult The response from the
     *         DescribeMigrationTask service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeMigrationTaskResult describeMigrationTask(
            DescribeMigrationTaskRequest describeMigrationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a created artifact of an AWS resource with a migration task
     * performed by a migration tool that was previously associated. This API
     * has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A migration user can call the <code>DisassociateCreatedArtifacts</code>
     * operation to disassociate a created AWS Artifact from a migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name)
     * format which will contain information about type and region; for example:
     * <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2
     * instance, or RDS instance, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateCreatedArtifactRequest
     * @return disassociateCreatedArtifactResult The response from the
     *         DisassociateCreatedArtifact service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateCreatedArtifactResult disassociateCreatedArtifact(
            DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociate an Application Discovery Service discovered resource from a
     * migration task.
     * </p>
     * 
     * @param disassociateDiscoveredResourceRequest
     * @return disassociateDiscoveredResourceResult The response from the
     *         DisassociateDiscoveredResource service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateDiscoveredResourceResult disassociateDiscoveredResource(
            DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a new migration task which represents a server, database, etc.,
     * being migrated to AWS by a migration tool.
     * </p>
     * <p>
     * This API is a prerequisite to calling the
     * <code>NotifyMigrationTaskState</code> API as the migration tool must
     * first register the migration task with Migration Hub.
     * </p>
     * 
     * @param importMigrationTaskRequest
     * @return importMigrationTaskResult The response from the
     *         ImportMigrationTask service method, as returned by AWS Migration
     *         Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ImportMigrationTaskResult importMigrationTask(
            ImportMigrationTaskRequest importMigrationTaskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the migration statuses for your applications. If you use the
     * optional <code>ApplicationIds</code> parameter, only the migration
     * statuses for those applications will be returned.
     * </p>
     * 
     * @param listApplicationStatesRequest
     * @return listApplicationStatesResult The response from the
     *         ListApplicationStates service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListApplicationStatesResult listApplicationStates(
            ListApplicationStatesRequest listApplicationStatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the created artifacts attached to a given migration task in an
     * update stream. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Gets the list of the created artifacts while migration is taking place.
     * </p>
     * </li>
     * <li>
     * <p>
     * Shows the artifacts created by the migration tool that was associated by
     * the <code>AssociateCreatedArtifact</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists created artifacts in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listCreatedArtifactsRequest
     * @return listCreatedArtifactsResult The response from the
     *         ListCreatedArtifacts service method, as returned by AWS Migration
     *         Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListCreatedArtifactsResult listCreatedArtifacts(
            ListCreatedArtifactsRequest listCreatedArtifactsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists discovered resources associated with the given
     * <code>MigrationTask</code>.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return listDiscoveredResourcesResult The response from the
     *         ListDiscoveredResources service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListDiscoveredResourcesResult listDiscoveredResources(
            ListDiscoveredResourcesRequest listDiscoveredResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all, or filtered by resource name, migration tasks associated with
     * the user account making this call. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can show a summary list of the most recent migration tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can show a summary list of migration tasks associated with a given
     * discovered resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists migration tasks in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMigrationTasksRequest
     * @return listMigrationTasksResult The response from the ListMigrationTasks
     *         service method, as returned by AWS Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListMigrationTasksResult listMigrationTasks(ListMigrationTasksRequest listMigrationTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists progress update streams associated with the user account making
     * this call.
     * </p>
     * 
     * @param listProgressUpdateStreamsRequest
     * @return listProgressUpdateStreamsResult The response from the
     *         ListProgressUpdateStreams service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListProgressUpdateStreamsResult listProgressUpdateStreams(
            ListProgressUpdateStreamsRequest listProgressUpdateStreamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the migration state of an application. For a given application
     * identified by the value passed to <code>ApplicationId</code>, its status
     * is set or updated by passing one of three values to <code>Status</code>:
     * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
     * </p>
     * 
     * @param notifyApplicationStateRequest
     * @return notifyApplicationStateResult The response from the
     *         NotifyApplicationState service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    NotifyApplicationStateResult notifyApplicationState(
            NotifyApplicationStateRequest notifyApplicationStateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Notifies Migration Hub of the current status, progress, or other detail
     * regarding a migration task. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools will call the <code>NotifyMigrationTaskState</code> API
     * to share the latest progress and status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MigrationTaskName</code> is used for addressing updates to the
     * correct target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProgressUpdateStream</code> is used for access control and to
     * provide a namespace for each migration tool.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifyMigrationTaskStateRequest
     * @return notifyMigrationTaskStateResult The response from the
     *         NotifyMigrationTaskState service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    NotifyMigrationTaskStateResult notifyMigrationTaskState(
            NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides identifying details of the resource being migrated so that it
     * can be associated in the Application Discovery Service repository. This
     * association occurs asynchronously after
     * <code>PutResourceAttributes</code> returns.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * Keep in mind that subsequent calls to PutResourceAttributes will override
     * previously stored attributes. For example, if it is first called with a
     * MAC address, but later, it is desired to <i>add</i> an IP address, it
     * will then be required to call it with <i>both</i> the IP and MAC
     * addresses to prevent overriding the MAC address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Note the instructions regarding the special use case of the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#migrationhub-PutResourceAttributes-request-ResourceAttributeList"
     * > <code>ResourceAttributeList</code> </a> parameter when specifying any
     * "VM" related value.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * Because this is an asynchronous call, it will always return 200, whether
     * an association occurs or not. To confirm if an association was found
     * based on the provided details, call <code>ListDiscoveredResources</code>.
     * </p>
     * </note>
     * 
     * @param putResourceAttributesRequest
     * @return putResourceAttributesResult The response from the
     *         PutResourceAttributes service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutResourceAttributesResult putResourceAttributes(
            PutResourceAttributesRequest putResourceAttributesRequest)
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
