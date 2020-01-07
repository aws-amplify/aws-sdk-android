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

package com.amazonaws.services.kinesisvideosignaling;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kinesisvideosignaling.model.*;

/**
 * Interface for accessing Amazon Kinesis Video Signaling
 * <p>
 * Kinesis Video Streams Signaling Service is a intermediate service that
 * establishes a communication channel for discovering peers, transmitting
 * offers and answers in order to establish peer-to-peer connection in webRTC
 * technology.
 * </p>
 **/
public interface AWSKinesisVideoSignaling {

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
     * An alternative to {@link AWSKinesisVideoSignaling#setEndpoint(String)},
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
     * Gets the Interactive Connectivity Establishment (ICE) server
     * configuration information, including URIs, username, and password which
     * can be used to configure the WebRTC connection. The ICE component uses
     * this configuration information to setup the WebRTC connection, including
     * authenticating with the Traversal Using Relays around NAT (TURN) relay
     * server.
     * </p>
     * <p>
     * TURN is a protocol that is used to improve the connectivity of
     * peer-to-peer applications. By providing a cloud-based relay service, TURN
     * ensures that a connection can be established even when one or more peers
     * are incapable of a direct peer-to-peer connection. For more information,
     * see <a
     * href="https://tools.ietf.org/html/draft-uberti-rtcweb-turn-rest-00">A
     * REST API For Access To TURN Services</a>.
     * </p>
     * <p>
     * You can invoke this API to establish a fallback mechanism in case either
     * of the peers is unable to establish a direct peer-to-peer connection over
     * a signaling channel. You must specify either a signaling channel ARN or
     * the client ID in order to invoke this API.
     * </p>
     * 
     * @param getIceServerConfigRequest
     * @return getIceServerConfigResult The response from the GetIceServerConfig
     *         service method, as returned by Amazon Kinesis Video Signaling.
     * @throws InvalidClientException
     * @throws SessionExpiredException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Signaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetIceServerConfigResult getIceServerConfig(GetIceServerConfigRequest getIceServerConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API allows you to connect WebRTC-enabled devices with Alexa display
     * devices. When invoked, it sends the Alexa Session Description Protocol
     * (SDP) offer to the master peer. The offer is delivered as soon as the
     * master is connected to the specified signaling channel. This API returns
     * the SDP answer from the connected master. If the master is not connected
     * to the signaling channel, redelivery requests are made until the message
     * expires.
     * </p>
     * 
     * @param sendAlexaOfferToMasterRequest
     * @return sendAlexaOfferToMasterResult The response from the
     *         SendAlexaOfferToMaster service method, as returned by Amazon
     *         Kinesis Video Signaling.
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Signaling indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SendAlexaOfferToMasterResult sendAlexaOfferToMaster(
            SendAlexaOfferToMasterRequest sendAlexaOfferToMasterRequest)
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
