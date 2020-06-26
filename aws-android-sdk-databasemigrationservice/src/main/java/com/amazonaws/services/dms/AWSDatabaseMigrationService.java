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

package com.amazonaws.services.dms;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.dms.model.*;

/**
 * Interface for accessing AWS Database Migration Service <fullname>AWS Database
 * Migration Service</fullname>
 * <p>
 * AWS Database Migration Service (AWS DMS) can migrate your data to and from
 * the most widely used commercial and open-source databases such as Oracle,
 * PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
 * MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports
 * homogeneous migrations such as Oracle to Oracle, as well as heterogeneous
 * migrations between different database platforms, such as Oracle to MySQL or
 * SQL Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about AWS DMS, see <a
 * href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What Is
 * AWS Database Migration Service?</a> in the <i>AWS Database Migration User
 * Guide.</i>
 * </p>
 **/
public interface AWSDatabaseMigrationService {

    /**
     * Overrides the default endpoint for this client
     * ("https://dms.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "dms.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://dms.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "dms.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://dms.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSDatabaseMigrationService#setEndpoint(String)}
     * , sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
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
     * Adds metadata tags to an AWS DMS resource, including replication
     * instance, endpoint, security group, and migration task. These tags can
     * also be used with cost allocation reporting to track cost associated with
     * DMS resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest <p>
     *            Associates a set of tags with an AWS DMS resource.
     *            </p>
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a
     * replication instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest <p/>
     * @return applyPendingMaintenanceActionResult The response from the
     *         ApplyPendingMaintenanceAction service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ApplyPendingMaintenanceActionResult applyPendingMaintenanceAction(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest <p/>
     * @return createEndpointResult The response from the CreateEndpoint service
     *         method, as returned by AWS Database Migration Service.
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceQuotaExceededException
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an AWS DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to
     * be notified of, provide a list of AWS DMS source IDs (
     * <code>SourceIds</code>) that triggers the events, and provide a list of
     * event categories (<code>EventCategories</code>) for events you want to be
     * notified of. If you specify both the <code>SourceType</code> and
     * <code>SourceIds</code>, such as
     * <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of
     * all the replication instance events for the specified source. If you
     * specify a <code>SourceType</code> but don't specify a
     * <code>SourceIdentifier</code>, you receive notice of the events for that
     * source type for all your AWS DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be
     * notified of events generated from all AWS DMS sources belonging to your
     * customer account.
     * </p>
     * <p>
     * For more information about AWS DMS events, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
     * >Working with Events and Notifications</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     * 
     * @param createEventSubscriptionRequest <p/>
     * @return createEventSubscriptionResult The response from the
     *         CreateEventSubscription service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceQuotaExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws KMSAccessDeniedException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateEventSubscriptionResult createEventSubscription(
            CreateEventSubscriptionRequest createEventSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * <p>
     * AWS DMS requires that your account have certain roles with appropriate
     * permissions before you can create a replication instance. For information
     * on the required roles, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.APIRole.html"
     * >Creating the IAM Roles to Use With the AWS CLI and AWS DMS API</a>. For
     * information on the required permissions, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.IAMPermissions.html"
     * >IAM Permissions Needed to Use AWS DMS</a>.
     * </p>
     * 
     * @param createReplicationInstanceRequest <p/>
     * @return createReplicationInstanceResult The response from the
     *         CreateReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceAlreadyExistsException
     * @throws InsufficientResourceCapacityException
     * @throws ResourceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws ResourceNotFoundException
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidResourceStateException
     * @throws InvalidSubnetException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateReplicationInstanceResult createReplicationInstance(
            CreateReplicationInstanceRequest createReplicationInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a replication subnet group given a list of the subnet IDs in a
     * VPC.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest <p/>
     * @return createReplicationSubnetGroupResult The response from the
     *         CreateReplicationSubnetGroup service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws ResourceQuotaExceededException
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateReplicationSubnetGroupResult createReplicationSubnetGroup(
            CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest <p/>
     * @return createReplicationTaskResult The response from the
     *         CreateReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws AccessDeniedException
     * @throws InvalidResourceStateException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateReplicationTaskResult createReplicationTask(
            CreateReplicationTaskRequest createReplicationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return deleteCertificateResult The response from the DeleteCertificate
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the connection between a replication instance and an endpoint.
     * </p>
     * 
     * @param deleteConnectionRequest <p/>
     * @return deleteConnectionResult The response from the DeleteConnection
     *         service method, as returned by AWS Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified endpoint.
     * </p>
     * <note>
     * <p>
     * All tasks associated with the endpoint must be deleted before you can
     * delete the endpoint.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteEndpointRequest <p/>
     * @return deleteEndpointResult The response from the DeleteEndpoint service
     *         method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an AWS DMS event subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest <p/>
     * @return deleteEventSubscriptionResult The response from the
     *         DeleteEventSubscription service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteEventSubscriptionResult deleteEventSubscription(
            DeleteEventSubscriptionRequest deleteEventSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified replication instance.
     * </p>
     * <note>
     * <p>
     * You must delete any migration tasks that are associated with the
     * replication instance before you can delete it.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteReplicationInstanceRequest <p/>
     * @return deleteReplicationInstanceResult The response from the
     *         DeleteReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteReplicationInstanceResult deleteReplicationInstance(
            DeleteReplicationInstanceRequest deleteReplicationInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * 
     * @param deleteReplicationSubnetGroupRequest <p/>
     * @return deleteReplicationSubnetGroupResult The response from the
     *         DeleteReplicationSubnetGroup service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteReplicationSubnetGroupResult deleteReplicationSubnetGroup(
            DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified replication task.
     * </p>
     * 
     * @param deleteReplicationTaskRequest <p/>
     * @return deleteReplicationTaskResult The response from the
     *         DeleteReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteReplicationTaskResult deleteReplicationTask(
            DeleteReplicationTaskRequest deleteReplicationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of the AWS DMS attributes for a customer account. These
     * attributes include AWS DMS quotas for the account and a unique account
     * identifier in a particular DMS region. DMS quotas include a list of
     * resource quotas supported by the account, such as the number of
     * replication instances allowed. The description for each resource quota,
     * includes the quota name, current usage toward that quota, and the quota's
     * maximum value. DMS uses the unique account identifier to name each
     * artifact used by DMS in the given region.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest <p/>
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by AWS
     *         Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a description of the certificate.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return describeCertificatesResult The response from the
     *         DescribeCertificates service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeCertificatesResult describeCertificates(
            DescribeCertificatesRequest describeCertificatesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the status of the connections that have been made between the
     * replication instance and an endpoint. Connections are created when you
     * test an endpoint.
     * </p>
     * 
     * @param describeConnectionsRequest <p/>
     * @return describeConnectionsResult The response from the
     *         DescribeConnections service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest describeConnectionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about the type of endpoints available.
     * </p>
     * 
     * @param describeEndpointTypesRequest <p/>
     * @return describeEndpointTypesResult The response from the
     *         DescribeEndpointTypes service method, as returned by AWS Database
     *         Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEndpointTypesResult describeEndpointTypes(
            DescribeEndpointTypesRequest describeEndpointTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the endpoints for your account in the current
     * region.
     * </p>
     * 
     * @param describeEndpointsRequest <p/>
     * @return describeEndpointsResult The response from the DescribeEndpoints
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists categories for all event source types, or, if specified, for a
     * specified source type. You can see a list of the event categories and
     * source types in <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
     * >Working with Events and Notifications</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest <p/>
     * @return describeEventCategoriesResult The response from the
     *         DescribeEventCategories service method, as returned by AWS
     *         Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEventCategoriesResult describeEventCategories(
            DescribeEventCategoriesRequest describeEventCategoriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the event subscriptions for a customer account. The description
     * of a subscription includes <code>SubscriptionName</code>,
     * <code>SNSTopicARN</code>, <code>CustomerID</code>,
     * <code>SourceType</code>, <code>SourceID</code>, <code>CreationTime</code>
     * , and <code>Status</code>.
     * </p>
     * <p>
     * If you specify <code>SubscriptionName</code>, this action lists the
     * description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest <p/>
     * @return describeEventSubscriptionsResult The response from the
     *         DescribeEventSubscriptions service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists events for a given source identifier and source type. You can also
     * specify a start and end time. For more information on AWS DMS events, see
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
     * >Working with Events and Notifications</a> in the <i>AWS Database
     * Migration User Guide.</i>
     * </p>
     * 
     * @param describeEventsRequest <p/>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by AWS Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the replication instance types that can be
     * created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest <p/>
     * @return describeOrderableReplicationInstancesResult The response from the
     *         DescribeOrderableReplicationInstances service method, as returned
     *         by AWS Database Migration Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For internal use only
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest <p/>
     * @return describePendingMaintenanceActionsResult The response from the
     *         DescribePendingMaintenanceActions service method, as returned by
     *         AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest <p/>
     * @return describeRefreshSchemasStatusResult The response from the
     *         DescribeRefreshSchemasStatus service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(
            DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the task logs for the specified task.
     * </p>
     * 
     * @param describeReplicationInstanceTaskLogsRequest
     * @return describeReplicationInstanceTaskLogsResult The response from the
     *         DescribeReplicationInstanceTaskLogs service method, as returned
     *         by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReplicationInstanceTaskLogsResult describeReplicationInstanceTaskLogs(
            DescribeReplicationInstanceTaskLogsRequest describeReplicationInstanceTaskLogsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about replication instances for your account in the
     * current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest <p/>
     * @return describeReplicationInstancesResult The response from the
     *         DescribeReplicationInstances service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReplicationInstancesResult describeReplicationInstances(
            DescribeReplicationInstancesRequest describeReplicationInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the replication subnet groups.
     * </p>
     * 
     * @param describeReplicationSubnetGroupsRequest <p/>
     * @return describeReplicationSubnetGroupsResult The response from the
     *         DescribeReplicationSubnetGroups service method, as returned by
     *         AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the task assessment results from Amazon S3. This action always
     * returns the latest results.
     * </p>
     * 
     * @param describeReplicationTaskAssessmentResultsRequest <p/>
     * @return describeReplicationTaskAssessmentResultsResult The response from
     *         the DescribeReplicationTaskAssessmentResults service method, as
     *         returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReplicationTaskAssessmentResultsResult describeReplicationTaskAssessmentResults(
            DescribeReplicationTaskAssessmentResultsRequest describeReplicationTaskAssessmentResultsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about replication tasks for your account in the
     * current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest <p/>
     * @return describeReplicationTasksResult The response from the
     *         DescribeReplicationTasks service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeReplicationTasksResult describeReplicationTasks(
            DescribeReplicationTasksRequest describeReplicationTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <p/>
     * 
     * @param describeSchemasRequest <p/>
     * @return describeSchemasResult The response from the DescribeSchemas
     *         service method, as returned by AWS Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeSchemasResult describeSchemas(DescribeSchemasRequest describeSchemasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns table statistics on the database migration task, including table
     * name, rows inserted, rows updated, and rows deleted.
     * </p>
     * <p>
     * Note that the "last updated" column the DMS console only indicates the
     * time that AWS DMS last updated the table statistics record for a table.
     * It does not indicate the time of the last update to the table.
     * </p>
     * 
     * @param describeTableStatisticsRequest <p/>
     * @return describeTableStatisticsResult The response from the
     *         DescribeTableStatistics service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeTableStatisticsResult describeTableStatistics(
            DescribeTableStatisticsRequest describeTableStatisticsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads the specified certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return importCertificateResult The response from the ImportCertificate
     *         service method, as returned by AWS Database Migration Service.
     * @throws ResourceAlreadyExistsException
     * @throws InvalidCertificateException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ImportCertificateResult importCertificate(ImportCertificateRequest importCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all tags for an AWS DMS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest <p/>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the specified endpoint.
     * </p>
     * 
     * @param modifyEndpointRequest <p/>
     * @return modifyEndpointResult The response from the ModifyEndpoint service
     *         method, as returned by AWS Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws KMSKeyNotAccessibleException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyEndpointResult modifyEndpoint(ModifyEndpointRequest modifyEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies an existing AWS DMS event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest <p/>
     * @return modifyEventSubscriptionResult The response from the
     *         ModifyEventSubscription service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceQuotaExceededException
     * @throws ResourceNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws KMSAccessDeniedException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyEventSubscriptionResult modifyEventSubscription(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the replication instance to apply new settings. You can change
     * one or more parameters by specifying these parameters and the new values
     * in the request.
     * </p>
     * <p>
     * Some settings are applied during the maintenance window.
     * </p>
     * <p/>
     * 
     * @param modifyReplicationInstanceRequest <p/>
     * @return modifyReplicationInstanceResult The response from the
     *         ModifyReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws InvalidResourceStateException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InsufficientResourceCapacityException
     * @throws StorageQuotaExceededException
     * @throws UpgradeDependencyFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyReplicationInstanceResult modifyReplicationInstance(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * 
     * @param modifyReplicationSubnetGroupRequest <p/>
     * @return modifyReplicationSubnetGroupResult The response from the
     *         ModifyReplicationSubnetGroup service method, as returned by AWS
     *         Database Migration Service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceQuotaExceededException
     * @throws SubnetAlreadyInUseException
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(
            ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified replication task.
     * </p>
     * <p>
     * You can't modify the task endpoints. The task must be stopped before you
     * can modify it.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html"
     * >Working with Migration Tasks</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @param modifyReplicationTaskRequest <p/>
     * @return modifyReplicationTaskResult The response from the
     *         ModifyReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ModifyReplicationTaskResult modifyReplicationTask(
            ModifyReplicationTaskRequest modifyReplicationTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reboots a replication instance. Rebooting results in a momentary outage,
     * until the replication instance becomes available again.
     * </p>
     * 
     * @param rebootReplicationInstanceRequest
     * @return rebootReplicationInstanceResult The response from the
     *         RebootReplicationInstance service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RebootReplicationInstanceResult rebootReplicationInstance(
            RebootReplicationInstanceRequest rebootReplicationInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous
     * operation and can take several minutes. You can check the status of this
     * operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest <p/>
     * @return refreshSchemasResult The response from the RefreshSchemas service
     *         method, as returned by AWS Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RefreshSchemasResult refreshSchemas(RefreshSchemasRequest refreshSchemasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reloads the target database table with the source data.
     * </p>
     * 
     * @param reloadTablesRequest
     * @return reloadTablesResult The response from the ReloadTables service
     *         method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ReloadTablesResult reloadTables(ReloadTablesRequest reloadTablesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p>
     *            Removes one or more tags from an AWS DMS resource.
     *            </p>
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by AWS
     *         Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html"
     * >Working with Migration Tasks </a> in the <i>AWS Database Migration
     * Service User Guide.</i>
     * </p>
     * 
     * @param startReplicationTaskRequest <p/>
     * @return startReplicationTaskResult The response from the
     *         StartReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartReplicationTaskResult startReplicationTask(
            StartReplicationTaskRequest startReplicationTaskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts the replication task assessment for unsupported data types in the
     * source database.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRequest <p/>
     * @return startReplicationTaskAssessmentResult The response from the
     *         StartReplicationTaskAssessment service method, as returned by AWS
     *         Database Migration Service.
     * @throws InvalidResourceStateException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartReplicationTaskAssessmentResult startReplicationTaskAssessment(
            StartReplicationTaskAssessmentRequest startReplicationTaskAssessmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest <p/>
     * @return stopReplicationTaskResult The response from the
     *         StopReplicationTask service method, as returned by AWS Database
     *         Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StopReplicationTaskResult stopReplicationTask(
            StopReplicationTaskRequest stopReplicationTaskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * 
     * @param testConnectionRequest <p/>
     * @return testConnectionResult The response from the TestConnection service
     *         method, as returned by AWS Database Migration Service.
     * @throws ResourceNotFoundException
     * @throws InvalidResourceStateException
     * @throws KMSKeyNotAccessibleException
     * @throws ResourceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Database Migration Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    TestConnectionResult testConnection(TestConnectionRequest testConnectionRequest)
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
