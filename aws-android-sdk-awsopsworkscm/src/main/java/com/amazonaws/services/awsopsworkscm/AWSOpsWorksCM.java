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

package com.amazonaws.services.awsopsworkscm;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsopsworkscm.model.*;

/**
 * Interface for accessing AWS OpsWorks CM <fullname>AWS OpsWorks CM</fullname>
 * <p>
 * AWS OpsWorks for configuration management (CM) is a service that runs and
 * manages configuration management servers. You can use AWS OpsWorks CM to
 * create and manage AWS OpsWorks for Chef Automate and AWS OpsWorks for Puppet
 * Enterprise servers, and add or remove nodes for the servers to manage.
 * </p>
 * <p>
 * <b>Glossary of terms</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A configuration management server that can be
 * highly-available. The configuration management server runs on an Amazon
 * Elastic Compute Cloud (EC2) instance, and may use various other AWS services,
 * such as Amazon Relational Database Service (RDS) and Elastic Load Balancing.
 * A server is a generic abstraction over the configuration manager that you
 * want to use, much like Amazon RDS. In AWS OpsWorks CM, you do not start or
 * stop servers. After you create servers, they continue to run until they are
 * deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Engine</b>: The engine is the specific configuration manager that you want
 * to use. Valid values in this release include <code>ChefAutomate</code> and
 * <code>Puppet</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Backup</b>: This is an application-level backup of the data that the
 * configuration manager stores. AWS OpsWorks CM creates an S3 bucket for
 * backups when you launch the first server. A backup maintains a snapshot of a
 * server's configuration-related attributes at the time the backup starts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Events</b>: Events are always related to a server. Events are written
 * during server creation, when health checks run, when backups are created,
 * when system maintenance is performed, etc. When you delete a server, the
 * server's events are also deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Account attributes</b>: Every account has attributes that are assigned in
 * the AWS OpsWorks CM database. These attributes store information about
 * configuration limits (servers, backups, etc.) and your customer account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks CM supports the following endpoints, all HTTPS. You must connect
 * to one of the following endpoints. Your servers can only be accessed or
 * managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks-cm.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-east-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-northeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-southeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-southeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-central-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Throttling limits</b>
 * </p>
 * <p>
 * All API operations allow for five requests per second with a burst of 10
 * requests per second.
 * </p>
 **/
public interface AWSOpsWorksCM {

    /**
     * Overrides the default endpoint for this client
     * ("https://opsworks-cm.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "opsworks-cm.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://opsworks-cm.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "opsworks-cm.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://opsworks-cm.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSOpsWorksCM#setEndpoint(String)}, sets the
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
     * Associates a new node with the server. For more information about how to
     * disassociate a node, see <a>DisassociateNode</a>.
     * </p>
     * <p>
     * On a Chef server: This command is an alternative to
     * <code>knife bootstrap</code>.
     * </p>
     * <p>
     * Example (Chef):
     * <code>aws opsworks-cm associate-node --server-name <i>MyServer</i> --node-name <i>MyManagedNode</i> --engine-attributes "Name=<i>CHEF_ORGANIZATION</i>,Value=default" "Name=<i>CHEF_NODE_PUBLIC_KEY</i>,Value=<i>public-key-pem</i>"</code>
     * </p>
     * <p>
     * On a Puppet server, this command is an alternative to the
     * <code>puppet cert sign</code> command that signs a Puppet node CSR.
     * </p>
     * <p>
     * Example (Chef):
     * <code>aws opsworks-cm associate-node --server-name <i>MyServer</i> --node-name <i>MyManagedNode</i> --engine-attributes "Name=<i>PUPPET_NODE_CSR</i>,Value=<i>csr-pem</i>"</code>
     * </p>
     * <p>
     * A node can can only be associated with servers that are in a
     * <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not
     * exist. A <code>ValidationException</code> is raised when parameters of
     * the request are not valid. The AssociateNode API call can be integrated
     * into Auto Scaling configurations, AWS Cloudformation templates, or the
     * user data of a server's instance.
     * </p>
     * 
     * @param associateNodeRequest
     * @return associateNodeResult The response from the AssociateNode service
     *         method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateNodeResult associateNode(AssociateNodeRequest associateNodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an application-level backup of a server. While the server is in
     * the <code>BACKING_UP</code> state, the server cannot be changed, and no
     * additional backup can be created.
     * </p>
     * <p>
     * Backups can be created for servers in <code>RUNNING</code>,
     * <code>HEALTHY</code>, and <code>UNHEALTHY</code> states. By default, you
     * can create a maximum of 50 manual backups.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when the maximum number
     * of manual backups is reached. An <code>InvalidStateException</code> is
     * thrown when the server is not in any of the following states: RUNNING,
     * HEALTHY, or UNHEALTHY. A <code>ResourceNotFoundException</code> is thrown
     * when the server is not found. A <code>ValidationException</code> is
     * thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param createBackupRequest
     * @return createBackupResult The response from the CreateBackup service
     *         method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and immedately starts a new server. The server is ready to use
     * when it is in the <code>HEALTHY</code> state. By default, you can create
     * a maximum of 10 servers.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when you have created the
     * maximum number of servers (10). A
     * <code>ResourceAlreadyExistsException</code> is thrown when a server with
     * the same name already exists in the account. A
     * <code>ResourceNotFoundException</code> is thrown when you specify a
     * backup ID that is not valid or is for a backup that does not exist. A
     * <code>ValidationException</code> is thrown when parameters of the request
     * are not valid.
     * </p>
     * <p>
     * If you do not specify a security group by adding the
     * <code>SecurityGroupIds</code> parameter, AWS OpsWorks creates a new
     * security group.
     * </p>
     * <p>
     * <i>Chef Automate:</i> The default security group opens the Chef server to
     * the world on TCP port 443. If a KeyName is present, AWS OpsWorks enables
     * SSH access. SSH is also open to the world on TCP port 22.
     * </p>
     * <p>
     * <i>Puppet Enterprise:</i> The default security group opens TCP ports 22,
     * 443, 4433, 8140, 8142, 8143, and 8170. If a KeyName is present, AWS
     * OpsWorks enables SSH access. SSH is also open to the world on TCP port
     * 22.
     * </p>
     * <p>
     * By default, your server is accessible from any IP address. We recommend
     * that you update your security group rules to allow access from known IP
     * addresses and address ranges only. To edit security group rules, open
     * Security Groups in the navigation pane of the EC2 management console.
     * </p>
     * <p>
     * To specify your own domain for a server, and provide your own self-signed
     * or CA-signed certificate and private key, specify values for
     * <code>CustomDomain</code>, <code>CustomCertificate</code>, and
     * <code>CustomPrivateKey</code>.
     * </p>
     * 
     * @param createServerRequest
     * @return createServerResult The response from the CreateServer service
     *         method, as returned by AWS OpsWorks CM.
     * @throws LimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a backup. You can delete both manual and automated backups. This
     * operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a backup deletion is
     * already in progress. A <code>ResourceNotFoundException</code> is thrown
     * when the backup does not exist. A <code>ValidationException</code> is
     * thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return deleteBackupResult The response from the DeleteBackup service
     *         method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the server and the underlying AWS CloudFormation stacks
     * (including the server's EC2 instance). When you run this command, the
     * server state is updated to <code>DELETING</code>. After the server is
     * deleted, it is no longer returned by <code>DescribeServer</code>
     * requests. If the AWS CloudFormation stack cannot be deleted, the server
     * cannot be deleted.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a server deletion is
     * already in progress. A <code>ResourceNotFoundException</code> is thrown
     * when the server does not exist. A <code>ValidationException</code> is
     * raised when parameters of the request are not valid.
     * </p>
     * <p>
     * </p>
     * 
     * @param deleteServerRequest
     * @return deleteServerResult The response from the DeleteServer service
     *         method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteServerResult deleteServer(DeleteServerRequest deleteServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your OpsWorks-CM account attributes.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by AWS
     *         OpsWorks CM.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes backups. The results are ordered by time, with newest backups
     * first. If you do not specify a BackupId or ServerName, the command
     * returns all backups.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the backup does
     * not exist. A <code>ValidationException</code> is raised when parameters
     * of the request are not valid.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return describeBackupsResult The response from the DescribeBackups
     *         service method, as returned by AWS OpsWorks CM.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes events for a specified server. Results are ordered by time,
     * with newest events first.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does
     * not exist. A <code>ValidationException</code> is raised when parameters
     * of the request are not valid.
     * </p>
     * 
     * @param describeEventsRequest
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by AWS OpsWorks CM.
     * @throws ValidationException
     * @throws InvalidNextTokenException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the current status of an existing association or disassociation
     * request.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when no recent
     * association or disassociation request with the specified token is found,
     * or when the server does not exist. A <code>ValidationException</code> is
     * raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeNodeAssociationStatusRequest
     * @return describeNodeAssociationStatusResult The response from the
     *         DescribeNodeAssociationStatus service method, as returned by AWS
     *         OpsWorks CM.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeNodeAssociationStatusResult describeNodeAssociationStatus(
            DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all configuration management servers that are identified with your
     * account. Only the stored results from Amazon DynamoDB are returned. AWS
     * OpsWorks CM does not query other services.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does
     * not exist. A <code>ValidationException</code> is raised when parameters
     * of the request are not valid.
     * </p>
     * 
     * @param describeServersRequest
     * @return describeServersResult The response from the DescribeServers
     *         service method, as returned by AWS OpsWorks CM.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeServersResult describeServers(DescribeServersRequest describeServersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a node from an AWS OpsWorks CM server, and removes the node
     * from the server's managed nodes. After a node is disassociated, the node
     * key pair is no longer valid for accessing the configuration manager's
     * API. For more information about how to associate a node, see
     * <a>AssociateNode</a>.
     * </p>
     * <p>
     * A node can can only be disassociated from a server that is in a
     * <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not
     * exist. A <code>ValidationException</code> is raised when parameters of
     * the request are not valid.
     * </p>
     * 
     * @param disassociateNodeRequest
     * @return disassociateNodeResult The response from the DisassociateNode
     *         service method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateNodeResult disassociateNode(DisassociateNodeRequest disassociateNodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports a specified server engine attribute as a base64-encoded string.
     * For example, you can export user data that you can use in EC2 to
     * associate nodes with a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ValidationException</code> is raised when parameters of the
     * request are not valid. A <code>ResourceNotFoundException</code> is thrown
     * when the server does not exist. An <code>InvalidStateException</code> is
     * thrown when the server is in any of the following states: CREATING,
     * TERMINATED, FAILED or DELETING.
     * </p>
     * 
     * @param exportServerEngineAttributeRequest
     * @return exportServerEngineAttributeResult The response from the
     *         ExportServerEngineAttribute service method, as returned by AWS
     *         OpsWorks CM.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ExportServerEngineAttributeResult exportServerEngineAttribute(
            ExportServerEngineAttributeRequest exportServerEngineAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags that are applied to the specified AWS OpsWorks for
     * Chef Automate or AWS OpsWorks for Puppet Enterprise servers or backups.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS OpsWorks
     *         CM.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Restores a backup to a server that is in a <code>CONNECTION_LOST</code>,
     * <code>HEALTHY</code>, <code>RUNNING</code>, <code>UNHEALTHY</code>, or
     * <code>TERMINATED</code> state. When you run RestoreServer, the server's
     * EC2 instance is deleted, and a new EC2 instance is configured.
     * RestoreServer maintains the existing server endpoint, so configuration
     * management of the server's client devices (nodes) should continue to
     * work.
     * </p>
     * <p>
     * Restoring from a backup is performed by creating a new EC2 instance. If
     * restoration is successful, and the server is in a <code>HEALTHY</code>
     * state, AWS OpsWorks CM switches traffic over to the new instance. After
     * restoration is finished, the old EC2 instance is maintained in a
     * <code>Running</code> or <code>Stopped</code> state, but is eventually
     * terminated.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when the server is not in
     * a valid state. A <code>ResourceNotFoundException</code> is thrown when
     * the server does not exist. A <code>ValidationException</code> is raised
     * when parameters of the request are not valid.
     * </p>
     * 
     * @param restoreServerRequest
     * @return restoreServerResult The response from the RestoreServer service
     *         method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RestoreServerResult restoreServer(RestoreServerRequest restoreServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Manually starts server maintenance. This command can be useful if an
     * earlier maintenance attempt failed, and the underlying cause of
     * maintenance failure has been resolved. The server is in an
     * <code>UNDER_MAINTENANCE</code> state while maintenance is in progress.
     * </p>
     * <p>
     * Maintenance can only be started on servers in <code>HEALTHY</code> and
     * <code>UNHEALTHY</code> states. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not
     * exist. A <code>ValidationException</code> is raised when parameters of
     * the request are not valid.
     * </p>
     * 
     * @param startMaintenanceRequest
     * @return startMaintenanceResult The response from the StartMaintenance
     *         service method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartMaintenanceResult startMaintenance(StartMaintenanceRequest startMaintenanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies tags to an AWS OpsWorks for Chef Automate or AWS OpsWorks for
     * Puppet Enterprise server, or to server backups.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS OpsWorks CM.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes specified tags from an AWS OpsWorks-CM server or backup.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS OpsWorks CM.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates settings for a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param updateServerRequest
     * @return updateServerResult The response from the UpdateServer service
     *         method, as returned by AWS OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateServerResult updateServer(UpdateServerRequest updateServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates engine-specific attributes on a specified server. The server
     * enters the <code>MODIFYING</code> state when this operation is in
     * progress. Only one update can occur at a time. You can use this command
     * to reset a Chef server's public key (<code>CHEF_PIVOTAL_KEY</code>) or a
     * Puppet server's admin password (<code>PUPPET_ADMIN_PASSWORD</code>).
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * This operation can only be called for servers in <code>HEALTHY</code> or
     * <code>UNHEALTHY</code> states. Otherwise, an
     * <code>InvalidStateException</code> is raised. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not
     * exist. A <code>ValidationException</code> is raised when parameters of
     * the request are not valid.
     * </p>
     * 
     * @param updateServerEngineAttributesRequest
     * @return updateServerEngineAttributesResult The response from the
     *         UpdateServerEngineAttributes service method, as returned by AWS
     *         OpsWorks CM.
     * @throws InvalidStateException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             OpsWorks CM indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateServerEngineAttributesResult updateServerEngineAttributes(
            UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest)
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
