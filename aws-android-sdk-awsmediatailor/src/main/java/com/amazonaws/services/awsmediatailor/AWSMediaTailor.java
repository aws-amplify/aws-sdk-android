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

package com.amazonaws.services.awsmediatailor;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsmediatailor.model.*;

/**
 * Interface for accessing AWS MediaTailor
 * <p>
 * Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for
 * your live and VOD content. With AWS Elemental MediaTailor, you can serve
 * targeted ads to viewers while maintaining broadcast quality in over-the-top
 * (OTT) video applications. For information about using the service, including
 * detailed information about the settings covered in this guide, see the AWS
 * Elemental MediaTailor User Guide.
 * <p>
 * Through the SDK, you manage AWS Elemental MediaTailor configurations the same
 * as you do through the console. For example, you specify ad insertion behavior
 * and mapping information for the origin server and the ad decision server
 * (ADS).
 * </p>
 **/
public interface AWSMediaTailor {

    /**
     * Overrides the default endpoint for this client
     * ("https://api.mediatailor.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "api.mediatailor.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://api.mediatailor.us-east-1.amazonaws.com"). If the
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
     *            "api.mediatailor.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://api.mediatailor.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSMediaTailor#setEndpoint(String)}, sets the
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
     * Deletes the playback configuration for the specified name.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @return deletePlaybackConfigurationResult The response from the
     *         DeletePlaybackConfiguration service method, as returned by AWS
     *         MediaTailor.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeletePlaybackConfigurationResult deletePlaybackConfiguration(
            DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the playback configuration for the specified name.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @return getPlaybackConfigurationResult The response from the
     *         GetPlaybackConfiguration service method, as returned by AWS
     *         MediaTailor.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPlaybackConfigurationResult getPlaybackConfiguration(
            GetPlaybackConfigurationRequest getPlaybackConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the playback configurations defined in AWS Elemental
     * MediaTailor. You can specify a maximum number of configurations to return
     * at a time. The default maximum is 50. Results are returned in pagefuls.
     * If MediaTailor has more configurations than the specified maximum, it
     * provides parameters in the response that you can use to retrieve the next
     * pageful.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @return listPlaybackConfigurationsResult The response from the
     *         ListPlaybackConfigurations service method, as returned by AWS
     *         MediaTailor.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPlaybackConfigurationsResult listPlaybackConfigurations(
            ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the tags assigned to the specified playback
     * configuration resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         MediaTailor.
     * @throws BadRequestException <p>
     *             Invalid request parameters.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds a new playback configuration to AWS Elemental MediaTailor.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @return putPlaybackConfigurationResult The response from the
     *         PutPlaybackConfiguration service method, as returned by AWS
     *         MediaTailor.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutPlaybackConfigurationResult putPlaybackConfiguration(
            PutPlaybackConfigurationRequest putPlaybackConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds tags to the specified playback configuration resource. You can
     * specify one or more tags to add.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException <p>
     *             Invalid request parameters.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes tags from the specified playback configuration resource. You can
     * specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException <p>
     *             Invalid request parameters.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             MediaTailor indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
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
