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

package com.amazonaws.services.rds;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.rds.model.*;

/**
 * Interface for accessing Amazon Relational Database Service <fullname>Amazon
 * Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes
 * it easier to set up, operate, and scale a relational database in the cloud.
 * It provides cost-efficient, resizeable capacity for an industry-standard
 * relational database and manages common database administration tasks, freeing
 * up developers to focus on what makes their applications and businesses
 * unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB,
 * PostgreSQL, Microsoft SQL Server, Oracle, or Amazon Aurora database server.
 * These capabilities mean that the code, applications, and tools you already
 * use today with your existing databases work with Amazon RDS without
 * modification. Amazon RDS automatically backs up your database and maintains
 * the database software that powers your DB instance. Amazon RDS is flexible:
 * you can scale your DB instance's compute resources and storage capacity to
 * meet your application's demand. As with all Amazon Web Services, there are no
 * up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a
 * programming or command line interface you can use to manage Amazon RDS.
 * Amazon RDS is asynchronous, which means that some interfaces might require
 * techniques such as polling or callback functions to determine when a command
 * has been applied. In this reference, the parameter descriptions indicate
 * whether a command is applied immediately, on the next instance reboot, or
 * during the maintenance window. The reference structure is as follows, and we
 * list following some related topics from the user guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html"
 * >API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html"
 * >Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html"
 * >Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces"
 * >Available RDS Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html"
 * >Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 **/
public interface AmazonRelationalDatabaseService {

    /**
     * Overrides the default endpoint for this client
     * ("https://rds.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "rds.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://rds.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "rds.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://rds.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to
     * {@link AmazonRelationalDatabaseService#setEndpoint(String)}, sets the
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
     * Associates an Identity and Access Management (IAM) role from an Amazon
     * Aurora DB cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your
     * Behalf</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param addRoleToDBClusterRequest
     * @throws DBClusterNotFoundException
     * @throws DBClusterRoleAlreadyExistsException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterRoleQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void addRoleToDBCluster(AddRoleToDBClusterRequest addRoleToDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates an AWS Identity and Access Management (IAM) role with a DB
     * instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be
     * <code>available</code>.
     * </p>
     * </note>
     * 
     * @param addRoleToDBInstanceRequest
     * @throws DBInstanceNotFoundException
     * @throws DBInstanceRoleAlreadyExistsException
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceRoleQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void addRoleToDBInstance(AddRoleToDBInstanceRequest addRoleToDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification
     * subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest <p/>
     * @return addSourceIdentifierToSubscriptionResult The response from the
     *         AddSourceIdentifierToSubscription service method, as returned by
     *         Amazon Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws SourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    AddSourceIdentifierToSubscriptionResult addSourceIdentifierToSubscription(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used
     * with cost allocation reporting to track cost associated with Amazon RDS
     * resources, or used in a Condition statement in an IAM policy for Amazon
     * RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
     * >Tagging Amazon RDS Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest <p/>
     * @throws DBInstanceNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB
     * instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest <p/>
     * @return applyPendingMaintenanceActionResult The response from the
     *         ApplyPendingMaintenanceAction service method, as returned by
     *         Amazon Relational Database Service.
     * @throws ResourceNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ApplyPendingMaintenanceActionResult applyPendingMaintenanceAction(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of
     * authorization. First, EC2 or VPC security groups can be added to the
     * DBSecurityGroup if the application using the database is running on EC2
     * or VPC instances. Second, IP ranges are available if the application
     * accessing your database is running on the Internet. Required parameters
     * for this API are one of CIDR range, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You can't authorize ingress from an EC2 security group in one AWS Region
     * to an Amazon RDS DB instance in another. You can't authorize ingress from
     * a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     * >Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param authorizeDBSecurityGroupIngressRequest <p/>
     * @return authorizeDBSecurityGroupIngressResult The response from the
     *         AuthorizeDBSecurityGroupIngress service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    AuthorizeDBSecurityGroupIngressResult authorizeDBSecurityGroupIngress(
            AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Backtracks a DB cluster to a specific time, without creating a new DB
     * cluster.
     * </p>
     * <p>
     * For more information on backtracking, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html"
     * > Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param backtrackDBClusterRequest <p/>
     * @return backtrackDBClusterResult The response from the BacktrackDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    BacktrackDBClusterResult backtrackDBCluster(BacktrackDBClusterRequest backtrackDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels an export task in progress that is exporting a snapshot to Amazon
     * S3. Any data that has already been written to the S3 bucket isn't
     * removed.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return cancelExportTaskResult The response from the CancelExportTask
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws ExportTaskNotFoundException
     * @throws InvalidExportTaskStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @return copyDBClusterParameterGroupResult The response from the
     *         CopyDBClusterParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CopyDBClusterParameterGroupResult copyDBClusterParameterGroup(
            CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies a snapshot of a DB cluster.
     * </p>
     * <p>
     * To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
     * <code>SourceDBClusterSnapshotIdentifier</code> must be the Amazon
     * Resource Name (ARN) of the shared DB cluster snapshot.
     * </p>
     * <p>
     * You can copy an encrypted DB cluster snapshot from another AWS Region. In
     * that case, the AWS Region where you call the
     * <code>CopyDBClusterSnapshot</code> action is the destination AWS Region
     * for the encrypted DB cluster snapshot to be copied to. To copy an
     * encrypted DB cluster snapshot from another AWS Region, you must provide
     * the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS Key Management System (AWS KMS) key
     * identifier for the key to use to encrypt the copy of the DB cluster
     * snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreSignedUrl</code> - A URL that contains a Signature Version 4
     * signed request for the <code>CopyDBClusterSnapshot</code> action to be
     * called in the source AWS Region where the DB cluster snapshot is copied
     * from. The pre-signed URL must be a valid request for the
     * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster snapshot to be
     * copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster snapshot in the destination AWS
     * Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the
     * destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB
     * cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the Amazon Resource Name (ARN) format for the
     * source AWS Region. For example, if you are copying an encrypted DB
     * cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
     * example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the
     * new copy of the DB cluster snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the ARN format for the source AWS Region and is the
     * same value as the <code>SourceDBClusterSnapshotIdentifier</code> in the
     * pre-signed URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB
     * cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster
     * snapshot is in "copying" status.
     * </p>
     * <p>
     * For more information on copying encrypted DB cluster snapshots from one
     * AWS Region to another, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"
     * > Copying a Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterSnapshotRequest <p/>
     * @return copyDBClusterSnapshotResult The response from the
     *         CopyDBClusterSnapshot service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws DBClusterSnapshotNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws SnapshotQuotaExceededException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CopyDBClusterSnapshotResult copyDBClusterSnapshot(
            CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * 
     * @param copyDBParameterGroupRequest <p/>
     * @return copyDBParameterGroupResult The response from the
     *         CopyDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws DBParameterGroupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CopyDBParameterGroupResult copyDBParameterGroup(
            CopyDBParameterGroupRequest copyDBParameterGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the
     * "available" state.
     * </p>
     * <p>
     * You can copy a snapshot from one AWS Region to another. In that case, the
     * AWS Region where you call the <code>CopyDBSnapshot</code> action is the
     * destination AWS Region for the DB snapshot copy.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopyDBSnapshot"
     * >Copying a DB Snapshot</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param copyDBSnapshotRequest <p/>
     * @return copyDBSnapshotResult The response from the CopyDBSnapshot service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBSnapshotAlreadyExistsException
     * @throws DBSnapshotNotFoundException
     * @throws InvalidDBSnapshotStateException
     * @throws SnapshotQuotaExceededException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CopyDBSnapshotResult copyDBSnapshot(CopyDBSnapshotRequest copyDBSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest <p/>
     * @return copyOptionGroupResult The response from the CopyOptionGroup
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws OptionGroupAlreadyExistsException
     * @throws OptionGroupNotFoundException
     * @throws OptionGroupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CopyOptionGroupResult copyOptionGroup(CopyOptionGroupRequest copyOptionGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a custom Availability Zone (AZ).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
     * cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * 
     * @param createCustomAvailabilityZoneRequest <p/>
     * @return createCustomAvailabilityZoneResult The response from the
     *         CreateCustomAvailabilityZone service method, as returned by
     *         Amazon Relational Database Service.
     * @throws CustomAvailabilityZoneAlreadyExistsException
     * @throws CustomAvailabilityZoneQuotaExceededException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateCustomAvailabilityZoneResult createCustomAvailabilityZone(
            CreateCustomAvailabilityZoneRequest createCustomAvailabilityZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to
     * create the DB cluster as a read replica of another DB cluster or Amazon
     * RDS MySQL DB instance. For cross-region replication where the DB cluster
     * identified by <code>ReplicationSourceIdentifier</code> is encrypted, you
     * must also specify the <code>PreSignedUrl</code> parameter.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterRequest <p/>
     * @return createDBClusterResult The response from the CreateDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterAlreadyExistsException
     * @throws InsufficientStorageClusterCapacityException
     * @throws DBClusterQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws InvalidDBInstanceStateException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws DomainNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBClusterResult createDBCluster(CreateDBClusterRequest createDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new custom endpoint and associates it with an Amazon Aurora DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterEndpointRequest
     * @return createDBClusterEndpointResult The response from the
     *         CreateDBClusterEndpoint service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterEndpointQuotaExceededException
     * @throws DBClusterEndpointAlreadyExistsException
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBClusterEndpointResult createDBClusterEndpoint(
            CreateDBClusterEndpointRequest createDBClusterEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB cluster parameter group.
     * </p>
     * <p>
     * Parameters in a DB cluster parameter group apply to all of the instances
     * in a DB cluster.
     * </p>
     * <p>
     * A DB cluster parameter group is initially created with the default
     * parameters for the database engine used by instances in the DB cluster.
     * To provide custom values for any of the parameters, you must modify the
     * group after creating it using <code>ModifyDBClusterParameterGroup</code>.
     * Once you've created a DB cluster parameter group, you need to associate
     * it with your DB cluster using <code>ModifyDBCluster</code>. When you
     * associate a new DB cluster parameter group with a running DB cluster, you
     * need to reboot the DB instances in the DB cluster without failover for
     * the new DB cluster parameter group and associated settings to take
     * effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5
     * minutes before creating your first DB cluster that uses that DB cluster
     * parameter group as the default parameter group. This allows Amazon RDS to
     * fully complete the create action before the DB cluster parameter group is
     * used as the default for a new DB cluster. This is especially important
     * for parameters that are critical when creating the default database for a
     * DB cluster, such as the character set for the default database defined by
     * the <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <code>DescribeDBClusterParameters</code> action to verify that your DB
     * cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterParameterGroupRequest <p/>
     * @return createDBClusterParameterGroupResult The response from the
     *         CreateDBClusterParameterGroup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBClusterParameterGroupResult createDBClusterParameterGroup(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon
     * Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterSnapshotRequest <p/>
     * @return createDBClusterSnapshotResult The response from the
     *         CreateDBClusterSnapshot service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBClusterSnapshotResult createDBClusterSnapshot(
            CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * 
     * @param createDBInstanceRequest <p/>
     * @return createDBInstanceResult The response from the CreateDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBParameterGroupNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidDBClusterStateException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws DBClusterNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DomainNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBInstanceResult createDBInstance(CreateDBInstanceRequest createDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB instance that acts as a read replica for an existing
     * source DB instance. You can create a read replica for a DB instance
     * running MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html"
     * >Working with Read Replicas</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this action. Call the
     * <code>CreateDBInstance</code> action to create a DB instance for an
     * Aurora DB cluster.
     * </p>
     * <p>
     * All read replica DB instances are created with backups disabled. All
     * other DB instance attributes (including DB security groups and DB
     * parameter groups) are inherited from the source DB instance, except as
     * specified.
     * </p>
     * <important>
     * <p>
     * Your source DB instance must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @return createDBInstanceReadReplicaResult The response from the
     *         CreateDBInstanceReadReplica service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBParameterGroupNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws DBSubnetGroupNotAllowedException
     * @throws InvalidDBSubnetGroupException
     * @throws StorageTypeNotSupportedException
     * @throws KMSKeyNotAccessibleException
     * @throws DomainNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBInstanceReadReplicaResult createDBInstanceReadReplica(
            CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for
     * the database engine used by the DB instance. To provide custom values for
     * any of the parameters, you must modify the group after creating it using
     * <i>ModifyDBParameterGroup</i>. Once you've created a DB parameter group,
     * you need to associate it with your DB instance using
     * <i>ModifyDBInstance</i>. When you associate a new DB parameter group with
     * a running DB instance, you need to reboot the DB instance without
     * failover for the new DB parameter group and associated settings to take
     * effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB parameter group, you should wait at least 5 minutes
     * before creating your first DB instance that uses that DB parameter group
     * as the default parameter group. This allows Amazon RDS to fully complete
     * the create action before the parameter group is used as the default for a
     * new DB instance. This is especially important for parameters that are
     * critical when creating the default database for a DB instance, such as
     * the character set for the default database defined by the
     * <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <i>DescribeDBParameters</i> command to verify that your DB parameter
     * group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBParameterGroupRequest <p/>
     * @return createDBParameterGroupResult The response from the
     *         CreateDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBParameterGroupResult createDBParameterGroup(
            CreateDBParameterGroupRequest createDBParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Creates a new DB proxy.
     * </p>
     * 
     * @param createDBProxyRequest
     * @return createDBProxyResult The response from the CreateDBProxy service
     *         method, as returned by Amazon Relational Database Service.
     * @throws InvalidSubnetException
     * @throws DBProxyAlreadyExistsException
     * @throws DBProxyQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBProxyResult createDBProxy(CreateDBProxyRequest createDBProxyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a
     * DB instance.
     * </p>
     * <note>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are
     * not in a VPC.
     * </p>
     * </note>
     * 
     * @param createDBSecurityGroupRequest <p/>
     * @return createDBSecurityGroupResult The response from the
     *         CreateDBSecurityGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSecurityGroupAlreadyExistsException
     * @throws DBSecurityGroupQuotaExceededException
     * @throws DBSecurityGroupNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBSecurityGroupResult createDBSecurityGroup(
            CreateDBSecurityGroupRequest createDBSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available" state.
     * </p>
     * 
     * @param createDBSnapshotRequest <p/>
     * @return createDBSnapshotResult The response from the CreateDBSnapshot
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBSnapshotAlreadyExistsException
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBSnapshotResult createDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one
     * subnet in at least two AZs in the AWS Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest <p/>
     * @return createDBSubnetGroupResult The response from the
     *         CreateDBSubnetGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSubnetGroupAlreadyExistsException
     * @throws DBSubnetGroupQuotaExceededException
     * @throws DBSubnetQuotaExceededException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateDBSubnetGroupResult createDBSubnetGroup(
            CreateDBSubnetGroupRequest createDBSubnetGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a
     * topic Amazon Resource Name (ARN) created by either the RDS console, the
     * SNS console, or the SNS API. To obtain an ARN with SNS, you must create a
     * topic in Amazon SNS and subscribe to the topic. The ARN is displayed in
     * the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be notified
     * of, provide a list of RDS sources (SourceIds) that triggers the events,
     * and provide a list of event categories (EventCategories) for events you
     * want to be notified of. For example, you can specify SourceType =
     * db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories
     * = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType =
     * db-instance and SourceIdentifier = myDBInstance1, you are notified of all
     * the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you receive notice of
     * the events for that source type for all your RDS sources. If you don't
     * specify either the SourceType or the SourceIdentifier, you are notified
     * of events generated from all RDS sources belonging to your customer
     * account.
     * </p>
     * <note>
     * <p>
     * RDS event notification is only available for unencrypted SNS topics. If
     * you specify an encrypted SNS topic, event notifications aren't sent for
     * the topic.
     * </p>
     * </note>
     * 
     * @param createEventSubscriptionRequest <p/>
     * @return createEventSubscriptionResult The response from the
     *         CreateEventSubscription service method, as returned by Amazon
     *         Relational Database Service.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionAlreadyExistException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateEventSubscriptionResult createEventSubscription(
            CreateEventSubscriptionRequest createEventSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Aurora global database spread across multiple regions. The
     * global database contains a single primary cluster with read-write
     * capability, and a read-only secondary cluster that receives data from the
     * primary cluster through high-speed replication performed by the Aurora
     * storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then add a
     * primary cluster and a secondary cluster to it. Or you can specify an
     * existing Aurora cluster during the create operation, and this cluster
     * becomes the primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     * @return createGlobalClusterResult The response from the
     *         CreateGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterAlreadyExistsException
     * @throws GlobalClusterQuotaExceededException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateGlobalClusterResult createGlobalCluster(
            CreateGlobalClusterRequest createGlobalClusterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * 
     * @param createOptionGroupRequest <p/>
     * @return createOptionGroupResult The response from the CreateOptionGroup
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws OptionGroupAlreadyExistsException
     * @throws OptionGroupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateOptionGroupResult createOptionGroup(CreateOptionGroupRequest createOptionGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom Availability Zone (AZ).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
     * cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * 
     * @param deleteCustomAvailabilityZoneRequest
     * @return deleteCustomAvailabilityZoneResult The response from the
     *         DeleteCustomAvailabilityZone service method, as returned by
     *         Amazon Relational Database Service.
     * @throws CustomAvailabilityZoneNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteCustomAvailabilityZoneResult deleteCustomAvailabilityZone(
            DeleteCustomAvailabilityZoneRequest deleteCustomAvailabilityZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster.
     * When you delete a DB cluster, all automated backups for that DB cluster
     * are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterRequest <p/>
     * @return deleteDBClusterResult The response from the DeleteDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBClusterResult deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom endpoint and removes it from an Amazon Aurora DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterEndpointRequest
     * @return deleteDBClusterEndpointResult The response from the
     *         DeleteDBClusterEndpoint service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBClusterEndpointStateException
     * @throws DBClusterEndpointNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBClusterEndpointResult deleteDBClusterEndpoint(
            DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter
     * group to be deleted can't be associated with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterParameterGroupRequest <p/>
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteDBClusterParameterGroup(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB cluster snapshot must be in the <code>available</code> state to be
     * deleted.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest <p/>
     * @return deleteDBClusterSnapshotResult The response from the
     *         DeleteDBClusterSnapshot service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBClusterSnapshotStateException
     * @throws DBClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBClusterSnapshotResult deleteDBClusterSnapshot(
            DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance.
     * When you delete a DB instance, all automated backups for that instance
     * are deleted and can't be recovered. Manual DB snapshots of the DB
     * instance to be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB
     * instance is <code>deleting</code> until the DB snapshot is created. The
     * API action <code>DescribeDBInstance</code> is used to monitor the status
     * of this operation. The action can't be canceled or reverted once
     * submitted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of
     * <code>failed</code>, <code>incompatible-restore</code>, or
     * <code>incompatible-network</code>, you can only delete it when you skip
     * creation of the final snapshot with the <code>SkipFinalSnapshot</code>
     * parameter.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you
     * can't delete the DB instance if both of the following conditions are
     * true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a read replica of another Amazon Aurora DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first call the
     * <code>PromoteReadReplicaDBCluster</code> API action to promote the DB
     * cluster so it's no longer a read replica. After the promotion completes,
     * then call the <code>DeleteDBInstance</code> API action to delete the
     * final instance in the DB cluster.
     * </p>
     * 
     * @param deleteDBInstanceRequest <p/>
     * @return deleteDBInstanceResult The response from the DeleteDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterStateException
     * @throws DBInstanceAutomatedBackupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBInstanceResult deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes automated backups based on the source instance's
     * <code>DbiResourceId</code> value or the restorable instance's resource
     * ID.
     * </p>
     * 
     * @param deleteDBInstanceAutomatedBackupRequest <p>
     *            Parameter input for the
     *            <code>DeleteDBInstanceAutomatedBackup</code> operation.
     *            </p>
     * @return deleteDBInstanceAutomatedBackupResult The response from the
     *         DeleteDBInstanceAutomatedBackup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws InvalidDBInstanceAutomatedBackupStateException
     * @throws DBInstanceAutomatedBackupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBInstanceAutomatedBackupResult deleteDBInstanceAutomatedBackup(
            DeleteDBInstanceAutomatedBackupRequest deleteDBInstanceAutomatedBackupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified DB parameter group. The DB parameter group to be
     * deleted can't be associated with any DB instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest <p/>
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Deletes an existing proxy.
     * </p>
     * 
     * @param deleteDBProxyRequest
     * @return deleteDBProxyResult The response from the DeleteDBProxy service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBProxyResult deleteDBProxy(DeleteDBProxyRequest deleteDBProxyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB
     * instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest <p/>
     * @throws InvalidDBSecurityGroupStateException
     * @throws DBSecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a DB snapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB snapshot must be in the <code>available</code> state to be
     * deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest <p/>
     * @return deleteDBSnapshotResult The response from the DeleteDBSnapshot
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBSnapshotStateException
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteDBSnapshotResult deleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB
     * instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest <p/>
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidDBSubnetStateException
     * @throws DBSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest <p/>
     * @return deleteEventSubscriptionResult The response from the
     *         DeleteEventSubscription service method, as returned by Amazon
     *         Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws InvalidEventSubscriptionStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteEventSubscriptionResult deleteEventSubscription(
            DeleteEventSubscriptionRequest deleteEventSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a global database cluster. The primary and secondary clusters
     * must already be detached or destroyed first.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     * @return deleteGlobalClusterResult The response from the
     *         DeleteGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteGlobalClusterResult deleteGlobalCluster(
            DeleteGlobalClusterRequest deleteGlobalClusterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the installation medium for a DB engine that requires an
     * on-premises customer provided license, such as Microsoft SQL Server.
     * </p>
     * 
     * @param deleteInstallationMediaRequest
     * @return deleteInstallationMediaResult The response from the
     *         DeleteInstallationMedia service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InstallationMediaNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteInstallationMediaResult deleteInstallationMedia(
            DeleteInstallationMediaRequest deleteInstallationMediaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest <p/>
     * @throws OptionGroupNotFoundException
     * @throws InvalidOptionGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteOptionGroup(DeleteOptionGroupRequest deleteOptionGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Remove the association between one or more <code>DBProxyTarget</code>
     * data structures and a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param deregisterDBProxyTargetsRequest
     * @return deregisterDBProxyTargetsResult The response from the
     *         DeregisterDBProxyTargets service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyTargetNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws DBProxyNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeregisterDBProxyTargetsResult deregisterDBProxyTargets(
            DeregisterDBProxyTargetsRequest deregisterDBProxyTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes
     * include Amazon RDS quotas for the account, such as the number of DB
     * instances allowed. The description for a quota includes the quota name,
     * current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command doesn't take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest <p/>
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS
     * account.
     * </p>
     * 
     * @param describeCertificatesRequest <p/>
     * @return describeCertificatesResult The response from the
     *         DescribeCertificates service method, as returned by Amazon
     *         Relational Database Service.
     * @throws CertificateNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeCertificatesResult describeCertificates(
            DescribeCertificatesRequest describeCertificatesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about custom Availability Zones (AZs).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
     * cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * 
     * @param describeCustomAvailabilityZonesRequest
     * @return describeCustomAvailabilityZonesResult The response from the
     *         DescribeCustomAvailabilityZones service method, as returned by
     *         Amazon Relational Database Service.
     * @throws CustomAvailabilityZoneNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeCustomAvailabilityZonesResult describeCustomAvailabilityZones(
            DescribeCustomAvailabilityZonesRequest describeCustomAvailabilityZonesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterBacktracksRequest <p/>
     * @return describeDBClusterBacktracksResult The response from the
     *         DescribeDBClusterBacktracks service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws DBClusterBacktrackNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClusterBacktracksResult describeDBClusterBacktracks(
            DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about endpoints for an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterEndpointsRequest
     * @return describeDBClusterEndpointsResult The response from the
     *         DescribeDBClusterEndpoints service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClusterEndpointsResult describeDBClusterEndpoints(
            DescribeDBClusterEndpointsRequest describeDBClusterEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list
     * will contain only the description of the specified DB cluster parameter
     * group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParameterGroupsRequest <p/>
     * @return describeDBClusterParameterGroupsResult The response from the
     *         DescribeDBClusterParameterGroups service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter
     * group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParametersRequest <p/>
     * @return describeDBClusterParametersResult The response from the
     *         DescribeDBClusterParameters service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClusterParametersResult describeDBClusterParameters(
            DescribeDBClusterParametersRequest describeDBClusterParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a
     * manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts,
     * <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts
     * that are authorized to copy or restore the manual DB cluster snapshot. If
     * <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB cluster snapshot is
     * public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB
     * cluster snapshot, or to make the manual DB cluster snapshot public or
     * private, use the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotAttributesRequest <p/>
     * @return describeDBClusterSnapshotAttributesResult The response from the
     *         DescribeDBClusterSnapshotAttributes service method, as returned
     *         by Amazon Relational Database Service.
     * @throws DBClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports
     * pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotsRequest <p/>
     * @return describeDBClusterSnapshotsResult The response from the
     *         DescribeDBClusterSnapshots service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API
     * supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB
     * instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBClustersRequest <p/>
     * @return describeDBClustersResult The response from the DescribeDBClusters
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest describeDBClustersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return describeDBEngineVersionsResult The response from the
     *         DescribeDBEngineVersions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions(
            DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Displays backups for both current and deleted instances. For example, use
     * this operation to find details about automated backups for previously
     * deleted instances. Current instances with retention periods greater than
     * zero (0) are returned for both the
     * <code>DescribeDBInstanceAutomatedBackups</code> and
     * <code>DescribeDBInstances</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBInstanceAutomatedBackupsRequest <p>
     *            Parameter input for DescribeDBInstanceAutomatedBackups.
     *            </p>
     * @return describeDBInstanceAutomatedBackupsResult The response from the
     *         DescribeDBInstanceAutomatedBackups service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBInstanceAutomatedBackupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBInstanceAutomatedBackupsResult describeDBInstanceAutomatedBackups(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about provisioned RDS instances. This API supports
     * pagination.
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB
     * instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBInstancesRequest <p/>
     * @return describeDBInstancesResult The response from the
     *         DescribeDBInstances service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBInstancesResult describeDBInstances(
            DescribeDBInstancesRequest describeDBInstancesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * 
     * @param describeDBLogFilesRequest <p/>
     * @return describeDBLogFilesResult The response from the DescribeDBLogFiles
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBLogFilesResult describeDBLogFiles(DescribeDBLogFilesRequest describeDBLogFilesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a
     * <code>DBParameterGroupName</code> is specified, the list will contain
     * only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest <p/>
     * @return describeDBParameterGroupsResult The response from the
     *         DescribeDBParameterGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBParameterGroupsResult describeDBParameterGroups(
            DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return describeDBParametersResult The response from the
     *         DescribeDBParameters service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBParametersResult describeDBParameters(
            DescribeDBParametersRequest describeDBParametersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Returns information about DB proxies.
     * </p>
     * 
     * @param describeDBProxiesRequest
     * @return describeDBProxiesResult The response from the DescribeDBProxies
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBProxyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest describeDBProxiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Returns information about DB proxy target groups, represented by
     * <code>DBProxyTargetGroup</code> data structures.
     * </p>
     * 
     * @param describeDBProxyTargetGroupsRequest
     * @return describeDBProxyTargetGroupsResult The response from the
     *         DescribeDBProxyTargetGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBProxyTargetGroupsResult describeDBProxyTargetGroups(
            DescribeDBProxyTargetGroupsRequest describeDBProxyTargetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Returns information about <code>DBProxyTarget</code> objects. This API
     * supports pagination.
     * </p>
     * 
     * @param describeDBProxyTargetsRequest
     * @return describeDBProxyTargetsResult The response from the
     *         DescribeDBProxyTargets service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBProxyTargetsResult describeDBProxyTargets(
            DescribeDBProxyTargetsRequest describeDBProxyTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a
     * <code>DBSecurityGroupName</code> is specified, the list will contain only
     * the descriptions of the specified DB security group.
     * </p>
     * 
     * @param describeDBSecurityGroupsRequest <p/>
     * @return describeDBSecurityGroupsResult The response from the
     *         DescribeDBSecurityGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBSecurityGroupsResult describeDBSecurityGroups(
            DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB
     * snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts,
     * <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts
     * that are authorized to copy or restore the manual DB snapshot. If
     * <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB snapshot is public and
     * can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB
     * snapshot, or to make the manual DB snapshot public or private, use the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest <p/>
     * @return describeDBSnapshotAttributesResult The response from the
     *         DescribeDBSnapshotAttributes service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBSnapshotAttributesResult describeDBSnapshotAttributes(
            DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports
     * pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest <p/>
     * @return describeDBSnapshotsResult The response from the
     *         DescribeDBSnapshots service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBSnapshotsResult describeDBSnapshots(
            DescribeDBSnapshotsRequest describeDBSnapshotsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is
     * specified, the list will contain only the descriptions of the specified
     * DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     * >Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest <p/>
     * @return describeDBSubnetGroupsResult The response from the
     *         DescribeDBSubnetGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups(
            DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest <p/>
     * @return describeEngineDefaultClusterParametersResult The response from
     *         the DescribeEngineDefaultClusterParameters service method, as
     *         returned by Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEngineDefaultClusterParametersResult describeEngineDefaultClusterParameters(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest <p/>
     * @return describeEngineDefaultParametersResult The response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEngineDefaultParametersResult describeEngineDefaultParameters(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if
     * specified, for a specified source type. You can see a list of the event
     * categories and source types in the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * > Events</a> topic in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest <p/>
     * @return describeEventCategoriesResult The response from the
     *         DescribeEventCategories service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEventCategoriesResult describeEventCategories(
            DescribeEventCategoriesRequest describeEventCategoriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The
     * description for a subscription includes SubscriptionName, SNSTopicARN,
     * CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that
     * subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest <p/>
     * @return describeEventSubscriptionsResult The response from the
     *         DescribeEventSubscriptions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB snapshots,
     * and DB parameter groups for the past 14 days. Events specific to a
     * particular DB instance, DB security group, database snapshot, or DB
     * parameter group can be obtained by providing the name as a parameter. By
     * default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest <p/>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a snapshot export to Amazon S3. This API
     * operation supports pagination.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return describeExportTasksResult The response from the
     *         DescribeExportTasks service method, as returned by Amazon
     *         Relational Database Service.
     * @throws ExportTaskNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeExportTasksResult describeExportTasks(
            DescribeExportTasksRequest describeExportTasksRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about Aurora global database clusters. This API
     * supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @return describeGlobalClustersResult The response from the
     *         DescribeGlobalClusters service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeGlobalClustersResult describeGlobalClusters(
            DescribeGlobalClustersRequest describeGlobalClustersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the available installation media for a DB engine that requires
     * an on-premises customer provided license, such as Microsoft SQL Server.
     * </p>
     * 
     * @param describeInstallationMediaRequest
     * @return describeInstallationMediaResult The response from the
     *         DescribeInstallationMedia service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InstallationMediaNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeInstallationMediaResult describeInstallationMedia(
            DescribeInstallationMediaRequest describeInstallationMediaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes all available options.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest <p/>
     * @return describeOptionGroupOptionsResult The response from the
     *         DescribeOptionGroupOptions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeOptionGroupOptionsResult describeOptionGroupOptions(
            DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest <p/>
     * @return describeOptionGroupsResult The response from the
     *         DescribeOptionGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws OptionGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeOptionGroupsResult describeOptionGroups(
            DescribeOptionGroupsRequest describeOptionGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest <p/>
     * @return describeOrderableDBInstanceOptionsResult The response from the
     *         DescribeOrderableDBInstanceOptions service method, as returned by
     *         Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at
     * least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest <p/>
     * @return describePendingMaintenanceActionsResult The response from the
     *         DescribePendingMaintenanceActions service method, as returned by
     *         Amazon Relational Database Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or
     * about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest <p/>
     * @return describeReservedDBInstancesResult The response from the
     *         DescribeReservedDBInstances service method, as returned by Amazon
     *         Relational Database Service.
     * @throws ReservedDBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReservedDBInstancesResult describeReservedDBInstances(
            DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest <p/>
     * @return describeReservedDBInstancesOfferingsResult The response from the
     *         DescribeReservedDBInstancesOfferings service method, as returned
     *         by Amazon Relational Database Service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the source AWS Regions where the current AWS Region can
     * create a read replica or copy a DB snapshot from. This API action
     * supports pagination.
     * </p>
     * 
     * @param describeSourceRegionsRequest <p/>
     * @return describeSourceRegionsResult The response from the
     *         DescribeSourceRegions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeSourceRegionsResult describeSourceRegions(
            DescribeSourceRegionsRequest describeSourceRegionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * You can call <code>DescribeValidDBInstanceModifications</code> to learn
     * what modifications you can make to your DB instance. You can use this
     * information when you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest <p/>
     * @return describeValidDBInstanceModificationsResult The response from the
     *         DescribeValidDBInstanceModifications service method, as returned
     *         by Amazon Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeValidDBInstanceModificationsResult describeValidDBInstanceModifications(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest <p/>
     * @return downloadDBLogFilePortionResult The response from the
     *         DownloadDBLogFilePortion service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws DBLogFileNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DownloadDBLogFilePortionResult downloadDBLogFilePortion(
            DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the Aurora Replicas
     * (read-only instances) in the DB cluster to be the primary instance (the
     * cluster writer).
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to an Aurora Replica, if one
     * exists, when the primary instance fails. You can force a failover when
     * you want to simulate a failure of a primary instance for testing. Because
     * each instance in a DB cluster has its own endpoint address, you will need
     * to clean up and re-establish any existing connections that use those
     * endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param failoverDBClusterRequest <p/>
     * @return failoverDBClusterResult The response from the FailoverDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    FailoverDBClusterResult failoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports the installation media for a DB engine that requires an
     * on-premises customer provided license, such as SQL Server.
     * </p>
     * 
     * @param importInstallationMediaRequest
     * @return importInstallationMediaResult The response from the
     *         ImportInstallationMedia service method, as returned by Amazon
     *         Relational Database Service.
     * @throws CustomAvailabilityZoneNotFoundException
     * @throws InstallationMediaAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ImportInstallationMediaResult importInstallationMedia(
            ImportInstallationMediaRequest importInstallationMediaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest <p/>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Override the system-default Secure Sockets Layer/Transport Layer Security
     * (SSL/TLS) certificate for Amazon RDS for new DB instances temporarily, or
     * remove the override.
     * </p>
     * <p>
     * By using this operation, you can specify an RDS-approved SSL/TLS
     * certificate for new DB instances that is different from the default
     * certificate provided by RDS. You can also use this operation to remove
     * the override, so that new DB instances use the default certificate
     * provided by RDS.
     * </p>
     * <p>
     * You might need to override the default certificate in the following
     * situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You already migrated your applications to support the latest certificate
     * authority (CA) certificate, but the new CA certificate is not yet the RDS
     * default CA certificate for the specified AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has already moved to a new default CA certificate for the specified
     * AWS Region, but you are still in the process of supporting the new CA
     * certificate. In this case, you temporarily need additional time to finish
     * your application changes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB
     * engines, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     * > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora
     * DB engines, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     * > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * 
     * @param modifyCertificatesRequest
     * @return modifyCertificatesResult The response from the ModifyCertificates
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws CertificateNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyCertificatesResult modifyCertificates(ModifyCertificatesRequest modifyCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Set the capacity of an Aurora Serverless DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless scales seamlessly based on the workload on the DB
     * cluster. In some cases, the capacity might not scale fast enough to meet
     * a sudden change in workload, such as a large number of new transactions.
     * Call <code>ModifyCurrentDBClusterCapacity</code> to set the capacity
     * explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless can
     * automatically scale the DB cluster based on the cooldown period for
     * scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default
     * <code>TimeoutAction</code>, connections that prevent Aurora Serverless
     * from finding a scaling point might be dropped. For more information about
     * scaling points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyCurrentDBClusterCapacityRequest
     * @return modifyCurrentDBClusterCapacityResult The response from the
     *         ModifyCurrentDBClusterCapacity service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBClusterCapacityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyCurrentDBClusterCapacityResult modifyCurrentDBClusterCapacity(
            ModifyCurrentDBClusterCapacityRequest modifyCurrentDBClusterCapacityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or
     * more database configuration parameters by specifying these parameters and
     * the new values in the request. For more information on Amazon Aurora, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterRequest <p/>
     * @return modifyDBClusterResult The response from the ModifyDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws InvalidDBInstanceStateException
     * @throws DBClusterAlreadyExistsException
     * @throws DomainNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBClusterResult modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterEndpointRequest
     * @return modifyDBClusterEndpointResult The response from the
     *         ModifyDBClusterEndpoint service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBClusterEndpointStateException
     * @throws DBClusterEndpointNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBClusterEndpointResult modifyDBClusterEndpoint(
            ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more
     * than one parameter, submit a list of the following:
     * <code>ParameterName</code>, <code>ParameterValue</code>, and
     * <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a
     * single request.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static
     * parameters require a reboot without failover to the DB cluster associated
     * with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5
     * minutes before creating your first DB cluster that uses that DB cluster
     * parameter group as the default parameter group. This allows Amazon RDS to
     * fully complete the create action before the parameter group is used as
     * the default for a new DB cluster. This is especially important for
     * parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by
     * the <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <code>DescribeDBClusterParameters</code> action to verify that your DB
     * cluster parameter group has been created or modified.
     * </p>
     * <p>
     * If the modified DB cluster parameter group is used by an Aurora
     * Serverless cluster, Aurora applies the update immediately. The cluster
     * restart might interrupt your workload. In that case, your application
     * must reopen any connections and retry any transactions that were active
     * when the parameter changes took effect.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterParameterGroupRequest <p/>
     * @return modifyDBClusterParameterGroupResult The response from the
     *         ModifyDBClusterParameterGroup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from,
     * a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other AWS accounts, specify
     * <code>restore</code> as the <code>AttributeName</code> and use the
     * <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB cluster snapshot.
     * Use the value <code>all</code> to make the manual DB cluster snapshot
     * public, which means that it can be copied or restored by all AWS
     * accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB cluster snapshots
     * that contain private information that you don't want available to all AWS
     * accounts.
     * </p>
     * </note>
     * <p>
     * If a manual DB cluster snapshot is encrypted, it can be shared, but only
     * by specifying a list of authorized AWS account IDs for the
     * <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB
     * cluster snapshot, or whether a manual DB cluster snapshot is public or
     * private, use the <a>DescribeDBClusterSnapshotAttributes</a> API action.
     * The accounts are returned as values for the <code>restore</code>
     * attribute.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest <p/>
     * @return modifyDBClusterSnapshotAttributeResult The response from the
     *         ModifyDBClusterSnapshotAttribute service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterSnapshotNotFoundException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws SharedSnapshotQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBClusterSnapshotAttributeResult modifyDBClusterSnapshotAttribute(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database
     * configuration parameters by specifying these parameters and the new
     * values in the request. To learn what modifications you can make to your
     * DB instance, call <code>DescribeValidDBInstanceModifications</code>
     * before you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param modifyDBInstanceRequest <p/>
     * @return modifyDBInstanceResult The response from the ModifyDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBSecurityGroupStateException
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws DBParameterGroupNotFoundException
     * @throws InsufficientDBInstanceCapacityException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws DBUpgradeDependencyFailureException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws CertificateNotFoundException
     * @throws DomainNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBInstanceResult modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one
     * parameter, submit a list of the following: <code>ParameterName</code>,
     * <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of
     * 20 parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static
     * parameters require a reboot without failover to the DB instance
     * associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes
     * before creating your first DB instance that uses that DB parameter group
     * as the default parameter group. This allows Amazon RDS to fully complete
     * the modify action before the parameter group is used as the default for a
     * new DB instance. This is especially important for parameters that are
     * critical when creating the default database for a DB instance, such as
     * the character set for the default database defined by the
     * <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <i>DescribeDBParameters</i> command to verify that your DB parameter
     * group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest <p/>
     * @return modifyDBParameterGroupResult The response from the
     *         ModifyDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBParameterGroupResult modifyDBParameterGroup(
            ModifyDBParameterGroupRequest modifyDBParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Changes the settings for an existing DB proxy.
     * </p>
     * 
     * @param modifyDBProxyRequest
     * @return modifyDBProxyResult The response from the ModifyDBProxy service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyAlreadyExistsException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest modifyDBProxyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Modifies the properties of a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param modifyDBProxyTargetGroupRequest
     * @return modifyDBProxyTargetGroupResult The response from the
     *         ModifyDBProxyTargetGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBProxyTargetGroupResult modifyDBProxyTargetGroup(
            ModifyDBProxyTargetGroupRequest modifyDBProxyTargetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a manual DB snapshot with a new engine version. The snapshot can
     * be encrypted or unencrypted, but not shared or public.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL, Oracle, and
     * PostgreSQL.
     * </p>
     * 
     * @param modifyDBSnapshotRequest
     * @return modifyDBSnapshotResult The response from the ModifyDBSnapshot
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBSnapshotResult modifyDBSnapshot(ModifyDBSnapshotRequest modifyDBSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from,
     * a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other AWS accounts, specify
     * <code>restore</code> as the <code>AttributeName</code> and use the
     * <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the
     * value <code>all</code> to make the manual DB snapshot public, which means
     * it can be copied or restored by all AWS accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB snapshots that
     * contain private information that you don't want available to all AWS
     * accounts.
     * </p>
     * </note>
     * <p>
     * If the manual DB snapshot is encrypted, it can be shared, but only by
     * specifying a list of authorized AWS account IDs for the
     * <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB
     * snapshot, or whether a manual DB snapshot public or private, use the
     * <a>DescribeDBSnapshotAttributes</a> API action. The accounts are returned
     * as values for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest <p/>
     * @return modifyDBSnapshotAttributeResult The response from the
     *         ModifyDBSnapshotAttribute service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSnapshotNotFoundException
     * @throws InvalidDBSnapshotStateException
     * @throws SharedSnapshotQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBSnapshotAttributeResult modifyDBSnapshotAttribute(
            ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at
     * least one subnet in at least two AZs in the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest <p/>
     * @return modifyDBSubnetGroupResult The response from the
     *         ModifyDBSubnetGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetQuotaExceededException
     * @throws SubnetAlreadyInUseException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyDBSubnetGroupResult modifyDBSubnetGroup(
            ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. You can't
     * modify the source identifiers using this call. To change source
     * identifiers for a subscription, use the
     * <code>AddSourceIdentifierToSubscription</code> and
     * <code>RemoveSourceIdentifierFromSubscription</code> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest <p/>
     * @return modifyEventSubscriptionResult The response from the
     *         ModifyEventSubscription service method, as returned by Amazon
     *         Relational Database Service.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyEventSubscriptionResult modifyEventSubscription(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modify a setting for an Amazon Aurora global cluster. You can change one
     * or more database configuration parameters by specifying these parameters
     * and the new values in the request. For more information on Amazon Aurora,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     * @return modifyGlobalClusterResult The response from the
     *         ModifyGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyGlobalClusterResult modifyGlobalCluster(
            ModifyGlobalClusterRequest modifyGlobalClusterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest <p/>
     * @return modifyOptionGroupResult The response from the ModifyOptionGroup
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidOptionGroupStateException
     * @throws OptionGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyOptionGroupResult modifyOptionGroup(ModifyOptionGroupRequest modifyOptionGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database
     * since the previous backup. If you plan to promote a read replica to a
     * standalone instance, we recommend that you enable backups and complete at
     * least one backup prior to promotion. In addition, a read replica cannot
     * be promoted to a standalone instance when it is in the
     * <code>backing-up</code> status. If you have enabled backups on your read
     * replica, configure the automated backup window so that daily backups do
     * not interfere with read replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promoteReadReplicaRequest <p/>
     * @return promoteReadReplicaResult The response from the PromoteReadReplica
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PromoteReadReplicaResult promoteReadReplica(PromoteReadReplicaRequest promoteReadReplicaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Promotes a read replica DB cluster to a standalone DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param promoteReadReplicaDBClusterRequest <p/>
     * @return promoteReadReplicaDBClusterResult The response from the
     *         PromoteReadReplicaDBCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PromoteReadReplicaDBClusterResult promoteReadReplicaDBCluster(
            PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest <p/>
     * @return purchaseReservedDBInstancesOfferingResult The response from the
     *         PurchaseReservedDBInstancesOffering service method, as returned
     *         by Amazon Relational Database Service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     * @throws ReservedDBInstanceAlreadyExistsException
     * @throws ReservedDBInstanceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PurchaseReservedDBInstancesOfferingResult purchaseReservedDBInstancesOffering(
            PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * You might need to reboot your DB instance, usually for maintenance
     * reasons. For example, if you make certain modifications, or if you change
     * the DB parameter group associated with the DB instance, you must reboot
     * the instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB instance restarts the database engine service. Rebooting a
     * DB instance results in a momentary outage, during which the DB instance
     * status is set to rebooting.
     * </p>
     * <p>
     * For more information about rebooting, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html"
     * >Rebooting a DB Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param rebootDBInstanceRequest <p/>
     * @return rebootDBInstanceResult The response from the RebootDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RebootDBInstanceResult rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Associate one or more <code>DBProxyTarget</code> data structures with a
     * <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param registerDBProxyTargetsRequest
     * @return registerDBProxyTargetsResult The response from the
     *         RegisterDBProxyTargets service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws DBProxyTargetAlreadyRegisteredException
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RegisterDBProxyTargetsResult registerDBProxyTargets(
            RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches an Aurora secondary cluster from an Aurora global database
     * cluster. The cluster becomes a standalone cluster with read-write
     * capability instead of being read-only and receiving data from a primary
     * cluster in a different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     * @return removeFromGlobalClusterResult The response from the
     *         RemoveFromGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RemoveFromGlobalClusterResult removeFromGlobalCluster(
            RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from an
     * Amazon Aurora DB cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your
     * Behalf </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeRoleFromDBClusterRequest
     * @throws DBClusterNotFoundException
     * @throws DBClusterRoleNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void removeRoleFromDBCluster(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from a DB
     * instance.
     * </p>
     * 
     * @param removeRoleFromDBInstanceRequest
     * @throws DBInstanceNotFoundException
     * @throws DBInstanceRoleNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void removeRoleFromDBInstance(RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification
     * subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest <p/>
     * @return removeSourceIdentifierFromSubscriptionResult The response from
     *         the RemoveSourceIdentifierFromSubscription service method, as
     *         returned by Amazon Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws SourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p/>
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default
     * value. To reset specific parameters submit a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the
     * entire DB cluster parameter group, specify the
     * <code>DBClusterParameterGroupName</code> and
     * <code>ResetAllParameters</code> parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated
     * immediately and static parameters are set to <code>pending-reboot</code>
     * to take effect on the next DB instance restart or
     * <code>RebootDBInstance</code> request. You must call
     * <code>RebootDBInstance</code> for every DB instance in your DB cluster
     * that you want the updated static parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param resetDBClusterParameterGroupRequest <p/>
     * @return resetDBClusterParameterGroupResult The response from the
     *         ResetDBClusterParameterGroup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(
            ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system
     * default value. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. To
     * reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. When resetting the entire group, dynamic parameters are
     * updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance
     * restart or <code>RebootDBInstance</code> request.
     * </p>
     * 
     * @param resetDBParameterGroupRequest <p/>
     * @return resetDBParameterGroupResult The response from the
     *         ResetDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ResetDBParameterGroupResult resetDBParameterGroup(
            ResetDBParameterGroupRequest resetDBParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3
     * bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and
     * the data must be created using the Percona XtraBackup utility as
     * described in <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.html"
     * > Migrating Data to an Amazon Aurora MySQL DB Cluster</a> in the
     * <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that
     * DB cluster. You must invoke the <code>CreateDBInstance</code> action to
     * create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>
     * . You can create DB instances only after the
     * <code>RestoreDBClusterFromS3</code> action has completed and the DB
     * cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromS3Request
     * @return restoreDBClusterFromS3Result The response from the
     *         RestoreDBClusterFromS3 service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterAlreadyExistsException
     * @throws DBClusterQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws InvalidS3BucketException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBClusterNotFoundException
     * @throws DomainNotFoundException
     * @throws InsufficientStorageClusterCapacityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RestoreDBClusterFromS3Result restoreDBClusterFromS3(
            RestoreDBClusterFromS3Request restoreDBClusterFromS3Request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. This
     * action only applies to Aurora DB clusters.
     * </p>
     * <p>
     * The target DB cluster is created from the source snapshot with a default
     * configuration. If you don't specify a security group, the new DB cluster
     * is associated with the default security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that
     * DB cluster. You must invoke the <code>CreateDBInstance</code> action to
     * create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>
     * . You can create DB instances only after the
     * <code>RestoreDBClusterFromSnapshot</code> action has completed and the DB
     * cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromSnapshotRequest <p/>
     * @return restoreDBClusterFromSnapshotResult The response from the
     *         RestoreDBClusterFromSnapshot service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterAlreadyExistsException
     * @throws DBClusterQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterSnapshotNotFoundException
     * @throws InsufficientDBClusterCapacityException
     * @throws InsufficientStorageClusterCapacityException
     * @throws InvalidDBSnapshotStateException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidRestoreException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidSubnetException
     * @throws OptionGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DomainNotFoundException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RestoreDBClusterFromSnapshotResult restoreDBClusterFromSnapshot(
            RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to
     * any point in time before <code>LatestRestorableTime</code> for up to
     * <code>BackupRetentionPeriod</code> days. The target DB cluster is created
     * from the source DB cluster with the same configuration as the original DB
     * cluster, except that the new DB cluster is created with the default DB
     * security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that
     * DB cluster. You must invoke the <code>CreateDBInstance</code> action to
     * create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>
     * . You can create DB instances only after the
     * <code>RestoreDBClusterToPointInTime</code> action has completed and the
     * DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterToPointInTimeRequest <p/>
     * @return restoreDBClusterToPointInTimeResult The response from the
     *         RestoreDBClusterToPointInTime service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterAlreadyExistsException
     * @throws DBClusterNotFoundException
     * @throws DBClusterQuotaExceededException
     * @throws DBClusterSnapshotNotFoundException
     * @throws DBSubnetGroupNotFoundException
     * @throws InsufficientDBClusterCapacityException
     * @throws InsufficientStorageClusterCapacityException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSnapshotStateException
     * @throws InvalidRestoreException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws KMSKeyNotAccessibleException
     * @throws OptionGroupNotFoundException
     * @throws StorageQuotaExceededException
     * @throws DomainNotFoundException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RestoreDBClusterToPointInTimeResult restoreDBClusterToPointInTime(
            RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is
     * created from the source database restore point with the most of original
     * configuration with the default security group and the default DB
     * parameter group. By default, the new DB instance is created as a
     * single-AZ deployment except when the instance is a SQL Server instance
     * that has an option group that is associated with mirroring; in this case,
     * the instance becomes a mirrored AZ deployment and not a single-AZ
     * deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new,
     * restored DB instance, then rename your original DB instance before you
     * call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB
     * instances with the same name. Once you have renamed your original DB
     * instance with a different identifier, then you can pass the original name
     * of the DB instance as the DBInstanceIdentifier in the call to the
     * RestoreDBInstanceFromDBSnapshot action. The result is that you will
     * replace the original DB instance with the DB instance created from the
     * snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora, use <code>RestoreDBClusterFromSnapshot</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest <p/>
     * @return restoreDBInstanceFromDBSnapshotResult The response from the
     *         RestoreDBInstanceFromDBSnapshot service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws DBSnapshotNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws InsufficientDBInstanceCapacityException
     * @throws InvalidDBSnapshotStateException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidRestoreException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws DBParameterGroupNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RestoreDBInstanceFromDBSnapshotResult restoreDBInstanceFromDBSnapshot(
            RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Amazon Relational Database Service (Amazon RDS) supports importing MySQL
     * databases by using backup files. You can create a backup of your
     * on-premises database, store it on Amazon Simple Storage Service (Amazon
     * S3), and then restore the backup file onto a new Amazon RDS DB instance
     * running MySQL. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html"
     * >Importing Data into an Amazon RDS MySQL DB Instance</a> in the <i>Amazon
     * RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBInstanceFromS3Request
     * @return restoreDBInstanceFromS3Result The response from the
     *         RestoreDBInstanceFromS3 service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBParameterGroupNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidS3BucketException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RestoreDBInstanceFromS3Result restoreDBInstanceFromS3(
            RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to
     * any point in time before the time identified by the LatestRestorableTime
     * property. You can restore to a point up to the number of days specified
     * by the BackupRetentionPeriod property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration,
     * but in a system-selected Availability Zone, with the default security
     * group, the default subnet group, and the default DB parameter group. By
     * default, the new DB instance is created as a single-AZ deployment except
     * when the instance is a SQL Server instance that has an option group that
     * is associated with mirroring; in this case, the instance becomes a
     * mirrored deployment and not a single-AZ deployment.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora, use <code>RestoreDBClusterToPointInTime</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceToPointInTimeRequest <p/>
     * @return restoreDBInstanceToPointInTimeResult The response from the
     *         RestoreDBInstanceToPointInTime service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws InsufficientDBInstanceCapacityException
     * @throws InvalidDBInstanceStateException
     * @throws PointInTimeRestoreNotEnabledException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidRestoreException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws DBParameterGroupNotFoundException
     * @throws DBInstanceAutomatedBackupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RestoreDBInstanceToPointInTimeResult restoreDBInstanceToPointInTime(
            RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP
     * ranges or EC2 or VPC Security Groups. Required parameters for this API
     * are one of CIDRIP, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId).
     * </p>
     * 
     * @param revokeDBSecurityGroupIngressRequest <p/>
     * @return revokeDBSecurityGroupIngressResult The response from the
     *         RevokeDBSecurityGroupIngress service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBSecurityGroupNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RevokeDBSecurityGroupIngressResult revokeDBSecurityGroupIngress(
            RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a database activity stream to monitor activity on the database.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"
     * >Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param startActivityStreamRequest
     * @return startActivityStreamResult The response from the
     *         StartActivityStream service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws ResourceNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartActivityStreamResult startActivityStream(
            StartActivityStreamRequest startActivityStreamRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts an Amazon Aurora DB cluster that was stopped using the AWS
     * console, the stop-db-cluster AWS CLI command, or the StopDBCluster
     * action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"
     * > Stopping and Starting an Aurora Cluster</a> in the <i>Amazon Aurora
     * User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param startDBClusterRequest
     * @return startDBClusterResult The response from the StartDBCluster service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartDBClusterResult startDBCluster(StartDBClusterRequest startDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an Amazon RDS DB instance that was stopped using the AWS console,
     * the stop-db-instance AWS CLI command, or the StopDBInstance action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"
     * > Starting an Amazon RDS DB instance That Was Previously Stopped</a> in
     * the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora DB clusters, use <code>StartDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param startDBInstanceRequest
     * @return startDBInstanceResult The response from the StartDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidDBClusterStateException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws DBClusterNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartDBInstanceResult startDBInstance(StartDBInstanceRequest startDBInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an export of a snapshot to Amazon S3. The provided IAM role must
     * have access to the S3 bucket.
     * </p>
     * 
     * @param startExportTaskRequest
     * @return startExportTaskResult The response from the StartExportTask
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterSnapshotNotFoundException
     * @throws ExportTaskAlreadyExistsException
     * @throws InvalidS3BucketException
     * @throws IamRoleNotFoundException
     * @throws IamRoleMissingPermissionsException
     * @throws InvalidExportOnlyException
     * @throws KMSKeyNotAccessibleException
     * @throws InvalidExportSourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartExportTaskResult startExportTask(StartExportTaskRequest startExportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a database activity stream that was started using the AWS console,
     * the <code>start-activity-stream</code> AWS CLI command, or the
     * <code>StartActivityStream</code> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"
     * >Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param stopActivityStreamRequest
     * @return stopActivityStreamResult The response from the StopActivityStream
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws ResourceNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StopActivityStreamResult stopActivityStream(StopActivityStreamRequest stopActivityStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora
     * retains the DB cluster's metadata, including its endpoints and DB
     * parameter groups. Aurora also retains the transaction logs so you can do
     * a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"
     * > Stopping and Starting an Aurora Cluster</a> in the <i>Amazon Aurora
     * User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param stopDBClusterRequest
     * @return stopDBClusterResult The response from the StopDBCluster service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StopDBClusterResult stopDBCluster(StopDBClusterRequest stopDBClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS
     * retains the DB instance's metadata, including its endpoint, DB parameter
     * group, and option group membership. Amazon RDS also retains the
     * transaction logs so you can do a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"
     * > Stopping an Amazon RDS DB Instance Temporarily</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora clusters, use <code>StopDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param stopDBInstanceRequest
     * @return stopDBInstanceResult The response from the StopDBInstance service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StopDBInstanceResult stopDBInstance(StopDBInstanceRequest stopDBInstanceRequest)
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
