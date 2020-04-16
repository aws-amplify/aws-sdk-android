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

package com.amazonaws.services.ssm;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.ssm.model.*;

/**
 * Interface for accessing Amazon Simple Systems Manager (SSM) asynchronously.
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate
 * management tasks such as collecting system inventory, applying operating
 * system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems
 * Manager lets you remotely and securely manage the configuration of your
 * managed instances. A <i>managed instance</i> is any Amazon EC2 instance or
 * on-premises machine in your hybrid environment that has been configured for
 * Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS
 * Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For
 * more information, see <a href=
 * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html"
 * >Setting Up AWS Systems Manager</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on Amazon EC2
 * instances, see the <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API
 * Reference</a>. For information about how to use a Query API, see <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html"
 * >Making API Requests</a>.
 * </p>
 **/
public interface AmazonSSMAsync extends AmazonSSM {
    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are
     * metadata that you can assign to your documents, managed instances,
     * maintenance windows, Parameter Store parameters, and patch baselines.
     * Tags enable you to categorize your resources in different ways, for
     * example, by purpose, owner, or environment. Each tag consists of a key
     * and an optional value, both of which you define. For example, you could
     * define a set of tags for your account's managed instances that helps you
     * track each instance's owner and stack level. For example: Key=Owner and
     * Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production,
     * Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for
     * each resource type. Using a consistent set of tag keys makes it easier
     * for you to manage your resources. You can search and filter the resources
     * based on the tags you add. Tags don't have any semantic meaning to Amazon
     * EC2 and are interpreted strictly as a string of characters.
     * </p>
     * <p>
     * For more information about tags, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyTagsErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest addTagsToResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are
     * metadata that you can assign to your documents, managed instances,
     * maintenance windows, Parameter Store parameters, and patch baselines.
     * Tags enable you to categorize your resources in different ways, for
     * example, by purpose, owner, or environment. Each tag consists of a key
     * and an optional value, both of which you define. For example, you could
     * define a set of tags for your account's managed instances that helps you
     * track each instance's owner and stack level. For example: Key=Owner and
     * Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production,
     * Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for
     * each resource type. Using a consistent set of tag keys makes it easier
     * for you to manage your resources. You can search and filter the resources
     * based on the tags you add. Tags don't have any semantic meaning to Amazon
     * EC2 and are interpreted strictly as a string of characters.
     * </p>
     * <p>
     * For more information about tags, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyTagsErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest addTagsToResourceRequest,
            AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest <p/>
     * @return A Java Future object containing the response from the
     *         CancelCommand service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws DuplicateInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest cancelCommandRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CancelCommand service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws DuplicateInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest cancelCommandRequest,
            AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and
     * cancels any tasks in the window that have not already starting running.
     * (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return A Java Future object containing the response from the
     *         CancelMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and
     * cancels any tasks in the window that have not already starting running.
     * (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CancelMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest,
            AsyncHandler<CancelMaintenanceWindowExecutionRequest, CancelMaintenanceWindowExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register
     * your on-premises server or virtual machine (VM) with Systems Manager.
     * Registering these machines with Systems Manager makes it possible to
     * manage them using Systems Manager capabilities. You use the activation
     * code and ID when installing SSM Agent on machines in your hybrid
     * environment. For more information about requirements for managing
     * on-premises instances and VMs using Systems Manager, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
     * >Setting Up AWS Systems Manager for Hybrid Environments</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and
     * Amazon EC2 instances that you manage with Systems Manager are all called
     * <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @return A Java Future object containing the response from the
     *         CreateActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateActivationResult> createActivationAsync(
            CreateActivationRequest createActivationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register
     * your on-premises server or virtual machine (VM) with Systems Manager.
     * Registering these machines with Systems Manager makes it possible to
     * manage them using Systems Manager capabilities. You use the activation
     * code and ID when installing SSM Agent on machines in your hybrid
     * environment. For more information about requirements for managing
     * on-premises instances and VMs using Systems Manager, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
     * >Setting Up AWS Systems Manager for Hybrid Environments</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and
     * Amazon EC2 instances that you manage with Systems Manager are all called
     * <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateActivationResult> createActivationAsync(
            CreateActivationRequest createActivationRequest,
            AsyncHandler<CreateActivationRequest, CreateActivationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationAlreadyExistsException
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidParametersException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest createAssociationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationAlreadyExistsException
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidParametersException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest createAssociationRequest,
            AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return A Java Future object containing the response from the
     *         CreateAssociationBatch service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws InvalidParametersException
     * @throws DuplicateInstanceIdException
     * @throws AssociationLimitExceededException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest createAssociationBatchRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateAssociationBatch service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws InvalidParametersException
     * @throws DuplicateInstanceIdException
     * @throws AssociationLimitExceededException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest createAssociationBatchRequest,
            AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Systems Manager document.
     * </p>
     * <p>
     * After you create a document, you can use CreateAssociation to associate
     * it with one or more running instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @return A Java Future object containing the response from the
     *         CreateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Systems Manager document.
     * </p>
     * <p>
     * After you create a document, you can use CreateAssociation to associate
     * it with one or more running instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest,
            AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         CreateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(
            CreateMaintenanceWindowRequest createMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(
            CreateMaintenanceWindowRequest createMaintenanceWindowRequest,
            AsyncHandler<CreateMaintenanceWindowRequest, CreateMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to create a new OpsItem. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return A Java Future object containing the response from the
     *         CreateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateOpsItemResult> createOpsItemAsync(CreateOpsItemRequest createOpsItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to create a new OpsItem. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateOpsItemResult> createOpsItemAsync(CreateOpsItemRequest createOpsItemRequest,
            AsyncHandler<CreateOpsItemRequest, CreateOpsItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         CreatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreatePatchBaselineResult> createPatchBaselineAsync(
            CreatePatchBaselineRequest createPatchBaselineRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreatePatchBaselineResult> createPatchBaselineAsync(
            CreatePatchBaselineRequest createPatchBaselineRequest,
            AsyncHandler<CreatePatchBaselineRequest, CreatePatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a
     * single location. Systems Manager offers two types of resource data sync:
     * <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the
     * <code>SyncToDestination</code> type to synchronize Inventory data from
     * multiple AWS Regions to a single Amazon S3 bucket. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html"
     * >Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the
     * <code>SyncFromSource</code> type to synchronize operational work items
     * (OpsItems) and operational data (OpsData) from multiple AWS Regions to a
     * single Amazon S3 bucket. This type can synchronize OpsItems and OpsData
     * from multiple AWS accounts and Regions or <code>EntireOrganization</code>
     * by using AWS Organizations. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html"
     * >Setting Up Explorer to Display Data from Multiple Accounts and
     * Regions</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns
     * immediately. After a successful initial sync is completed, the system
     * continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend
     * that you enable encryption in Amazon S3 to ensure secure data storage. We
     * also recommend that you secure access to the Amazon S3 bucket by creating
     * a restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         CreateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncCountExceededException
     * @throws ResourceDataSyncAlreadyExistsException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(
            CreateResourceDataSyncRequest createResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a
     * single location. Systems Manager offers two types of resource data sync:
     * <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the
     * <code>SyncToDestination</code> type to synchronize Inventory data from
     * multiple AWS Regions to a single Amazon S3 bucket. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html"
     * >Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the
     * <code>SyncFromSource</code> type to synchronize operational work items
     * (OpsItems) and operational data (OpsData) from multiple AWS Regions to a
     * single Amazon S3 bucket. This type can synchronize OpsItems and OpsData
     * from multiple AWS accounts and Regions or <code>EntireOrganization</code>
     * by using AWS Organizations. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html"
     * >Setting Up Explorer to Display Data from Multiple Accounts and
     * Regions</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns
     * immediately. After a successful initial sync is completed, the system
     * continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend
     * that you enable encryption in Amazon S3 to ensure secure data storage. We
     * also recommend that you secure access to the Amazon S3 bucket by creating
     * a restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncCountExceededException
     * @throws ResourceDataSyncAlreadyExistsException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(
            CreateResourceDataSyncRequest createResourceDataSyncRequest,
            AsyncHandler<CreateResourceDataSyncRequest, CreateResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If
     * you delete an activation, you can no longer use it to register additional
     * managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return A Java Future object containing the response from the
     *         DeleteActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidActivationIdException
     * @throws InvalidActivationException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteActivationResult> deleteActivationAsync(
            DeleteActivationRequest deleteActivationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If
     * you delete an activation, you can no longer use it to register additional
     * managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidActivationIdException
     * @throws InvalidActivationException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteActivationResult> deleteActivationAsync(
            DeleteActivationRequest deleteActivationRequest,
            AsyncHandler<DeleteActivationRequest, DeleteActivationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the
     * configuration of the instance. To change the configuration state of an
     * instance after you disassociate a document, you must create a new
     * document with the desired configuration and associate it with the
     * instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return A Java Future object containing the response from the
     *         DeleteAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest deleteAssociationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the
     * configuration of the instance. To change the configuration state of an
     * instance after you disassociate a document, you must create a new
     * document with the desired configuration and associate it with the
     * instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest deleteAssociationRequest,
            AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the
     * document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use
     * <a>DeleteAssociation</a> to disassociate all instances that are
     * associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return A Java Future object containing the response from the
     *         DeleteDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AssociatedInstancesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the
     * document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use
     * <a>DeleteAssociation</a> to disassociate all instances that are
     * associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AssociatedInstancesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest,
            AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom
     * Inventory type. Deleting a custom inventory type is also referred to as
     * deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return A Java Future object containing the response from the
     *         DeleteInventory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidOptionException
     * @throws InvalidDeleteInventoryParametersException
     * @throws InvalidInventoryRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteInventoryResult> deleteInventoryAsync(DeleteInventoryRequest deleteInventoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom
     * Inventory type. Deleting a custom inventory type is also referred to as
     * deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteInventory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidOptionException
     * @throws InvalidDeleteInventoryParametersException
     * @throws InvalidInventoryRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteInventoryResult> deleteInventoryAsync(
            DeleteInventoryRequest deleteInventoryRequest,
            AsyncHandler<DeleteInventoryRequest, DeleteInventoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeleteMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(
            DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(
            DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest,
            AsyncHandler<DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return A Java Future object containing the response from the
     *         DeleteParameter service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest deleteParameterRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteParameter service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteParameterResult> deleteParameterAsync(
            DeleteParameterRequest deleteParameterRequest,
            AsyncHandler<DeleteParameterRequest, DeleteParameterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return A Java Future object containing the response from the
     *         DeleteParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteParametersResult> deleteParametersAsync(
            DeleteParametersRequest deleteParametersRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteParametersResult> deleteParametersAsync(
            DeleteParametersRequest deleteParametersRequest,
            AsyncHandler<DeleteParametersRequest, DeleteParametersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         DeletePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeletePatchBaselineResult> deletePatchBaselineAsync(
            DeletePatchBaselineRequest deletePatchBaselineRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeletePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeletePatchBaselineResult> deletePatchBaselineAsync(
            DeletePatchBaselineRequest deletePatchBaselineRequest,
            AsyncHandler<DeletePatchBaselineRequest, DeletePatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is
     * deleted, changes to data on managed instances are no longer synced to or
     * from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         DeleteResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(
            DeleteResourceDataSyncRequest deleteResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is
     * deleted, changes to data on managed instances are no longer synced to or
     * from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(
            DeleteResourceDataSyncRequest deleteResourceDataSyncRequest,
            AsyncHandler<DeleteResourceDataSyncRequest, DeleteResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered
     * servers. You can reregister the instance again at any time. If you don't
     * plan to use Run Command on the server, we suggest uninstalling SSM Agent
     * first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return A Java Future object containing the response from the
     *         DeregisterManagedInstance service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered
     * servers. You can reregister the instance again at any time. If you don't
     * plan to use Run Command on the server, we suggest uninstalling SSM Agent
     * first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeregisterManagedInstance service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest,
            AsyncHandler<DeregisterManagedInstanceRequest, DeregisterManagedInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         DeregisterPatchBaselineForPatchGroup service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeregisterPatchBaselineForPatchGroup service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest,
            AsyncHandler<DeregisterPatchBaselineForPatchGroupRequest, DeregisterPatchBaselineForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeregisterTargetFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws TargetInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeregisterTargetFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws TargetInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest,
            AsyncHandler<DeregisterTargetFromMaintenanceWindowRequest, DeregisterTargetFromMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeregisterTaskFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeregisterTaskFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest,
            AsyncHandler<DeregisterTaskFromMaintenanceWindowRequest, DeregisterTaskFromMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes details about the activation, such as the date and time the
     * activation was created, its expiration date, the IAM role assigned to the
     * instances in the activation, and the number of instances registered by
     * using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeActivations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeActivationsResult> describeActivationsAsync(
            DescribeActivationsRequest describeActivationsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes details about the activation, such as the date and time the
     * activation was created, its expiration date, the IAM role assigned to the
     * instances in the activation, and the number of instances registered by
     * using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeActivations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeActivationsResult> describeActivationsAsync(
            DescribeActivationsRequest describeActivationsRequest,
            AsyncHandler<DescribeActivationsRequest, DescribeActivationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the association for the specified target or instance. If you
     * created the association by using the <code>Targets</code> parameter, then
     * you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems
     * Manager document, then you retrieve the association by specifying the
     * document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InvalidAssociationVersionException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest describeAssociationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the association for the specified target or instance. If you
     * created the association by using the <code>Targets</code> parameter, then
     * you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems
     * Manager document, then you retrieve the association by specifying the
     * document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InvalidAssociationVersionException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest describeAssociationRequest,
            AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this API action to view information about a specific execution of a
     * specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutionTargets service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AssociationExecutionDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this API action to view information about a specific execution of a
     * specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutionTargets service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AssociationExecutionDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest,
            AsyncHandler<DescribeAssociationExecutionTargetsRequest, DescribeAssociationExecutionTargetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest,
            AsyncHandler<DescribeAssociationExecutionsRequest, DescribeAssociationExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAutomationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAutomationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest,
            AsyncHandler<DescribeAutomationExecutionsRequest, DescribeAutomationExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Information about all active and terminated step executions in an
     * Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAutomationStepExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Information about all active and terminated step executions in an
     * Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAutomationStepExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest,
            AsyncHandler<DescribeAutomationStepExecutionsRequest, DescribeAutomationStepExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return A Java Future object containing the response from the
     *         DescribeAvailablePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(
            DescribeAvailablePatchesRequest describeAvailablePatchesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeAvailablePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(
            DescribeAvailablePatchesRequest describeAvailablePatchesRequest,
            AsyncHandler<DescribeAvailablePatchesRequest, DescribeAvailablePatchesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest describeDocumentRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest describeDocumentRequest,
            AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created
     * the document, you are the owner. If a document is shared, it can either
     * be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created
     * the document, you are the owner. If a document is shared, it can either
     * be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest,
            AsyncHandler<DescribeDocumentPermissionRequest, DescribeDocumentPermissionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeEffectiveInstanceAssociations service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEffectiveInstanceAssociations service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest,
            AsyncHandler<DescribeEffectiveInstanceAssociationsRequest, DescribeEffectiveInstanceAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval
     * state) for the specified patch baseline. Note that this API applies only
     * to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         DescribeEffectivePatchesForPatchBaseline service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws UnsupportedOperatingSystemException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval
     * state) for the specified patch baseline. Note that this API applies only
     * to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEffectivePatchesForPatchBaseline service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws UnsupportedOperatingSystemException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest,
            AsyncHandler<DescribeEffectivePatchesForPatchBaselineRequest, DescribeEffectivePatchesForPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAssociationsStatus service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAssociationsStatus service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest,
            AsyncHandler<DescribeInstanceAssociationsStatusRequest, DescribeInstanceAssociationsStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your instances. You can use this to get
     * information about instances like the operating system platform, the SSM
     * Agent version (Linux), status etc. If you specify one or more instance
     * IDs, it returns information for those instances. If you do not specify
     * instance IDs, it returns information for all your instances. If you
     * specify an instance ID that is not valid or an instance that you do not
     * own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access
     * Management (IAM) role assigned to on-premises instances. This call does
     * not return the IAM role for Amazon EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceInformation service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws InvalidInstanceInformationFilterValueException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest describeInstanceInformationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your instances. You can use this to get
     * information about instances like the operating system platform, the SSM
     * Agent version (Linux), status etc. If you specify one or more instance
     * IDs, it returns information for those instances. If you do not specify
     * instance IDs, it returns information for all your instances. If you
     * specify an instance ID that is not valid or an instance that you do not
     * own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access
     * Management (IAM) role assigned to on-premises instances. This call does
     * not return the IAM role for Amazon EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstanceInformation service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws InvalidInstanceInformationFilterValueException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest describeInstanceInformationRequest,
            AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStates service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(
            DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStates service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(
            DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest,
            AsyncHandler<DescribeInstancePatchStatesRequest, DescribeInstancePatchStatesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified
     * patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStatesForPatchGroup service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified
     * patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStatesForPatchGroup service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest,
            AsyncHandler<DescribeInstancePatchStatesForPatchGroupRequest, DescribeInstancePatchStatesForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and
     * their state relative to the patch baseline being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(
            DescribeInstancePatchesRequest describeInstancePatchesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and
     * their state relative to the patch baseline being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(
            DescribeInstancePatchesRequest describeInstancePatchesRequest,
            AsyncHandler<DescribeInstancePatchesRequest, DescribeInstancePatchesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeInventoryDeletions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDeletionIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(
            DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeInventoryDeletions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDeletionIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(
            DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest,
            AsyncHandler<DescribeInventoryDeletionsRequest, DescribeInventoryDeletionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a
     * particular task run as part of a maintenance window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTaskInvocations service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a
     * particular task run as part of a maintenance window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTaskInvocations service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest,
            AsyncHandler<DescribeMaintenanceWindowExecutionTaskInvocationsRequest, DescribeMaintenanceWindowExecutionTaskInvocationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTasks service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTasks service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest,
            AsyncHandler<DescribeMaintenanceWindowExecutionTasksRequest, DescribeMaintenanceWindowExecutionTasksResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information
     * about when the maintenance window was scheduled to be active, and
     * information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutions service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information
     * about when the maintenance window was scheduled to be active, and
     * information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutions service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest,
            AsyncHandler<DescribeMaintenanceWindowExecutionsRequest, DescribeMaintenanceWindowExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowSchedule service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowSchedule service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest,
            AsyncHandler<DescribeMaintenanceWindowScheduleRequest, DescribeMaintenanceWindowScheduleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTargets service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTargets service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest,
            AsyncHandler<DescribeMaintenanceWindowTargetsRequest, DescribeMaintenanceWindowTargetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTasks service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTasks service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest,
            AsyncHandler<DescribeMaintenanceWindowTasksRequest, DescribeMaintenanceWindowTasksResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindows service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindows service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest,
            AsyncHandler<DescribeMaintenanceWindowsRequest, DescribeMaintenanceWindowsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that
     * an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowsForTarget service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that
     * an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowsForTarget service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest,
            AsyncHandler<DescribeMaintenanceWindowsForTargetRequest, DescribeMaintenanceWindowsForTargetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and
     * Access Management (IAM) to query a list of OpsItems. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return A Java Future object containing the response from the
     *         DescribeOpsItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeOpsItemsResult> describeOpsItemsAsync(
            DescribeOpsItemsRequest describeOpsItemsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and
     * Access Management (IAM) to query a list of OpsItems. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeOpsItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeOpsItemsResult> describeOpsItemsAsync(
            DescribeOpsItemsRequest describeOpsItemsRequest,
            AsyncHandler<DescribeOpsItemsRequest, DescribeOpsItemsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @return A Java Future object containing the response from the
     *         DescribeParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeParametersResult> describeParametersAsync(
            DescribeParametersRequest describeParametersRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeParametersResult> describeParametersAsync(
            DescribeParametersRequest describeParametersRequest,
            AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchBaselines service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(
            DescribePatchBaselinesRequest describePatchBaselinesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePatchBaselines service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(
            DescribePatchBaselinesRequest describePatchBaselinesRequest,
            AsyncHandler<DescribePatchBaselinesRequest, DescribePatchBaselinesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchGroupState service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(
            DescribePatchGroupStateRequest describePatchGroupStateRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePatchGroupState service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(
            DescribePatchGroupStateRequest describePatchGroupStateRequest,
            AsyncHandler<DescribePatchGroupStateRequest, DescribePatchGroupStateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchGroups service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchGroupsResult> describePatchGroupsAsync(
            DescribePatchGroupsRequest describePatchGroupsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePatchGroups service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchGroupsResult> describePatchGroupsAsync(
            DescribePatchGroupsRequest describePatchGroupsRequest,
            AsyncHandler<DescribePatchGroupsRequest, DescribePatchGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the properties of available patches organized by product, product
     * family, classification, severity, and other properties of available
     * patches. You can use the reported properties in the filters you specify
     * in requests for actions such as <a>CreatePatchBaseline</a>,
     * <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters
     * for each major operating system type:
     * </p>
     * <dl>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchProperties service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchPropertiesResult> describePatchPropertiesAsync(
            DescribePatchPropertiesRequest describePatchPropertiesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the properties of available patches organized by product, product
     * family, classification, severity, and other properties of available
     * patches. You can use the reported properties in the filters you specify
     * in requests for actions such as <a>CreatePatchBaseline</a>,
     * <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters
     * for each major operating system type:
     * </p>
     * <dl>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePatchProperties service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribePatchPropertiesResult> describePatchPropertiesAsync(
            DescribePatchPropertiesRequest describePatchPropertiesRequest,
            AsyncHandler<DescribePatchPropertiesRequest, DescribePatchPropertiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected)
     * or terminated sessions from the past 30 days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeSessions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeSessionsResult> describeSessionsAsync(
            DescribeSessionsRequest describeSessionsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected)
     * or terminated sessions from the past 30 days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeSessions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<DescribeSessionsResult> describeSessionsAsync(
            DescribeSessionsRequest describeSessionsRequest,
            AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         GetAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetAutomationExecutionResult> getAutomationExecutionAsync(
            GetAutomationExecutionRequest getAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetAutomationExecutionResult> getAutomationExecutionAsync(
            GetAutomationExecutionRequest getAutomationExecutionRequest,
            AsyncHandler<GetAutomationExecutionRequest, GetAutomationExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the state of the AWS Systems Manager Change Calendar at an optional,
     * specified time. If you specify a time, <code>GetCalendarState</code>
     * returns the state of the calendar at a specific time, and returns the
     * next time that the Change Calendar state will transition. If you do not
     * specify a time, <code>GetCalendarState</code> assumes the current time.
     * Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>. For more information about Systems Manager Change
     * Calendar, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html"
     * >AWS Systems Manager Change Calendar</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @return A Java Future object containing the response from the
     *         GetCalendarState service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentTypeException
     * @throws UnsupportedCalendarException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetCalendarStateResult> getCalendarStateAsync(
            GetCalendarStateRequest getCalendarStateRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets the state of the AWS Systems Manager Change Calendar at an optional,
     * specified time. If you specify a time, <code>GetCalendarState</code>
     * returns the state of the calendar at a specific time, and returns the
     * next time that the Change Calendar state will transition. If you do not
     * specify a time, <code>GetCalendarState</code> assumes the current time.
     * Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>. For more information about Systems Manager Change
     * Calendar, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html"
     * >AWS Systems Manager Change Calendar</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCalendarState service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentTypeException
     * @throws UnsupportedCalendarException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetCalendarStateResult> getCalendarStateAsync(
            GetCalendarStateRequest getCalendarStateRequest,
            AsyncHandler<GetCalendarStateRequest, GetCalendarStateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or
     * plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return A Java Future object containing the response from the
     *         GetCommandInvocation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidPluginNameException
     * @throws InvocationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetCommandInvocationResult> getCommandInvocationAsync(
            GetCommandInvocationRequest getCommandInvocationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or
     * plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCommandInvocation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidPluginNameException
     * @throws InvocationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetCommandInvocationResult> getCommandInvocationAsync(
            GetCommandInvocationRequest getCommandInvocationRequest,
            AsyncHandler<GetCommandInvocationRequest, GetCommandInvocationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to
     * determine whether it is connected and ready to receive Session Manager
     * connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return A Java Future object containing the response from the
     *         GetConnectionStatus service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetConnectionStatusResult> getConnectionStatusAsync(
            GetConnectionStatusRequest getConnectionStatusRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to
     * determine whether it is connected and ready to receive Session Manager
     * connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetConnectionStatus service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetConnectionStatusResult> getConnectionStatusAsync(
            GetConnectionStatusRequest getConnectionStatusRequest,
            AsyncHandler<GetConnectionStatusRequest, GetConnectionStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports
     * creating multiple default patch baselines. For example, you can create a
     * default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch
     * baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         GetDefaultPatchBaseline service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(
            GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports
     * creating multiple default patch baselines. For example, you can create a
     * default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch
     * baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetDefaultPatchBaseline service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(
            GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest,
            AsyncHandler<GetDefaultPatchBaselineRequest, GetDefaultPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses.
     * This API is primarily used by the AWS-RunPatchBaseline Systems Manager
     * document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return A Java Future object containing the response from the
     *         GetDeployablePatchSnapshotForInstance service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws UnsupportedOperatingSystemException
     * @throws UnsupportedFeatureRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses.
     * This API is primarily used by the AWS-RunPatchBaseline Systems Manager
     * document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetDeployablePatchSnapshotForInstance service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws UnsupportedOperatingSystemException
     * @throws UnsupportedFeatureRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest,
            AsyncHandler<GetDeployablePatchSnapshotForInstanceRequest, GetDeployablePatchSnapshotForInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future object containing the response from the GetDocument
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the GetDocument
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest,
            AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return A Java Future object containing the response from the
     *         GetInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidInventoryGroupException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws InvalidResultAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest getInventoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidInventoryGroupException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws InvalidResultAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest getInventoryRequest,
            AsyncHandler<GetInventoryRequest, GetInventoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list
     * of attribute names for a specific Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return A Java Future object containing the response from the
     *         GetInventorySchema service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetInventorySchemaResult> getInventorySchemaAsync(
            GetInventorySchemaRequest getInventorySchemaRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list
     * of attribute names for a specific Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetInventorySchema service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetInventorySchemaResult> getInventorySchemaAsync(
            GetInventorySchemaRequest getInventorySchemaRequest,
            AsyncHandler<GetInventorySchemaRequest, GetInventorySchemaResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindow service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(
            GetMaintenanceWindowRequest getMaintenanceWindowRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindow service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(
            GetMaintenanceWindowRequest getMaintenanceWindowRequest,
            AsyncHandler<GetMaintenanceWindowRequest, GetMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest,
            AsyncHandler<GetMaintenanceWindowExecutionRequest, GetMaintenanceWindowExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTask service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTask service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest,
            AsyncHandler<GetMaintenanceWindowExecutionTaskRequest, GetMaintenanceWindowExecutionTaskResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTaskInvocation service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTaskInvocation service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest,
            AsyncHandler<GetMaintenanceWindowExecutionTaskInvocationRequest, GetMaintenanceWindowExecutionTaskInvocationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(
            GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(
            GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest,
            AsyncHandler<GetMaintenanceWindowTaskRequest, GetMaintenanceWindowTaskResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have
     * permission in AWS Identity and Access Management (IAM) to view
     * information about an OpsItem. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return A Java Future object containing the response from the GetOpsItem
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetOpsItemResult> getOpsItemAsync(GetOpsItemRequest getOpsItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have
     * permission in AWS Identity and Access Management (IAM) to view
     * information about an OpsItem. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the GetOpsItem
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetOpsItemResult> getOpsItemAsync(GetOpsItemRequest getOpsItemRequest,
            AsyncHandler<GetOpsItemRequest, GetOpsItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return A Java Future object containing the response from the
     *         GetOpsSummary service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetOpsSummaryResult> getOpsSummaryAsync(GetOpsSummaryRequest getOpsSummaryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetOpsSummary service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetOpsSummaryResult> getOpsSummaryAsync(GetOpsSummaryRequest getOpsSummaryRequest,
            AsyncHandler<GetOpsSummaryRequest, GetOpsSummaryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't
     * confuse this API action with the <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return A Java Future object containing the response from the
     *         GetParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParameterResult> getParameterAsync(GetParameterRequest getParameterRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't
     * confuse this API action with the <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParameterResult> getParameterAsync(GetParameterRequest getParameterRequest,
            AsyncHandler<GetParameterRequest, GetParameterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return A Java Future object containing the response from the
     *         GetParameterHistory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidKeyIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParameterHistoryResult> getParameterHistoryAsync(
            GetParameterHistoryRequest getParameterHistoryRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetParameterHistory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidKeyIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParameterHistoryResult> getParameterHistoryAsync(
            GetParameterHistoryRequest getParameterHistoryRequest,
            AsyncHandler<GetParameterHistoryRequest, GetParameterHistoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the
     * <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return A Java Future object containing the response from the
     *         GetParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidKeyIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParametersResult> getParametersAsync(GetParametersRequest getParametersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the
     * <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidKeyIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParametersResult> getParametersAsync(GetParametersRequest getParametersRequest,
            AsyncHandler<GetParametersRequest, GetParametersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific
     * hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return A Java Future object containing the response from the
     *         GetParametersByPath service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidKeyIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParametersByPathResult> getParametersByPathAsync(
            GetParametersByPathRequest getParametersByPathRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific
     * hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetParametersByPath service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidKeyIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetParametersByPathResult> getParametersByPathAsync(
            GetParametersByPathRequest getParametersByPathRequest,
            AsyncHandler<GetParametersByPathRequest, GetParametersByPathResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         GetPatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetPatchBaselineResult> getPatchBaselineAsync(
            GetPatchBaselineRequest getPatchBaselineRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetPatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetPatchBaselineResult> getPatchBaselineAsync(
            GetPatchBaselineRequest getPatchBaselineRequest,
            AsyncHandler<GetPatchBaselineRequest, GetPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch
     * group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         GetPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch
     * group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest,
            AsyncHandler<GetPatchBaselineForPatchGroupRequest, GetPatchBaselineForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>UpdateServiceSetting</a> API
     * action to change the default setting. Or use the
     * <a>ResetServiceSetting</a> to change the value back to the original value
     * defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest <p>
     *            The request body of the GetServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetServiceSettingResult> getServiceSettingAsync(
            GetServiceSettingRequest getServiceSettingRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>UpdateServiceSetting</a> API
     * action to change the default setting. Or use the
     * <a>ResetServiceSetting</a> to change the value back to the original value
     * defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest <p>
     *            The request body of the GetServiceSetting API action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<GetServiceSettingResult> getServiceSettingAsync(
            GetServiceSettingRequest getServiceSettingRequest,
            AsyncHandler<GetServiceSettingRequest, GetServiceSettingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different
     * versions of a parameter. When you modify a parameter, Systems Manager
     * automatically saves a new version and increments the version number by
     * one. A label can help you remember the purpose of a parameter when there
     * are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same
     * parameter. For example, if version 1 has the label Production, then you
     * can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach
     * a label to a specific version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a
     * parameter label, then you must move it to a different version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.),
     * hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive).
     * If a label fails to meet these requirements, then the label is not
     * associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return A Java Future object containing the response from the
     *         LabelParameterVersion service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws ParameterVersionLabelLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<LabelParameterVersionResult> labelParameterVersionAsync(
            LabelParameterVersionRequest labelParameterVersionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different
     * versions of a parameter. When you modify a parameter, Systems Manager
     * automatically saves a new version and increments the version number by
     * one. A label can help you remember the purpose of a parameter when there
     * are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same
     * parameter. For example, if version 1 has the label Production, then you
     * can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach
     * a label to a specific version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a
     * parameter label, then you must move it to a different version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.),
     * hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive).
     * If a label fails to meet these requirements, then the label is not
     * associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         LabelParameterVersion service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws ParameterVersionLabelLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<LabelParameterVersionResult> labelParameterVersionAsync(
            LabelParameterVersionRequest labelParameterVersionRequest,
            AsyncHandler<LabelParameterVersionRequest, LabelParameterVersionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListAssociationVersions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListAssociationVersionsResult> listAssociationVersionsAsync(
            ListAssociationVersionsRequest listAssociationVersionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListAssociationVersions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListAssociationVersionsResult> listAssociationVersionsAsync(
            ListAssociationVersionsRequest listAssociationVersionsRequest,
            AsyncHandler<ListAssociationVersionsRequest, ListAssociationVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and
     * Region. You can limit the results to a specific State Manager association
     * document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListAssociations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest listAssociationsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and
     * Region. You can limit the results to a specific State Manager association
     * document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListAssociations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest listAssociationsRequest,
            AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user runs SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return A Java Future object containing the response from the
     *         ListCommandInvocations service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            ListCommandInvocationsRequest listCommandInvocationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user runs SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListCommandInvocations service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            ListCommandInvocationsRequest listCommandInvocationsRequest,
            AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return A Java Future object containing the response from the
     *         ListCommands service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest listCommandsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListCommands service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest listCommandsRequest,
            AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance
     * statuses for different resource types. Currently, you can only specify
     * one resource ID per call. List results depend on the criteria specified
     * in the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return A Java Future object containing the response from the
     *         ListComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListComplianceItemsResult> listComplianceItemsAsync(
            ListComplianceItemsRequest listComplianceItemsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance
     * statuses for different resource types. Currently, you can only specify
     * one resource ID per call. List results depend on the criteria specified
     * in the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListComplianceItemsResult> listComplianceItemsAsync(
            ListComplianceItemsRequest listComplianceItemsRequest,
            AsyncHandler<ListComplianceItemsRequest, ListComplianceItemsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a
     * compliance type. For example, this call can return State Manager
     * associations, patches, or custom compliance types according to the filter
     * criteria that you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListComplianceSummaries service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListComplianceSummariesResult> listComplianceSummariesAsync(
            ListComplianceSummariesRequest listComplianceSummariesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a
     * compliance type. For example, this call can return State Manager
     * associations, patches, or custom compliance types according to the filter
     * criteria that you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListComplianceSummaries service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListComplianceSummariesResult> listComplianceSummariesAsync(
            ListComplianceSummariesRequest listComplianceSummariesRequest,
            AsyncHandler<ListComplianceSummariesRequest, ListComplianceSummariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentVersions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListDocumentVersionsResult> listDocumentVersionsAsync(
            ListDocumentVersionsRequest listDocumentVersionsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDocumentVersions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListDocumentVersionsResult> listDocumentVersionsAsync(
            ListDocumentVersionsRequest listDocumentVersionsRequest,
            AsyncHandler<ListDocumentVersionsRequest, ListDocumentVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account
     * and Region. You can limit the results of this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future object containing the response from the
     *         ListDocuments service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account
     * and Region. You can limit the results of this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDocuments service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest,
            AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return A Java Future object containing the response from the
     *         ListInventoryEntries service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListInventoryEntriesResult> listInventoryEntriesAsync(
            ListInventoryEntriesRequest listInventoryEntriesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListInventoryEntries service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListInventoryEntriesResult> listInventoryEntriesAsync(
            ListInventoryEntriesRequest listInventoryEntriesRequest,
            AsyncHandler<ListInventoryEntriesRequest, ListInventoryEntriesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information
     * about compliant and non-compliant statuses and detailed compliance-item
     * severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListResourceComplianceSummaries service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information
     * about compliant and non-compliant statuses and detailed compliance-item
     * severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListResourceComplianceSummaries service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest,
            AsyncHandler<ListResourceComplianceSummariesRequest, ListResourceComplianceSummariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about
     * the last time a sync attempted to start, the last sync status, and the
     * last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a
     * single call to <code>ListResourceDataSync</code>. You can limit the
     * number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more
     * sync configurations to list, check the value of <code>NextToken</code> in
     * the output. If there are more sync configurations to list, you can
     * request them by specifying the <code>NextToken</code> returned in the
     * call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         ListResourceDataSync service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListResourceDataSyncResult> listResourceDataSyncAsync(
            ListResourceDataSyncRequest listResourceDataSyncRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about
     * the last time a sync attempted to start, the last sync status, and the
     * last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a
     * single call to <code>ListResourceDataSync</code>. You can limit the
     * number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more
     * sync configurations to list, check the value of <code>NextToken</code> in
     * the output. If there are more sync configurations to list, you can
     * request them by specifying the <code>NextToken</code> returned in the
     * call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListResourceDataSync service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListResourceDataSyncResult> listResourceDataSyncAsync(
            ListResourceDataSyncRequest listResourceDataSyncRequest,
            AsyncHandler<ListResourceDataSyncRequest, ListResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a
     * document privately, you must specify the AWS user account IDs for those
     * people who can use the document. If you share a document publicly, you
     * must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return A Java Future object containing the response from the
     *         ModifyDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws DocumentPermissionLimitException
     * @throws DocumentLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(
            ModifyDocumentPermissionRequest modifyDocumentPermissionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a
     * document privately, you must specify the AWS user account IDs for those
     * people who can use the document. If you share a document publicly, you
     * must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ModifyDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws DocumentPermissionLimitException
     * @throws DocumentLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(
            ModifyDocumentPermissionRequest modifyDocumentPermissionRequest,
            AsyncHandler<ModifyDocumentPermissionRequest, ModifyDocumentPermissionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated
     * resource. This action lets you register custom compliance details with a
     * resource. This call overwrites existing compliance information on the
     * resource, so you must provide a full list of compliance items each time
     * that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom
     * compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item
     * was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example,
     * <code>approved</code> for patches, or <code>Failed</code> for
     * associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example,
     * <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example,
     * <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item
     * was applied to the resource. Specify the time by using the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return A Java Future object containing the response from the
     *         PutComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ComplianceTypeCountLimitExceededException
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PutComplianceItemsResult> putComplianceItemsAsync(
            PutComplianceItemsRequest putComplianceItemsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated
     * resource. This action lets you register custom compliance details with a
     * resource. This call overwrites existing compliance information on the
     * resource, so you must provide a full list of compliance items each time
     * that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom
     * compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item
     * was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example,
     * <code>approved</code> for patches, or <code>Failed</code> for
     * associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example,
     * <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example,
     * <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item
     * was applied to the resource. Specify the time by using the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PutComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ComplianceTypeCountLimitExceededException
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PutComplianceItemsResult> putComplianceItemsAsync(
            PutComplianceItemsRequest putComplianceItemsRequest,
            AsyncHandler<PutComplianceItemsRequest, PutComplianceItemsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds
     * an inventory item, if it doesn't already exist, or updates an inventory
     * item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return A Java Future object containing the response from the
     *         PutInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ItemContentMismatchException
     * @throws CustomSchemaCountLimitExceededException
     * @throws UnsupportedInventorySchemaVersionException
     * @throws UnsupportedInventoryItemContextException
     * @throws InvalidInventoryItemContextException
     * @throws SubTypeCountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest putInventoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds
     * an inventory item, if it doesn't already exist, or updates an inventory
     * item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PutInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ItemContentMismatchException
     * @throws CustomSchemaCountLimitExceededException
     * @throws UnsupportedInventorySchemaVersionException
     * @throws UnsupportedInventoryItemContextException
     * @throws InvalidInventoryItemContextException
     * @throws SubTypeCountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest putInventoryRequest,
            AsyncHandler<PutInventoryRequest, PutInventoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return A Java Future object containing the response from the
     *         PutParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterLimitExceededException
     * @throws TooManyUpdatesException
     * @throws ParameterAlreadyExistsException
     * @throws HierarchyLevelLimitExceededException
     * @throws HierarchyTypeMismatchException
     * @throws InvalidAllowedPatternException
     * @throws ParameterMaxVersionLimitExceededException
     * @throws ParameterPatternMismatchException
     * @throws UnsupportedParameterTypeException
     * @throws PoliciesLimitExceededException
     * @throws InvalidPolicyTypeException
     * @throws InvalidPolicyAttributeException
     * @throws IncompatiblePolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PutParameterResult> putParameterAsync(PutParameterRequest putParameterRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PutParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterLimitExceededException
     * @throws TooManyUpdatesException
     * @throws ParameterAlreadyExistsException
     * @throws HierarchyLevelLimitExceededException
     * @throws HierarchyTypeMismatchException
     * @throws InvalidAllowedPatternException
     * @throws ParameterMaxVersionLimitExceededException
     * @throws ParameterPatternMismatchException
     * @throws UnsupportedParameterTypeException
     * @throws PoliciesLimitExceededException
     * @throws InvalidPolicyTypeException
     * @throws InvalidPolicyAttributeException
     * @throws IncompatiblePolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<PutParameterResult> putParameterAsync(PutParameterRequest putParameterRequest,
            AsyncHandler<PutParameterRequest, PutParameterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the
     * full patch baseline ARN as the baseline ID value. For example, for
     * CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code>
     * instead of <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         RegisterDefaultPatchBaseline service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(
            RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the
     * full patch baseline ARN as the baseline ID value. For example, for
     * CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code>
     * instead of <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RegisterDefaultPatchBaseline service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(
            RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest,
            AsyncHandler<RegisterDefaultPatchBaselineRequest, RegisterDefaultPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         RegisterPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AlreadyExistsException
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RegisterPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AlreadyExistsException
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest,
            AsyncHandler<RegisterPatchBaselineForPatchGroupRequest, RegisterPatchBaselineForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         RegisterTargetWithMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RegisterTargetWithMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest,
            AsyncHandler<RegisterTargetWithMaintenanceWindowRequest, RegisterTargetWithMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         RegisterTaskWithMaintenanceWindow service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws FeatureNotAvailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RegisterTaskWithMaintenanceWindow service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws FeatureNotAvailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest,
            AsyncHandler<RegisterTaskWithMaintenanceWindowRequest, RegisterTaskWithMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Use the <a>UpdateServiceSetting</a> API action
     * to change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as
     * provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest <p>
     *            The request body of the ResetServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ResetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ResetServiceSettingResult> resetServiceSettingAsync(
            ResetServiceSettingRequest resetServiceSettingRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Use the <a>UpdateServiceSetting</a> API action
     * to change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as
     * provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest <p>
     *            The request body of the ResetServiceSetting API action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ResetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ResetServiceSettingResult> resetServiceSettingAsync(
            ResetServiceSettingRequest resetServiceSettingRequest,
            AsyncHandler<ResetServiceSettingRequest, ResetServiceSettingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected.
     * Connections can be resumed for disconnected sessions, but not terminated
     * sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically
     * reconnect during intermittent network issues. It is not intended for any
     * other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return A Java Future object containing the response from the
     *         ResumeSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ResumeSessionResult> resumeSessionAsync(ResumeSessionRequest resumeSessionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected.
     * Connections can be resumed for disconnected sessions, but not terminated
     * sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically
     * reconnect during intermittent network issues. It is not intended for any
     * other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ResumeSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<ResumeSessionResult> resumeSessionAsync(ResumeSessionRequest resumeSessionRequest,
            AsyncHandler<ResumeSessionRequest, ResumeSessionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior
     * or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return A Java Future object containing the response from the
     *         SendAutomationSignal service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws AutomationStepNotFoundException
     * @throws InvalidAutomationSignalException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SendAutomationSignalResult> sendAutomationSignalAsync(
            SendAutomationSignalRequest sendAutomationSignalRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior
     * or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SendAutomationSignal service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws AutomationStepNotFoundException
     * @throws InvalidAutomationSignalException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SendAutomationSignalResult> sendAutomationSignalAsync(
            SendAutomationSignalRequest sendAutomationSignalRequest,
            AsyncHandler<SendAutomationSignalRequest, SendAutomationSignalResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return A Java Future object containing the response from the SendCommand
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidOutputFolderException
     * @throws InvalidParametersException
     * @throws UnsupportedPlatformTypeException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidRoleException
     * @throws InvalidNotificationConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SendCommand
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidOutputFolderException
     * @throws InvalidParametersException
     * @throws UnsupportedPlatformTypeException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidRoleException
     * @throws InvalidNotificationConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest,
            AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this API action to run an association immediately and only one time.
     * This action can be helpful when troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return A Java Future object containing the response from the
     *         StartAssociationsOnce service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidAssociationException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StartAssociationsOnceResult> startAssociationsOnceAsync(
            StartAssociationsOnceRequest startAssociationsOnceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this API action to run an association immediately and only one time.
     * This action can be helpful when troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartAssociationsOnce service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidAssociationException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StartAssociationsOnceResult> startAssociationsOnceAsync(
            StartAssociationsOnceRequest startAssociationsOnceRequest,
            AsyncHandler<StartAssociationsOnceRequest, StartAssociationsOnceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         StartAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationDefinitionNotFoundException
     * @throws InvalidAutomationExecutionParametersException
     * @throws AutomationExecutionLimitExceededException
     * @throws AutomationDefinitionVersionNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidTargetException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StartAutomationExecutionResult> startAutomationExecutionAsync(
            StartAutomationExecutionRequest startAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationDefinitionNotFoundException
     * @throws InvalidAutomationExecutionParametersException
     * @throws AutomationExecutionLimitExceededException
     * @throws AutomationDefinitionVersionNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidTargetException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StartAutomationExecutionResult> startAutomationExecutionAsync(
            StartAutomationExecutionRequest startAutomationExecutionRequest,
            AsyncHandler<StartAutomationExecutionRequest, StartAutomationExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a
     * Session Manager session. Returns a URL and token that can be used to open
     * a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that
     * requires the Session Manager plugin to be installed on the client machine
     * making the call. For information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * > Install the Session Manager Plugin for the AWS CLI</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently
     * supported by AWS Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return A Java Future object containing the response from the
     *         StartSession service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InvalidDocumentException
     * @throws TargetNotConnectedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StartSessionResult> startSessionAsync(StartSessionRequest startSessionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a
     * Session Manager session. Returns a URL and token that can be used to open
     * a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that
     * requires the Session Manager plugin to be installed on the client machine
     * making the call. For information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * > Install the Session Manager Plugin for the AWS CLI</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently
     * supported by AWS Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartSession service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InvalidDocumentException
     * @throws TargetNotConnectedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StartSessionResult> startSessionAsync(StartSessionRequest startSessionRequest,
            AsyncHandler<StartSessionRequest, StartSessionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         StopAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidAutomationStatusUpdateException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(
            StopAutomationExecutionRequest stopAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidAutomationStatusUpdateException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(
            StopAutomationExecutionRequest stopAutomationExecutionRequest,
            AsyncHandler<StopAutomationExecutionRequest, StopAutomationExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the
     * Session Manager client and SSM Agent on the instance. A terminated
     * session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return A Java Future object containing the response from the
     *         TerminateSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<TerminateSessionResult> terminateSessionAsync(
            TerminateSessionRequest terminateSessionRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the
     * Session Manager client and SSM Agent on the instance. A terminated
     * session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         TerminateSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<TerminateSessionResult> terminateSessionAsync(
            TerminateSessionRequest terminateSessionRequest,
            AsyncHandler<TerminateSessionRequest, TerminateSessionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an association. You can update the association name and version,
     * the document version, schedule, parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role
     * must be configured with permission to call the <a>DescribeAssociation</a>
     * API action. If you don't have permission to call DescribeAssociation,
     * then you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against
     * the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return A Java Future object containing the response from the
     *         UpdateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidScheduleException
     * @throws InvalidParametersException
     * @throws InvalidOutputLocationException
     * @throws InvalidDocumentVersionException
     * @throws AssociationDoesNotExistException
     * @throws InvalidUpdateException
     * @throws TooManyUpdatesException
     * @throws InvalidDocumentException
     * @throws InvalidTargetException
     * @throws InvalidAssociationVersionException
     * @throws AssociationVersionLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateAssociationResult> updateAssociationAsync(
            UpdateAssociationRequest updateAssociationRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates an association. You can update the association name and version,
     * the document version, schedule, parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role
     * must be configured with permission to call the <a>DescribeAssociation</a>
     * API action. If you don't have permission to call DescribeAssociation,
     * then you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against
     * the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidScheduleException
     * @throws InvalidParametersException
     * @throws InvalidOutputLocationException
     * @throws InvalidDocumentVersionException
     * @throws AssociationDoesNotExistException
     * @throws InvalidUpdateException
     * @throws TooManyUpdatesException
     * @throws InvalidDocumentException
     * @throws InvalidTargetException
     * @throws InvalidAssociationVersionException
     * @throws AssociationVersionLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateAssociationResult> updateAssociationAsync(
            UpdateAssociationRequest updateAssociationRequest,
            AsyncHandler<UpdateAssociationRequest, UpdateAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateAssociationStatus service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest updateAssociationStatusRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateAssociationStatus service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest updateAssociationStatusRequest,
            AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return A Java Future object containing the response from the
     *         UpdateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws MaxDocumentSizeExceededException
     * @throws DocumentVersionLimitExceededException
     * @throws InternalServerErrorException
     * @throws DuplicateDocumentContentException
     * @throws DuplicateDocumentVersionNameException
     * @throws InvalidDocumentContentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws MaxDocumentSizeExceededException
     * @throws DocumentVersionLimitExceededException
     * @throws InternalServerErrorException
     * @throws DuplicateDocumentContentException
     * @throws DuplicateDocumentVersionNameException
     * @throws InvalidDocumentContentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest,
            AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return A Java Future object containing the response from the
     *         UpdateDocumentDefaultVersion service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateDocumentDefaultVersion service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest,
            AsyncHandler<UpdateDocumentDefaultVersionRequest, UpdateDocumentDefaultVersionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are
     * modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(
            UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are
     * modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(
            UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest,
            AsyncHandler<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are
     * ID target, Tag target, and resource group. For more information, see
     * <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTarget service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are
     * ID target, Tag target, and resource group. For more information, see
     * <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTarget service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest,
            AsyncHandler<UpdateMaintenanceWindowTargetRequest, UpdateMaintenanceWindowTargetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the
     * task type, but you can change the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from
     * AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * Also, if you set Replace to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this
     * request. Optional fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the
     * task type, but you can change the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from
     * AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * Also, if you set Replace to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this
     * request. Optional fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest,
            AsyncHandler<UpdateMaintenanceWindowTaskRequest, UpdateMaintenanceWindowTaskResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role
     * for the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return A Java Future object containing the response from the
     *         UpdateManagedInstanceRole service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role
     * for the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateManagedInstanceRole service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest,
            AsyncHandler<UpdateManagedInstanceRoleRequest, UpdateManagedInstanceRoleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to update an OpsItem. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return A Java Future object containing the response from the
     *         UpdateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateOpsItemResult> updateOpsItemAsync(UpdateOpsItemRequest updateOpsItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to update an OpsItem. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateOpsItemResult> updateOpsItemAsync(UpdateOpsItemRequest updateOpsItemRequest,
            AsyncHandler<UpdateOpsItemRequest, UpdateOpsItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request
     * are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         UpdatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(
            UpdatePatchBaselineRequest updatePatchBaselineRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request
     * are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(
            UpdatePatchBaselineRequest updatePatchBaselineRequest,
            AsyncHandler<UpdatePatchBaselineRequest, UpdatePatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a
     * Region, you can't change the account options for that sync. For example,
     * if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later
     * and choose the Include all accounts from my AWS Organizations
     * configuration option. Instead, you must delete the first resource data
     * sync, and create a new one.
     * </p>
     * 
     * @param updateResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         UpdateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws ResourceDataSyncConflictException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateResourceDataSyncResult> updateResourceDataSyncAsync(
            UpdateResourceDataSyncRequest updateResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a
     * Region, you can't change the account options for that sync. For example,
     * if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later
     * and choose the Include all accounts from my AWS Organizations
     * configuration option. Instead, you must delete the first resource data
     * sync, and create a new one.
     * </p>
     * 
     * @param updateResourceDataSyncRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws ResourceDataSyncConflictException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateResourceDataSyncResult> updateResourceDataSyncAsync(
            UpdateResourceDataSyncRequest updateResourceDataSyncRequest,
            AsyncHandler<UpdateResourceDataSyncRequest, UpdateResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Or, use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service
     * team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest <p>
     *            The request body of the UpdateServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateServiceSettingResult> updateServiceSettingAsync(
            UpdateServiceSettingRequest updateServiceSettingRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Or, use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service
     * team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest <p>
     *            The request body of the UpdateServiceSetting API action.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<UpdateServiceSettingResult> updateServiceSettingAsync(
            UpdateServiceSettingRequest updateServiceSettingRequest,
            AsyncHandler<UpdateServiceSettingRequest, UpdateServiceSettingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
