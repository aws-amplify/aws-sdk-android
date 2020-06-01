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

package com.amazonaws.services.fsx;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.fsx.model.*;

/**
 * Interface for accessing Amazon FSx
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and
 * application administrators to launch and use shared file storage.
 * </p>
 **/
public interface AmazonFSx {

    /**
     * Overrides the default endpoint for this client
     * ("https://fsx.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "fsx.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://fsx.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "fsx.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://fsx.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonFSx#setEndpoint(String)}, sets the
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
     * Cancels an existing Amazon FSx for Lustre data repository task if that
     * task is in either the <code>PENDING</code> or <code>EXECUTING</code>
     * state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel
     * operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest <p>
     *            Cancels a data repository task.
     *            </p>
     * @return cancelDataRepositoryTaskResult The response from the
     *         CancelDataRepositoryTask service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws DataRepositoryTaskNotFoundException
     * @throws DataRepositoryTaskEndedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CancelDataRepositoryTaskResult cancelDataRepositoryTask(
            CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx for Windows File Server file
     * system. Creating regular backups for your file system is a best practice
     * that complements the replication that Amazon FSx for Windows File Server
     * performs for your file system. It also enables you to restore from user
     * modification of data.
     * </p>
     * <p>
     * If a backup with the specified client request token exists, and the
     * parameters match, this operation returns the description of the existing
     * backup. If a backup specified client request token exists, and the
     * parameters don't match, this operation returns
     * <code>IncompatibleParameterError</code>. If a backup with the specified
     * client request token doesn't exist, <code>CreateBackup</code> does the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial
     * lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a
     * <code>CreateBackup</code> operation without the risk of creating an extra
     * backup. This approach can be useful when an initial call fails in a way
     * that makes it unclear whether a backup was created. If you use the same
     * client request token and the initial call created a backup, the operation
     * returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateFileSystem</code> operation returns while the backup's
     * lifecycle state is still <code>CREATING</code>. You can check the file
     * system creation status by calling the <a>DescribeBackups</a> operation,
     * which returns the backup state along with other information.
     * </p>
     * <note>
     * <p/>
     * </note>
     * 
     * @param createBackupRequest <p>
     *            The request object for the <code>CreateBackup</code>
     *            operation.
     *            </p>
     * @return createBackupResult The response from the CreateBackup service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws FileSystemNotFoundException
     * @throws BackupInProgressException
     * @throws IncompatibleParameterErrorException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository task. You use data
     * repository tasks to perform bulk operations between your Amazon FSx file
     * system and its linked data repository. An example of a data repository
     * task is exporting any data and metadata changes, including POSIX
     * metadata, to files, directories, and symbolic links (symlinks) from your
     * FSx file system to its linked data repository. A
     * <code>CreateDataRepositoryTask</code> operation will fail if a data
     * repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html"
     * >Using Data Repository Tasks</a>. To learn more about linking a data
     * repository to your file system, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/export-data-repository.html#export-prefix"
     * >Setting the Export Prefix</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @return createDataRepositoryTaskResult The response from the
     *         CreateDataRepositoryTask service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws FileSystemNotFoundException
     * @throws IncompatibleParameterErrorException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws DataRepositoryTaskExecutingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateDataRepositoryTaskResult createDataRepositoryTask(
            CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the
     * parameters match, <code>CreateFileSystem</code> returns the description
     * of the existing file system. If a file system specified client request
     * token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an
     * initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon
     * FSx uses to ensure idempotent creation. This means that calling the
     * operation multiple times with the same client request token has no
     * effect. By using the idempotent operation, you can retry a
     * <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails
     * in a way that makes it unclear whether a file system was created.
     * Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call
     * created a file system, the client receives success as long as the
     * parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's
     * lifecycle state is still <code>CREATING</code>. You can check the
     * file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other
     * information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest <p>
     *            The request object used to create a new Amazon FSx file
     *            system.
     *            </p>
     * @return createFileSystemResult The response from the CreateFileSystem
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws ActiveDirectoryErrorException
     * @throws IncompatibleParameterErrorException
     * @throws InvalidImportPathException
     * @throws InvalidExportPathException
     * @throws InvalidNetworkSettingsException
     * @throws InvalidPerUnitStorageThroughputException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws MissingFileSystemConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateFileSystemResult createFileSystem(CreateFileSystemRequest createFileSystemRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon FSx file system from an existing Amazon FSx for
     * Windows File Server backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the
     * parameters match, this operation returns the description of the file
     * system. If a client request token specified by the file system exists and
     * the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and
     * an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like Active Directory, default share name, automatic backup,
     * and backup settings default to the parameters of the file system that was
     * backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a
     * <code>CreateFileSystemFromBackup</code> call without the risk of creating
     * an extra file system. This approach can be useful when an initial call
     * fails in a way that makes it unclear whether a file system was created.
     * Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call
     * created a file system, the client receives success as long as the
     * parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file
     * system's lifecycle state is still <code>CREATING</code>. You can check
     * the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other
     * information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest <p>
     *            The request object for the
     *            <code>CreateFileSystemFromBackup</code> operation.
     *            </p>
     * @return createFileSystemFromBackupResult The response from the
     *         CreateFileSystemFromBackup service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws ActiveDirectoryErrorException
     * @throws IncompatibleParameterErrorException
     * @throws InvalidNetworkSettingsException
     * @throws ServiceLimitExceededException
     * @throws BackupNotFoundException
     * @throws InternalServerErrorException
     * @throws MissingFileSystemConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    CreateFileSystemFromBackupResult createFileSystemFromBackup(
            CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon FSx for Windows File Server backup, deleting its
     * contents. After deletion, the backup no longer exists, and its data is
     * gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup will not
     * show up in later <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by
     * any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest <p>
     *            The request object for <code>DeleteBackup</code> operation.
     *            </p>
     * @return deleteBackupResult The response from the DeleteBackup service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws BackupInProgressException
     * @throws BackupNotFoundException
     * @throws BackupRestoringException
     * @throws IncompatibleParameterErrorException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a file system, deleting its contents. After deletion, the file
     * system no longer exists, and its data is gone. Any existing automatic
     * backups will also be deleted.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file
     * system, a final backup is created upon deletion. This final backup is not
     * subject to the file system's retention policy, and must be manually
     * deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> action returns while the file system
     * has the <code>DELETING</code> status. You can check the file system
     * deletion status by calling the <a>DescribeFileSystems</a> action, which
     * returns a list of file systems in your account. If you pass the file
     * system ID for a deleted file system, the <a>DescribeFileSystems</a>
     * returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * Deleting an Amazon FSx for Lustre file system will fail with a 400
     * BadRequest if a data repository task is in a <code>PENDING</code> or
     * <code>EXECUTING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered
     * by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest <p>
     *            The request object for <code>DeleteFileSystem</code>
     *            operation.
     *            </p>
     * @return deleteFileSystemResult The response from the DeleteFileSystem
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws IncompatibleParameterErrorException
     * @throws FileSystemNotFoundException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Windows File Server
     * backups, if a <code>BackupIds</code> value is provided for that backup.
     * Otherwise, it returns all backups owned by your AWS account in the AWS
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the
     * <code>MaxResults</code> parameter to limit the number of backups in a
     * response. If more backups remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later
     * request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your
     * backups. <code>DescribeBackups</code> is called first without a
     * <code>NextToken</code>value. Then the action continues to be called with
     * the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no
     * <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file
     * system descriptions while still including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of backups returned in the response of one
     * <code>DescribeBackups</code> call and the order of backups returned
     * across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest <p>
     *            The request object for <code>DescribeBackups</code> operation.
     *            </p>
     * @return describeBackupsResult The response from the DescribeBackups
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws BackupNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre data repository
     * tasks, if one or more <code>TaskIds</code> values are provided in the
     * request, or if filters are used in the request. You can use filters to
     * narrow the response to include just tasks for specific file systems, or
     * tasks in a specific lifecycle state. Otherwise, it returns all data
     * repository tasks owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the
     * optional <code>MaxResults</code> parameter to limit the number of tasks
     * returned in a response. If more tasks remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later
     * request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @return describeDataRepositoryTasksResult The response from the
     *         DescribeDataRepositoryTasks service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws DataRepositoryTaskNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeDataRepositoryTasksResult describeDataRepositoryTasks(
            DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a
     * <code>FileSystemIds</code> value is provided for that file system.
     * Otherwise, it returns descriptions of all file systems owned by your AWS
     * account in the AWS Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify
     * the <code>MaxResults</code> parameter to limit the number of descriptions
     * in a response. If more file system descriptions remain, Amazon FSx
     * returns a <code>NextToken</code> value in the response. In this case,
     * send a later request with the <code>NextToken</code> request parameter
     * set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your
     * file system descriptions. <code>DescribeFileSystems</code> is called
     * first without a <code>NextToken</code>value. Then the action continues to
     * be called with the <code>NextToken</code> parameter set to the value of
     * the last <code>NextToken</code> value until a response has no
     * <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file
     * system descriptions while still including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call and the order of file systems
     * returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest <p>
     *            The request object for <code>DescribeFileSystems</code>
     *            operation.
     *            </p>
     * @return describeFileSystemsResult The response from the
     *         DescribeFileSystems service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    DescribeFileSystemsResult describeFileSystems(
            DescribeFileSystemsRequest describeFileSystemsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists tags for an Amazon FSx file systems and backups in the case of
     * Amazon FSx for Windows File Server.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the
     * <code>MaxResults</code> parameter to limit the number of tags in a
     * response. If more tags remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later
     * request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your
     * tags. <code>ListTagsForResource</code> is called first without a
     * <code>NextToken</code>value. Then the action continues to be called with
     * the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no
     * <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file
     * system descriptions while still including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one
     * <code>ListTagsForResource</code> call and the order of tags returned
     * across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest <p>
     *            The request object for <code>ListTagsForResource</code>
     *            operation.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     * @throws NotServiceResourceErrorException
     * @throws ResourceDoesNotSupportTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            The request object for the <code>TagResource</code> operation.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     * @throws NotServiceResourceErrorException
     * @throws ResourceDoesNotSupportTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            The request object for <code>UntagResource</code> action.
     *            </p>
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     * @throws NotServiceResourceErrorException
     * @throws ResourceDoesNotSupportTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use this operation to update the configuration of an existing Amazon FSx
     * file system. For an Amazon FSx for Lustre file system, you can update
     * only the WeeklyMaintenanceStartTime. For an Amazon for Windows File
     * Server file system, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * SelfManagedActiveDirectoryConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ThroughputCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can update multiple properties in a single request.
     * </p>
     * 
     * @param updateFileSystemRequest <p>
     *            The request object for the <code>UpdateFileSystem</code>
     *            operation.
     *            </p>
     * @return updateFileSystemResult The response from the UpdateFileSystem
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws IncompatibleParameterErrorException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws MissingFileSystemConfigurationException
     * @throws ServiceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest updateFileSystemRequest)
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
