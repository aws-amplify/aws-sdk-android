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

package com.amazonaws.services.lightsail;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.lightsail.model.*;

/**
 * Interface for accessing Amazon Lightsail
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers
 * who just need virtual private servers. Lightsail includes everything you need
 * to launch your project quickly - a virtual machine, a managed database,
 * SSD-based storage, data transfer, DNS management, and a static IP - for a
 * low, predictable price. You manage those Lightsail servers through the
 * Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="https://lightsail.aws.amazon.com/ls/docs/all">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and
 * Access Management (IAM) to generate access keys. For details about how to set
 * this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/article/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 **/
public interface AmazonLightsail {

    /**
     * Overrides the default endpoint for this client
     * ("https://lightsail.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "lightsail.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://lightsail.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "lightsail.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://lightsail.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonLightsail#setEndpoint(String)}, sets the
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
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return allocateStaticIpResult The response from the AllocateStaticIp
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest allocateStaticIpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches a block storage disk to a running or stopped Lightsail instance
     * and exposes it to the instance with the specified disk name.
     * </p>
     * <p>
     * The <code>attach disk</code> operation supports tag-based access control
     * via resource tags applied to the resource identified by
     * <code>disk name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachDiskRequest
     * @return attachDiskResult The response from the AttachDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AttachDiskResult attachDisk(AttachDiskRequest attachDiskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attaches one or more Lightsail instances to a load balancer.
     * </p>
     * <p>
     * After some time, the instances are attached to the load balancer and the
     * health check status is available.
     * </p>
     * <p>
     * The <code>attach instances to load balancer</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachInstancesToLoadBalancerRequest
     * @return attachInstancesToLoadBalancerResult The response from the
     *         AttachInstancesToLoadBalancer service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AttachInstancesToLoadBalancerResult attachInstancesToLoadBalancer(
            AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches a Transport Layer Security (TLS) certificate to your load
     * balancer. TLS is just an updated, more secure version of Secure Socket
     * Layer (SSL).
     * </p>
     * <p>
     * Once you create and validate your certificate, you can attach it to your
     * load balancer. You can also use this API to rotate the certificates on
     * your account. Use the <code>AttachLoadBalancerTlsCertificate</code>
     * action with the non-attached certificate, and it will replace the
     * existing one and become the attached certificate.
     * </p>
     * <p>
     * The <code>AttachLoadBalancerTlsCertificate</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachLoadBalancerTlsCertificateRequest
     * @return attachLoadBalancerTlsCertificateResult The response from the
     *         AttachLoadBalancerTlsCertificate service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AttachLoadBalancerTlsCertificateResult attachLoadBalancerTlsCertificate(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return attachStaticIpResult The response from the AttachStaticIp service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AttachStaticIpResult attachStaticIp(AttachStaticIpRequest attachStaticIpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Closes ports for a specific Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>CloseInstancePublicPorts</code> action supports tag-based
     * access control via resource tags applied to the resource identified by
     * <code>instanceName</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return closeInstancePublicPortsResult The response from the
     *         CloseInstancePublicPorts service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CloseInstancePublicPortsResult closeInstancePublicPorts(
            CloseInstancePublicPortsRequest closeInstancePublicPortsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies a manual snapshot of an instance or disk as another manual
     * snapshot, or copies an automatic snapshot of an instance or disk as a
     * manual snapshot. This operation can also be used to copy a manual or
     * automatic snapshot of an instance or a disk from one AWS Region to
     * another in Amazon Lightsail.
     * </p>
     * <p>
     * When copying a <i>manual snapshot</i>, be sure to define the
     * <code>source region</code>, <code>source snapshot name</code>, and
     * <code>target snapshot name</code> parameters.
     * </p>
     * <p>
     * When copying an <i>automatic snapshot</i>, be sure to define the
     * <code>source region</code>, <code>source resource name</code>,
     * <code>target snapshot name</code>, and either the
     * <code>restore date</code> or the
     * <code>use latest restorable auto snapshot</code> parameters.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return copySnapshotResult The response from the CopySnapshot service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an AWS CloudFormation stack, which creates a new Amazon EC2
     * instance from an exported Amazon Lightsail snapshot. This operation
     * results in a CloudFormation stack record that can be used to track the
     * AWS CloudFormation stack created. Use the
     * <code>get cloud formation stack records</code> operation to get a list of
     * the CloudFormation stacks created.
     * </p>
     * <important>
     * <p>
     * Wait until after your new Amazon EC2 instance is created before running
     * the <code>create cloud formation stack</code> operation again with the
     * same export snapshot record.
     * </p>
     * </important>
     * 
     * @param createCloudFormationStackRequest
     * @return createCloudFormationStackResult The response from the
     *         CreateCloudFormationStack service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCloudFormationStackResult createCloudFormationStack(
            CreateCloudFormationStackRequest createCloudFormationStackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an email or SMS text message contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * 
     * @param createContactMethodRequest
     * @return createContactMethodResult The response from the
     *         CreateContactMethod service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateContactMethodResult createContactMethod(
            CreateContactMethodRequest createContactMethodRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a block storage disk that can be attached to an Amazon Lightsail
     * instance in the same Availability Zone (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk</code> operation supports tag-based access control
     * via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskRequest
     * @return createDiskResult The response from the CreateDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDiskResult createDisk(CreateDiskRequest createDiskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a block storage disk from a manual or automatic snapshot of a
     * disk. The resulting disk can be attached to an Amazon Lightsail instance
     * in the same Availability Zone (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk from snapshot</code> operation supports tag-based
     * access control via request tags and resource tags applied to the resource
     * identified by <code>disk snapshot name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskFromSnapshotRequest
     * @return createDiskFromSnapshotResult The response from the
     *         CreateDiskFromSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDiskFromSnapshotResult createDiskFromSnapshot(
            CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a snapshot of a block storage disk. You can use snapshots for
     * backups, to make copies of disks, and to save data before shutting down a
     * Lightsail instance.
     * </p>
     * <p>
     * You can take a snapshot of an attached disk that is in use; however,
     * snapshots only capture data that has been written to your disk at the
     * time the snapshot command is issued. This may exclude any data that has
     * been cached by any applications or the operating system. If you can pause
     * any file systems on the disk long enough to take a snapshot, your
     * snapshot should be complete. Nevertheless, if you cannot pause all file
     * writes to the disk, you should unmount the disk from within the Lightsail
     * instance, issue the create disk snapshot command, and then remount the
     * disk to ensure a consistent and complete snapshot. You may remount and
     * use your disk while the snapshot status is pending.
     * </p>
     * <p>
     * You can also use this operation to create a snapshot of an instance's
     * system volume. You might want to do this, for example, to recover data
     * from the system volume of a botched instance or to create a backup of the
     * system volume like you would for a block storage disk. To create a
     * snapshot of a system volume, just define the <code>instance name</code>
     * parameter when issuing the snapshot command, and a snapshot of the
     * defined instance's system volume will be created. After the snapshot is
     * available, you can create a block storage disk from the snapshot and
     * attach it to a running instance to access the data on the disk.
     * </p>
     * <p>
     * The <code>create disk snapshot</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskSnapshotRequest
     * @return createDiskSnapshotResult The response from the CreateDiskSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDiskSnapshotResult createDiskSnapshot(CreateDiskSnapshotRequest createDiskSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * <p>
     * The <code>create domain</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return createDomainResult The response from the CreateDomain service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates one of the following entry records associated with the domain:
     * Address (A), canonical name (CNAME), mail exchanger (MX), name server
     * (NS), start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The <code>create domain entry</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return createDomainEntryResult The response from the CreateDomainEntry
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest createDomainEntryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or
     * <i>instance</i>. You can use a snapshot to create a new instance that is
     * based on that snapshot.
     * </p>
     * <p>
     * The <code>create instance snapshot</code> operation supports tag-based
     * access control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return createInstanceSnapshotResult The response from the
     *         CreateInstanceSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateInstanceSnapshotResult createInstanceSnapshot(
            CreateInstanceSnapshotRequest createInstanceSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates one or more Amazon Lightsail instances.
     * </p>
     * <p>
     * The <code>create instances</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return createInstancesResult The response from the CreateInstances
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateInstancesResult createInstances(CreateInstancesRequest createInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates one or more new instances from a manual or automatic snapshot of
     * an instance.
     * </p>
     * <p>
     * The <code>create instances from snapshot</code> operation supports
     * tag-based access control via request tags and resource tags applied to
     * the resource identified by <code>instance snapshot name</code>. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return createInstancesFromSnapshotResult The response from the
     *         CreateInstancesFromSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateInstancesFromSnapshotResult createInstancesFromSnapshot(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an SSH key pair.
     * </p>
     * <p>
     * The <code>create key pair</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return createKeyPairResult The response from the CreateKeyPair service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Lightsail load balancer. To learn more about deciding whether
     * to load balance your application, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/how-to/article/configure-lightsail-instances-for-load-balancing"
     * >Configure your Lightsail instances for load balancing</a>. You can
     * create up to 5 load balancers per AWS Region in your account.
     * </p>
     * <p>
     * When you create a load balancer, you can specify a unique name and port
     * settings. To change additional load balancer settings, use the
     * <code>UpdateLoadBalancerAttribute</code> operation.
     * </p>
     * <p>
     * The <code>create load balancer</code> operation supports tag-based access
     * control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return createLoadBalancerResult The response from the CreateLoadBalancer
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Lightsail load balancer TLS certificate.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * The <code>CreateLoadBalancerTlsCertificate</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerTlsCertificateRequest
     * @return createLoadBalancerTlsCertificateResult The response from the
     *         CreateLoadBalancerTlsCertificate service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateLoadBalancerTlsCertificateResult createLoadBalancerTlsCertificate(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>create relational database</code> operation supports tag-based
     * access control via request tags. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseRequest
     * @return createRelationalDatabaseResult The response from the
     *         CreateRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRelationalDatabaseResult createRelationalDatabase(
            CreateRelationalDatabaseRequest createRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new database from an existing database snapshot in Amazon
     * Lightsail.
     * </p>
     * <p>
     * You can create a new database from a snapshot in if something goes wrong
     * with your original database, or to change it to a different plan, such as
     * a high availability or standard plan.
     * </p>
     * <p>
     * The <code>create relational database from snapshot</code> operation
     * supports tag-based access control via request tags and resource tags
     * applied to the resource identified by relationalDatabaseSnapshotName. For
     * more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseFromSnapshotRequest
     * @return createRelationalDatabaseFromSnapshotResult The response from the
     *         CreateRelationalDatabaseFromSnapshot service method, as returned
     *         by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a snapshot of your database in Amazon Lightsail. You can use
     * snapshots for backups, to make copies of a database, and to save data
     * before deleting a database.
     * </p>
     * <p>
     * The <code>create relational database snapshot</code> operation supports
     * tag-based access control via request tags. For more information, see the
     * <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseSnapshotRequest
     * @return createRelationalDatabaseSnapshotResult The response from the
     *         CreateRelationalDatabaseSnapshot service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRelationalDatabaseSnapshotResult createRelationalDatabaseSnapshot(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteAlarmRequest
     * @return deleteAlarmResult The response from the DeleteAlarm service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAlarmResult deleteAlarm(DeleteAlarmRequest deleteAlarmRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an automatic snapshot of an instance or disk. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteAutoSnapshotRequest
     * @return deleteAutoSnapshotResult The response from the DeleteAutoSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAutoSnapshotResult deleteAutoSnapshot(DeleteAutoSnapshotRequest deleteAutoSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteContactMethodRequest
     * @return deleteContactMethodResult The response from the
     *         DeleteContactMethod service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteContactMethodResult deleteContactMethod(
            DeleteContactMethodRequest deleteContactMethodRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified block storage disk. The disk must be in the
     * <code>available</code> state (not attached to a Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several
     * minutes.
     * </p>
     * </note>
     * <p>
     * The <code>delete disk</code> operation supports tag-based access control
     * via resource tags applied to the resource identified by
     * <code>disk name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskRequest
     * @return deleteDiskResult The response from the DeleteDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDiskResult deleteDisk(DeleteDiskRequest deleteDiskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified disk snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a disk, the snapshots are
     * incremental, and only the blocks on the device that have changed since
     * your last snapshot are saved in the new snapshot. When you delete a
     * snapshot, only the data not needed for any other snapshot is removed. So
     * regardless of which prior snapshots have been deleted, all active
     * snapshots will have access to all the information needed to restore the
     * disk.
     * </p>
     * <p>
     * The <code>delete disk snapshot</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>disk snapshot name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskSnapshotRequest
     * @return deleteDiskSnapshotResult The response from the DeleteDiskSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDiskSnapshotResult deleteDiskSnapshot(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * <p>
     * The <code>delete domain</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return deleteDomainResult The response from the DeleteDomain service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * <p>
     * The <code>delete domain entry</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return deleteDomainEntryResult The response from the DeleteDomainEntry
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest deleteDomainEntryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>delete instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return deleteInstanceResult The response from the DeleteInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or
     * <i>instance</i>).
     * </p>
     * <p>
     * The <code>delete instance snapshot</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * <code>instance snapshot name</code>. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return deleteInstanceSnapshotResult The response from the
     *         DeleteInstanceSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInstanceSnapshotResult deleteInstanceSnapshot(
            DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * <p>
     * The <code>delete key pair</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>key pair name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return deleteKeyPairResult The response from the DeleteKeyPair service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the known host key or certificate used by the Amazon Lightsail
     * browser-based SSH or RDP clients to authenticate an instance. This
     * operation enables the Lightsail browser-based SSH or RDP clients to
     * connect to the instance after a host key mismatch.
     * </p>
     * <important>
     * <p>
     * Perform this operation only if you were expecting the host key or
     * certificate mismatch or if you are familiar with the new host key or
     * certificate on the instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-troubleshooting-browser-based-ssh-rdp-client-connection"
     * >Troubleshooting connection issues when using the Amazon Lightsail
     * browser-based SSH or RDP client</a>.
     * </p>
     * </important>
     * 
     * @param deleteKnownHostKeysRequest
     * @return deleteKnownHostKeysResult The response from the
     *         DeleteKnownHostKeys service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteKnownHostKeysResult deleteKnownHostKeys(
            DeleteKnownHostKeysRequest deleteKnownHostKeysRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a Lightsail load balancer and all its associated SSL/TLS
     * certificates. Once the load balancer is deleted, you will need to create
     * a new load balancer, create a new certificate, and verify domain
     * ownership again.
     * </p>
     * <p>
     * The <code>delete load balancer</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>load balancer name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return deleteLoadBalancerResult The response from the DeleteLoadBalancer
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
     * </p>
     * <p>
     * The <code>DeleteLoadBalancerTlsCertificate</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerTlsCertificateRequest
     * @return deleteLoadBalancerTlsCertificateResult The response from the
     *         DeleteLoadBalancerTlsCertificate service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteLoadBalancerTlsCertificateResult deleteLoadBalancerTlsCertificate(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseRequest
     * @return deleteRelationalDatabaseResult The response from the
     *         DeleteRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRelationalDatabaseResult deleteRelationalDatabase(
            DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database snapshot</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by relationalDatabaseName. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseSnapshotRequest
     * @return deleteRelationalDatabaseSnapshotResult The response from the
     *         DeleteRelationalDatabaseSnapshot service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRelationalDatabaseSnapshotResult deleteRelationalDatabaseSnapshot(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches a stopped block storage disk from a Lightsail instance. Make
     * sure to unmount any file systems on the device within your operating
     * system before stopping the instance and detaching the disk.
     * </p>
     * <p>
     * The <code>detach disk</code> operation supports tag-based access control
     * via resource tags applied to the resource identified by
     * <code>disk name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachDiskRequest
     * @return detachDiskResult The response from the DetachDisk service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DetachDiskResult detachDisk(DetachDiskRequest detachDiskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Detaches the specified instances from a Lightsail load balancer.
     * </p>
     * <p>
     * This operation waits until the instances are no longer needed before they
     * are detached from the load balancer.
     * </p>
     * <p>
     * The <code>detach instances from load balancer</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachInstancesFromLoadBalancerRequest
     * @return detachInstancesFromLoadBalancerResult The response from the
     *         DetachInstancesFromLoadBalancer service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DetachInstancesFromLoadBalancerResult detachInstancesFromLoadBalancer(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is
     * attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return detachStaticIpResult The response from the DetachStaticIp service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DetachStaticIpResult detachStaticIp(DetachStaticIpRequest detachStaticIpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables an add-on for an Amazon Lightsail resource. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param disableAddOnRequest
     * @return disableAddOnResult The response from the DisableAddOn service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableAddOnResult disableAddOn(DisableAddOnRequest disableAddOnRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return downloadDefaultKeyPairResult The response from the
     *         DownloadDefaultKeyPair service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DownloadDefaultKeyPairResult downloadDefaultKeyPair(
            DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or modifies an add-on for an Amazon Lightsail resource. For more
     * information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param enableAddOnRequest
     * @return enableAddOnResult The response from the EnableAddOn service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableAddOnResult enableAddOn(EnableAddOnRequest enableAddOnRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports an Amazon Lightsail instance or block storage disk snapshot to
     * Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an
     * export snapshot record that can be used with the
     * <code>create cloud formation stack</code> operation to create new Amazon
     * EC2 instances.
     * </p>
     * <p>
     * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images
     * (AMIs), and the instance system disk appears as an Amazon Elastic Block
     * Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2
     * as Amazon EBS volumes. Snapshots are exported to the same Amazon Web
     * Services Region in Amazon EC2 as the source Lightsail snapshot.
     * </p>
     * <p/>
     * <p>
     * The <code>export snapshot</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>source snapshot name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <note>
     * <p>
     * Use the <code>get instance snapshots</code> or
     * <code>get disk snapshots</code> operations to get a list of snapshots
     * that you can export to Amazon EC2.
     * </p>
     * </note>
     * 
     * @param exportSnapshotRequest
     * @return exportSnapshotResult The response from the ExportSnapshot service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ExportSnapshotResult exportSnapshot(ExportSnapshotRequest exportSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return getActiveNamesResult The response from the GetActiveNames service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetActiveNamesResult getActiveNames(GetActiveNamesRequest getActiveNamesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the configured alarms. Specify an alarm name in
     * your request to return information about a specific alarm, or specify a
     * monitored resource name to return information about all alarms for a
     * specific resource.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * 
     * @param getAlarmsRequest
     * @return getAlarmsResult The response from the GetAlarms service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAlarmsResult getAlarms(GetAlarmsRequest getAlarmsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the available automatic snapshots for an instance or disk. For
     * more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param getAutoSnapshotsRequest
     * @return getAutoSnapshotsResult The response from the GetAutoSnapshots
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAutoSnapshotsResult getAutoSnapshots(GetAutoSnapshotsRequest getAutoSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You
     * can use a blueprint to create a new instance already running a specific
     * operating system, as well as a preinstalled app or development stack. The
     * software each instance is running depends on the blueprint image you
     * choose.
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints
     * are listed to support customers with existing instances and are not
     * necessarily available to create new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new
     * application releases.
     * </p>
     * </note>
     * 
     * @param getBlueprintsRequest
     * @return getBlueprintsResult The response from the GetBlueprints service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBlueprintsResult getBlueprints(GetBlueprintsRequest getBlueprintsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle
     * describes the specs for your virtual private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return getBundlesResult The response from the GetBundles service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBundlesResult getBundles(GetBundlesRequest getBundlesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the CloudFormation stack record created as a result of the
     * <code>create cloud formation stack</code> operation.
     * </p>
     * <p>
     * An AWS CloudFormation stack is used to create a new Amazon EC2 instance
     * from an exported Lightsail snapshot.
     * </p>
     * 
     * @param getCloudFormationStackRecordsRequest
     * @return getCloudFormationStackRecordsResult The response from the
     *         GetCloudFormationStackRecords service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCloudFormationStackRecordsResult getCloudFormationStackRecords(
            GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the configured contact methods. Specify a
     * protocol in your request to return information about a specific contact
     * method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * 
     * @param getContactMethodsRequest
     * @return getContactMethodsResult The response from the GetContactMethods
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetContactMethodsResult getContactMethods(GetContactMethodsRequest getContactMethodsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @return getDiskResult The response from the GetDisk service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDiskResult getDisk(GetDiskRequest getDiskRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @return getDiskSnapshotResult The response from the GetDiskSnapshot
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDiskSnapshotResult getDiskSnapshot(GetDiskSnapshotRequest getDiskSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS
     * account and region.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @return getDiskSnapshotsResult The response from the GetDiskSnapshots
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDiskSnapshotsResult getDiskSnapshots(GetDiskSnapshotsRequest getDiskSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and
     * region.
     * </p>
     * 
     * @param getDisksRequest
     * @return getDisksResult The response from the GetDisks service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDisksResult getDisks(GetDisksRequest getDisksRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return getDomainResult The response from the GetDomain service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDomainResult getDomain(GetDomainRequest getDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return getDomainsResult The response from the GetDomains service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDomainsResult getDomains(GetDomainsRequest getDomainsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the export snapshot record created as a result of the
     * <code>export snapshot</code> operation.
     * </p>
     * <p>
     * An export snapshot record can be used to create a new Amazon EC2 instance
     * and its related resources with the
     * <code>create cloud formation stack</code> operation.
     * </p>
     * 
     * @param getExportSnapshotRecordsRequest
     * @return getExportSnapshotRecordsResult The response from the
     *         GetExportSnapshotRecords service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetExportSnapshotRecordsResult getExportSnapshotRecords(
            GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is
     * a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return getInstanceResult The response from the GetInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual
     * private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>get instance access details</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return getInstanceAccessDetailsResult The response from the
     *         GetInstanceAccessDetails service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceAccessDetailsResult getInstanceAccessDetails(
            GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance
     * metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return getInstanceMetricDataResult The response from the
     *         GetInstanceMetricData service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceMetricDataResult getInstanceMetricData(
            GetInstanceMetricDataRequest getInstanceMetricDataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the firewall port states for a specific Amazon Lightsail
     * instance, the IP addresses allowed to connect to the instance through the
     * ports, and the protocol.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return getInstancePortStatesResult The response from the
     *         GetInstancePortStates service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstancePortStatesResult getInstancePortStates(
            GetInstancePortStatesRequest getInstancePortStatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return getInstanceSnapshotResult The response from the
     *         GetInstanceSnapshot service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceSnapshotResult getInstanceSnapshot(
            GetInstanceSnapshotRequest getInstanceSnapshotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return getInstanceSnapshotsResult The response from the
     *         GetInstanceSnapshots service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceSnapshotsResult getInstanceSnapshots(
            GetInstanceSnapshotsRequest getInstanceSnapshotsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a
     * time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return getInstanceStateResult The response from the GetInstanceState
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceStateResult getInstanceState(GetInstanceStateRequest getInstanceStateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers,
     * or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return getInstancesResult The response from the GetInstances service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstancesResult getInstances(GetInstancesRequest getInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return getKeyPairResult The response from the GetKeyPair service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetKeyPairResult getKeyPair(GetKeyPairRequest getKeyPairRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return getKeyPairsResult The response from the GetKeyPairs service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetKeyPairsResult getKeyPairs(GetKeyPairsRequest getKeyPairsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @return getLoadBalancerResult The response from the GetLoadBalancer
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetLoadBalancerResult getLoadBalancer(GetLoadBalancerRequest getLoadBalancerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about health metrics for your Lightsail load
     * balancer.
     * </p>
     * 
     * @param getLoadBalancerMetricDataRequest
     * @return getLoadBalancerMetricDataResult The response from the
     *         GetLoadBalancerMetricData service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetLoadBalancerMetricDataResult getLoadBalancerMetricData(
            GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the TLS certificates that are associated with
     * the specified Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * You can have a maximum of 2 certificates associated with a Lightsail load
     * balancer. One is active and the other is inactive.
     * </p>
     * 
     * @param getLoadBalancerTlsCertificatesRequest
     * @return getLoadBalancerTlsCertificatesResult The response from the
     *         GetLoadBalancerTlsCertificates service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetLoadBalancerTlsCertificatesResult getLoadBalancerTlsCertificates(
            GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @return getLoadBalancersResult The response from the GetLoadBalancers
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetLoadBalancersResult getLoadBalancers(GetLoadBalancersRequest getLoadBalancersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific operation. Operations include events
     * such as when you create an instance, allocate a static IP, attach a
     * static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return getOperationResult The response from the GetOperation service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetOperationResult getOperation(GetOperationRequest getOperationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200.
     * Results can be paged by making each subsequent call to
     * <code>GetOperations</code> use the maximum (last)
     * <code>statusChangedAt</code> value from the previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return getOperationsResult The response from the GetOperations service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetOperationsResult getOperations(GetOperationsRequest getOperationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static
     * IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return getOperationsForResourceResult The response from the
     *         GetOperationsForResource service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetOperationsForResourceResult getOperationsForResource(
            GetOperationsForResourceRequest getOperationsForResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the
     * <code>include availability zones</code> parameter to also return the
     * Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return getRegionsResult The response from the GetRegions service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRegionsResult getRegions(GetRegionsRequest getRegionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @return getRelationalDatabaseResult The response from the
     *         GetRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseResult getRelationalDatabase(
            GetRelationalDatabaseRequest getRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of available database blueprints in Amazon Lightsail. A
     * blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * You can use a blueprint ID to create a new database that runs a specific
     * database engine.
     * </p>
     * 
     * @param getRelationalDatabaseBlueprintsRequest
     * @return getRelationalDatabaseBlueprintsResult The response from the
     *         GetRelationalDatabaseBlueprints service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseBlueprintsResult getRelationalDatabaseBlueprints(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of bundles that are available in Amazon Lightsail. A
     * bundle describes the performance specifications for a database.
     * </p>
     * <p>
     * You can use a bundle ID to create a new database with explicit
     * performance specifications.
     * </p>
     * 
     * @param getRelationalDatabaseBundlesRequest
     * @return getRelationalDatabaseBundlesResult The response from the
     *         GetRelationalDatabaseBundles service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseBundlesResult getRelationalDatabaseBundles(
            GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @return getRelationalDatabaseEventsResult The response from the
     *         GetRelationalDatabaseEvents service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseEventsResult getRelationalDatabaseEvents(
            GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @return getRelationalDatabaseLogEventsResult The response from the
     *         GetRelationalDatabaseLogEvents service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseLogEventsResult getRelationalDatabaseLogEvents(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @return getRelationalDatabaseLogStreamsResult The response from the
     *         GetRelationalDatabaseLogStreams service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseLogStreamsResult getRelationalDatabaseLogStreams(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the current, previous, or pending versions of the master user
     * password for a Lightsail database.
     * </p>
     * <p>
     * The <code>GetRelationalDatabaseMasterUserPassword</code> operation
     * supports tag-based access control via resource tags applied to the
     * resource identified by relationalDatabaseName.
     * </p>
     * 
     * @param getRelationalDatabaseMasterUserPasswordRequest
     * @return getRelationalDatabaseMasterUserPasswordResult The response from
     *         the GetRelationalDatabaseMasterUserPassword service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseMasterUserPasswordResult getRelationalDatabaseMasterUserPassword(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the data points of the specified metric for a database in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseMetricDataRequest
     * @return getRelationalDatabaseMetricDataResult The response from the
     *         GetRelationalDatabaseMetricData service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseMetricDataResult getRelationalDatabaseMetricData(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns all of the runtime parameters offered by the underlying database
     * software, or engine, for a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * In addition to the parameter names and values, this operation returns
     * other information about each parameter. This information includes whether
     * changes require a reboot, whether the parameter is modifiable, the
     * allowed values, and the data types.
     * </p>
     * 
     * @param getRelationalDatabaseParametersRequest
     * @return getRelationalDatabaseParametersResult The response from the
     *         GetRelationalDatabaseParameters service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseParametersResult getRelationalDatabaseParameters(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @return getRelationalDatabaseSnapshotResult The response from the
     *         GetRelationalDatabaseSnapshot service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseSnapshotResult getRelationalDatabaseSnapshot(
            GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon
     * Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @return getRelationalDatabaseSnapshotsResult The response from the
     *         GetRelationalDatabaseSnapshots service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabaseSnapshotsResult getRelationalDatabaseSnapshots(
            GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @return getRelationalDatabasesResult The response from the
     *         GetRelationalDatabases service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRelationalDatabasesResult getRelationalDatabases(
            GetRelationalDatabasesRequest getRelationalDatabasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return getStaticIpResult The response from the GetStaticIp service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetStaticIpResult getStaticIp(GetStaticIpRequest getStaticIpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return getStaticIpsResult The response from the GetStaticIps service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetStaticIpsResult getStaticIps(GetStaticIpsRequest getStaticIpsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return importKeyPairResult The response from the ImportKeyPair service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return isVpcPeeredResult The response from the IsVpcPeered service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest isVpcPeeredRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the
     * IP addresses allowed to connect to the instance through the ports, and
     * the protocol.
     * </p>
     * <p>
     * The <code>OpenInstancePublicPorts</code> action supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instanceName</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return openInstancePublicPortsResult The response from the
     *         OpenInstancePublicPorts service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    OpenInstancePublicPortsResult openInstancePublicPorts(
            OpenInstancePublicPortsRequest openInstancePublicPortsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return peerVpcResult The response from the PeerVpc service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PeerVpcResult peerVpc(PeerVpcRequest peerVpcRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates or updates an alarm, and associates it with the specified metric.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * <p>
     * When this action creates an alarm, the alarm state is immediately set to
     * <code>INSUFFICIENT_DATA</code>. The alarm is then evaluated and its state
     * is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the
     * update completely overwrites the previous configuration of the alarm. The
     * alarm is then evaluated with the updated configuration.
     * </p>
     * 
     * @param putAlarmRequest
     * @return putAlarmResult The response from the PutAlarm service method, as
     *         returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws UnauthenticatedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutAlarmResult putAlarm(PutAlarmRequest putAlarmRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the
     * IP addresses allowed to connect to the instance through the ports, and
     * the protocol. This action also closes all currently open ports that are
     * not included in the request. Include all of the ports and the protocols
     * you want to open in your <code>PutInstancePublicPorts</code>request. Or
     * use the <code>OpenInstancePublicPorts</code> action to open ports without
     * closing currently open ports.
     * </p>
     * <p>
     * The <code>PutInstancePublicPorts</code> action supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instanceName</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @return putInstancePublicPortsResult The response from the
     *         PutInstancePublicPorts service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutInstancePublicPortsResult putInstancePublicPorts(
            PutInstancePublicPortsRequest putInstancePublicPortsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restarts a specific instance.
     * </p>
     * <p>
     * The <code>reboot instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return rebootInstanceResult The response from the RebootInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RebootInstanceResult rebootInstance(RebootInstanceRequest rebootInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restarts a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>reboot relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootRelationalDatabaseRequest
     * @return rebootRelationalDatabaseResult The response from the
     *         RebootRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RebootRelationalDatabaseResult rebootRelationalDatabase(
            RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return releaseStaticIpResult The response from the ReleaseStaticIp
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest releaseStaticIpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends a verification request to an email contact method to ensure it's
     * owned by the requester. SMS contact methods don't need to be verified.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon
     * Lightsail resources. You can add one email address and one mobile phone
     * number contact method in each AWS Region. However, SMS text messaging is
     * not supported in some AWS Regions, and SMS text messages cannot be sent
     * to some countries/regions. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * A verification request is sent to the contact method when you initially
     * create it. Use this action to send another verification request if a
     * previous verification request was deleted, or has expired.
     * </p>
     * <important>
     * <p>
     * Notifications are not sent to an email contact method until after it is
     * verified, and confirmed as valid.
     * </p>
     * </important>
     * 
     * @param sendContactMethodVerificationRequest
     * @return sendContactMethodVerificationResult The response from the
     *         SendContactMethodVerification service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SendContactMethodVerificationResult sendContactMethodVerification(
            SendContactMethodVerificationRequest sendContactMethodVerificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To
     * restart an instance, use the <code>reboot instance</code> operation.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP
     * address to the instance. To use the same IP address after stopping and
     * starting an instance, create a static IP address and attach it to the
     * instance. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>start instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return startInstanceResult The response from the StartInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartInstanceResult startInstance(StartInstanceRequest startInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a specific database from a stopped state in Amazon Lightsail. To
     * restart a database, use the <code>reboot relational database</code>
     * operation.
     * </p>
     * <p>
     * The <code>start relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startRelationalDatabaseRequest
     * @return startRelationalDatabaseResult The response from the
     *         StartRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartRelationalDatabaseResult startRelationalDatabase(
            StartRelationalDatabaseRequest startRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP
     * address to the instance. To use the same IP address after stopping and
     * starting an instance, create a static IP address and attach it to the
     * instance. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>stop instance</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>instance name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return stopInstanceResult The response from the StopInstance service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopInstanceResult stopInstance(StopInstanceRequest stopInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a specific database that is currently running in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>stop relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopRelationalDatabaseRequest
     * @return stopRelationalDatabaseResult The response from the
     *         StopRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopRelationalDatabaseResult stopRelationalDatabase(
            StopRelationalDatabaseRequest stopRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to the specified Amazon Lightsail resource. Each
     * resource can have a maximum of 50 tags. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. For more
     * information about tags, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * The <code>tag resource</code> operation supports tag-based access control
     * via request tags and resource tags applied to the resource identified by
     * <code>resource name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Tests an alarm by displaying a banner on the Amazon Lightsail console. If
     * a notification trigger is configured for the specified alarm, the test
     * also sends a notification to the notification protocol (
     * <code>Email</code> and/or <code>SMS</code>) configured for the alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources.
     * When a metric condition is met, the alarm can notify you by email, SMS
     * text message, and a banner displayed on the Amazon Lightsail console. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
     * >Alarms in Amazon Lightsail</a>.
     * </p>
     * 
     * @param testAlarmRequest
     * @return testAlarmResult The response from the TestAlarm service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws OperationFailureException
     * @throws UnauthenticatedException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TestAlarmResult testAlarm(TestAlarmRequest testAlarmRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return unpeerVpcResult The response from the UnpeerVpc service method,
     *         as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UnpeerVpcResult unpeerVpc(UnpeerVpcRequest unpeerVpcRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified set of tag keys and their values from the specified
     * Amazon Lightsail resource.
     * </p>
     * <p>
     * The <code>untag resource</code> operation supports tag-based access
     * control via request tags and resource tags applied to the resource
     * identified by <code>resource name</code>. For more information, see the
     * <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * <p>
     * The <code>update domain entry</code> operation supports tag-based access
     * control via resource tags applied to the resource identified by
     * <code>domain name</code>. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return updateDomainEntryResult The response from the UpdateDomainEntry
     *         service method, as returned by Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDomainEntryResult updateDomainEntry(UpdateDomainEntryRequest updateDomainEntryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified attribute for a load balancer. You can only update
     * one attribute at a time.
     * </p>
     * <p>
     * The <code>update load balancer attribute</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by <code>load balancer name</code>. For more information, see
     * the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateLoadBalancerAttributeRequest
     * @return updateLoadBalancerAttributeResult The response from the
     *         UpdateLoadBalancerAttribute service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateLoadBalancerAttributeResult updateLoadBalancerAttribute(
            UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows the update of one or more attributes of a database in Amazon
     * Lightsail.
     * </p>
     * <p>
     * Updates are applied immediately, or in cases where the updates could
     * result in an outage, are applied during the database's predefined
     * maintenance window.
     * </p>
     * <p>
     * The <code>update relational database</code> operation supports tag-based
     * access control via resource tags applied to the resource identified by
     * relationalDatabaseName. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseRequest
     * @return updateRelationalDatabaseResult The response from the
     *         UpdateRelationalDatabase service method, as returned by Amazon
     *         Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRelationalDatabaseResult updateRelationalDatabase(
            UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows the update of one or more parameters of a database in Amazon
     * Lightsail.
     * </p>
     * <p>
     * Parameter updates don't cause outages; therefore, their application is
     * not subject to the preferred maintenance window. However, there are two
     * ways in which parameter updates are applied: <code>dynamic</code> or
     * <code>pending-reboot</code>. Parameters marked with a
     * <code>dynamic</code> apply type are applied immediately. Parameters
     * marked with a <code>pending-reboot</code> apply type are applied only
     * after the database is rebooted using the
     * <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>update relational database parameters</code> operation supports
     * tag-based access control via resource tags applied to the resource
     * identified by relationalDatabaseName. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseParametersRequest
     * @return updateRelationalDatabaseParametersResult The response from the
     *         UpdateRelationalDatabaseParameters service method, as returned by
     *         Amazon Lightsail.
     * @throws ServiceException
     * @throws InvalidInputException
     * @throws NotFoundException
     * @throws OperationFailureException
     * @throws AccessDeniedException
     * @throws AccountSetupInProgressException
     * @throws UnauthenticatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lightsail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRelationalDatabaseParametersResult updateRelationalDatabaseParameters(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest)
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
