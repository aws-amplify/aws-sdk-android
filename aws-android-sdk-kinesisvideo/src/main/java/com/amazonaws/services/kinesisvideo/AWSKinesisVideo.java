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

package com.amazonaws.services.kinesisvideo;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing AWSKinesisVideoFrontend
 * <p/>
 **/
public interface AWSKinesisVideo {

    /**
     * Overrides the default endpoint for this client
     * ("https://https://kinesisvideo.us-west-2.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "https://kinesisvideo.us-west-2.amazonaws.com") or a full URL, including
     * the protocol (ex:
     * "https://https://kinesisvideo.us-west-2.amazonaws.com"). If the protocol
     * is not specified here, the default protocol from this client's
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
     *            "https://kinesisvideo.us-west-2.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://https://kinesisvideo.us-west-2.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSKinesisVideo#setEndpoint(String)}, sets the
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
     * Creates a signaling channel.
     * </p>
     * <p>
     * <code>CreateSignalingChannel</code> is an asynchronous operation.
     * </p>
     * 
     * @param createSignalingChannelRequest
     * @return createSignalingChannelResult The response from the
     *         CreateSignalingChannel service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws AccountChannelLimitExceededException
     * @throws ResourceInUseException
     * @throws AccessDeniedException
     * @throws TagsPerResourceExceededLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateSignalingChannelResult createSignalingChannel(
            CreateSignalingChannelRequest createSignalingChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Kinesis video stream.
     * </p>
     * <p>
     * When you create a new stream, Kinesis Video Streams assigns it a version
     * number. When you change the stream's metadata, Kinesis Video Streams
     * updates the version.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation.
     * </p>
     * <p>
     * For information about how the service works, see <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html"
     * >How it Works</a>.
     * </p>
     * <p>
     * You must have permissions for the <code>KinesisVideo:CreateStream</code>
     * action.
     * </p>
     * 
     * @param createStreamRequest
     * @return createStreamResult The response from the CreateStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws AccountStreamLimitExceededException
     * @throws DeviceStreamLimitExceededException
     * @throws ResourceInUseException
     * @throws InvalidDeviceException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws TagsPerResourceExceededLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateStreamResult createStream(CreateStreamRequest createStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * An asynchronous API that deletes a stream’s existing edge configuration,
     * as well as the corresponding media from the Edge Agent.
     * </p>
     * <p>
     * When you invoke this API, the sync status is set to <code>DELETING</code>
     * . A deletion process starts, in which active edge jobs are stopped and
     * all media is deleted from the edge device. The time to delete varies,
     * depending on the total amount of stored media. If the deletion process
     * fails, the sync status changes to <code>DELETE_FAILED</code>. You will
     * need to re-try the deletion.
     * </p>
     * <p>
     * When the deletion process has completed successfully, the edge
     * configuration is no longer accessible.
     * </p>
     * 
     * @param deleteEdgeConfigurationRequest
     * @return deleteEdgeConfigurationResult The response from the
     *         DeleteEdgeConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws AccessDeniedException
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws StreamEdgeConfigurationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteEdgeConfigurationResult deleteEdgeConfiguration(
            DeleteEdgeConfigurationRequest deleteEdgeConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified signaling channel.
     * <code>DeleteSignalingChannel</code> is an asynchronous operation. If you
     * don't specify the channel's current version, the most recent version is
     * deleted.
     * </p>
     * 
     * @param deleteSignalingChannelRequest
     * @return deleteSignalingChannelResult The response from the
     *         DeleteSignalingChannel service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws VersionMismatchException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteSignalingChannelResult deleteSignalingChannel(
            DeleteSignalingChannelRequest deleteSignalingChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Kinesis video stream and the data contained in the stream.
     * </p>
     * <p>
     * This method marks the stream for deletion, and makes the data in the
     * stream inaccessible immediately.
     * </p>
     * <p>
     * </p>
     * <p>
     * To ensure that you have the latest version of the stream before deleting
     * it, you can specify the stream version. Kinesis Video Streams assigns a
     * version to each stream. When you update a stream, Kinesis Video Streams
     * assigns a new version number. To get the latest stream version, use the
     * <code>DescribeStream</code> API.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>KinesisVideo:DeleteStream</code> action.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return deleteStreamResult The response from the DeleteStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws VersionMismatchException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a stream’s edge configuration that was set using the
     * <code>StartEdgeConfigurationUpdate</code> API and the latest status of
     * the edge agent's recorder and uploader jobs. Use this API to get the
     * status of the configuration to determine if the configuration is in sync
     * with the Edge Agent. Use this API to evaluate the health of the Edge
     * Agent.
     * </p>
     * 
     * @param describeEdgeConfigurationRequest
     * @return describeEdgeConfigurationResult The response from the
     *         DescribeEdgeConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws AccessDeniedException
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws StreamEdgeConfigurationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeEdgeConfigurationResult describeEdgeConfiguration(
            DescribeEdgeConfigurationRequest describeEdgeConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the <code>ImageGenerationConfiguration</code> for a given Kinesis
     * video stream.
     * </p>
     * 
     * @param describeImageGenerationConfigurationRequest
     * @return describeImageGenerationConfigurationResult The response from the
     *         DescribeImageGenerationConfiguration service method, as returned
     *         by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImageGenerationConfigurationResult describeImageGenerationConfiguration(
            DescribeImageGenerationConfigurationRequest describeImageGenerationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the most current information about the stream. The
     * <code>streamName</code> or <code>streamARN</code> should be provided in
     * the input.
     * </p>
     * 
     * @param describeMappedResourceConfigurationRequest
     * @return describeMappedResourceConfigurationResult The response from the
     *         DescribeMappedResourceConfiguration service method, as returned
     *         by AWSKinesisVideoFrontend.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws AccessDeniedException
     * @throws ClientLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeMappedResourceConfigurationResult describeMappedResourceConfiguration(
            DescribeMappedResourceConfigurationRequest describeMappedResourceConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the most current information about the channel. Specify the
     * <code>ChannelName</code> or <code>ChannelARN</code> in the input.
     * </p>
     * 
     * @param describeMediaStorageConfigurationRequest
     * @return describeMediaStorageConfigurationResult The response from the
     *         DescribeMediaStorageConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws AccessDeniedException
     * @throws ClientLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeMediaStorageConfigurationResult describeMediaStorageConfiguration(
            DescribeMediaStorageConfigurationRequest describeMediaStorageConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the <code>NotificationConfiguration</code> for a given Kinesis video
     * stream.
     * </p>
     * 
     * @param describeNotificationConfigurationRequest
     * @return describeNotificationConfigurationResult The response from the
     *         DescribeNotificationConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeNotificationConfigurationResult describeNotificationConfiguration(
            DescribeNotificationConfigurationRequest describeNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the most current information about the signaling channel. You
     * must specify either the name or the Amazon Resource Name (ARN) of the
     * channel that you want to describe.
     * </p>
     * 
     * @param describeSignalingChannelRequest
     * @return describeSignalingChannelResult The response from the
     *         DescribeSignalingChannel service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSignalingChannelResult describeSignalingChannel(
            DescribeSignalingChannelRequest describeSignalingChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the most current information about the specified stream. You must
     * specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param describeStreamRequest
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an endpoint for a specified stream for either reading or writing.
     * Use this endpoint in your application to read from the specified stream
     * (using the <code>GetMedia</code> or <code>GetMediaForFragmentList</code>
     * operations) or write to it (using the <code>PutMedia</code> operation).
     * </p>
     * <note>
     * <p>
     * The returned endpoint does not have the API name appended. The client
     * needs to add the API name to the returned endpoint.
     * </p>
     * </note>
     * <p>
     * In the request, specify the stream either by <code>StreamName</code> or
     * <code>StreamARN</code>.
     * </p>
     * 
     * @param getDataEndpointRequest
     * @return getDataEndpointResult The response from the GetDataEndpoint
     *         service method, as returned by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetDataEndpointResult getDataEndpoint(GetDataEndpointRequest getDataEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides an endpoint for the specified signaling channel to send and
     * receive messages. This API uses the
     * <code>SingleMasterChannelEndpointConfiguration</code> input parameter,
     * which consists of the <code>Protocols</code> and <code>Role</code>
     * properties.
     * </p>
     * <p>
     * <code>Protocols</code> is used to determine the communication mechanism.
     * For example, if you specify <code>WSS</code> as the protocol, this API
     * produces a secure websocket endpoint. If you specify <code>HTTPS</code>
     * as the protocol, this API generates an HTTPS endpoint.
     * </p>
     * <p>
     * <code>Role</code> determines the messaging permissions. A
     * <code>MASTER</code> role results in this API generating an endpoint that
     * a client can use to communicate with any of the viewers on the channel. A
     * <code>VIEWER</code> role results in this API generating an endpoint that
     * a client can use to communicate only with a <code>MASTER</code>.
     * </p>
     * 
     * @param getSignalingChannelEndpointRequest
     * @return getSignalingChannelEndpointResult The response from the
     *         GetSignalingChannelEndpoint service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSignalingChannelEndpointResult getSignalingChannelEndpoint(
            GetSignalingChannelEndpointRequest getSignalingChannelEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of edge configurations associated with the specified
     * Edge Agent.
     * </p>
     * <p>
     * In the request, you must specify the Edge Agent <code>HubDeviceArn</code>
     * .
     * </p>
     * 
     * @param listEdgeAgentConfigurationsRequest
     * @return listEdgeAgentConfigurationsResult The response from the
     *         ListEdgeAgentConfigurations service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws NotAuthorizedException
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListEdgeAgentConfigurationsResult listEdgeAgentConfigurations(
            ListEdgeAgentConfigurationsRequest listEdgeAgentConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of <code>ChannelInfo</code> objects. Each object
     * describes a signaling channel. To retrieve only those channels that
     * satisfy a specific condition, you can specify a
     * <code>ChannelNameCondition</code>.
     * </p>
     * 
     * @param listSignalingChannelsRequest
     * @return listSignalingChannelsResult The response from the
     *         ListSignalingChannels service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListSignalingChannelsResult listSignalingChannels(
            ListSignalingChannelsRequest listSignalingChannelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of <code>StreamInfo</code> objects. Each object
     * describes a stream. To retrieve only streams that satisfy a specific
     * condition, you can specify a <code>StreamNameCondition</code>.
     * </p>
     * 
     * @param listStreamsRequest
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags associated with the specified signaling channel.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags associated with the specified stream.
     * </p>
     * <p>
     * In the request, you must specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @param listTagsForStreamRequest
     * @return listTagsForStreamResult The response from the ListTagsForStream
     *         service method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidResourceFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest listTagsForStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * An asynchronous API that updates a stream’s existing edge configuration.
     * The Kinesis Video Stream will sync the stream’s edge configuration with
     * the Edge Agent IoT Greengrass component that runs on an IoT Hub Device,
     * setup at your premise. The time to sync can vary and depends on the
     * connectivity of the Hub Device. The <code>SyncStatus</code> will be
     * updated as the edge configuration is acknowledged, and synced with the
     * Edge Agent.
     * </p>
     * <p>
     * If this API is invoked for the first time, a new edge configuration will
     * be created for the stream, and the sync status will be set to
     * <code>SYNCING</code>. You will have to wait for the sync status to reach
     * a terminal state such as: <code>IN_SYNC</code>, or
     * <code>SYNC_FAILED</code>, before using this API again. If you invoke this
     * API during the syncing process, a <code>ResourceInUseException</code>
     * will be thrown. The connectivity of the stream’s edge configuration and
     * the Edge Agent will be retried for 15 minutes. After 15 minutes, the
     * status will transition into the <code>SYNC_FAILED</code> state.
     * </p>
     * 
     * @param startEdgeConfigurationUpdateRequest
     * @return startEdgeConfigurationUpdateResult The response from the
     *         StartEdgeConfigurationUpdate service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws AccessDeniedException
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws NoDataRetentionException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartEdgeConfigurationUpdateResult startEdgeConfigurationUpdate(
            StartEdgeConfigurationUpdateRequest startEdgeConfigurationUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to a signaling channel. A <i>tag</i> is a key-value
     * pair (the value is optional) that you can define and assign to Amazon Web
     * Services resources. If you specify a tag that already exists, the tag
     * value is replaced with the value that you specify in the request. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Using Cost Allocation Tags</a> in the <i>Billing and Cost Management and
     * Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws TagsPerResourceExceededLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to a stream. A <i>tag</i> is a key-value pair (the
     * value is optional) that you can define and assign to Amazon Web Services
     * resources. If you specify a tag that already exists, the tag value is
     * replaced with the value that you specify in the request. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Using Cost Allocation Tags</a> in the <i>Billing and Cost Management and
     * Cost Management User Guide</i>.
     * </p>
     * <p>
     * You must provide either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>KinesisVideo:TagStream</code> action.
     * </p>
     * <p>
     * A Kinesis video stream can support up to 50 tags.
     * </p>
     * 
     * @param tagStreamRequest
     * @return tagStreamResult The response from the TagStream service method,
     *         as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidResourceFormatException
     * @throws TagsPerResourceExceededLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagStreamResult tagStream(TagStreamRequest tagStreamRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from a signaling channel. In the request,
     * specify only a tag key or keys; don't specify the value. If you specify a
     * tag key that does not exist, it's ignored.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from a stream. In the request, specify only a
     * tag key or keys; don't specify the value. If you specify a tag key that
     * does not exist, it's ignored.
     * </p>
     * <p>
     * In the request, you must provide the <code>StreamName</code> or
     * <code>StreamARN</code>.
     * </p>
     * 
     * @param untagStreamRequest
     * @return untagStreamResult The response from the UntagStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidResourceFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagStreamResult untagStream(UntagStreamRequest untagStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Increases or decreases the stream's data retention period by the value
     * that you specify. To indicate whether you want to increase or decrease
     * the data retention period, specify the <code>Operation</code> parameter
     * in the request body. In the request, you must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <note>
     * <p>
     * The retention period that you specify replaces the current value.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the
     * <code>KinesisVideo:UpdateDataRetention</code> action.
     * </p>
     * <p>
     * Changing the data retention period affects the data in the stream as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the data retention period is increased, existing data is retained for
     * the new retention period. For example, if the data retention period is
     * increased from one hour to seven hours, all existing data is retained for
     * seven hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the data retention period is decreased, existing data is retained for
     * the new retention period. For example, if the data retention period is
     * decreased from seven hours to one hour, all existing data is retained for
     * one hour, and any data older than one hour is deleted immediately.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateDataRetentionRequest
     * @return updateDataRetentionResult The response from the
     *         UpdateDataRetention service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws NotAuthorizedException
     * @throws VersionMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateDataRetentionResult updateDataRetention(
            UpdateDataRetentionRequest updateDataRetentionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the <code>StreamInfo</code> and
     * <code>ImageProcessingConfiguration</code> fields.
     * </p>
     * 
     * @param updateImageGenerationConfigurationRequest
     * @return updateImageGenerationConfigurationResult The response from the
     *         UpdateImageGenerationConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws NoDataRetentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateImageGenerationConfigurationResult updateImageGenerationConfiguration(
            UpdateImageGenerationConfigurationRequest updateImageGenerationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a <code>SignalingChannel</code> to a stream to store the
     * media. There are two signaling modes that can specified :
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>StorageStatus</code> is disabled, no data will be stored,
     * and the <code>StreamARN</code> parameter will not be needed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageStatus</code> is enabled, the data will be stored in
     * the <code>StreamARN</code> provided.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If <code>StorageStatus</code> is enabled, direct peer-to-peer
     * (master-viewer) connections no longer occur. Peers connect directly to
     * the storage session. You must call the <code>JoinStorageSession</code>
     * API to trigger an SDP offer send and establish a connection between a
     * peer and the storage session.
     * </p>
     * </important>
     * 
     * @param updateMediaStorageConfigurationRequest
     * @return updateMediaStorageConfigurationResult The response from the
     *         UpdateMediaStorageConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws NoDataRetentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateMediaStorageConfigurationResult updateMediaStorageConfiguration(
            UpdateMediaStorageConfigurationRequest updateMediaStorageConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the notification information for a stream.
     * </p>
     * 
     * @param updateNotificationConfigurationRequest
     * @return updateNotificationConfigurationResult The response from the
     *         UpdateNotificationConfiguration service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws NoDataRetentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateNotificationConfigurationResult updateNotificationConfiguration(
            UpdateNotificationConfigurationRequest updateNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the existing signaling channel. This is an asynchronous operation
     * and takes time to complete.
     * </p>
     * <p>
     * If the <code>MessageTtlSeconds</code> value is updated (either increased
     * or reduced), it only applies to new messages sent via this channel after
     * it's been updated. Existing messages are still expired as per the
     * previous <code>MessageTtlSeconds</code> value.
     * </p>
     * 
     * @param updateSignalingChannelRequest
     * @return updateSignalingChannelResult The response from the
     *         UpdateSignalingChannel service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AccessDeniedException
     * @throws VersionMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateSignalingChannelResult updateSignalingChannel(
            UpdateSignalingChannelRequest updateSignalingChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates stream metadata, such as the device name and media type.
     * </p>
     * <p>
     * You must provide the stream name or the Amazon Resource Name (ARN) of the
     * stream.
     * </p>
     * <p>
     * To make sure that you have the latest version of the stream before
     * updating it, you can specify the stream version. Kinesis Video Streams
     * assigns a version to each stream. When you update a stream, Kinesis Video
     * Streams assigns a new version number. To get the latest stream version,
     * use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * <code>UpdateStream</code> is an asynchronous operation, and takes time to
     * complete.
     * </p>
     * 
     * @param updateStreamRequest
     * @return updateStreamResult The response from the UpdateStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws NotAuthorizedException
     * @throws VersionMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateStreamResult updateStream(UpdateStreamRequest updateStreamRequest)
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
