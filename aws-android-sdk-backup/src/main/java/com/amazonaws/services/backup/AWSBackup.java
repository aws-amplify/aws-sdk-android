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

package com.amazonaws.services.backup;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.backup.model.*;

/**
 * Interface for accessing AWS Backup <fullname>AWS Backup</fullname>
 * <p>
 * AWS Backup is a unified backup service designed to protect AWS services and
 * their associated data. AWS Backup simplifies the creation, migration,
 * restoration, and deletion of backups, while also providing reporting and
 * auditing.
 * </p>
 **/
public interface AWSBackup {

    /**
     * Overrides the default endpoint for this client
     * ("https://backup.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "backup.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://backup.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex: "backup.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://backup.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSBackup#setEndpoint(String)}, sets the
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
     * Backup plans are documents that contain information that AWS Backup uses
     * to schedule tasks that create recovery points of resources.
     * </p>
     * <p>
     * If you call <code>CreateBackupPlan</code> with a plan that already
     * exists, an <code>AlreadyExistsException</code> is returned.
     * </p>
     * 
     * @param createBackupPlanRequest
     * @return createBackupPlanResult The response from the CreateBackupPlan
     *         service method, as returned by AWS Backup.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBackupPlanResult createBackupPlan(CreateBackupPlanRequest createBackupPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a JSON document that specifies a set of resources to assign to a
     * backup plan. Resources can be included by specifying patterns for a
     * <code>ListOfTags</code> and selected <code>Resources</code>.
     * </p>
     * <p>
     * For example, consider the following patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Resources: "arn:aws:ec2:region:account-id:volume/volume-id"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"department"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"finance"</code>
     * </p>
     * <p>
     * <code>ConditionType:"STRINGEQUALS"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"importance"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"critical"</code>
     * </p>
     * <p>
     * <code>ConditionType:"STRINGEQUALS"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using these patterns would back up all Amazon Elastic Block Store (Amazon
     * EBS) volumes that are tagged as <code>"department=finance"</code>,
     * <code>"importance=critical"</code>, in addition to an EBS volume with the
     * specified volume Id.
     * </p>
     * <p>
     * Resources and conditions are additive in that all resources that match
     * the pattern are selected. This shouldn't be confused with a logical AND,
     * where all conditions must match. The matching patterns are logically 'put
     * together using the OR operator. In other words, all patterns that match
     * are selected for backup.
     * </p>
     * 
     * @param createBackupSelectionRequest
     * @return createBackupSelectionResult The response from the
     *         CreateBackupSelection service method, as returned by AWS Backup.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBackupSelectionResult createBackupSelection(
            CreateBackupSelectionRequest createBackupSelectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a logical container where backups are stored. A
     * <code>CreateBackupVault</code> request includes a name, optionally one or
     * more resource tags, an encryption key, and a request ID.
     * </p>
     * <note>
     * <p>
     * Sensitive data, such as passport numbers, should not be included the name
     * of a backup vault.
     * </p>
     * </note>
     * 
     * @param createBackupVaultRequest
     * @return createBackupVaultResult The response from the CreateBackupVault
     *         service method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBackupVaultResult createBackupVault(CreateBackupVaultRequest createBackupVaultRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a backup plan. A backup plan can only be deleted after all
     * associated selections of resources have been deleted. Deleting a backup
     * plan deletes the current version of a backup plan. Previous versions, if
     * any, will still exist.
     * </p>
     * 
     * @param deleteBackupPlanRequest
     * @return deleteBackupPlanResult The response from the DeleteBackupPlan
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteBackupPlanResult deleteBackupPlan(DeleteBackupPlanRequest deleteBackupPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the resource selection associated with a backup plan that is
     * specified by the <code>SelectionId</code>.
     * </p>
     * 
     * @param deleteBackupSelectionRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteBackupSelection(DeleteBackupSelectionRequest deleteBackupSelectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the backup vault identified by its name. A vault can be deleted
     * only if it is empty.
     * </p>
     * 
     * @param deleteBackupVaultRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteBackupVault(DeleteBackupVaultRequest deleteBackupVaultRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the policy document that manages permissions on a backup vault.
     * </p>
     * 
     * @param deleteBackupVaultAccessPolicyRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteBackupVaultAccessPolicy(
            DeleteBackupVaultAccessPolicyRequest deleteBackupVaultAccessPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes event notifications for the specified backup vault.
     * </p>
     * 
     * @param deleteBackupVaultNotificationsRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteBackupVaultNotifications(
            DeleteBackupVaultNotificationsRequest deleteBackupVaultNotificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the recovery point specified by a recovery point ID.
     * </p>
     * 
     * @param deleteRecoveryPointRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteRecoveryPoint(DeleteRecoveryPointRequest deleteRecoveryPointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata associated with creating a backup of a resource.
     * </p>
     * 
     * @param describeBackupJobRequest
     * @return describeBackupJobResult The response from the DescribeBackupJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws DependencyFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeBackupJobResult describeBackupJob(DescribeBackupJobRequest describeBackupJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata about a backup vault specified by its name.
     * </p>
     * 
     * @param describeBackupVaultRequest
     * @return describeBackupVaultResult The response from the
     *         DescribeBackupVault service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeBackupVaultResult describeBackupVault(
            DescribeBackupVaultRequest describeBackupVaultRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns metadata associated with creating a copy of a resource.
     * </p>
     * 
     * @param describeCopyJobRequest
     * @return describeCopyJobResult The response from the DescribeCopyJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCopyJobResult describeCopyJob(DescribeCopyJobRequest describeCopyJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a saved resource, including the last time it
     * was backed up, its Amazon Resource Name (ARN), and the AWS service type
     * of the saved resource.
     * </p>
     * 
     * @param describeProtectedResourceRequest
     * @return describeProtectedResourceResult The response from the
     *         DescribeProtectedResource service method, as returned by AWS
     *         Backup.
     * @throws MissingParameterValueException
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeProtectedResourceResult describeProtectedResource(
            DescribeProtectedResourceRequest describeProtectedResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata associated with a recovery point, including ID, status,
     * encryption, and lifecycle.
     * </p>
     * 
     * @param describeRecoveryPointRequest
     * @return describeRecoveryPointResult The response from the
     *         DescribeRecoveryPoint service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRecoveryPointResult describeRecoveryPoint(
            DescribeRecoveryPointRequest describeRecoveryPointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the current service opt-in settings for the Region. If the
     * service has a value set to <code>true</code>, AWS Backup attempts to
     * protect that service's resources in this Region, when included in an
     * on-demand backup or scheduled backup plan. If the value is set to
     * <code>false</code> for a service, AWS Backup does not attempt to protect
     * that service's resources in this Region.
     * </p>
     * 
     * @param describeRegionSettingsRequest
     * @return describeRegionSettingsResult The response from the
     *         DescribeRegionSettings service method, as returned by AWS Backup.
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRegionSettingsResult describeRegionSettings(
            DescribeRegionSettingsRequest describeRegionSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata associated with a restore job that is specified by a job
     * ID.
     * </p>
     * 
     * @param describeRestoreJobRequest
     * @return describeRestoreJobResult The response from the DescribeRestoreJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws DependencyFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRestoreJobResult describeRestoreJob(DescribeRestoreJobRequest describeRestoreJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the backup plan that is specified by the plan ID as a backup
     * template.
     * </p>
     * 
     * @param exportBackupPlanTemplateRequest
     * @return exportBackupPlanTemplateResult The response from the
     *         ExportBackupPlanTemplate service method, as returned by AWS
     *         Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ExportBackupPlanTemplateResult exportBackupPlanTemplate(
            ExportBackupPlanTemplateRequest exportBackupPlanTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the body of a backup plan in JSON format, in addition to plan
     * metadata.
     * </p>
     * 
     * @param getBackupPlanRequest
     * @return getBackupPlanResult The response from the GetBackupPlan service
     *         method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackupPlanResult getBackupPlan(GetBackupPlanRequest getBackupPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a valid JSON document specifying a backup plan or an error.
     * </p>
     * 
     * @param getBackupPlanFromJSONRequest
     * @return getBackupPlanFromJSONResult The response from the
     *         GetBackupPlanFromJSON service method, as returned by AWS Backup.
     * @throws LimitExceededException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackupPlanFromJSONResult getBackupPlanFromJSON(
            GetBackupPlanFromJSONRequest getBackupPlanFromJSONRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the template specified by its <code>templateId</code> as a backup
     * plan.
     * </p>
     * 
     * @param getBackupPlanFromTemplateRequest
     * @return getBackupPlanFromTemplateResult The response from the
     *         GetBackupPlanFromTemplate service method, as returned by AWS
     *         Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackupPlanFromTemplateResult getBackupPlanFromTemplate(
            GetBackupPlanFromTemplateRequest getBackupPlanFromTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns selection metadata and a document in JSON format that specifies a
     * list of resources that are associated with a backup plan.
     * </p>
     * 
     * @param getBackupSelectionRequest
     * @return getBackupSelectionResult The response from the GetBackupSelection
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackupSelectionResult getBackupSelection(GetBackupSelectionRequest getBackupSelectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the access policy document that is associated with the named
     * backup vault.
     * </p>
     * 
     * @param getBackupVaultAccessPolicyRequest
     * @return getBackupVaultAccessPolicyResult The response from the
     *         GetBackupVaultAccessPolicy service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackupVaultAccessPolicyResult getBackupVaultAccessPolicy(
            GetBackupVaultAccessPolicyRequest getBackupVaultAccessPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns event notifications for the specified backup vault.
     * </p>
     * 
     * @param getBackupVaultNotificationsRequest
     * @return getBackupVaultNotificationsResult The response from the
     *         GetBackupVaultNotifications service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackupVaultNotificationsResult getBackupVaultNotifications(
            GetBackupVaultNotificationsRequest getBackupVaultNotificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a set of metadata key-value pairs that were used to create the
     * backup.
     * </p>
     * 
     * @param getRecoveryPointRestoreMetadataRequest
     * @return getRecoveryPointRestoreMetadataResult The response from the
     *         GetRecoveryPointRestoreMetadata service method, as returned by
     *         AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRecoveryPointRestoreMetadataResult getRecoveryPointRestoreMetadata(
            GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the AWS resource types supported by AWS Backup.
     * </p>
     * 
     * @param getSupportedResourceTypesRequest
     * @return getSupportedResourceTypesResult The response from the
     *         GetSupportedResourceTypes service method, as returned by AWS
     *         Backup.
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSupportedResourceTypesResult getSupportedResourceTypes(
            GetSupportedResourceTypesRequest getSupportedResourceTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata about your backup jobs.
     * </p>
     * 
     * @param listBackupJobsRequest
     * @return listBackupJobsResult The response from the ListBackupJobs service
     *         method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupJobsResult listBackupJobs(ListBackupJobsRequest listBackupJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata of your saved backup plan templates, including the
     * template ID, name, and the creation and deletion dates.
     * </p>
     * 
     * @param listBackupPlanTemplatesRequest
     * @return listBackupPlanTemplatesResult The response from the
     *         ListBackupPlanTemplates service method, as returned by AWS
     *         Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupPlanTemplatesResult listBackupPlanTemplates(
            ListBackupPlanTemplatesRequest listBackupPlanTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns version metadata of your backup plans, including Amazon Resource
     * Names (ARNs), backup plan IDs, creation and deletion dates, plan names,
     * and version IDs.
     * </p>
     * 
     * @param listBackupPlanVersionsRequest
     * @return listBackupPlanVersionsResult The response from the
     *         ListBackupPlanVersions service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupPlanVersionsResult listBackupPlanVersions(
            ListBackupPlanVersionsRequest listBackupPlanVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata of your saved backup plans, including Amazon Resource
     * Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan
     * names, and creator request IDs.
     * </p>
     * 
     * @param listBackupPlansRequest
     * @return listBackupPlansResult The response from the ListBackupPlans
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupPlansResult listBackupPlans(ListBackupPlansRequest listBackupPlansRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array containing metadata of the resources associated with the
     * target backup plan.
     * </p>
     * 
     * @param listBackupSelectionsRequest
     * @return listBackupSelectionsResult The response from the
     *         ListBackupSelections service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupSelectionsResult listBackupSelections(
            ListBackupSelectionsRequest listBackupSelectionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of recovery point storage containers along with
     * information about them.
     * </p>
     * 
     * @param listBackupVaultsRequest
     * @return listBackupVaultsResult The response from the ListBackupVaults
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupVaultsResult listBackupVaults(ListBackupVaultsRequest listBackupVaultsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata about your copy jobs.
     * </p>
     * 
     * @param listCopyJobsRequest
     * @return listCopyJobsResult The response from the ListCopyJobs service
     *         method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListCopyJobsResult listCopyJobs(ListCopyJobsRequest listCopyJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of resources successfully backed up by AWS Backup,
     * including the time the resource was saved, an Amazon Resource Name (ARN)
     * of the resource, and a resource type.
     * </p>
     * 
     * @param listProtectedResourcesRequest
     * @return listProtectedResourcesResult The response from the
     *         ListProtectedResources service method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListProtectedResourcesResult listProtectedResources(
            ListProtectedResourcesRequest listProtectedResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns detailed information about the recovery points stored in a backup
     * vault.
     * </p>
     * 
     * @param listRecoveryPointsByBackupVaultRequest
     * @return listRecoveryPointsByBackupVaultResult The response from the
     *         ListRecoveryPointsByBackupVault service method, as returned by
     *         AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRecoveryPointsByBackupVaultResult listRecoveryPointsByBackupVault(
            ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns detailed information about recovery points of the type specified
     * by a resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecoveryPointsByResourceRequest
     * @return listRecoveryPointsByResourceResult The response from the
     *         ListRecoveryPointsByResource service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRecoveryPointsByResourceResult listRecoveryPointsByResource(
            ListRecoveryPointsByResourceRequest listRecoveryPointsByResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of jobs that AWS Backup initiated to restore a saved
     * resource, including metadata about the recovery process.
     * </p>
     * 
     * @param listRestoreJobsRequest
     * @return listRestoreJobsResult The response from the ListRestoreJobs
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRestoreJobsResult listRestoreJobs(ListRestoreJobsRequest listRestoreJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of key-value pairs assigned to a target recovery point,
     * backup plan, or backup vault.
     * </p>
     * <note>
     * <p>
     * <code>ListTags</code> are currently only supported with Amazon EFS
     * backups.
     * </p>
     * </note>
     * 
     * @param listTagsRequest
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets a resource-based policy that is used to manage access permissions on
     * the target backup vault. Requires a backup vault name and an access
     * policy document in JSON format.
     * </p>
     * 
     * @param putBackupVaultAccessPolicyRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void putBackupVaultAccessPolicy(
            PutBackupVaultAccessPolicyRequest putBackupVaultAccessPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Turns on notifications on a backup vault for the specified topic and
     * events.
     * </p>
     * 
     * @param putBackupVaultNotificationsRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void putBackupVaultNotifications(
            PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a job to create a one-time backup of the specified resource.
     * </p>
     * 
     * @param startBackupJobRequest
     * @return startBackupJobResult The response from the StartBackupJob service
     *         method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartBackupJobResult startBackupJob(StartBackupJobRequest startBackupJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a job to create a one-time copy of the specified resource.
     * </p>
     * 
     * @param startCopyJobRequest
     * @return startCopyJobResult The response from the StartCopyJob service
     *         method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartCopyJobResult startCopyJob(StartCopyJobRequest startCopyJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Recovers the saved resource identified by an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * If the resource ARN is included in the request, then the last complete
     * backup of that resource is recovered. If the ARN of a recovery point is
     * supplied, then that recovery point is restored.
     * </p>
     * 
     * @param startRestoreJobRequest
     * @return startRestoreJobResult The response from the StartRestoreJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartRestoreJobResult startRestoreJob(StartRestoreJobRequest startRestoreJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attempts to cancel a job to create a one-time backup of a resource.
     * </p>
     * 
     * @param stopBackupJobRequest
     * @throws MissingParameterValueException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void stopBackupJob(StopBackupJobRequest stopBackupJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Assigns a set of key-value pairs to a recovery point, backup plan, or
     * backup vault identified by an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes a set of key-value pairs from a recovery point, backup plan, or
     * backup vault identified by an Amazon Resource Name (ARN)
     * </p>
     * 
     * @param untagResourceRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Replaces the body of a saved backup plan identified by its
     * <code>backupPlanId</code> with the input document in JSON format. The new
     * version is uniquely identified by a <code>VersionId</code>.
     * </p>
     * 
     * @param updateBackupPlanRequest
     * @return updateBackupPlanResult The response from the UpdateBackupPlan
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateBackupPlanResult updateBackupPlan(UpdateBackupPlanRequest updateBackupPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the transition lifecycle of a recovery point.
     * </p>
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     * 
     * @param updateRecoveryPointLifecycleRequest
     * @return updateRecoveryPointLifecycleResult The response from the
     *         UpdateRecoveryPointLifecycle service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRecoveryPointLifecycleResult updateRecoveryPointLifecycle(
            UpdateRecoveryPointLifecycleRequest updateRecoveryPointLifecycleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the current service opt-in settings for the Region. If the
     * service has a value set to <code>true</code>, AWS Backup attempts to
     * protect that service's resources in this Region, when included in an
     * on-demand backup or scheduled backup plan. If the value is set to
     * <code>false</code> for a service, AWS Backup does not attempt to protect
     * that service's resources in this Region.
     * </p>
     * 
     * @param updateRegionSettingsRequest
     * @throws ServiceUnavailableException
     * @throws MissingParameterValueException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateRegionSettings(UpdateRegionSettingsRequest updateRegionSettingsRequest)
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
