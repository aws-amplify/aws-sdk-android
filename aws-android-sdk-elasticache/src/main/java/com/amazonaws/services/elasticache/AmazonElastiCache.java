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

package com.amazonaws.services.elasticache;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elasticache.model.*;

/**
 * Interface for accessing Amazon ElastiCache <fullname>Amazon
 * ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate,
 * and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With ElastiCache, customers get all of the benefits of a high-performance,
 * in-memory cache with less of the administrative burden involved in launching
 * and managing a distributed cache. The service makes setup, scaling, and
 * cluster failure handling much simpler than in a self-managed cache
 * deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get
 * enhanced visibility into the key performance statistics associated with their
 * cache and can receive alarms if a part of their cache runs hot.
 * </p>
 **/
public interface AmazonElastiCache {

    /**
     * Overrides the default endpoint for this client
     * ("https://elasticache.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "elasticache.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://elasticache.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "elasticache.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://elasticache.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElastiCache#setEndpoint(String)}, sets the
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
     * Adds up to 50 cost allocation tags to the named resource. A cost
     * allocation tag is a key-value pair where the key and value are
     * case-sensitive. You can use cost allocation tags to categorize and track
     * your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost
     * allocation report as a comma-separated value (CSV) file with your usage
     * and costs aggregated by your tags. You can apply tags that represent
     * business categories (such as cost centers, application names, or owners)
     * to organize your costs across multiple services. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html"
     * >Using Cost Allocation Tags in Amazon ElastiCache</a> in the
     * <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest <p>
     *            Represents the input of an AddTagsToResource operation.
     *            </p>
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidARNException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using
     * ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups
     * are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one
     * region to an ElastiCache cluster in another region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest <p>
     *            Represents the input of an AuthorizeCacheSecurityGroupIngress
     *            operation.
     *            </p>
     * @return authorizeCacheSecurityGroupIngressResult The response from the
     *         AuthorizeCacheSecurityGroupIngress service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheSecurityGroupNotFoundException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AuthorizeCacheSecurityGroupIngressResult authorizeCacheSecurityGroupIngress(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Apply the service update. For more information on service updates and
     * applying them, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/applying-updates.html"
     * >Applying Service Updates</a>.
     * </p>
     * 
     * @param batchApplyUpdateActionRequest
     * @return batchApplyUpdateActionResult The response from the
     *         BatchApplyUpdateAction service method, as returned by Amazon
     *         ElastiCache.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchApplyUpdateActionResult batchApplyUpdateAction(
            BatchApplyUpdateActionRequest batchApplyUpdateActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stop the service update. For more information on service updates and
     * stopping them, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/stopping-self-service-updates.html"
     * >Stopping Service Updates</a>.
     * </p>
     * 
     * @param batchStopUpdateActionRequest
     * @return batchStopUpdateActionResult The response from the
     *         BatchStopUpdateAction service method, as returned by Amazon
     *         ElastiCache.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchStopUpdateActionResult batchStopUpdateAction(
            BatchStopUpdateActionRequest batchStopUpdateActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Complete the migration of data.
     * </p>
     * 
     * @param completeMigrationRequest
     * @return completeMigrationResult The response from the CompleteMigration
     *         service method, as returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws ReplicationGroupNotUnderMigrationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CompleteMigrationResult completeMigration(CompleteMigrationRequest completeMigrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the
     * <code>CopySnapshot</code> operation can create their own Amazon S3
     * buckets and copy snapshots to it. To control access to your snapshots,
     * use an IAM policy to control who has the ability to use the
     * <code>CopySnapshot</code> operation. For more information about using IAM
     * to control the use of ElastiCache operations, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html"
     * >Exporting Snapshots</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html"
     * >Authentication &amp; Access Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
     * snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
     * snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated
     * user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
     * snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient
     * permissions to perform the desired activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with
     * key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and
     * unique value. If exporting a snapshot, you could alternatively create a
     * new Amazon S3 bucket and use this same value for
     * <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions
     * %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions
     * %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP
     * permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest <p>
     *            Represents the input of a <code>CopySnapshotMessage</code>
     *            operation.
     *            </p>
     * @return copySnapshotResult The response from the CopySnapshot service
     *         method, as returned by Amazon ElastiCache.
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidSnapshotStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same
     * protocol-compliant cache engine software, either Memcached or Redis.
     * </p>
     * <p>
     * This operation is not supported for Redis (cluster mode enabled)
     * clusters.
     * </p>
     * 
     * @param createCacheClusterRequest <p>
     *            Represents the input of a CreateCacheCluster operation.
     *            </p>
     * @return createCacheClusterResult The response from the CreateCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws CacheClusterAlreadyExistsException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheSubnetGroupNotFoundException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCacheClusterResult createCacheCluster(CreateCacheClusterRequest createCacheClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache
     * cache parameter group is a collection of parameters and their values that
     * are applied to all of the nodes in any cluster or replication group using
     * the CacheParameterGroup.
     * </p>
     * <p>
     * A newly created CacheParameterGroup is an exact duplicate of the default
     * parameter group for the CacheParameterGroupFamily. To customize the newly
     * created CacheParameterGroup you can change the values of specific
     * parameters. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html"
     * >ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html"
     * >Parameters and Parameter Groups</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>CreateCacheParameterGroup</code> operation.
     *            </p>
     * @return createCacheParameterGroupResult The response from the
     *         CreateCacheParameterGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheParameterGroupQuotaExceededException
     * @throws CacheParameterGroupAlreadyExistsException
     * @throws InvalidCacheParameterGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCacheParameterGroupResult createCacheParameterGroup(
            CreateCacheParameterGroupRequest createCacheParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control
     * access to one or more clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster
     * outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are
     * creating a cluster inside of a VPC, use a cache subnet group instead. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest <p>
     *            Represents the input of a
     *            <code>CreateCacheSecurityGroup</code> operation.
     *            </p>
     * @return createCacheSecurityGroupResult The response from the
     *         CreateCacheSecurityGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSecurityGroupAlreadyExistsException
     * @throws CacheSecurityGroupQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCacheSecurityGroupResult createCacheSecurityGroup(
            CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon
     * Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest <p>
     *            Represents the input of a <code>CreateCacheSubnetGroup</code>
     *            operation.
     *            </p>
     * @return createCacheSubnetGroupResult The response from the
     *         CreateCacheSubnetGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSubnetGroupAlreadyExistsException
     * @throws CacheSubnetGroupQuotaExceededException
     * @throws CacheSubnetQuotaExceededException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCacheSubnetGroupResult createCacheSubnetGroup(
            CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Global Datastore for Redis offers fully managed, fast, reliable and
     * secure cross-region replication. Using Global Datastore for Redis, you
     * can create cross-region read replica clusters for ElastiCache for Redis
     * to enable low-latency reads and disaster recovery across regions. For
     * more information, see <a
     * href="/AmazonElastiCache/latest/red-ug/Redis-Global-Clusters.html"
     * >Replication Across Regions Using Global Datastore</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> is the name of the Global
     * Datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <b>PrimaryReplicationGroupId</b> represents the name of the primary
     * cluster that accepts writes and will replicate updates to the secondary
     * cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGlobalReplicationGroupRequest
     * @return createGlobalReplicationGroupResult The response from the
     *         CreateGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws GlobalReplicationGroupAlreadyExistsException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateGlobalReplicationGroupResult createGlobalReplicationGroup(
            CreateGlobalReplicationGroupRequest createGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled)
     * replication group.
     * </p>
     * <p>
     * This API can be used to create a standalone regional replication group or
     * a secondary replication group associated with a Global Datastore.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of
     * clusters, where one of the clusters is a read/write primary and the
     * others are read-only replicas. Writes to the primary are asynchronously
     * propagated to the replicas.
     * </p>
     * <p>
     * A Redis (cluster mode enabled) replication group is a collection of 1 to
     * 90 node groups (shards). Each node group (shard) has one read/write
     * primary node and up to 5 read-only replica nodes. Writes to the primary
     * are asynchronously propagated to the replicas. Redis (cluster mode
     * enabled) replication groups partition the data across node groups
     * (shards).
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been
     * successfully created, you can add one or more read replicas to it, up to
     * a total of 5 read replicas. You cannot alter a Redis (cluster mode
     * enabled) replication group after it has been created. However, if you
     * need to increase or decrease the number of node groups (console: shards),
     * you can avail yourself of ElastiCache for Redis' enhanced backup and
     * restore. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-restoring.html"
     * >Restoring From a Backup with Cluster Resizing</a> in the <i>ElastiCache
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest <p>
     *            Represents the input of a <code>CreateReplicationGroup</code>
     *            operation.
     *            </p>
     * @return createReplicationGroupResult The response from the
     *         CreateReplicationGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws ReplicationGroupAlreadyExistsException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheSubnetGroupNotFoundException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws TagQuotaPerResourceExceededException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateReplicationGroupResult createReplicationGroup(
            CreateReplicationGroupRequest createReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a copy of an entire cluster or replication group at a specific
     * moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest <p>
     *            Represents the input of a <code>CreateSnapshot</code>
     *            operation.
     *            </p>
     * @return createSnapshotResult The response from the CreateSnapshot service
     *         method, as returned by Amazon ElastiCache.
     * @throws SnapshotAlreadyExistsException
     * @throws CacheClusterNotFoundException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidReplicationGroupStateException
     * @throws SnapshotQuotaExceededException
     * @throws SnapshotFeatureNotSupportedException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Decreases the number of node groups in a Global Datastore
     * </p>
     * 
     * @param decreaseNodeGroupsInGlobalReplicationGroupRequest
     * @return decreaseNodeGroupsInGlobalReplicationGroupResult The response
     *         from the DecreaseNodeGroupsInGlobalReplicationGroup service
     *         method, as returned by Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DecreaseNodeGroupsInGlobalReplicationGroupResult decreaseNodeGroupsInGlobalReplicationGroup(
            DecreaseNodeGroupsInGlobalReplicationGroupRequest decreaseNodeGroupsInGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Dynamically decreases the number of replicas in a Redis (cluster mode
     * disabled) replication group or the number of replica nodes in one or more
     * node groups (shards) of a Redis (cluster mode enabled) replication group.
     * This operation is performed with no cluster down time.
     * </p>
     * 
     * @param decreaseReplicaCountRequest
     * @return decreaseReplicaCountResult The response from the
     *         DecreaseReplicaCount service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws NoOperationException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DecreaseReplicaCountResult decreaseReplicaCount(
            DecreaseReplicaCountRequest decreaseReplicaCountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code>
     * deletes all associated cache nodes, node endpoints and the cluster
     * itself. When you receive a successful response from this operation,
     * Amazon ElastiCache immediately begins deleting the cluster; you cannot
     * cancel or revert this operation.
     * </p>
     * <p>
     * This operation is not valid for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode enabled) clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is the last read replica of a replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A node group (shard) that has Multi-AZ mode enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster from a Redis (cluster mode enabled) replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is not in the <code>available</code> state
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteCacheClusterRequest <p>
     *            Represents the input of a <code>DeleteCacheCluster</code>
     *            operation.
     *            </p>
     * @return deleteCacheClusterResult The response from the DeleteCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotFeatureNotSupportedException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteCacheClusterResult deleteCacheCluster(DeleteCacheClusterRequest deleteCacheClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache
     * parameter group if it is associated with any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>DeleteCacheParameterGroup</code> operation.
     *            </p>
     * @throws InvalidCacheParameterGroupStateException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteCacheParameterGroup(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any
     * clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest <p>
     *            Represents the input of a
     *            <code>DeleteCacheSecurityGroup</code> operation.
     *            </p>
     * @throws InvalidCacheSecurityGroupStateException
     * @throws CacheSecurityGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any
     * clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest <p>
     *            Represents the input of a <code>DeleteCacheSubnetGroup</code>
     *            operation.
     *            </p>
     * @throws CacheSubnetGroupInUseException
     * @throws CacheSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deleting a Global Datastore is a two-step process:
     * </p>
     * <ul>
     * <li>
     * <p>
     * First, you must <a>DisassociateGlobalReplicationGroup</a> to remove the
     * secondary clusters in the Global Datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the Global Datastore contains only the primary cluster, you can use
     * DeleteGlobalReplicationGroup API to delete the Global Datastore while
     * retainining the primary cluster using Retain…= true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Since the Global Datastore has only a primary cluster, you can delete the
     * Global Datastore while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteGlobalReplicationGroupRequest
     * @return deleteGlobalReplicationGroupResult The response from the
     *         DeleteGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteGlobalReplicationGroupResult deleteGlobalReplicationGroup(
            DeleteGlobalReplicationGroupRequest deleteGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes
     * the entire replication group, including the primary/primaries and all of
     * the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by
     * setting <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest <p>
     *            Represents the input of a <code>DeleteReplicationGroup</code>
     *            operation.
     *            </p>
     * @return deleteReplicationGroupResult The response from the
     *         DeleteReplicationGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotFeatureNotSupportedException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteReplicationGroupResult deleteReplicationGroup(
            DeleteReplicationGroupRequest deleteReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from
     * this operation, ElastiCache immediately begins deleting the snapshot; you
     * cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest <p>
     *            Represents the input of a <code>DeleteSnapshot</code>
     *            operation.
     *            </p>
     * @return deleteSnapshotResult The response from the DeleteSnapshot service
     *         method, as returned by Amazon ElastiCache.
     * @throws SnapshotNotFoundException
     * @throws InvalidSnapshotStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster
     * identifier is specified, or about a specific cache cluster if a cluster
     * identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the clusters is returned. You
     * can use the optional <i>ShowCacheNodeInfo</i> flag to retrieve detailed
     * information about the cache nodes associated with the clusters. These
     * details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the <i>creating</i> state, only cluster-level
     * information is displayed until all of the nodes are successfully
     * provisioned.
     * </p>
     * <p>
     * If the cluster is in the <i>deleting</i> state, only cluster-level
     * information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cluster, node endpoint
     * information and creation time for the additional nodes are not displayed
     * until they are completely provisioned. When the cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cluster, no endpoint
     * information for the removed nodes is displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest <p>
     *            Represents the input of a <code>DescribeCacheClusters</code>
     *            operation.
     *            </p>
     * @return describeCacheClustersResult The response from the
     *         DescribeCacheClusters service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCacheClustersResult describeCacheClusters(
            DescribeCacheClustersRequest describeCacheClustersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheEngineVersions</code> operation.
     *            </p>
     * @return describeCacheEngineVersionsResult The response from the
     *         DescribeCacheEngineVersions service method, as returned by Amazon
     *         ElastiCache.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCacheEngineVersionsResult describeCacheEngineVersions(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache
     * parameter group name is specified, the list contains only the
     * descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheParameterGroups</code> operation.
     *            </p>
     * @return describeCacheParameterGroupsResult The response from the
     *         DescribeCacheParameterGroups service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCacheParameterGroupsResult describeCacheParameterGroups(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter
     * group.
     * </p>
     * 
     * @param describeCacheParametersRequest <p>
     *            Represents the input of a <code>DescribeCacheParameters</code>
     *            operation.
     *            </p>
     * @return describeCacheParametersResult The response from the
     *         DescribeCacheParameters service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCacheParametersResult describeCacheParameters(
            DescribeCacheParametersRequest describeCacheParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security
     * group name is specified, the list contains only the description of that
     * group. This applicable only when you have ElastiCache in Classic setup
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheSecurityGroups</code> operation.
     *            </p>
     * @return describeCacheSecurityGroupsResult The response from the
     *         DescribeCacheSecurityGroups service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSecurityGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name
     * is specified, the list contains only the description of that group. This
     * is applicable only when you have ElastiCache in VPC setup. All
     * ElastiCache clusters now launch in VPC by default.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheSubnetGroups</code> operation.
     *            </p>
     * @return describeCacheSubnetGroupsResult The response from the
     *         DescribeCacheSubnetGroups service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest <p>
     *            Represents the input of a
     *            <code>DescribeEngineDefaultParameters</code> operation.
     *            </p>
     * @return describeEngineDefaultParametersResult The response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         Amazon ElastiCache.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeEngineDefaultParametersResult describeEngineDefaultParameters(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns events related to clusters, cache security groups, and cache
     * parameter groups. You can obtain events specific to a particular cluster,
     * cache security group, or cache parameter group by providing the name as a
     * parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned;
     * however, you can retrieve up to 14 days' worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest <p>
     *            Represents the input of a <code>DescribeEvents</code>
     *            operation.
     *            </p>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by Amazon ElastiCache.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a particular global replication group. If no
     * identifier is specified, returns information about all Global Datastores.
     * </p>
     * 
     * @param describeGlobalReplicationGroupsRequest
     * @return describeGlobalReplicationGroupsResult The response from the
     *         DescribeGlobalReplicationGroups service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeGlobalReplicationGroupsResult describeGlobalReplicationGroups(
            DescribeGlobalReplicationGroupsRequest describeGlobalReplicationGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a particular replication group. If no
     * identifier is specified, <code>DescribeReplicationGroups</code> returns
     * information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeReplicationGroups</code> operation.
     *            </p>
     * @return describeReplicationGroupsResult The response from the
     *         DescribeReplicationGroups service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeReplicationGroupsResult describeReplicationGroups(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about
     * a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest <p>
     *            Represents the input of a
     *            <code>DescribeReservedCacheNodes</code> operation.
     *            </p>
     * @return describeReservedCacheNodesResult The response from the
     *         DescribeReservedCacheNodes service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReservedCacheNodeNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeReservedCacheNodesResult describeReservedCacheNodes(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest <p>
     *            Represents the input of a
     *            <code>DescribeReservedCacheNodesOfferings</code> operation.
     *            </p>
     * @return describeReservedCacheNodesOfferingsResult The response from the
     *         DescribeReservedCacheNodesOfferings service method, as returned
     *         by Amazon ElastiCache.
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return describeServiceUpdatesResult The response from the
     *         DescribeServiceUpdates service method, as returned by Amazon
     *         ElastiCache.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeServiceUpdatesResult describeServiceUpdates(
            DescribeServiceUpdatesRequest describeServiceUpdatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about cluster or replication group snapshots. By
     * default, <code>DescribeSnapshots</code> lists all of your snapshots; it
     * can optionally describe a single snapshot, or just the snapshots
     * associated with a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest <p>
     *            Represents the input of a
     *            <code>DescribeSnapshotsMessage</code> operation.
     *            </p>
     * @return describeSnapshotsResult The response from the DescribeSnapshots
     *         service method, as returned by Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns details of the update actions
     * </p>
     * 
     * @param describeUpdateActionsRequest
     * @return describeUpdateActionsResult The response from the
     *         DescribeUpdateActions service method, as returned by Amazon
     *         ElastiCache.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeUpdateActionsResult describeUpdateActions(
            DescribeUpdateActionsRequest describeUpdateActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Remove a secondary cluster from the Global Datastore using the Global
     * Datastore name. The secondary cluster will no longer receive updates from
     * the primary cluster, but will remain as a standalone cluster in that AWS
     * region.
     * </p>
     * 
     * @param disassociateGlobalReplicationGroupRequest
     * @return disassociateGlobalReplicationGroupResult The response from the
     *         DisassociateGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateGlobalReplicationGroupResult disassociateGlobalReplicationGroup(
            DisassociateGlobalReplicationGroupRequest disassociateGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Used to failover the primary region to a selected secondary region. The
     * selected secondary region will become primary, and all other clusters
     * will become secondary.
     * </p>
     * 
     * @param failoverGlobalReplicationGroupRequest
     * @return failoverGlobalReplicationGroupResult The response from the
     *         FailoverGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    FailoverGlobalReplicationGroupResult failoverGlobalReplicationGroup(
            FailoverGlobalReplicationGroupRequest failoverGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Increase the number of node groups in the Global Datastore
     * </p>
     * 
     * @param increaseNodeGroupsInGlobalReplicationGroupRequest
     * @return increaseNodeGroupsInGlobalReplicationGroupResult The response
     *         from the IncreaseNodeGroupsInGlobalReplicationGroup service
     *         method, as returned by Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    IncreaseNodeGroupsInGlobalReplicationGroupResult increaseNodeGroupsInGlobalReplicationGroup(
            IncreaseNodeGroupsInGlobalReplicationGroupRequest increaseNodeGroupsInGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Dynamically increases the number of replics in a Redis (cluster mode
     * disabled) replication group or the number of replica nodes in one or more
     * node groups (shards) of a Redis (cluster mode enabled) replication group.
     * This operation is performed with no cluster down time.
     * </p>
     * 
     * @param increaseReplicaCountRequest
     * @return increaseReplicaCountResult The response from the
     *         IncreaseReplicaCount service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws NoOperationException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    IncreaseReplicaCountResult increaseReplicaCount(
            IncreaseReplicaCountRequest increaseReplicaCountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or
     * replication group's current node type.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code> operations to scale your cluster or
     * replication group, the value of the <code>CacheNodeType</code> parameter
     * must be one of the node types returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest <p>
     *            The input parameters for the
     *            <code>ListAllowedNodeTypeModifications</code> operation.
     *            </p>
     * @return listAllowedNodeTypeModificationsResult The response from the
     *         ListAllowedNodeTypeModifications service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all cost allocation tags currently on the named resource. A
     * <code>cost allocation tag</code> is a key-value pair where the key is
     * case-sensitive and the value is optional. You can use cost allocation
     * tags to categorize and track your AWS costs.
     * </p>
     * <p>
     * If the cluster is not in the <i>available</i> state,
     * <code>ListTagsForResource</code> returns an error.
     * </p>
     * <p>
     * You can have a maximum of 50 cost allocation tags on an ElastiCache
     * resource. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html"
     * >Monitoring Costs with Tags</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            The input parameters for the <code>ListTagsForResource</code>
     *            operation.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change
     * one or more cluster configuration parameters by specifying the parameters
     * and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest <p>
     *            Represents the input of a <code>ModifyCacheCluster</code>
     *            operation.
     *            </p>
     * @return modifyCacheClusterResult The response from the ModifyCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws InvalidCacheClusterStateException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheClusterNotFoundException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ModifyCacheClusterResult modifyCacheCluster(ModifyCacheClusterRequest modifyCacheClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to
     * 20 parameters in a single request by submitting a list parameter name and
     * value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>ModifyCacheParameterGroup</code> operation.
     *            </p>
     * @return modifyCacheParameterGroupResult The response from the
     *         ModifyCacheParameterGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidCacheParameterGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ModifyCacheParameterGroupResult modifyCacheParameterGroup(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest <p>
     *            Represents the input of a <code>ModifyCacheSubnetGroup</code>
     *            operation.
     *            </p>
     * @return modifyCacheSubnetGroupResult The response from the
     *         ModifyCacheSubnetGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSubnetGroupNotFoundException
     * @throws CacheSubnetQuotaExceededException
     * @throws SubnetInUseException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ModifyCacheSubnetGroupResult modifyCacheSubnetGroup(
            ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the settings for a Global Datastore.
     * </p>
     * 
     * @param modifyGlobalReplicationGroupRequest
     * @return modifyGlobalReplicationGroupResult The response from the
     *         ModifyGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ModifyGlobalReplicationGroupResult modifyGlobalReplicationGroup(
            ModifyGlobalReplicationGroupRequest modifyGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html"
     * >Scaling for Amazon ElastiCache for Redis (cluster mode enabled)</a> in
     * the ElastiCache User Guide
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
     * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API
     * Reference
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest <p>
     *            Represents the input of a <code>ModifyReplicationGroups</code>
     *            operation.
     *            </p>
     * @return modifyReplicationGroupResult The response from the
     *         ModifyReplicationGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheClusterNotFoundException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ModifyReplicationGroupResult modifyReplicationGroup(
            ModifyReplicationGroupRequest modifyReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a replication group's shards (node groups) by allowing you to
     * add shards, remove shards, or rebalance the keyspaces among exisiting
     * shards.
     * </p>
     * 
     * @param modifyReplicationGroupShardConfigurationRequest <p>
     *            Represents the input for a
     *            <code>ModifyReplicationGroupShardConfiguration</code>
     *            operation.
     *            </p>
     * @return modifyReplicationGroupShardConfigurationResult The response from
     *         the ModifyReplicationGroupShardConfiguration service method, as
     *         returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ModifyReplicationGroupShardConfigurationResult modifyReplicationGroupShardConfiguration(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest <p>
     *            Represents the input of a
     *            <code>PurchaseReservedCacheNodesOffering</code> operation.
     *            </p>
     * @return purchaseReservedCacheNodesOfferingResult The response from the
     *         PurchaseReservedCacheNodesOffering service method, as returned by
     *         Amazon ElastiCache.
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws ReservedCacheNodeAlreadyExistsException
     * @throws ReservedCacheNodeQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PurchaseReservedCacheNodesOfferingResult purchaseReservedCacheNodesOffering(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Redistribute slots to ensure uniform distribution across existing shards
     * in the cluster.
     * </p>
     * 
     * @param rebalanceSlotsInGlobalReplicationGroupRequest
     * @return rebalanceSlotsInGlobalReplicationGroupResult The response from
     *         the RebalanceSlotsInGlobalReplicationGroup service method, as
     *         returned by Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RebalanceSlotsInGlobalReplicationGroupResult rebalanceSlotsInGlobalReplicationGroup(
            RebalanceSlotsInGlobalReplicationGroupRequest rebalanceSlotsInGlobalReplicationGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cluster.
     * This operation applies any modified cache parameter groups to the
     * cluster. The reboot operation takes place as soon as possible, and
     * results in a momentary outage to the cluster. During the reboot, the
     * cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being
     * rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cluster event is created.
     * </p>
     * <p>
     * Rebooting a cluster is currently supported on Memcached and Redis
     * (cluster mode disabled) clusters. Rebooting is not supported on Redis
     * (cluster mode enabled) clusters.
     * </p>
     * <p>
     * If you make changes to parameters that require a Redis (cluster mode
     * enabled) cluster reboot for the changes to be applied, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a> for an alternate process.
     * </p>
     * 
     * @param rebootCacheClusterRequest <p>
     *            Represents the input of a <code>RebootCacheCluster</code>
     *            operation.
     *            </p>
     * @return rebootCacheClusterResult The response from the RebootCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws InvalidCacheClusterStateException
     * @throws CacheClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RebootCacheClusterResult rebootCacheCluster(RebootCacheClusterRequest rebootCacheClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the
     * named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p>
     *            Represents the input of a <code>RemoveTagsFromResource</code>
     *            operation.
     *            </p>
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws TagNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or
     * system default value. You can reset specific parameters by submitting a
     * list of parameter names. To reset the entire cache parameter group,
     * specify the <code>ResetAllParameters</code> and
     * <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>ResetCacheParameterGroup</code> operation.
     *            </p>
     * @return resetCacheParameterGroupResult The response from the
     *         ResetCacheParameterGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws InvalidCacheParameterGroupStateException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ResetCacheParameterGroupResult resetCacheParameterGroup(
            ResetCacheParameterGroupRequest resetCacheParameterGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to
     * disallow access from an Amazon EC2 security group that had been
     * previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest <p>
     *            Represents the input of a
     *            <code>RevokeCacheSecurityGroupIngress</code> operation.
     *            </p>
     * @return revokeCacheSecurityGroupIngressResult The response from the
     *         RevokeCacheSecurityGroupIngress service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheSecurityGroupNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RevokeCacheSecurityGroupIngressResult revokeCacheSecurityGroupIngress(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Start the migration of data.
     * </p>
     * 
     * @param startMigrationRequest
     * @return startMigrationResult The response from the StartMigration service
     *         method, as returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws ReplicationGroupAlreadyUnderMigrationException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartMigrationResult startMigration(StartMigrationRequest startMigrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents the input of a <code>TestFailover</code> operation which test
     * automatic failover on a specified node group (called shard in the
     * console) in a replication group (called cluster in the console).
     * </p>
     * <p class="title">
     * <b>Note the following</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A customer can use this operation to test automatic failover on up to 5
     * shards (called node groups in the ElastiCache API and AWS CLI) in any
     * rolling 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * If calling this operation on shards in different clusters (called
     * replication groups in the API and CLI), the calls can be made
     * concurrently.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * If calling this operation multiple times on different shards in the same
     * Redis (cluster mode enabled) replication group, the first node
     * replacement must complete before a subsequent call can be made.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether the node replacement is complete you can check
     * Events using the Amazon ElastiCache console, the AWS CLI, or the
     * ElastiCache API. Look for the following automatic failover related
     * events, listed here in order of occurrance:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Replication group message:
     * <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replication group message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Recovering cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html"
     * >Viewing ElastiCache Events</a> in the <i>ElastiCache User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html"
     * >DescribeEvents</a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Also see, <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test"
     * >Testing Multi-AZ with Automatic Failover</a> in the <i>ElastiCache User
     * Guide</i>.
     * </p>
     * 
     * @param testFailoverRequest
     * @return testFailoverResult The response from the TestFailover service
     *         method, as returned by Amazon ElastiCache.
     * @throws APICallRateForCustomerExceededException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidReplicationGroupStateException
     * @throws NodeGroupNotFoundException
     * @throws ReplicationGroupNotFoundException
     * @throws TestFailoverNotAvailableException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TestFailoverResult testFailover(TestFailoverRequest testFailoverRequest)
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
