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

package com.amazonaws.services.amazonelasticfilesystem;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonelasticfilesystem.model.*;

/**
 * Interface for accessing Amazon Elastic File System <fullname>Amazon Elastic
 * File System</fullname>
 * <p>
 * Amazon Elastic File System (Amazon EFS) provides simple, scalable file
 * storage for use with Amazon EC2 instances in the AWS Cloud. With Amazon EFS,
 * storage capacity is elastic, growing and shrinking automatically as you add
 * and remove files, so your applications have the storage they need, when they
 * need it. For more information, see the <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/api-reference.html">User
 * Guide</a>.
 * </p>
 **/
public interface AmazonElasticFileSystem {

    /**
     * Overrides the default endpoint for this client
     * ("https://elasticfilesystem.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "elasticfilesystem.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://elasticfilesystem.us-east-1.amazonaws.com"). If
     * the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is
     * HTTPS.
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
     * @param endpoint The endpoint (ex:
     *            "elasticfilesystem.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://elasticfilesystem.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticFileSystem#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
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
     * Creates an EFS access point. An access point is an application-specific
     * view into an EFS file system that applies an operating system user and
     * group, and a file system path, to any file system request made through
     * the access point. The operating system user and group override any
     * identity information provided by the NFS client. The file system path is
     * exposed as the access point's root directory. Applications using the
     * access point can only access data in its own directory and below. To
     * learn more, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html"
     * >Mounting a File System Using EFS Access Points</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:CreateAccessPoint</code> action.
     * </p>
     * 
     * @param createAccessPointRequest
     * @return createAccessPointResult The response from the CreateAccessPoint
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws AccessPointAlreadyExistsException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAccessPointResult createAccessPoint(CreateAccessPointRequest createAccessPointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token
     * in the request that Amazon EFS uses to ensure idempotent creation
     * (calling the operation with same creation token has no effect). If a file
     * system does not currently exist that is owned by the caller's AWS account
     * with the specified creation token, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty file system. The file system will have an Amazon EFS
     * assigned ID, and an initial lifecycle state <code>creating</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns with the description of the created file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code>
     * error with the ID of the existing file system.
     * </p>
     * <note>
     * <p>
     * For basic use cases, you can use a randomly generated UUID for the
     * creation token.
     * </p>
     * </note>
     * <p>
     * The idempotent operation allows you to retry a
     * <code>CreateFileSystem</code> call without risk of creating an extra file
     * system. This can happen when an initial call fails in a way that leaves
     * it uncertain whether or not a file system was actually created. An
     * example might be that a transport level timeout occurred or your
     * connection was reset. As long as you use the same creation token, if the
     * initial call had succeeded in creating a file system, the client can
     * learn of its existence from the <code>FileSystemAlreadyExists</code>
     * error.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's
     * lifecycle state is still <code>creating</code>. You can check the file
     * system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which among other things returns the file system state.
     * </p>
     * </note>
     * <p>
     * This operation also takes an optional <code>PerformanceMode</code>
     * parameter that you choose for your file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html"
     * >Amazon EFS: Performance Modes</a>.
     * </p>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle
     * state to <code>available</code>, at which point you can create one or
     * more mount targets for the file system in your VPC. For more information,
     * see <a>CreateMountTarget</a>. You mount your Amazon EFS file system on an
     * EC2 instances in your VPC by using the mount target. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * 
     * @param createFileSystemRequest
     * @return createFileSystemResult The response from the CreateFileSystem
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemAlreadyExistsException
     * @throws FileSystemLimitExceededException
     * @throws InsufficientThroughputCapacityException
     * @throws ThroughputLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateFileSystemResult createFileSystem(CreateFileSystemRequest createFileSystemRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file
     * system on EC2 instances by using the mount target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC.
     * All EC2 instances in a VPC within a given Availability Zone share a
     * single mount target for a given file system. If you have multiple subnets
     * in an Availability Zone, you create a mount target in one of the subnets.
     * EC2 instances do not need to be in the same subnet as the mount target in
     * order to access their file system. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>.
     * </p>
     * <p>
     * In the request, you also specify a file system ID for which you are
     * creating the mount target and the file system's lifecycle state must be
     * <code>available</code>. For more information, see
     * <a>DescribeFileSystems</a>.
     * </p>
     * <p>
     * In the request, you also provide a subnet ID, which determines the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VPC in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * Availability Zone in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address range from which Amazon EFS selects the IP address of the
     * mount target (if you don't specify an IP address in the request)
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that
     * includes, a <code>MountTargetId</code> and an <code>IpAddress</code>. You
     * use this IP address when mounting the file system in an EC2 instance. You
     * can also use the mount target's DNS name when mounting the file system.
     * The EC2 instance on which you mount the file system by using the mount
     * target can resolve the mount target's DNS name to its IP address. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"
     * >How it Works: Implementation Overview</a>.
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC,
     * and there can be only one mount target per Availability Zone. That is, if
     * the file system already has one or more mount targets created for it, the
     * subnet specified in the request to add another mount target must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must belong to the same VPC as the subnets of the existing mount targets
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be in the same Availability Zone as any of the subnets of the
     * existing mount targets
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new mount target in the specified subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Also creates a new network interface in the subnet as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request provides an <code>IpAddress</code>, Amazon EFS assigns
     * that IP address to the network interface. Otherwise, Amazon EFS assigns a
     * free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not
     * specify a primary private IP address).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request provides <code>SecurityGroups</code>, this network
     * interface is associated with those security groups. Otherwise, it belongs
     * to the default security group for the subnet's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Assigns the description
     * <code>Mount target <i>fsmt-id</i> for file system <i>fs-id</i> </code>
     * where <code> <i>fsmt-id</i> </code> is the mount target ID, and
     * <code> <i>fs-id</i> </code> is the <code>FileSystemId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the <code>requesterManaged</code> property of the network interface
     * to <code>true</code>, and the <code>requesterId</code> value to
     * <code>EFS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requester-managed EC2
     * network interface. After the network interface is created, Amazon EFS
     * sets the <code>NetworkInterfaceId</code> field in the mount target's
     * description to the network interface ID, and the <code>IpAddress</code>
     * field to its address. If network interface creation fails, the entire
     * <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateMountTarget</code> call returns only after creating the
     * network interface, but while the mount target state is still
     * <code>creating</code>, you can check the mount target creation status by
     * calling the <a>DescribeMountTargets</a> operation, which among other
     * things returns the mount target state.
     * </p>
     * </note>
     * <p>
     * We recommend that you create a mount target in each of the Availability
     * Zones. There are cost considerations for using a file system in an
     * Availability Zone through a mount target created in another Availability
     * Zone. For more information, see <a
     * href="http://aws.amazon.com/efs/">Amazon EFS</a>. In addition, by always
     * using a mount target local to the instance's Availability Zone, you
     * eliminate a partial failure scenario. If the Availability Zone in which
     * your mount target is created goes down, then you can't access your file
     * system through that mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:CreateMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation also requires permissions for the following Amazon EC2
     * actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMountTargetRequest <p/>
     * @return createMountTargetResult The response from the CreateMountTarget
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws MountTargetConflictException
     * @throws SubnetNotFoundException
     * @throws NoFreeAddressesInSubnetException
     * @throws IpAddressInUseException
     * @throws NetworkInterfaceLimitExceededException
     * @throws SecurityGroupLimitExceededException
     * @throws SecurityGroupNotFoundException
     * @throws UnsupportedAvailabilityZoneException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateMountTargetResult createMountTarget(CreateMountTargetRequest createMountTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a
     * key-value pair. If a tag key specified in the request already exists on
     * the file system, this operation overwrites its value with the value
     * provided in the request. If you add the <code>Name</code> tag to your
     * file system, Amazon EFS returns it in the response to the
     * <a>DescribeFileSystems</a> operation.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    void createTags(CreateTagsRequest createTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified access point. After deletion is complete, new
     * clients can no longer connect to the access points. Clients connected to
     * the access point at the time of deletion will continue to function until
     * they terminate their connection.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteAccessPoint</code> action.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAccessPoint(DeleteAccessPointRequest deleteAccessPointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents. Upon
     * return, the file system no longer exists and you can't access any
     * contents of the deleted file system.
     * </p>
     * <p>
     * You can't delete a file system that is in use. That is, if the file
     * system has any mount targets, you must first delete them. For more
     * information, see <a>DescribeMountTargets</a> and
     * <a>DeleteMountTarget</a>.
     * </p>
     * <note>
     * <p>
     * The <code>DeleteFileSystem</code> call returns while the file system
     * state is still <code>deleting</code>. You can check the file system
     * deletion status by calling the <a>DescribeFileSystems</a> operation,
     * which returns a list of file systems in your account. If you pass file
     * system ID or creation token for the deleted file system, the
     * <a>DescribeFileSystems</a> returns a <code>404 FileSystemNotFound</code>
     * error.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws FileSystemInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the <code>FileSystemPolicy</code> for the specified file system.
     * The default <code>FileSystemPolicy</code> goes into effect once the
     * existing policy is deleted. For more information about the default file
     * system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/res-based-policies-efs.html"
     * >Using Resource-based Policies with EFS</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteFileSystemPolicy</code> action.
     * </p>
     * 
     * @param deleteFileSystemPolicyRequest
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteFileSystemPolicy(DeleteFileSystemPolicyRequest deleteFileSystemPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system by using the
     * mount target that is being deleted, which might disrupt instances or
     * applications using those mounts. To avoid applications getting cut off
     * abruptly, you might consider unmounting any mounts of the mount target,
     * if feasible. The operation also deletes the associated network interface.
     * Uncommitted writes might be lost, but breaking a mount target using this
     * operation does not corrupt the file system itself. The file system you
     * created remains. You can mount an EC2 instance in your VPC by using
     * another mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DeleteMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DeleteMountTarget</code> call returns while the mount target
     * state is still <code>deleting</code>. You can check the mount target
     * deletion by calling the <a>DescribeMountTargets</a> operation, which
     * returns a list of mount target descriptions for the given file system.
     * </p>
     * </note>
     * <p>
     * The operation also requires permissions for the following Amazon EC2
     * action on the mount target's network interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMountTargetRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws DependencyTimeoutException
     * @throws MountTargetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteMountTarget(DeleteMountTargetRequest deleteMountTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified tags from a file system. If the
     * <code>DeleteTags</code> request includes a tag key that doesn't exist,
     * Amazon EFS ignores it and doesn't cause an error. For more information
     * about tags and related restrictions, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Tag Restrictions</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    void deleteTags(DeleteTagsRequest deleteTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the description of a specific Amazon EFS access point if the
     * <code>AccessPointId</code> is provided. If you provide an EFS
     * <code>FileSystemId</code>, it returns descriptions of all access points
     * for that file system. You can provide either an
     * <code>AccessPointId</code> or a <code>FileSystemId</code> in the request,
     * but not both.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param describeAccessPointsRequest
     * @return describeAccessPointsResult The response from the
     *         DescribeAccessPoints service method, as returned by Amazon
     *         Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAccessPointsResult describeAccessPoints(
            DescribeAccessPointsRequest describeAccessPointsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the <code>FileSystemPolicy</code> for the specified EFS file
     * system.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeFileSystemPolicy</code> action.
     * </p>
     * 
     * @param describeFileSystemPolicyRequest
     * @return describeFileSystemPolicyResult The response from the
     *         DescribeFileSystemPolicy service method, as returned by Amazon
     *         Elastic File System.
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws PolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeFileSystemPolicyResult describeFileSystemPolicy(
            DescribeFileSystemPolicyRequest describeFileSystemPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either
     * the file system <code>CreationToken</code> or the
     * <code>FileSystemId</code> is provided. Otherwise, it returns descriptions
     * of all file systems owned by the caller's AWS account in the AWS Region
     * of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify
     * the <code>MaxItems</code> parameter to limit the number of descriptions
     * in a response. Currently, this number is automatically set to 10. If more
     * file system descriptions remain, Amazon EFS returns a
     * <code>NextMarker</code>, an opaque token, in the response. In this case,
     * you should send a subsequent request with the <code>Marker</code> request
     * parameter set to the value of <code>NextMarker</code>.
     * </p>
     * <p>
     * To retrieve a list of your file system descriptions, this operation is
     * used in an iterative process, where <code>DescribeFileSystems</code> is
     * called first without the <code>Marker</code> and then the operation
     * continues to call it with the <code>Marker</code> parameter set to the
     * value of the <code>NextMarker</code> from the previous response until the
     * response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call and the order of file systems
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest <p/>
     * @return describeFileSystemsResult The response from the
     *         DescribeFileSystems service method, as returned by Amazon Elastic
     *         File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeFileSystemsResult describeFileSystems(
            DescribeFileSystemsRequest describeFileSystemsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the current <code>LifecycleConfiguration</code> object for the
     * specified Amazon EFS file system. EFS lifecycle management uses the
     * <code>LifecycleConfiguration</code> object to identify which files to
     * move to the EFS Infrequent Access (IA) storage class. For a file system
     * without a <code>LifecycleConfiguration</code> object, the call returns an
     * empty array in the response.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeLifecycleConfiguration</code> operation.
     * </p>
     * 
     * @param describeLifecycleConfigurationRequest
     * @return describeLifecycleConfigurationResult The response from the
     *         DescribeLifecycleConfiguration service method, as returned by
     *         Amazon Elastic File System.
     * @throws InternalServerErrorException
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeLifecycleConfigurationResult describeLifecycleConfiguration(
            DescribeLifecycleConfigurationRequest describeLifecycleConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This
     * operation requires that the network interface of the mount target has
     * been created and the lifecycle state of the mount target is not
     * <code>deleted</code>.
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code> action
     * on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the mount
     * target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest <p/>
     * @return describeMountTargetSecurityGroupsResult The response from the
     *         DescribeMountTargetSecurityGroups service method, as returned by
     *         Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws MountTargetNotFoundException
     * @throws IncorrectMountTargetStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the descriptions of all the current mount targets, or a specific
     * mount target, for a file system. When requesting all of the current mount
     * targets, the order of mount targets returned in the response is
     * unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeMountTargets</code> action, on either the
     * file system ID that you specify in <code>FileSystemId</code>, or on the
     * file system of the mount target that you specify in
     * <code>MountTargetId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest <p/>
     * @return describeMountTargetsResult The response from the
     *         DescribeMountTargets service method, as returned by Amazon
     *         Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws MountTargetNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeMountTargetsResult describeMountTargets(
            DescribeMountTargetsRequest describeMountTargetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the tags associated with a file system. The order of tags
     * returned in the response of one <code>DescribeTags</code> call and the
     * order of tags returned across the responses of a multiple-call iteration
     * (when using pagination) is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest <p/>
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all tags for a top-level EFS resource. You must provide the ID of
     * the resource that you want to retrieve the tags for.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Elastic
     *         File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network
     * interface. For more information, see <a>CreateMountTarget</a>. This
     * operation replaces the security groups in effect for the network
     * interface associated with a mount target, with the
     * <code>SecurityGroups</code> provided in the request. This operation
     * requires that the network interface of the mount target has been created
     * and the lifecycle state of the mount target is not <code>deleted</code>.
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action on
     * the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount
     * target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws MountTargetNotFoundException
     * @throws IncorrectMountTargetStateException
     * @throws SecurityGroupLimitExceededException
     * @throws SecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void modifyMountTargetSecurityGroups(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies an Amazon EFS <code>FileSystemPolicy</code> to an Amazon EFS file
     * system. A file system policy is an IAM resource-based policy and can
     * contain multiple policy statements. A file system always has exactly one
     * file system policy, which can be the default policy or an explicit policy
     * set or updated using this API operation. When an explicit policy is set,
     * it overrides the default policy. For more information about the default
     * file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html#default-filesystempolicy"
     * >Default EFS File System Policy</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:PutFileSystemPolicy</code> action.
     * </p>
     * 
     * @param putFileSystemPolicyRequest
     * @return putFileSystemPolicyResult The response from the
     *         PutFileSystemPolicy service method, as returned by Amazon Elastic
     *         File System.
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws InvalidPolicyException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutFileSystemPolicyResult putFileSystemPolicy(
            PutFileSystemPolicyRequest putFileSystemPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Enables lifecycle management by creating a new
     * <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object defines when files in an
     * Amazon EFS file system are automatically transitioned to the lower-cost
     * EFS Infrequent Access (IA) storage class. A
     * <code>LifecycleConfiguration</code> applies to all files in a file
     * system.
     * </p>
     * <p>
     * Each Amazon EFS file system supports one lifecycle configuration, which
     * applies to all files in the file system. If a
     * <code>LifecycleConfiguration</code> object already exists for the
     * specified file system, a <code>PutLifecycleConfiguration</code> call
     * modifies the existing configuration. A
     * <code>PutLifecycleConfiguration</code> call with an empty
     * <code>LifecyclePolicies</code> array in the request body deletes any
     * existing <code>LifecycleConfiguration</code> and disables lifecycle
     * management.
     * </p>
     * <p>
     * In the request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID for the file system for which you are enabling, disabling, or
     * modifying lifecycle management.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>LifecyclePolicies</code> array of <code>LifecyclePolicy</code>
     * objects that define when files are moved to the IA storage class. The
     * array can contain only one <code>LifecyclePolicy</code> item.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:PutLifecycleConfiguration</code> operation.
     * </p>
     * <p>
     * To apply a <code>LifecycleConfiguration</code> object to an encrypted
     * file system, you need the same AWS Key Management Service (AWS KMS)
     * permissions as when you created the encrypted file system.
     * </p>
     * 
     * @param putLifecycleConfigurationRequest
     * @return putLifecycleConfigurationResult The response from the
     *         PutLifecycleConfiguration service method, as returned by Amazon
     *         Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutLifecycleConfigurationResult putLifecycleConfiguration(
            PutLifecycleConfigurationRequest putLifecycleConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a tag for an EFS resource. You can create tags for EFS file
     * systems and access points using this API operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes tags from an EFS resource. You can remove tags from EFS file
     * systems and access points using this API operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the throughput mode or the amount of provisioned throughput of an
     * existing file system.
     * </p>
     * 
     * @param updateFileSystemRequest
     * @return updateFileSystemResult The response from the UpdateFileSystem
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws InsufficientThroughputCapacityException
     * @throws InternalServerErrorException
     * @throws ThroughputLimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
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
