/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html"
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
     * Adds one or more tags to a stream. A <i>tag</i> is a key-value pair (the
     * value is optional) that you can define and assign to AWS resources. If
     * you specify a tag that already exists, the tag value is replaced with the
     * value that you specify in the request. For more information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
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
     * Kinesis video streams support up to 50 tags.
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
