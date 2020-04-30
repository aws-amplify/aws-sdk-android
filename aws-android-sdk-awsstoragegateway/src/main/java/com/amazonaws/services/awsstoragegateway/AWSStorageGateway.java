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

package com.amazonaws.services.awsstoragegateway;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsstoragegateway.model.*;

/**
 * Interface for accessing AWS Storage Gateway <fullname>AWS Storage Gateway
 * Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software
 * appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and the AWS storage
 * infrastructure. The service enables you to securely upload data to the AWS
 * Cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway
 * Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewayHTTPRequestsHeaders"
 * >AWS Storage Gateway Required Request Headers</a>: Describes the required
 * headers that you must send with every POST request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewaySigningRequests"
 * >Signing Requests</a>: AWS Storage Gateway requires that you authenticate
 * every request you send; this topic describes how sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#APIErrorResponses"
 * >Error Responses</a>: Provides reference information about AWS Storage
 * Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_Operations.html"
 * >Operations in AWS Storage Gateway</a>: Contains detailed descriptions of all
 * AWS Storage Gateway operations, their request parameters, response elements,
 * possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">
 * AWS Storage Gateway Regions and Endpoints:</a> Provides a list of each AWS
 * Region and the endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these
 * resource IDs with the Amazon EC2 API, EC2 expects resource IDs in lowercase.
 * You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be
 * <code>vol-AA22BB012345DAF670</code>. When you use this ID with the EC2 API,
 * you must change it to <code>vol-aa22bb012345daf670</code>. Otherwise, the EC2
 * API might not behave as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway
 * volumes are changing to a longer format. Starting in December 2016, all new
 * volumes and snapshots will be created with a 17-character string. Starting in
 * April 2016, you will be able to use these longer IDs so you can test your
 * systems with the new format. For more information, see <a
 * href="https://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS
 * Resource IDs</a>.
 * </p>
 * <p>
 * For example, a volume Amazon Resource Name (ARN) with the longer volume ID
 * format looks like the following:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>
 * .
 * </p>
 * <p>
 * A snapshot ID with the longer ID format looks like the following:
 * <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement:
 * Heads-up – Longer AWS Storage Gateway volume and snapshot IDs coming in
 * 2016</a>.
 * </p>
 * </important>
 **/
public interface AWSStorageGateway {

    /**
     * Overrides the default endpoint for this client
     * ("https://storagegateway.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "storagegateway.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://storagegateway.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex:
     *            "storagegateway.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://storagegateway.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSStorageGateway#setEndpoint(String)}, sets the
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
     * Activates the gateway you previously deployed on your host. In the
     * activation process, you specify information such as the AWS Region that
     * you want to use for storing snapshots or tapes, the time zone for
     * scheduled snapshots the gateway snapshot schedule window, an activation
     * key, and a name for your gateway. The activation process also associates
     * your gateway with your account; for more information, see
     * <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>
     * <p>
     * You must turn on the gateway VM before you can activate your gateway.
     * </p>
     * </note>
     * 
     * @param activateGatewayRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$ActivationKey</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayName</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayRegion</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayTimezone</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayType</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$TapeDriveType</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$MediumChangerType</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return activateGatewayResult The response from the ActivateGateway
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ActivateGatewayResult activateGateway(ActivateGatewayRequest activateGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Configures one or more gateway local disks as cache for a gateway. This
     * operation is only supported in the cached volume, tape and file gateway
     * type (see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html"
     * >Storage Gateway Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return addCacheResult The response from the AddCache service method, as
     *         returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AddCacheResult addCache(AddCacheRequest addCacheRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to the specified resource. You use tags to add
     * metadata to resources, which you can use to categorize these resources.
     * For example, you can categorize resources by purpose, owner, environment,
     * or team. Each tag consists of a key and a value, which you define. You
     * can add tags to the following AWS Storage Gateway resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * <li>
     * <p>
     * Storage volumes
     * </p>
     * </li>
     * <li>
     * <p>
     * Virtual tapes
     * </p>
     * </li>
     * <li>
     * <p>
     * NFS and SMB file shares
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 50 tags for each resource. Virtual tapes and
     * storage volumes that are recovered to a new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest <p>
     *            AddTagsToResourceInput
     *            </p>
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Configures one or more gateway local disks as upload buffer for a
     * specified gateway. This operation is supported for the stored volume,
     * cached volume and tape gateway types.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return addUploadBufferResult The response from the AddUploadBuffer
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AddUploadBufferResult addUploadBuffer(AddUploadBufferRequest addUploadBufferRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Configures one or more gateway local disks as working storage for a
     * gateway. This operation is only supported in the stored volume gateway
     * type. This operation is deprecated in cached volume API version 20120630.
     * Use <a>AddUploadBuffer</a> instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the <a>AddUploadBuffer</a> operation to add upload buffer to a stored
     * volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that you
     * want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>AddWorkingStorageInput$DiskIds</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return addWorkingStorageResult The response from the AddWorkingStorage
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AddWorkingStorageResult addWorkingStorage(AddWorkingStorageRequest addWorkingStorageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns a tape to a tape pool for archiving. The tape assigned to a pool
     * is archived in the S3 storage class that is associated with the pool.
     * When you use your backup application to eject the tape, the tape is
     * archived directly into the S3 storage class (S3 Glacier or S3 Glacier
     * Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param assignTapePoolRequest
     * @return assignTapePoolResult The response from the AssignTapePool service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssignTapePoolResult assignTapePool(AssignTapePoolRequest assignTapePoolRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Connects a volume to an iSCSI connection and then attaches the volume to
     * the specified gateway. Detaching and attaching a volume enables you to
     * recover your data from one gateway to a different gateway without
     * creating a snapshot. It also makes it easier to move your volumes from an
     * on-premises gateway to a gateway hosted on an Amazon EC2 instance.
     * </p>
     * 
     * @param attachVolumeRequest <p>
     *            AttachVolumeInput
     *            </p>
     * @return attachVolumeResult The response from the AttachVolume service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after
     * the archiving process is initiated. This operation is only supported in
     * the tape gateway type.
     * </p>
     * 
     * @param cancelArchivalRequest <p>
     *            CancelArchivalInput
     *            </p>
     * @return cancelArchivalResult The response from the CancelArchival service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CancelArchivalResult cancelArchival(CancelArchivalRequest cancelArchivalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to
     * a gateway after the retrieval process is initiated. The virtual tape is
     * returned to the VTS. This operation is only supported in the tape gateway
     * type.
     * </p>
     * 
     * @param cancelRetrievalRequest <p>
     *            CancelRetrievalInput
     *            </p>
     * @return cancelRetrievalResult The response from the CancelRetrieval
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CancelRetrievalResult cancelRetrieval(CancelRetrievalRequest cancelRetrievalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a cached volume on a specified cached volume gateway. This
     * operation is only supported in the cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a
     * cached volume. Use the <a>AddCache</a> operation to add cache storage to
     * a gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, the gateway creates the
     * volume and returns information about it. This information includes the
     * volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN
     * that initiators can use to connect to the volume target.
     * </p>
     * <p>
     * Optionally, you can provide the ARN for an existing volume as the
     * <code>SourceVolumeARN</code> for this cached volume, which creates an
     * exact copy of the existing volume’s latest recovery point. The
     * <code>VolumeSizeInBytes</code> value must be equal to or larger than the
     * size of the copied volume, in bytes.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return createCachediSCSIVolumeResult The response from the
     *         CreateCachediSCSIVolume service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateCachediSCSIVolumeResult createCachediSCSIVolume(
            CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Network File System (NFS) file share on an existing file
     * gateway. In Storage Gateway, a file share is a file system mount point
     * backed by Amazon S3 cloud storage. Storage Gateway exposes file shares
     * using an NFS interface. This operation is only supported for file
     * gateways.
     * </p>
     * <important>
     * <p>
     * File gateway requires AWS Security Token Service (AWS STS) to be
     * activated to enable you to create a file share. Make sure AWS STS is
     * activated in the AWS Region you are creating your file gateway in. If AWS
     * STS is not activated in the AWS Region, activate it. For information
     * about how to activate AWS STS, see Activating and Deactivating AWS STS in
     * an AWS Region in the AWS Identity and Access Management User Guide.
     * </p>
     * <p>
     * File gateway does not support creating hard or symbolic links on a file
     * share.
     * </p>
     * </important>
     * 
     * @param createNFSFileShareRequest <p>
     *            CreateNFSFileShareInput
     *            </p>
     * @return createNFSFileShareResult The response from the CreateNFSFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateNFSFileShareResult createNFSFileShare(CreateNFSFileShareRequest createNFSFileShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Server Message Block (SMB) file share on an existing file
     * gateway. In Storage Gateway, a file share is a file system mount point
     * backed by Amazon S3 cloud storage. Storage Gateway expose file shares
     * using an SMB interface. This operation is only supported for file
     * gateways.
     * </p>
     * <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be
     * activated to enable you to create a file share. Make sure that AWS STS is
     * activated in the AWS Region you are creating your file gateway in. If AWS
     * STS is not activated in this AWS Region, activate it. For information
     * about how to activate AWS STS, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file
     * share.
     * </p>
     * </important>
     * 
     * @param createSMBFileShareRequest <p>
     *            CreateSMBFileShareInput
     *            </p>
     * @return createSMBFileShareResult The response from the CreateSMBFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateSMBFileShareResult createSMBFileShare(CreateSMBFileShareRequest createSMBFileShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage Service (Amazon S3) for
     * durable off-site recovery, as well as import the data to an Amazon
     * Elastic Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2).
     * You can take snapshots of your gateway volume on a scheduled or ad hoc
     * basis. This API enables you to take an ad hoc snapshot. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot"
     * >Editing a Snapshot Schedule</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage Gateway
     * Console. In response, AWS Storage Gateway returns you a snapshot ID. You
     * can use this snapshot ID to check the snapshot progress or later use it
     * when you want to create a volume from a snapshot. This operation is only
     * supported in stored and cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, see DescribeSnapshots or DeleteSnapshot in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html"
     * >EC2 API reference</a>.
     * </p>
     * </note> <important>
     * <p>
     * Volume and snapshot IDs are changing to a longer length ID format. For
     * more information, see the important note on the <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html"
     * >Welcome</a> page.
     * </p>
     * </important>
     * 
     * @param createSnapshotRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>CreateSnapshotInput$SnapshotDescription</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateSnapshotInput$VolumeARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return createSnapshotResult The response from the CreateSnapshot service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates a snapshot of a gateway from a volume recovery point. This
     * operation is only supported in the cached volume gateway type.
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get a
     * list of volume recovery point for cached volume gateway, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You must
     * also provide a description for the snapshot. When the gateway takes a
     * snapshot of the specified volume, the snapshot and its description appear
     * in the AWS Storage Gateway console. In response, the gateway returns you
     * a snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a
     * snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, in <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return createSnapshotFromVolumeRecoveryPointResult The response from the
     *         CreateSnapshotFromVolumeRecoveryPoint service method, as returned
     *         by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a volume on a specified gateway. This operation is only supported
     * in the stored volume gateway type.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can
     * choose to preserve existing data on the disk, create volume from an
     * existing snapshot, or create an empty volume. If you choose to create an
     * empty gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on
     * which you are creating the volume. In response, the gateway creates the
     * volume and returns volume information such as the volume Amazon Resource
     * Name (ARN), its size, and the iSCSI target ARN that initiators can use to
     * connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$DiskId</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$SnapshotId</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$TargetName</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return createStorediSCSIVolumeResult The response from the
     *         CreateStorediSCSIVolume service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateStorediSCSIVolumeResult createStorediSCSIVolume(
            CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a virtual tape by using your own barcode. You write data to the
     * virtual tape and then archive the tape. A barcode is unique and cannot be
     * reused if it has already been used on a tape. This applies to barcodes
     * used on deleted tapes. This operation is only supported in the tape
     * gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a
     * virtual tape. Use the <a>AddCache</a> operation to add cache storage to a
     * gateway.
     * </p>
     * </note>
     * 
     * @param createTapeWithBarcodeRequest <p>
     *            CreateTapeWithBarcodeInput
     *            </p>
     * @return createTapeWithBarcodeResult The response from the
     *         CreateTapeWithBarcode service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateTapeWithBarcodeResult createTapeWithBarcode(
            CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes
     * and then archive the tapes. This operation is only supported in the tape
     * gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create
     * virtual tapes. Use the <a>AddCache</a> operation to add cache storage to
     * a gateway.
     * </p>
     * </note>
     * 
     * @param createTapesRequest <p>
     *            CreateTapesInput
     *            </p>
     * @return createTapesResult The response from the CreateTapes service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateTapesResult createTapes(CreateTapesRequest createTapesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the automatic tape creation policy of a gateway. If you delete
     * this policy, new virtual tapes must be created manually. Use the Amazon
     * Resource Name (ARN) of the gateway in your request to remove the policy.
     * </p>
     * 
     * @param deleteAutomaticTapeCreationPolicyRequest
     * @return deleteAutomaticTapeCreationPolicyResult The response from the
     *         DeleteAutomaticTapeCreationPolicy service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteAutomaticTapeCreationPolicyResult deleteAutomaticTapeCreationPolicy(
            DeleteAutomaticTapeCreationPolicyRequest deleteAutomaticTapeCreationPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the bandwidth rate limits of a gateway. You can delete either the
     * upload and download bandwidth rate limit, or you can delete both. If you
     * delete only one of the limits, the other limit remains unchanged. To
     * specify which gateway to work with, use the Amazon Resource Name (ARN) of
     * the gateway in your request. This operation is supported for the stored
     * volume, cached volume and tape gateway types.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest <p>
     *            A JSON object containing the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>DeleteBandwidthRateLimitInput$BandwidthType</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return deleteBandwidthRateLimitResult The response from the
     *         DeleteBandwidthRateLimit service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(
            DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials
     * for a specified iSCSI target and initiator pair. This operation is
     * supported in volume and tape gateway types.
     * </p>
     * 
     * @param deleteChapCredentialsRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>DeleteChapCredentialsInput$InitiatorName</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>DeleteChapCredentialsInput$TargetARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return deleteChapCredentialsResult The response from the
     *         DeleteChapCredentials service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteChapCredentialsResult deleteChapCredentials(
            DeleteChapCredentialsRequest deleteChapCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a file share from a file gateway. This operation is only
     * supported for file gateways.
     * </p>
     * 
     * @param deleteFileShareRequest <p>
     *            DeleteFileShareInput
     *            </p>
     * @return deleteFileShareResult The response from the DeleteFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteFileShareResult deleteFileShare(DeleteFileShareRequest deleteFileShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a gateway. To specify which gateway to delete, use the Amazon
     * Resource Name (ARN) of the gateway in your request. The operation deletes
     * the gateway; however, it does not delete the gateway virtual machine (VM)
     * from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots
     * of the gateway volumes are not deleted upon deleting the gateway,
     * however, pending snapshots will not complete. After you delete a gateway,
     * your next step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however,
     * your existing Amazon EBS snapshots persist and you will continue to be
     * billed for these snapshots. You can choose to remove all remaining Amazon
     * EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer
     * not to cancel your Amazon EC2 subscription, you can delete your snapshots
     * using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail
     * Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest <p>
     *            A JSON object containing the ID of the gateway to delete.
     *            </p>
     * @return deleteGatewayResult The response from the DeleteGateway service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad hoc
     * basis. This API action enables you to delete a snapshot schedule for a
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working with Snapshots</a>. In the <code>DeleteSnapshotSchedule</code>
     * request, you identify the volume by providing its Amazon Resource Name
     * (ARN). This operation is only supported in stored and cached volume
     * gateway types.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, go to <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return deleteSnapshotScheduleResult The response from the
     *         DeleteSnapshotSchedule service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteSnapshotScheduleResult deleteSnapshotSchedule(
            DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified virtual tape. This operation is only supported in
     * the tape gateway type.
     * </p>
     * 
     * @param deleteTapeRequest <p>
     *            DeleteTapeInput
     *            </p>
     * @return deleteTapeResult The response from the DeleteTape service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteTapeResult deleteTape(DeleteTapeRequest deleteTapeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS).
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param deleteTapeArchiveRequest <p>
     *            DeleteTapeArchiveInput
     *            </p>
     * @return deleteTapeArchiveResult The response from the DeleteTapeArchive
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteTapeArchiveResult deleteTapeArchive(DeleteTapeArchiveRequest deleteTapeArchiveRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified storage volume that you previously created using
     * the <a>CreateCachediSCSIVolume</a> or <a>CreateStorediSCSIVolume</a> API.
     * This operation is only supported in the cached volume and stored volume
     * types. For stored volume gateways, the local disk that was configured as
     * the storage volume is not deleted. You can reuse the local disk to create
     * another storage volume.
     * </p>
     * <p>
     * Before you delete a volume, make sure there are no iSCSI connections to
     * the volume you are deleting. You should also make sure there is no
     * snapshot in progress. You can use the Amazon Elastic Compute Cloud
     * (Amazon EC2) API to query snapshots on the volume you are deleting and
     * check the snapshot status. For more information, go to <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest <p>
     *            A JSON object containing the
     *            <a>DeleteVolumeInput$VolumeARN</a> to delete.
     *            </p>
     * @return deleteVolumeResult The response from the DeleteVolume service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the most recent High Availability monitoring
     * test that was performed on the host in a cluster. If a test isn't
     * performed, the status and start time in the response would be null.
     * </p>
     * 
     * @param describeAvailabilityMonitorTestRequest
     * @return describeAvailabilityMonitorTestResult The response from the
     *         DescribeAvailabilityMonitorTest service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeAvailabilityMonitorTestResult describeAvailabilityMonitorTest(
            DescribeAvailabilityMonitorTestRequest describeAvailabilityMonitorTestRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the bandwidth rate limits of a gateway. By default, these limits
     * are not set, which means no bandwidth rate limiting is in effect. This
     * operation is supported for the stored volume, cached volume and tape
     * gateway types.'
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To specify
     * which gateway to describe, use the Amazon Resource Name (ARN) of the
     * gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return describeBandwidthRateLimitResult The response from the
     *         DescribeBandwidthRateLimit service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeBandwidthRateLimitResult describeBandwidthRateLimit(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the cache of a gateway. This operation is only
     * supported in the cached volume, tape, and file gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return describeCacheResult The response from the DescribeCache service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeCacheResult describeCache(DescribeCacheRequest describeCacheRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of the gateway volumes specified in the request.
     * This operation is only supported in the cached volume gateway types.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In
     * the response, AWS Storage Gateway returns volume information sorted by
     * volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return describeCachediSCSIVolumesResult The response from the
     *         DescribeCachediSCSIVolumes service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of Challenge-Handshake Authentication Protocol (CHAP)
     * credentials information for a specified iSCSI target, one for each
     * target-initiator pair. This operation is supported in the volume and tape
     * gateway types.
     * </p>
     * 
     * @param describeChapCredentialsRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            iSCSI volume target.
     *            </p>
     * @return describeChapCredentialsResult The response from the
     *         DescribeChapCredentials service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeChapCredentialsResult describeChapCredentials(
            DescribeChapCredentialsRequest describeChapCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata about a gateway such as its name, network interfaces,
     * configured time zone, and the state (whether the gateway is running or
     * not). To specify which gateway to describe, use the Amazon Resource Name
     * (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest <p>
     *            A JSON object containing the ID of the gateway.
     *            </p>
     * @return describeGatewayInformationResult The response from the
     *         DescribeGatewayInformation service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeGatewayInformationResult describeGatewayInformation(
            DescribeGatewayInformationRequest describeGatewayInformationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day
     * and time of the week. Note that values are in terms of the gateway's time
     * zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return describeMaintenanceStartTimeResult The response from the
     *         DescribeMaintenanceStartTime service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a description for one or more Network File System (NFS) file shares
     * from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param describeNFSFileSharesRequest <p>
     *            DescribeNFSFileSharesInput
     *            </p>
     * @return describeNFSFileSharesResult The response from the
     *         DescribeNFSFileShares service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeNFSFileSharesResult describeNFSFileShares(
            DescribeNFSFileSharesRequest describeNFSFileSharesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a description for one or more Server Message Block (SMB) file shares
     * from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param describeSMBFileSharesRequest <p>
     *            DescribeSMBFileSharesInput
     *            </p>
     * @return describeSMBFileSharesResult The response from the
     *         DescribeSMBFileShares service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeSMBFileSharesResult describeSMBFileShares(
            DescribeSMBFileSharesRequest describeSMBFileSharesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a description of a Server Message Block (SMB) file share settings
     * from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param describeSMBSettingsRequest
     * @return describeSMBSettingsResult The response from the
     *         DescribeSMBSettings service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeSMBSettingsResult describeSMBSettings(
            DescribeSMBSettingsRequest describeSMBSettingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the snapshot schedule for the specified gateway volume. The
     * snapshot schedule information includes intervals at which snapshots are
     * automatically initiated on the volume. This operation is only supported
     * in the cached volume and stored volume types.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest <p>
     *            A JSON object containing the
     *            <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     *            </p>
     * @return describeSnapshotScheduleResult The response from the
     *         DescribeSnapshotSchedule service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeSnapshotScheduleResult describeSnapshotSchedule(
            DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of the gateway volumes specified in the request.
     * The list of gateway volumes in the request must be from one gateway. In
     * the response AWS Storage Gateway returns volume information sorted by
     * volume ARNs. This operation is only supported in stored volume gateway
     * type.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest <p>
     *            A JSON object containing a list of
     *            <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     *            </p>
     * @return describeStorediSCSIVolumesResult The response from the
     *         DescribeStorediSCSIVolumes service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape
     * shelf (VTS). This operation is only supported in the tape gateway type.
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway
     * returns a description of all virtual tapes found in the VTS associated
     * with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest <p>
     *            DescribeTapeArchivesInput
     *            </p>
     * @return describeTapeArchivesResult The response from the
     *         DescribeTapeArchives service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTapeArchivesResult describeTapeArchives(
            DescribeTapeArchivesRequest describeTapeArchivesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the
     * specified tape gateway.
     * </p>
     * <p>
     * A recovery point is a point-in-time view of a virtual tape at which all
     * the data on the virtual tape is consistent. If your gateway crashes,
     * virtual tapes that have recovery points can be recovered to a new
     * gateway. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest <p>
     *            DescribeTapeRecoveryPointsInput
     *            </p>
     * @return describeTapeRecoveryPointsResult The response from the
     *         DescribeTapeRecoveryPoints service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of
     * virtual tapes. If a <code>TapeARN</code> is not specified, returns a
     * description of all virtual tapes associated with the specified gateway.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapesRequest <p>
     *            DescribeTapesInput
     *            </p>
     * @return describeTapesResult The response from the DescribeTapes service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTapesResult describeTapes(DescribeTapesRequest describeTapesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the upload buffer of a gateway. This operation
     * is supported for the stored volume, cached volume and tape gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return describeUploadBufferResult The response from the
     *         DescribeUploadBuffer service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeUploadBufferResult describeUploadBuffer(
            DescribeUploadBufferRequest describeUploadBufferRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the
     * specified tape gateway. In the response, AWS Storage Gateway returns VTL
     * device information.
     * </p>
     * <p>
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeVTLDevicesRequest <p>
     *            DescribeVTLDevicesInput
     *            </p>
     * @return describeVTLDevicesResult The response from the DescribeVTLDevices
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeVTLDevicesResult describeVTLDevices(DescribeVTLDevicesRequest describeVTLDevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the working storage of a gateway. This
     * operation is only supported in the stored volumes gateway type. This
     * operation is deprecated in cached volumes API version (20120630). Use
     * DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the DescribeUploadBuffer operation to add upload buffer to a stored
     * volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return describeWorkingStorageResult The response from the
     *         DescribeWorkingStorage service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeWorkingStorageResult describeWorkingStorage(
            DescribeWorkingStorageRequest describeWorkingStorageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disconnects a volume from an iSCSI connection and then detaches the
     * volume from the specified gateway. Detaching and attaching a volume
     * enables you to recover your data from one gateway to a different gateway
     * without creating a snapshot. It also makes it easier to move your volumes
     * from an on-premises gateway to a gateway hosted on an Amazon EC2
     * instance. This operation is only supported in the volume gateway type.
     * </p>
     * 
     * @param detachVolumeRequest <p>
     *            AttachVolumeInput
     *            </p>
     * @return detachVolumeResult The response from the DetachVolume service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables a tape gateway when the gateway is no longer functioning. For
     * example, if your gateway VM is damaged, you can disable the gateway so
     * you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a tape gateway that is not reachable or not
     * functioning. This operation is only supported in the tape gateway type.
     * </p>
     * <important>
     * <p>
     * After a gateway is disabled, it cannot be enabled.
     * </p>
     * </important>
     * 
     * @param disableGatewayRequest <p>
     *            DisableGatewayInput
     *            </p>
     * @return disableGatewayResult The response from the DisableGateway service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisableGatewayResult disableGateway(DisableGatewayRequest disableGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a file gateway to an Active Directory domain. This operation is only
     * supported for file gateways that support the SMB file protocol.
     * </p>
     * 
     * @param joinDomainRequest <p>
     *            JoinDomainInput
     *            </p>
     * @return joinDomainResult The response from the JoinDomain service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    JoinDomainResult joinDomain(JoinDomainRequest joinDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the automatic tape creation policies for a gateway. If there are no
     * automatic tape creation policies for the gateway, it returns an empty
     * list.
     * </p>
     * <p>
     * This operation is only supported for tape gateways.
     * </p>
     * 
     * @param listAutomaticTapeCreationPoliciesRequest
     * @return listAutomaticTapeCreationPoliciesResult The response from the
     *         ListAutomaticTapeCreationPolicies service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListAutomaticTapeCreationPoliciesResult listAutomaticTapeCreationPolicies(
            ListAutomaticTapeCreationPoliciesRequest listAutomaticTapeCreationPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of the file shares for a specific file gateway, or the list
     * of file shares that belong to the calling user account. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param listFileSharesRequest <p>
     *            ListFileShareInput
     *            </p>
     * @return listFileSharesResult The response from the ListFileShares service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListFileSharesResult listFileShares(ListFileSharesRequest listFileSharesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists gateways owned by an AWS account in an AWS Region specified in the
     * request. The returned list is ordered by gateway Amazon Resource Name
     * (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response (that is, the
     * response returns only a truncated list of your gateways), the response
     * contains a marker that you can specify in your next request to fetch the
     * next page of gateways.
     * </p>
     * 
     * @param listGatewaysRequest <p>
     *            A JSON object containing zero or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ListGatewaysInput$Limit</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListGatewaysInput$Marker</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return listGatewaysResult The response from the ListGateways service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the gateway's local disks. To specify which gateway to
     * describe, you use the Amazon Resource Name (ARN) of the gateway in the
     * body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured
     * as working storage, cache storage, or stored volume or not configured at
     * all. The response includes a <code>DiskStatus</code> field. This field
     * can have a value of present (the disk is available to use), missing (the
     * disk is no longer connected to the gateway), or mismatch (the disk node
     * is occupied by a disk that has incorrect metadata or the disk content is
     * corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return listLocalDisksResult The response from the ListLocalDisks service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListLocalDisksResult listLocalDisks(ListLocalDisksRequest listLocalDisksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags that have been added to the specified resource. This
     * operation is supported in storage gateways of all types.
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            ListTagsForResourceInput
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists virtual tapes in your virtual tape library (VTL) and your virtual
     * tape shelf (VTS). You specify the tapes to list by specifying one or more
     * tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
     * operation lists all virtual tapes in both your VTL and VTS.
     * </p>
     * <p>
     * This operation supports pagination. By default, the operation returns a
     * maximum of up to 100 tapes. You can optionally specify the
     * <code>Limit</code> parameter in the body to limit the number of tapes in
     * the response. If the number of tapes returned in the response is
     * truncated, the response includes a <code>Marker</code> element that you
     * can use in your subsequent request to retrieve the next set of tapes.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param listTapesRequest <p>
     *            A JSON object that contains one or more of the following
     *            fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ListTapesInput$Limit</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListTapesInput$Marker</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListTapesInput$TapeARNs</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return listTapesResult The response from the ListTapes service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTapesResult listTapes(ListTapesRequest listTapesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists iSCSI initiators that are connected to a volume. You can use this
     * operation to determine whether a volume is being used or not. This
     * operation is only supported in the cached volume and stored volume
     * gateway types.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest <p>
     *            ListVolumeInitiatorsInput
     *            </p>
     * @return listVolumeInitiatorsResult The response from the
     *         ListVolumeInitiators service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListVolumeInitiatorsResult listVolumeInitiators(
            ListVolumeInitiatorsRequest listVolumeInitiatorsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the recovery points for a specified gateway. This operation is only
     * supported in the cached volume gateway type.
     * </p>
     * <p>
     * Each cache volume has one recovery point. A volume recovery point is a
     * point in time at which all data of the volume is consistent and from
     * which you can create a snapshot or clone a new cached volume from a
     * source volume. To create a snapshot from a volume recovery point use the
     * <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return listVolumeRecoveryPointsResult The response from the
     *         ListVolumeRecoveryPoints service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(
            ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume
     * ARN. The response includes only the volume ARNs. If you want additional
     * volume information, use the <a>DescribeStorediSCSIVolumes</a> or the
     * <a>DescribeCachediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this Marker
     * value in your subsequent request to retrieve the next set of volumes.
     * This operation is only supported in the cached volume and stored volume
     * gateway types.
     * </p>
     * 
     * @param listVolumesRequest <p>
     *            A JSON object that contains one or more of the following
     *            fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ListVolumesInput$Limit</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListVolumesInput$Marker</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return listVolumesResult The response from the ListVolumes service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListVolumesResult listVolumes(ListVolumesRequest listVolumesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends you notification through CloudWatch Events when all files written
     * to your file share have been uploaded to Amazon S3.
     * </p>
     * <p>
     * AWS Storage Gateway can send a notification through Amazon CloudWatch
     * Events when all files written to your file share up to that point in time
     * have been uploaded to Amazon S3. These files include files written to the
     * file share up to the time that you make a request for notification. When
     * the upload is done, Storage Gateway sends you notification through an
     * Amazon CloudWatch Event. You can configure CloudWatch Events to send the
     * notification through event targets such as Amazon SNS or AWS Lambda
     * function. This operation is only supported for file gateways.
     * </p>
     * <p>
     * For more information, see Getting File Upload Notification in the Storage
     * Gateway User Guide
     * (https://docs.aws.amazon.com/storagegateway/latest/userguide
     * /monitoring-file-gateway.html#get-upload-notification).
     * </p>
     * 
     * @param notifyWhenUploadedRequest
     * @return notifyWhenUploadedResult The response from the NotifyWhenUploaded
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    NotifyWhenUploadedResult notifyWhenUploaded(NotifyWhenUploadedRequest notifyWhenUploadedRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Refreshes the cache for the specified file share. This operation finds
     * objects in the Amazon S3 bucket that were added, removed or replaced
     * since the gateway last listed the bucket's contents and cached the
     * results. This operation is only supported in the file gateway type. You
     * can subscribe to be notified through an Amazon CloudWatch event when your
     * RefreshCache operation completes. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting Notified About File Operations</a>.
     * </p>
     * <p>
     * When this API is called, it only initiates the refresh operation. When
     * the API call completes and returns a success code, it doesn't necessarily
     * mean that the file refresh has completed. You should use the
     * refresh-complete notification to determine that the operation has
     * completed before you check for new files on the gateway file share. You
     * can subscribe to be notified through an CloudWatch event when your
     * <code>RefreshCache</code> operation completes.
     * </p>
     * <p>
     * Throttle limit: This API is asynchronous so the gateway will accept no
     * more than two refreshes at any time. We recommend using the
     * refresh-complete CloudWatch event notification before issuing additional
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting Notified About File Operations</a>.
     * </p>
     * <p>
     * If you invoke the RefreshCache API when two requests are already being
     * processed, any new request will cause an
     * <code>InvalidGatewayRequestException</code> error because too many
     * requests were sent to the server.
     * </p>
     * <p>
     * For more information, see
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * .
     * </p>
     * 
     * @param refreshCacheRequest <p>
     *            RefreshCacheInput
     *            </p>
     * @return refreshCacheResult The response from the RefreshCache service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RefreshCacheResult refreshCache(RefreshCacheRequest refreshCacheRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from the specified resource. This operation is
     * supported in storage gateways of all types.
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p>
     *            RemoveTagsFromResourceInput
     *            </p>
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets all cache disks that have encountered an error and makes the disks
     * available for reconfiguration as cache storage. If your cache disk
     * encounters an error, the gateway prevents read and write operations on
     * virtual tapes in the gateway. For example, an error can occur when a disk
     * is corrupted or removed from the gateway. When a cache is reset, the
     * gateway loses its cache storage. At this point, you can reconfigure the
     * disks as cache disks. This operation is only supported in the cached
     * volume and tape types.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been
     * uploaded to Amazon S3 yet, that data can be lost. After you reset cache
     * disks, there will be no configured cache disks left in the gateway, so
     * you must configure at least one new cache disk for your gateway to
     * function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @return resetCacheResult The response from the ResetCache service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ResetCacheResult resetCache(ResetCacheRequest resetCacheRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a
     * tape gateway. Virtual tapes archived in the VTS are not associated with
     * any gateway. However after a tape is retrieved, it is associated with a
     * gateway, even though it is also listed in the VTS, that is, archive. This
     * operation is only supported in the tape gateway type.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be
     * retrieved again to another gateway. You must archive the tape again
     * before you can retrieve it to another gateway. This operation is only
     * supported in the tape gateway type.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest <p>
     *            RetrieveTapeArchiveInput
     *            </p>
     * @return retrieveTapeArchiveResult The response from the
     *         RetrieveTapeArchive service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RetrieveTapeArchiveResult retrieveTapeArchive(
            RetrieveTapeArchiveRequest retrieveTapeArchiveRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape. This
     * operation is only supported in the tape gateway type.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the tape is consistent. If your gateway crashes, virtual
     * tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>
     * <p>
     * The virtual tape can be retrieved to only one gateway. The retrieved tape
     * is read-only. The virtual tape can be retrieved to only a tape gateway.
     * There is no charge for retrieving recovery points.
     * </p>
     * </note>
     * 
     * @param retrieveTapeRecoveryPointRequest <p>
     *            RetrieveTapeRecoveryPointInput
     *            </p>
     * @return retrieveTapeRecoveryPointResult The response from the
     *         RetrieveTapeRecoveryPoint service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the password for your VM local console. When you log in to the local
     * console for the first time, you log in to the VM with the default
     * credentials. We recommend that you set a new password. You don't need to
     * know the default password to set a new password.
     * </p>
     * 
     * @param setLocalConsolePasswordRequest <p>
     *            SetLocalConsolePasswordInput
     *            </p>
     * @return setLocalConsolePasswordResult The response from the
     *         SetLocalConsolePassword service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SetLocalConsolePasswordResult setLocalConsolePassword(
            SetLocalConsolePasswordRequest setLocalConsolePasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the password for the guest user <code>smbguest</code>. The
     * <code>smbguest</code> user is the user when the authentication method for
     * the file share is set to <code>GuestAccess</code>.
     * </p>
     * 
     * @param setSMBGuestPasswordRequest <p>
     *            SetSMBGuestPasswordInput
     *            </p>
     * @return setSMBGuestPasswordResult The response from the
     *         SetSMBGuestPassword service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SetSMBGuestPasswordResult setSMBGuestPassword(
            SetSMBGuestPasswordRequest setSMBGuestPasswordRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Shuts down a gateway. To specify which gateway to shut down, use the
     * Amazon Resource Name (ARN) of the gateway in the body of your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * gateway's virtual machine (VM) and not the host VM.
     * </p>
     * <note>
     * <p>
     * If you want to shut down the VM, it is recommended that you first shut
     * down the gateway component in the VM to avoid unpredictable conditions.
     * </p>
     * </note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * <a>StartGateway</a>, <a>DescribeGatewayInformation</a> and
     * <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage
     * volumes, and there are no snapshots taken.
     * </p>
     * <note>
     * <p>
     * When you make a shutdown request, you will get a <code>200 OK</code>
     * success response immediately. However, it might take some time for the
     * gateway to shut down. You can call the <a>DescribeGatewayInformation</a>
     * API to check the status. For more information, see
     * <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using <a>DeleteGateway</a>) to no longer pay software charges associated
     * with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway to shut down.
     *            </p>
     * @return shutdownGatewayResult The response from the ShutdownGateway
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest shutdownGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Start a test that verifies that the specified gateway is configured for
     * High Availability monitoring in your host environment. This request only
     * initiates the test and that a successful response only indicates that the
     * test was started. It doesn't indicate that the test passed. For the
     * status of the test, invoke the
     * <code>DescribeAvailabilityMonitorTest</code> API.
     * </p>
     * <note>
     * <p>
     * Starting this test will cause your gateway to go offline for a brief
     * period.
     * </p>
     * </note>
     * 
     * @param startAvailabilityMonitorTestRequest
     * @return startAvailabilityMonitorTestResult The response from the
     *         StartAvailabilityMonitorTest service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StartAvailabilityMonitorTestResult startAvailabilityMonitorTest(
            StartAvailabilityMonitorTestRequest startAvailabilityMonitorTestRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a gateway that you previously shut down (see
     * <a>ShutdownGateway</a>). After the gateway starts, you can then make
     * other API calls, your applications can read from or write to the
     * gateway's storage volumes and you will be able to take snapshot backups.
     * </p>
     * <note>
     * <p>
     * When you make a request, you will get a 200 OK success response
     * immediately. However, it might take some time for the gateway to be
     * ready. You should call <a>DescribeGatewayInformation</a> and check the
     * status before making any additional API calls. For more information, see
     * <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway to start.
     *            </p>
     * @return startGatewayResult The response from the StartGateway service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StartGatewayResult startGateway(StartGatewayRequest startGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the automatic tape creation policy of a gateway. Use this to
     * update the policy with a new set of automatic tape creation rules. This
     * is only supported for tape gateways.
     * </p>
     * <p>
     * By default, there is no automatic tape creation policy.
     * </p>
     * <note>
     * <p>
     * A gateway can have only one automatic tape creation policy.
     * </p>
     * </note>
     * 
     * @param updateAutomaticTapeCreationPolicyRequest
     * @return updateAutomaticTapeCreationPolicyResult The response from the
     *         UpdateAutomaticTapeCreationPolicy service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateAutomaticTapeCreationPolicyResult updateAutomaticTapeCreationPolicy(
            UpdateAutomaticTapeCreationPolicyRequest updateAutomaticTapeCreationPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the bandwidth rate limits of a gateway. You can update both the
     * upload and download bandwidth rate limit or specify only one of the two.
     * If you don't set a bandwidth rate limit, the existing rate limit remains.
     * This operation is supported for the stored volume, cached volume and tape
     * gateway types.'
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't
     * set any limit, the gateway does not have any limitations on its bandwidth
     * usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>
     *            UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec
     *            </a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>
     *            UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec
     *            </a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateBandwidthRateLimitResult The response from the
     *         UpdateBandwidthRateLimit service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateBandwidthRateLimitResult updateBandwidthRateLimit(
            UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the Challenge-Handshake Authentication Protocol (CHAP)
     * credentials for a specified iSCSI target. By default, a gateway does not
     * have CHAP enabled; however, for added security, you might use it. This
     * operation is supported in the volume and tape gateway types.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target
     * are closed and initiators must reconnect with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$InitiatorName</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a
     *            >
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$TargetARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateChapCredentialsResult The response from the
     *         UpdateChapCredentials service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateChapCredentialsResult updateChapCredentials(
            UpdateChapCredentialsRequest updateChapCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a gateway's metadata, which includes the gateway's name and time
     * zone. To specify which gateway to update, use the Amazon Resource Name
     * (ARN) of the gateway in your request.
     * </p>
     * <note>
     * <p>
     * For Gateways activated after September 2, 2015, the gateway's ARN
     * contains the gateway ID rather than the gateway name. However, changing
     * the name of the gateway has no effect on the gateway's ARN.
     * </p>
     * </note>
     * 
     * @param updateGatewayInformationRequest
     * @return updateGatewayInformationResult The response from the
     *         UpdateGatewayInformation service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateGatewayInformationResult updateGatewayInformation(
            UpdateGatewayInformationRequest updateGatewayInformationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request
     * immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success
     * response immediately. However, it might take some time for the update to
     * complete. You can call <a>DescribeGatewayInformation</a> to verify the
     * gateway is in the <code>STATE_RUNNING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * A software update forces a system restart of your gateway. You can
     * minimize the chance of any disruption to your applications by increasing
     * your iSCSI Initiators' timeouts. For more information about increasing
     * iSCSI Initiator timeouts for Windows and Linux, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.
     * </p>
     * </important>
     * 
     * @param updateGatewaySoftwareNowRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway to update.
     *            </p>
     * @return updateGatewaySoftwareNowResult The response from the
     *         UpdateGatewaySoftwareNow service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(
            UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a gateway's weekly maintenance start time information, including
     * day and time of the week. The maintenance time is the time in your
     * gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest <p>
     *            A JSON object containing the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$DayOfMonth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$HourOfDay</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateMaintenanceStartTimeResult The response from the
     *         UpdateMaintenanceStartTime service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Network File System (NFS) file share. This operation is only
     * supported in the file gateway type.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field
     * to null.
     * </p>
     * </note>
     * <p>
     * Updates the following file share setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default storage class for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata defaults for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed NFS clients for your file share
     * </p>
     * </li>
     * <li>
     * <p>
     * Squash settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Write status of your file share
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field
     * to null. This operation is only supported in file gateways.
     * </p>
     * </note>
     * 
     * @param updateNFSFileShareRequest <p>
     *            UpdateNFSFileShareInput
     *            </p>
     * @return updateNFSFileShareResult The response from the UpdateNFSFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateNFSFileShareResult updateNFSFileShare(UpdateNFSFileShareRequest updateNFSFileShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Server Message Block (SMB) file share.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field
     * to null. This operation is only supported for file gateways.
     * </p>
     * </note> <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be
     * activated to enable you to create a file share. Make sure that AWS STS is
     * activated in the AWS Region you are creating your file gateway in. If AWS
     * STS is not activated in this AWS Region, activate it. For information
     * about how to activate AWS STS, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file
     * share.
     * </p>
     * </important>
     * 
     * @param updateSMBFileShareRequest <p>
     *            UpdateSMBFileShareInput
     *            </p>
     * @return updateSMBFileShareResult The response from the UpdateSMBFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateSMBFileShareResult updateSMBFileShare(UpdateSMBFileShareRequest updateSMBFileShareRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the SMB security strategy on a file gateway. This action is only
     * supported in file gateways.
     * </p>
     * <note>
     * <p>
     * This API is called Security level in the User Guide.
     * </p>
     * <p>
     * A higher security level can affect performance of the gateway.
     * </p>
     * </note>
     * 
     * @param updateSMBSecurityStrategyRequest
     * @return updateSMBSecurityStrategyResult The response from the
     *         UpdateSMBSecurityStrategy service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateSMBSecurityStrategyResult updateSMBSecurityStrategy(
            UpdateSMBSecurityStrategyRequest updateSMBSecurityStrategyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a snapshot schedule configured for a gateway volume. This
     * operation is only supported in the cached volume and stored volume
     * gateway types.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting
     * at the creation time of the volume. You can use this API to change the
     * snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including when
     * you want the snapshot to begin on a day and the frequency (in hours) of
     * snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$Description</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$StartAt</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$VolumeARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateSnapshotScheduleResult The response from the
     *         UpdateSnapshotSchedule service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateSnapshotScheduleResult updateSnapshotSchedule(
            UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the type of medium changer in a tape gateway. When you activate a
     * tape gateway, you select a medium changer type for the tape gateway. This
     * operation enables you to select a different type of medium changer after
     * a tape gateway is activated. This operation is only supported in the tape
     * gateway type.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     * @return updateVTLDeviceTypeResult The response from the
     *         UpdateVTLDeviceType service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateVTLDeviceTypeResult updateVTLDeviceType(
            UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest) throws AmazonClientException,
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
