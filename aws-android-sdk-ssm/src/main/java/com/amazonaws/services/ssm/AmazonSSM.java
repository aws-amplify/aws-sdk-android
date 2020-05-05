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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.ssm.model.*;

/**
 * Interface for accessing Amazon Simple Systems Manager (SSM) <fullname>AWS
 * Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate
 * management tasks such as collecting system inventory, applying operating
 * system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems
 * Manager lets you remotely and securely manage the configuration of your
 * managed instances. A <i>managed instance</i> is any Amazon Elastic Compute
 * Cloud instance (EC2 instance), or any on-premises server or virtual machine
 * (VM) in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS
 * Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html"
 * >Setting up AWS Systems Manager</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on EC2 instances, see
 * the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon
 * EC2 API Reference</a>. For information about how to use a Query API, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html"
 * >Making API requests</a>.
 * </p>
 **/
public interface AmazonSSM {

    /**
     * Overrides the default endpoint for this client
     * ("https://ssm.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ssm.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://ssm.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "ssm.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://ssm.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonSSM#setEndpoint(String)}, sets the
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
     * based on the tags you add. Tags don't have any semantic meaning to and
     * are interpreted strictly as a string of characters.
     * </p>
     * <p>
     * For more information about using tags with EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging your Amazon EC2 resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest <p/>
     * @return cancelCommandResult The response from the CancelCommand service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    CancelCommandResult cancelCommand(CancelCommandRequest cancelCommandRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and
     * cancels any tasks in the window that have not already starting running.
     * (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return cancelMaintenanceWindowExecutionResult The response from the
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
    CancelMaintenanceWindowExecutionResult cancelMaintenanceWindowExecution(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register
     * your on-premises server or virtual machine (VM) with Systems Manager.
     * Registering these machines with Systems Manager makes it possible to
     * manage them using Systems Manager capabilities. You use the activation
     * code and ID when installing SSM Agent on machines in your hybrid
     * environment. For more information about requirements for managing
     * on-premises instances and VMs using Systems Manager, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
     * >Setting up AWS Systems Manager for hybrid environments</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and
     * EC2 instances that you manage with Systems Manager are all called
     * <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @return createActivationResult The response from the CreateActivation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateActivationResult createActivation(CreateActivationRequest createActivationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createAssociationResult The response from the CreateAssociation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    CreateAssociationResult createAssociation(CreateAssociationRequest createAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createAssociationBatchResult The response from the
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
    CreateAssociationBatchResult createAssociationBatch(
            CreateAssociationBatchRequest createAssociationBatchRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Systems Manager (SSM) document. An SSM document defines the
     * actions that Systems Manager performs on your managed instances. For more
     * information about SSM documents, including information about supported
     * schemas, features, and syntax, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html"
     * >AWS Systems Manager Documents</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createDocumentRequest
     * @return createDocumentResult The response from the CreateDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createMaintenanceWindowResult The response from the
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
    CreateMaintenanceWindowResult createMaintenanceWindow(
            CreateMaintenanceWindowRequest createMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to create a new OpsItem. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return createOpsItemResult The response from the CreateOpsItem service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    CreateOpsItemResult createOpsItem(CreateOpsItemRequest createOpsItemRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createPatchBaselineResult The response from the
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
    CreatePatchBaselineResult createPatchBaseline(
            CreatePatchBaselineRequest createPatchBaselineRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a
     * single location. Systems Manager offers two types of resource data sync:
     * <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the
     * <code>SyncToDestination</code> type to synchronize Inventory data from
     * multiple AWS Regions to a single S3 bucket. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html"
     * >Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the
     * <code>SyncFromSource</code> type to synchronize operational work items
     * (OpsItems) and operational data (OpsData) from multiple AWS Regions to a
     * single S3 bucket. This type can synchronize OpsItems and OpsData from
     * multiple AWS accounts and Regions or <code>EntireOrganization</code> by
     * using AWS Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html"
     * >Setting up Systems Manager Explorer to display data from multiple
     * accounts and Regions</a> in the <i>AWS Systems Manager User Guide</i>.
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
     * @return createResourceDataSyncResult The response from the
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
    CreateResourceDataSyncResult createResourceDataSync(
            CreateResourceDataSyncRequest createResourceDataSyncRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If
     * you delete an activation, you can no longer use it to register additional
     * managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return deleteActivationResult The response from the DeleteActivation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    DeleteActivationResult deleteActivation(DeleteActivationRequest deleteActivationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return deleteAssociationResult The response from the DeleteAssociation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    DeleteAssociationResult deleteAssociation(DeleteAssociationRequest deleteAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return deleteDocumentResult The response from the DeleteDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom
     * Inventory type. Deleting a custom inventory type is also referred to as
     * deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return deleteInventoryResult The response from the DeleteInventory
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    DeleteInventoryResult deleteInventory(DeleteInventoryRequest deleteInventoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return deleteMaintenanceWindowResult The response from the
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
    DeleteMaintenanceWindowResult deleteMaintenanceWindow(
            DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return deleteParameterResult The response from the DeleteParameter
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    DeleteParameterResult deleteParameter(DeleteParameterRequest deleteParameterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return deleteParametersResult The response from the DeleteParameters
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteParametersResult deleteParameters(DeleteParametersRequest deleteParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return deletePatchBaselineResult The response from the
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
    DeletePatchBaselineResult deletePatchBaseline(
            DeletePatchBaselineRequest deletePatchBaselineRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is
     * deleted, changes to data on managed instances are no longer synced to or
     * from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return deleteResourceDataSyncResult The response from the
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
    DeleteResourceDataSyncResult deleteResourceDataSync(
            DeleteResourceDataSyncRequest deleteResourceDataSyncRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered
     * servers. You can reregister the instance again at any time. If you don't
     * plan to use Run Command on the server, we suggest uninstalling SSM Agent
     * first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return deregisterManagedInstanceResult The response from the
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
    DeregisterManagedInstanceResult deregisterManagedInstance(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return deregisterPatchBaselineForPatchGroupResult The response from the
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
    DeregisterPatchBaselineForPatchGroupResult deregisterPatchBaselineForPatchGroup(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return deregisterTargetFromMaintenanceWindowResult The response from the
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
    DeregisterTargetFromMaintenanceWindowResult deregisterTargetFromMaintenanceWindow(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return deregisterTaskFromMaintenanceWindowResult The response from the
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
    DeregisterTaskFromMaintenanceWindowResult deregisterTaskFromMaintenanceWindow(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes details about the activation, such as the date and time the
     * activation was created, its expiration date, the IAM role assigned to the
     * instances in the activation, and the number of instances registered by
     * using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return describeActivationsResult The response from the
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
    DescribeActivationsResult describeActivations(
            DescribeActivationsRequest describeActivationsRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return describeAssociationResult The response from the
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
    DescribeAssociationResult describeAssociation(
            DescribeAssociationRequest describeAssociationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Use this API action to view information about a specific execution of a
     * specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return describeAssociationExecutionTargetsResult The response from the
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
    DescribeAssociationExecutionTargetsResult describeAssociationExecutionTargets(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return describeAssociationExecutionsResult The response from the
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
    DescribeAssociationExecutionsResult describeAssociationExecutions(
            DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return describeAutomationExecutionsResult The response from the
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
    DescribeAutomationExecutionsResult describeAutomationExecutions(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Information about all active and terminated step executions in an
     * Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return describeAutomationStepExecutionsResult The response from the
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
    DescribeAutomationStepExecutionsResult describeAutomationStepExecutions(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return describeAvailablePatchesResult The response from the
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
    DescribeAvailablePatchesResult describeAvailablePatches(
            DescribeAvailablePatchesRequest describeAvailablePatchesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return describeDocumentResult The response from the DescribeDocument
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
    DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created
     * the document, you are the owner. If a document is shared, it can either
     * be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return describeDocumentPermissionResult The response from the
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
    DescribeDocumentPermissionResult describeDocumentPermission(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return describeEffectiveInstanceAssociationsResult The response from the
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
    DescribeEffectiveInstanceAssociationsResult describeEffectiveInstanceAssociations(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval
     * state) for the specified patch baseline. Note that this API applies only
     * to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return describeEffectivePatchesForPatchBaselineResult The response from
     *         the DescribeEffectivePatchesForPatchBaseline service method, as
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
    DescribeEffectivePatchesForPatchBaselineResult describeEffectivePatchesForPatchBaseline(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return describeInstanceAssociationsStatusResult The response from the
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
    DescribeInstanceAssociationsStatusResult describeInstanceAssociationsStatus(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your instances, including information about the
     * operating system platform, the version of SSM Agent installed on the
     * instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those
     * instances. If you do not specify instance IDs, it returns information for
     * all your instances. If you specify an instance ID that is not valid or an
     * instance that you do not own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access
     * Management (IAM) role assigned to on-premises instances. This call does
     * not return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return describeInstanceInformationResult The response from the
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
    DescribeInstanceInformationResult describeInstanceInformation(
            DescribeInstanceInformationRequest describeInstanceInformationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return describeInstancePatchStatesResult The response from the
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
    DescribeInstancePatchStatesResult describeInstancePatchStates(
            DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified
     * patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return describeInstancePatchStatesForPatchGroupResult The response from
     *         the DescribeInstancePatchStatesForPatchGroup service method, as
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
    DescribeInstancePatchStatesForPatchGroupResult describeInstancePatchStatesForPatchGroup(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and
     * their state relative to the patch baseline being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return describeInstancePatchesResult The response from the
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
    DescribeInstancePatchesResult describeInstancePatches(
            DescribeInstancePatchesRequest describeInstancePatchesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return describeInventoryDeletionsResult The response from the
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
    DescribeInventoryDeletionsResult describeInventoryDeletions(
            DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a
     * particular task run as part of a maintenance window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return describeMaintenanceWindowExecutionTaskInvocationsResult The
     *         response from the
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
    DescribeMaintenanceWindowExecutionTaskInvocationsResult describeMaintenanceWindowExecutionTaskInvocations(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return describeMaintenanceWindowExecutionTasksResult The response from
     *         the DescribeMaintenanceWindowExecutionTasks service method, as
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
    DescribeMaintenanceWindowExecutionTasksResult describeMaintenanceWindowExecutionTasks(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information
     * about when the maintenance window was scheduled to be active, and
     * information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return describeMaintenanceWindowExecutionsResult The response from the
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
    DescribeMaintenanceWindowExecutionsResult describeMaintenanceWindowExecutions(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return describeMaintenanceWindowScheduleResult The response from the
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
    DescribeMaintenanceWindowScheduleResult describeMaintenanceWindowSchedule(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return describeMaintenanceWindowTargetsResult The response from the
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
    DescribeMaintenanceWindowTargetsResult describeMaintenanceWindowTargets(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return describeMaintenanceWindowTasksResult The response from the
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
    DescribeMaintenanceWindowTasksResult describeMaintenanceWindowTasks(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return describeMaintenanceWindowsResult The response from the
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
    DescribeMaintenanceWindowsResult describeMaintenanceWindows(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that
     * an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return describeMaintenanceWindowsForTargetResult The response from the
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
    DescribeMaintenanceWindowsForTargetResult describeMaintenanceWindowsForTarget(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and
     * Access Management (IAM) to query a list of OpsItems. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return describeOpsItemsResult The response from the DescribeOpsItems
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeOpsItemsResult describeOpsItems(DescribeOpsItemsRequest describeOpsItemsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeParametersResult The response from the DescribeParameters
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    DescribeParametersResult describeParameters(DescribeParametersRequest describeParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return describePatchBaselinesResult The response from the
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
    DescribePatchBaselinesResult describePatchBaselines(
            DescribePatchBaselinesRequest describePatchBaselinesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return describePatchGroupStateResult The response from the
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
    DescribePatchGroupStateResult describePatchGroupState(
            DescribePatchGroupStateRequest describePatchGroupStateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return describePatchGroupsResult The response from the
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
    DescribePatchGroupsResult describePatchGroups(
            DescribePatchGroupsRequest describePatchGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return describePatchPropertiesResult The response from the
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
    DescribePatchPropertiesResult describePatchProperties(
            DescribePatchPropertiesRequest describePatchPropertiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected)
     * or terminated sessions from the past 30 days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return describeSessionsResult The response from the DescribeSessions
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return getAutomationExecutionResult The response from the
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
    GetAutomationExecutionResult getAutomationExecution(
            GetAutomationExecutionRequest getAutomationExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getCalendarStateResult The response from the GetCalendarState
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    GetCalendarStateResult getCalendarState(GetCalendarStateRequest getCalendarStateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or
     * plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return getCommandInvocationResult The response from the
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
    GetCommandInvocationResult getCommandInvocation(
            GetCommandInvocationRequest getCommandInvocationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to
     * determine whether it is running and ready to receive Session Manager
     * connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return getConnectionStatusResult The response from the
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
    GetConnectionStatusResult getConnectionStatus(
            GetConnectionStatusRequest getConnectionStatusRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return getDefaultPatchBaselineResult The response from the
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
    GetDefaultPatchBaselineResult getDefaultPatchBaseline(
            GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses.
     * This API is primarily used by the AWS-RunPatchBaseline Systems Manager
     * document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return getDeployablePatchSnapshotForInstanceResult The response from the
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
    GetDeployablePatchSnapshotForInstanceResult getDeployablePatchSnapshotForInstance(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return getDocumentResult The response from the GetDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return getInventoryResult The response from the GetInventory service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    GetInventoryResult getInventory(GetInventoryRequest getInventoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list
     * of attribute names for a specific Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return getInventorySchemaResult The response from the GetInventorySchema
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    GetInventorySchemaResult getInventorySchema(GetInventorySchemaRequest getInventorySchemaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return getMaintenanceWindowResult The response from the
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
    GetMaintenanceWindowResult getMaintenanceWindow(
            GetMaintenanceWindowRequest getMaintenanceWindowRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return getMaintenanceWindowExecutionResult The response from the
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
    GetMaintenanceWindowExecutionResult getMaintenanceWindowExecution(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return getMaintenanceWindowExecutionTaskResult The response from the
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
    GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTask(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return getMaintenanceWindowExecutionTaskInvocationResult The response
     *         from the GetMaintenanceWindowExecutionTaskInvocation service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    GetMaintenanceWindowExecutionTaskInvocationResult getMaintenanceWindowExecutionTaskInvocation(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return getMaintenanceWindowTaskResult The response from the
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
    GetMaintenanceWindowTaskResult getMaintenanceWindowTask(
            GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have
     * permission in AWS Identity and Access Management (IAM) to view
     * information about an OpsItem. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return getOpsItemResult The response from the GetOpsItem service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
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
    GetOpsItemResult getOpsItem(GetOpsItemRequest getOpsItemRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return getOpsSummaryResult The response from the GetOpsSummary service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    GetOpsSummaryResult getOpsSummary(GetOpsSummaryRequest getOpsSummaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't
     * confuse this API action with the <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return getParameterResult The response from the GetParameter service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    GetParameterResult getParameter(GetParameterRequest getParameterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return getParameterHistoryResult The response from the
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
    GetParameterHistoryResult getParameterHistory(
            GetParameterHistoryRequest getParameterHistoryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the
     * <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return getParametersResult The response from the GetParameters service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    GetParametersResult getParameters(GetParametersRequest getParametersRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getParametersByPathResult The response from the
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
    GetParametersByPathResult getParametersByPath(
            GetParametersByPathRequest getParametersByPathRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return getPatchBaselineResult The response from the GetPatchBaseline
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    GetPatchBaselineResult getPatchBaseline(GetPatchBaselineRequest getPatchBaselineRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch
     * group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return getPatchBaselineForPatchGroupResult The response from the
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
    GetPatchBaselineForPatchGroupResult getPatchBaselineForPatchGroup(
            GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getServiceSettingResult The response from the GetServiceSetting
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    GetServiceSettingResult getServiceSetting(GetServiceSettingRequest getServiceSettingRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return labelParameterVersionResult The response from the
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
    LabelParameterVersionResult labelParameterVersion(
            LabelParameterVersionRequest labelParameterVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return listAssociationVersionsResult The response from the
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
    ListAssociationVersionsResult listAssociationVersions(
            ListAssociationVersionsRequest listAssociationVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and
     * Region. You can limit the results to a specific State Manager association
     * document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return listAssociationsResult The response from the ListAssociations
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listCommandInvocationsResult The response from the
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
    ListCommandInvocationsResult listCommandInvocations(
            ListCommandInvocationsRequest listCommandInvocationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return listCommandsResult The response from the ListCommands service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    ListCommandsResult listCommands(ListCommandsRequest listCommandsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance
     * statuses for different resource types. Currently, you can only specify
     * one resource ID per call. List results depend on the criteria specified
     * in the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return listComplianceItemsResult The response from the
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
    ListComplianceItemsResult listComplianceItems(
            ListComplianceItemsRequest listComplianceItemsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a
     * compliance type. For example, this call can return State Manager
     * associations, patches, or custom compliance types according to the filter
     * criteria that you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return listComplianceSummariesResult The response from the
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
    ListComplianceSummariesResult listComplianceSummaries(
            ListComplianceSummariesRequest listComplianceSummariesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return listDocumentVersionsResult The response from the
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
    ListDocumentVersionsResult listDocumentVersions(
            ListDocumentVersionsRequest listDocumentVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account
     * and Region. You can limit the results of this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return listDocumentsResult The response from the ListDocuments service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return listInventoryEntriesResult The response from the
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
    ListInventoryEntriesResult listInventoryEntries(
            ListInventoryEntriesRequest listInventoryEntriesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information
     * about compliant and non-compliant statuses and detailed compliance-item
     * severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return listResourceComplianceSummariesResult The response from the
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
    ListResourceComplianceSummariesResult listResourceComplianceSummaries(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listResourceDataSyncResult The response from the
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
    ListResourceDataSyncResult listResourceDataSync(
            ListResourceDataSyncRequest listResourceDataSyncRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
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
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a
     * document privately, you must specify the AWS user account IDs for those
     * people who can use the document. If you share a document publicly, you
     * must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return modifyDocumentPermissionResult The response from the
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
    ModifyDocumentPermissionResult modifyDocumentPermission(
            ModifyDocumentPermissionRequest modifyDocumentPermissionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return putComplianceItemsResult The response from the PutComplianceItems
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    PutComplianceItemsResult putComplianceItems(PutComplianceItemsRequest putComplianceItemsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds
     * an inventory item, if it doesn't already exist, or updates an inventory
     * item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return putInventoryResult The response from the PutInventory service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    PutInventoryResult putInventory(PutInventoryRequest putInventoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return putParameterResult The response from the PutParameter service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    PutParameterResult putParameter(PutParameterRequest putParameterRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return registerDefaultPatchBaselineResult The response from the
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
    RegisterDefaultPatchBaselineResult registerDefaultPatchBaseline(
            RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return registerPatchBaselineForPatchGroupResult The response from the
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
    RegisterPatchBaselineForPatchGroupResult registerPatchBaselineForPatchGroup(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return registerTargetWithMaintenanceWindowResult The response from the
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
    RegisterTargetWithMaintenanceWindowResult registerTargetWithMaintenanceWindow(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return registerTaskWithMaintenanceWindowResult The response from the
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
    RegisterTaskWithMaintenanceWindowResult registerTaskWithMaintenanceWindow(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return removeTagsFromResourceResult The response from the
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
    RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return resetServiceSettingResult The response from the
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
    ResetServiceSettingResult resetServiceSetting(
            ResetServiceSettingRequest resetServiceSettingRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return resumeSessionResult The response from the ResumeSession service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    ResumeSessionResult resumeSession(ResumeSessionRequest resumeSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior
     * or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return sendAutomationSignalResult The response from the
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
    SendAutomationSignalResult sendAutomationSignal(
            SendAutomationSignalRequest sendAutomationSignalRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return sendCommandResult The response from the SendCommand service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    SendCommandResult sendCommand(SendCommandRequest sendCommandRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use this API action to run an association immediately and only one time.
     * This action can be helpful when troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return startAssociationsOnceResult The response from the
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
    StartAssociationsOnceResult startAssociationsOnce(
            StartAssociationsOnceRequest startAssociationsOnceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return startAutomationExecutionResult The response from the
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
    StartAutomationExecutionResult startAutomationExecution(
            StartAutomationExecutionRequest startAutomationExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently
     * supported by AWS Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return startSessionResult The response from the StartSession service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    StartSessionResult startSession(StartSessionRequest startSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return stopAutomationExecutionResult The response from the
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
    StopAutomationExecutionResult stopAutomationExecution(
            StopAutomationExecutionRequest stopAutomationExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the
     * Session Manager client and SSM Agent on the instance. A terminated
     * session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return terminateSessionResult The response from the TerminateSession
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    TerminateSessionResult terminateSession(TerminateSessionRequest terminateSessionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateAssociationResult The response from the UpdateAssociation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
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
    UpdateAssociationResult updateAssociation(UpdateAssociationRequest updateAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return updateAssociationStatusResult The response from the
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
    UpdateAssociationStatusResult updateAssociationStatus(
            UpdateAssociationStatusRequest updateAssociationStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return updateDocumentResult The response from the UpdateDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    UpdateDocumentResult updateDocument(UpdateDocumentRequest updateDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return updateDocumentDefaultVersionResult The response from the
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
    UpdateDocumentDefaultVersionResult updateDocumentDefaultVersion(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateMaintenanceWindowResult The response from the
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
    UpdateMaintenanceWindowResult updateMaintenanceWindow(
            UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateMaintenanceWindowTargetResult The response from the
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
    UpdateMaintenanceWindowTargetResult updateMaintenanceWindowTarget(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateMaintenanceWindowTaskResult The response from the
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
    UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTask(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the Amazon Identity and Access Management (IAM) role that is
     * assigned to the on-premises instance or virtual machines (VM). IAM roles
     * are first assigned to these hybrid instances during the activation
     * process. For more information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return updateManagedInstanceRoleResult The response from the
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
    UpdateManagedInstanceRoleResult updateManagedInstanceRole(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to update an OpsItem. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return updateOpsItemResult The response from the UpdateOpsItem service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
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
    UpdateOpsItemResult updateOpsItem(UpdateOpsItemRequest updateOpsItemRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updatePatchBaselineResult The response from the
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
    UpdatePatchBaselineResult updatePatchBaseline(
            UpdatePatchBaselineRequest updatePatchBaselineRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * <note>
     * <p>
     * This API action only supports a resource data sync that was created with
     * a SyncFromSource <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @return updateResourceDataSyncResult The response from the
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
    UpdateResourceDataSyncResult updateResourceDataSync(
            UpdateResourceDataSyncRequest updateResourceDataSyncRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateServiceSettingResult The response from the
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
    UpdateServiceSettingResult updateServiceSetting(
            UpdateServiceSettingRequest updateServiceSettingRequest) throws AmazonClientException,
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
