/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing AmazonPinpoint
 **/
public interface AmazonPinpoint {

    /**
     * Overrides the default endpoint for this client
     * ("https://pinpoint.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "pinpoint.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://pinpoint.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://pinpoint.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonPinpoint#setEndpoint(String)}, sets the
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
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return createCampaignResult The response from the CreateCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return createImportJobResult The response from the CreateImportJob
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateImportJobResult createImportJob(CreateImportJobRequest createImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return createSegmentResult The response from the CreateSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateSegmentResult createSegment(CreateSegmentRequest createSegmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return deleteApnsChannelResult The response from the DeleteApnsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteApnsChannelResult deleteApnsChannel(DeleteApnsChannelRequest deleteApnsChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return deleteCampaignResult The response from the DeleteCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return deleteGcmChannelResult The response from the DeleteGcmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return deleteSegmentResult The response from the DeleteSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteSegmentResult deleteSegment(DeleteSegmentRequest deleteSegmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return getApnsChannelResult The response from the GetApnsChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetApnsChannelResult getApnsChannel(GetApnsChannelRequest getApnsChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return getApplicationSettingsResult The response from the
     *         GetApplicationSettings service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetApplicationSettingsResult getApplicationSettings(
            GetApplicationSettingsRequest getApplicationSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return getCampaignResult The response from the GetCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCampaignResult getCampaign(GetCampaignRequest getCampaignRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return getCampaignActivitiesResult The response from the
     *         GetCampaignActivities service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCampaignActivitiesResult getCampaignActivities(
            GetCampaignActivitiesRequest getCampaignActivitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionRequest
     * @return getCampaignVersionResult The response from the GetCampaignVersion
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCampaignVersionResult getCampaignVersion(GetCampaignVersionRequest getCampaignVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return getCampaignVersionsResult The response from the
     *         GetCampaignVersions service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCampaignVersionsResult getCampaignVersions(
            GetCampaignVersionsRequest getCampaignVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return getCampaignsResult The response from the GetCampaigns service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCampaignsResult getCampaigns(GetCampaignsRequest getCampaignsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return getEndpointResult The response from the GetEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetEndpointResult getEndpoint(GetEndpointRequest getEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return getGcmChannelResult The response from the GetGcmChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetGcmChannelResult getGcmChannel(GetGcmChannelRequest getGcmChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return getImportJobResult The response from the GetImportJob service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return getImportJobsResult The response from the GetImportJobs service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImportJobsResult getImportJobs(GetImportJobsRequest getImportJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return getSegmentResult The response from the GetSegment service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSegmentResult getSegment(GetSegmentRequest getSegmentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return getSegmentImportJobsResult The response from the
     *         GetSegmentImportJobs service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSegmentImportJobsResult getSegmentImportJobs(
            GetSegmentImportJobsRequest getSegmentImportJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return getSegmentVersionResult The response from the GetSegmentVersion
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSegmentVersionResult getSegmentVersion(GetSegmentVersionRequest getSegmentVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return getSegmentVersionsResult The response from the GetSegmentVersions
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSegmentVersionsResult getSegmentVersions(GetSegmentVersionsRequest getSegmentVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return getSegmentsResult The response from the GetSegments service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSegmentsResult getSegments(GetSegmentsRequest getSegmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return updateApnsChannelResult The response from the UpdateApnsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateApnsChannelResult updateApnsChannel(UpdateApnsChannelRequest updateApnsChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return updateApplicationSettingsResult The response from the
     *         UpdateApplicationSettings service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateApplicationSettingsResult updateApplicationSettings(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return updateCampaignResult The response from the UpdateCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @return updateEndpointResult The response from the UpdateEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Use to update your endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return updateEndpointsBatchResult The response from the
     *         UpdateEndpointsBatch service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateEndpointsBatchResult updateEndpointsBatch(
            UpdateEndpointsBatchRequest updateEndpointsBatchRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return updateGcmChannelResult The response from the UpdateGcmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @return updateSegmentResult The response from the UpdateSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateSegmentResult updateSegment(UpdateSegmentRequest updateSegmentRequest)
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
