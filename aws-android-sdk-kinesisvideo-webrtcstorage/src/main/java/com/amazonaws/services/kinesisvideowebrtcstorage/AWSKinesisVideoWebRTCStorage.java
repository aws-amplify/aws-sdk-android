/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideowebrtcstorage;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kinesisvideowebrtcstorage.model.*;

/**
 * Interface for accessing Amazon Kinesis Video WebRTC Storage
 * <p>
 * </p>
 **/
public interface AWSKinesisVideoWebRTCStorage {

    /**
     * Overrides the default endpoint for this client
     * ("https://kinesisvideo.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "kinesisvideo.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://kinesisvideo.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "kinesisvideo.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://kinesisvideo.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to
     * {@link AWSKinesisVideoWebRTCStorage#setEndpoint(String)}, sets the
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
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a
     * video producing device for an input channel. If there’s no existing
     * session for the channel, a new streaming session needs to be created, and
     * the Amazon Resource Name (ARN) of the signaling channel must be provided.
     * </p>
     * <p>
     * Currently for the <code>SINGLE_MASTER</code> type, a video producing
     * device is able to ingest both audio and video media into a stream, while
     * viewers can only ingest audio. Both a video producing device and viewers
     * can join the session first, and wait for other participants.
     * </p>
     * <p>
     * While participants are having peer to peer conversations through webRTC,
     * the ingested media session will be stored into the Kinesis Video Stream.
     * Multiple viewers are able to playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like
     * <code>HLS</code> or <code>DASH</code> playback, Image generation, and
     * more with ingested WebRTC media.
     * </p>
     * <note>
     * <p>
     * Assume that only one video producing device client can be associated with
     * a session for the channel. If more than one client joins the session of a
     * specific channel as a video producing device, the most recent client
     * request takes precedence.
     * </p>
     * </note>
     * 
     * @param joinStorageSessionRequest
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video WebRTC Storage indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void joinStorageSession(JoinStorageSessionRequest joinStorageSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a
     * viewer for an input channel. If there’s no existing session for the
     * channel, create a new streaming session and provide the Amazon Resource
     * Name (ARN) of the signaling channel (<code>channelArn</code>) and client
     * id (<code>clientId</code>).
     * </p>
     * <p>
     * Currently for <code>SINGLE_MASTER</code> type, a video producing device
     * is able to ingest both audio and video media into a stream, while viewers
     * can only ingest audio. Both a video producing device and viewers can join
     * a session first and wait for other participants. While participants are
     * having peer to peer conversations through webRTC, the ingested media
     * session will be stored into the Kinesis Video Stream. Multiple viewers
     * are able to playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like
     * <code>HLS</code> or <code>DASH</code> playback, Image generation, and
     * more with ingested WebRTC media. If there’s an existing session with the
     * same <code>clientId</code> that's found in the join session request, the
     * new request takes precedence.
     * </p>
     * 
     * @param joinStorageSessionAsViewerRequest
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video WebRTC Storage indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void joinStorageSessionAsViewer(
            JoinStorageSessionAsViewerRequest joinStorageSessionAsViewerRequest)
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
