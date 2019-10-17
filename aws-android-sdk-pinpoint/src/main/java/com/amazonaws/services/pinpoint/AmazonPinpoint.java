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

package com.amazonaws.services.pinpoint;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing AmazonPinpoint
 * <p>
 * Doc Engage API - Amazon Pinpoint API
 * </p>
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
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createAppRequest
     * @return createAppResult The response from the CreateApp service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new campaign for an application or updates the settings of an
     * existing campaign for an application.
     * </p>
     * 
     * @param createCampaignRequest
     * @return createCampaignResult The response from the CreateCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Creates a message template that you can use in messages that are sent
     * through the email channel.
     * </p>
     * 
     * @param createEmailTemplateRequest
     * @return createEmailTemplateResult The response from the
     *         CreateEmailTemplate service method, as returned by
     *         AmazonPinpoint.
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateEmailTemplateResult createEmailTemplate(
            CreateEmailTemplateRequest createEmailTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an export job for an application.
     * </p>
     * 
     * @param createExportJobRequest
     * @return createExportJobResult The response from the CreateExportJob
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateExportJobResult createExportJob(CreateExportJobRequest createExportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an import job for an application.
     * </p>
     * 
     * @param createImportJobRequest
     * @return createImportJobResult The response from the CreateImportJob
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Creates a message template that you can use in messages that are sent
     * through a push notification channel.
     * </p>
     * 
     * @param createPushTemplateRequest
     * @return createPushTemplateResult The response from the CreatePushTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreatePushTemplateResult createPushTemplate(CreatePushTemplateRequest createPushTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration,
     * dimension, and other settings for an existing segment that's associated
     * with an application.
     * </p>
     * 
     * @param createSegmentRequest
     * @return createSegmentResult The response from the CreateSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Creates a message template that you can use in messages that are sent
     * through the SMS channel.
     * </p>
     * 
     * @param createSmsTemplateRequest
     * @return createSmsTemplateResult The response from the CreateSmsTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateSmsTemplateResult createSmsTemplate(CreateSmsTemplateRequest createSmsTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the ADM channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteAdmChannelRequest
     * @return deleteAdmChannelResult The response from the DeleteAdmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteAdmChannelResult deleteAdmChannel(DeleteAdmChannelRequest deleteAdmChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the APNs channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteApnsChannelRequest
     * @return deleteApnsChannelResult The response from the DeleteApnsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Disables the APNs sandbox channel for an application and deletes any
     * existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return deleteApnsSandboxChannelResult The response from the
     *         DeleteApnsSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteApnsSandboxChannelResult deleteApnsSandboxChannel(
            DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the APNs VoIP channel for an application and deletes any
     * existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipChannelRequest
     * @return deleteApnsVoipChannelResult The response from the
     *         DeleteApnsVoipChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteApnsVoipChannelResult deleteApnsVoipChannel(
            DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the APNs VoIP sandbox channel for an application and deletes any
     * existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @return deleteApnsVoipSandboxChannelResult The response from the
     *         DeleteApnsVoipSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteApnsVoipSandboxChannelResult deleteApnsVoipSandboxChannel(
            DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return deleteAppResult The response from the DeleteApp service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Disables the Baidu channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteBaiduChannelRequest
     * @return deleteBaiduChannelResult The response from the DeleteBaiduChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteBaiduChannelResult deleteBaiduChannel(DeleteBaiduChannelRequest deleteBaiduChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a campaign from an application.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return deleteCampaignResult The response from the DeleteCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Disables the email channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteEmailChannelRequest
     * @return deleteEmailChannelResult The response from the DeleteEmailChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteEmailChannelResult deleteEmailChannel(DeleteEmailChannelRequest deleteEmailChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a message template that was designed for use in messages that
     * were sent through the email channel.
     * </p>
     * 
     * @param deleteEmailTemplateRequest
     * @return deleteEmailTemplateResult The response from the
     *         DeleteEmailTemplate service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteEmailTemplateResult deleteEmailTemplate(
            DeleteEmailTemplateRequest deleteEmailTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an endpoint from an application.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return deleteEndpointResult The response from the DeleteEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the event stream for an application.
     * </p>
     * 
     * @param deleteEventStreamRequest
     * @return deleteEventStreamResult The response from the DeleteEventStream
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteEventStreamResult deleteEventStream(DeleteEventStreamRequest deleteEventStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the GCM channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteGcmChannelRequest
     * @return deleteGcmChannelResult The response from the DeleteGcmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Deletes a message template that was designed for use in messages that
     * were sent through a push notification channel.
     * </p>
     * 
     * @param deletePushTemplateRequest
     * @return deletePushTemplateResult The response from the DeletePushTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest deletePushTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a segment from an application.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return deleteSegmentResult The response from the DeleteSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Disables the SMS channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteSmsChannelRequest
     * @return deleteSmsChannelResult The response from the DeleteSmsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest deleteSmsChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a message template that was designed for use in messages that
     * were sent through the SMS channel.
     * </p>
     * 
     * @param deleteSmsTemplateRequest
     * @return deleteSmsTemplateResult The response from the DeleteSmsTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteSmsTemplateResult deleteSmsTemplate(DeleteSmsTemplateRequest deleteSmsTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param deleteUserEndpointsRequest
     * @return deleteUserEndpointsResult The response from the
     *         DeleteUserEndpoints service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteUserEndpointsResult deleteUserEndpoints(
            DeleteUserEndpointsRequest deleteUserEndpointsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Disables the voice channel for an application and deletes any existing
     * settings for the channel.
     * </p>
     * 
     * @param deleteVoiceChannelRequest
     * @return deleteVoiceChannelResult The response from the DeleteVoiceChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteVoiceChannelResult deleteVoiceChannel(DeleteVoiceChannelRequest deleteVoiceChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the ADM channel
     * for an application.
     * </p>
     * 
     * @param getAdmChannelRequest
     * @return getAdmChannelResult The response from the GetAdmChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetAdmChannelResult getAdmChannel(GetAdmChannelRequest getAdmChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs channel
     * for an application.
     * </p>
     * 
     * @param getApnsChannelRequest
     * @return getApnsChannelResult The response from the GetApnsChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status and settings of the APNs sandbox
     * channel for an application.
     * </p>
     * 
     * @param getApnsSandboxChannelRequest
     * @return getApnsSandboxChannelResult The response from the
     *         GetApnsSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetApnsSandboxChannelResult getApnsSandboxChannel(
            GetApnsSandboxChannelRequest getApnsSandboxChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP
     * channel for an application.
     * </p>
     * 
     * @param getApnsVoipChannelRequest
     * @return getApnsVoipChannelResult The response from the GetApnsVoipChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetApnsVoipChannelResult getApnsVoipChannel(GetApnsVoipChannelRequest getApnsVoipChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP
     * sandbox channel for an application.
     * </p>
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @return getApnsVoipSandboxChannelResult The response from the
     *         GetApnsVoipSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetApnsVoipSandboxChannelResult getApnsVoipSandboxChannel(
            GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @return getAppResult The response from the GetApp service method, as
     *         returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetAppResult getApp(GetAppRequest getAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that
     * applies to an application.
     * </p>
     * 
     * @param getApplicationDateRangeKpiRequest
     * @return getApplicationDateRangeKpiResult The response from the
     *         GetApplicationDateRangeKpi service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetApplicationDateRangeKpiResult getApplicationDateRangeKpi(
            GetApplicationDateRangeKpiRequest getApplicationDateRangeKpiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the settings for an application.
     * </p>
     * 
     * @param getApplicationSettingsRequest
     * @return getApplicationSettingsResult The response from the
     *         GetApplicationSettings service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about all of your applications.
     * </p>
     * 
     * @param getAppsRequest
     * @return getAppsResult The response from the GetApps service method, as
     *         returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetAppsResult getApps(GetAppsRequest getAppsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the Baidu channel
     * for an application.
     * </p>
     * 
     * @param getBaiduChannelRequest
     * @return getBaiduChannelResult The response from the GetBaiduChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest getBaiduChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings
     * for a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return getCampaignResult The response from the GetCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the activity performed by a campaign.
     * </p>
     * 
     * @param getCampaignActivitiesRequest
     * @return getCampaignActivitiesResult The response from the
     *         GetCampaignActivities service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that
     * applies to a campaign.
     * </p>
     * 
     * @param getCampaignDateRangeKpiRequest
     * @return getCampaignDateRangeKpiResult The response from the
     *         GetCampaignDateRangeKpi service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCampaignDateRangeKpiResult getCampaignDateRangeKpi(
            GetCampaignDateRangeKpiRequest getCampaignDateRangeKpiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings
     * for a specific version of a campaign.
     * </p>
     * 
     * @param getCampaignVersionRequest
     * @return getCampaignVersionResult The response from the GetCampaignVersion
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status, configuration, and other settings
     * for all versions of a specific campaign.
     * </p>
     * 
     * @param getCampaignVersionsRequest
     * @return getCampaignVersionsResult The response from the
     *         GetCampaignVersions service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status, configuration, and other settings
     * for all the campaigns that are associated with an application.
     * </p>
     * 
     * @param getCampaignsRequest
     * @return getCampaignsResult The response from the GetCampaigns service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the history and status of each channel for an
     * application.
     * </p>
     * 
     * @param getChannelsRequest
     * @return getChannelsResult The response from the GetChannels service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetChannelsResult getChannels(GetChannelsRequest getChannelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the email channel
     * for an application.
     * </p>
     * 
     * @param getEmailChannelRequest
     * @return getEmailChannelResult The response from the GetEmailChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetEmailChannelResult getEmailChannel(GetEmailChannelRequest getEmailChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the content and settings for a message template that you can
     * use in messages that are sent through the email channel.
     * </p>
     * 
     * @param getEmailTemplateRequest
     * @return getEmailTemplateResult The response from the GetEmailTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetEmailTemplateResult getEmailTemplate(GetEmailTemplateRequest getEmailTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the settings and attributes of a specific
     * endpoint for an application.
     * </p>
     * 
     * @param getEndpointRequest
     * @return getEndpointResult The response from the GetEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the event stream settings for an application.
     * </p>
     * 
     * @param getEventStreamRequest
     * @return getEventStreamResult The response from the GetEventStream service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetEventStreamResult getEventStream(GetEventStreamRequest getEventStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of a specific export
     * job for an application.
     * </p>
     * 
     * @param getExportJobRequest
     * @return getExportJobResult The response from the GetExportJob service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetExportJobResult getExportJob(GetExportJobRequest getExportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of all the export
     * jobs for an application.
     * </p>
     * 
     * @param getExportJobsRequest
     * @return getExportJobsResult The response from the GetExportJobs service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetExportJobsResult getExportJobs(GetExportJobsRequest getExportJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the GCM channel
     * for an application.
     * </p>
     * 
     * @param getGcmChannelRequest
     * @return getGcmChannelResult The response from the GetGcmChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status and settings of a specific import
     * job for an application.
     * </p>
     * 
     * @param getImportJobRequest
     * @return getImportJobResult The response from the GetImportJob service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status and settings of all the import
     * jobs for an application.
     * </p>
     * 
     * @param getImportJobsRequest
     * @return getImportJobsResult The response from the GetImportJobs service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves the content and settings for a message template that you can
     * use in messages that are sent through a push notification channel.
     * </p>
     * 
     * @param getPushTemplateRequest
     * @return getPushTemplateResult The response from the GetPushTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetPushTemplateResult getPushTemplate(GetPushTemplateRequest getPushTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other
     * settings for a specific segment that's associated with an application.
     * </p>
     * 
     * @param getSegmentRequest
     * @return getSegmentResult The response from the GetSegment service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status and settings of the export jobs
     * for a segment.
     * </p>
     * 
     * @param getSegmentExportJobsRequest
     * @return getSegmentExportJobsResult The response from the
     *         GetSegmentExportJobs service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSegmentExportJobsResult getSegmentExportJobs(
            GetSegmentExportJobsRequest getSegmentExportJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the import jobs
     * for a segment.
     * </p>
     * 
     * @param getSegmentImportJobsRequest
     * @return getSegmentImportJobsResult The response from the
     *         GetSegmentImportJobs service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the configuration, dimension, and other
     * settings for a specific version of a segment that's associated with an
     * application.
     * </p>
     * 
     * @param getSegmentVersionRequest
     * @return getSegmentVersionResult The response from the GetSegmentVersion
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the configuration, dimension, and other
     * settings for all versions of a specific segment that's associated with an
     * application.
     * </p>
     * 
     * @param getSegmentVersionsRequest
     * @return getSegmentVersionsResult The response from the GetSegmentVersions
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the configuration, dimension, and other
     * settings for all the segments that are associated with an application.
     * </p>
     * 
     * @param getSegmentsRequest
     * @return getSegmentsResult The response from the GetSegments service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Retrieves information about the status and settings of the SMS channel
     * for an application.
     * </p>
     * 
     * @param getSmsChannelRequest
     * @return getSmsChannelResult The response from the GetSmsChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSmsChannelResult getSmsChannel(GetSmsChannelRequest getSmsChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the content and settings for a message template that you can
     * use in messages that are sent through the SMS channel.
     * </p>
     * 
     * @param getSmsTemplateRequest
     * @return getSmsTemplateResult The response from the GetSmsTemplate service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetSmsTemplateResult getSmsTemplate(GetSmsTemplateRequest getSmsTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about all the endpoints that are associated with a
     * specific user ID.
     * </p>
     * 
     * @param getUserEndpointsRequest
     * @return getUserEndpointsResult The response from the GetUserEndpoints
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetUserEndpointsResult getUserEndpoints(GetUserEndpointsRequest getUserEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings of the voice channel
     * for an application.
     * </p>
     * 
     * @param getVoiceChannelRequest
     * @return getVoiceChannelResult The response from the GetVoiceChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetVoiceChannelResult getVoiceChannel(GetVoiceChannelRequest getVoiceChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves all the tags (keys and values) that are associated with an
     * application, campaign, message template, or segment.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by
     *         AmazonPinpoint.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about all the message templates that are associated
     * with your Amazon Pinpoint account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return listTemplatesResult The response from the ListTemplates service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a phone number.
     * </p>
     * 
     * @param phoneNumberValidateRequest
     * @return phoneNumberValidateResult The response from the
     *         PhoneNumberValidate service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PhoneNumberValidateResult phoneNumberValidate(
            PhoneNumberValidateRequest phoneNumberValidateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new event stream for an application or updates the settings of
     * an existing event stream for an application.
     * </p>
     * 
     * @param putEventStreamRequest
     * @return putEventStreamResult The response from the PutEventStream service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutEventStreamResult putEventStream(PutEventStreamRequest putEventStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new event to record for endpoints, or creates or updates
     * endpoint data that existing events are associated with.
     * </p>
     * 
     * @param putEventsRequest
     * @return putEventsResult The response from the PutEvents service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutEventsResult putEvents(PutEventsRequest putEventsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes one or more attributes, of the same attribute type, from all the
     * endpoints that are associated with an application.
     * </p>
     * 
     * @param removeAttributesRequest
     * @return removeAttributesResult The response from the RemoveAttributes
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RemoveAttributesResult removeAttributes(RemoveAttributesRequest removeAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and sends a direct message.
     * </p>
     * 
     * @param sendMessagesRequest
     * @return sendMessagesResult The response from the SendMessages service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SendMessagesResult sendMessages(SendMessagesRequest sendMessagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and sends a message to a list of users.
     * </p>
     * 
     * @param sendUsersMessagesRequest
     * @return sendUsersMessagesResult The response from the SendUsersMessages
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SendUsersMessagesResult sendUsersMessages(SendUsersMessagesRequest sendUsersMessagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags (keys and values) to an application, campaign,
     * message template, or segment.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags (keys and values) from an application, campaign,
     * message template, or segment.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Enables the ADM channel for an application or updates the status and
     * settings of the ADM channel for an application.
     * </p>
     * 
     * @param updateAdmChannelRequest
     * @return updateAdmChannelResult The response from the UpdateAdmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateAdmChannelResult updateAdmChannel(UpdateAdmChannelRequest updateAdmChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the APNs channel for an application or updates the status and
     * settings of the APNs channel for an application.
     * </p>
     * 
     * @param updateApnsChannelRequest
     * @return updateApnsChannelResult The response from the UpdateApnsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Enables the APNs sandbox channel for an application or updates the status
     * and settings of the APNs sandbox channel for an application.
     * </p>
     * 
     * @param updateApnsSandboxChannelRequest
     * @return updateApnsSandboxChannelResult The response from the
     *         UpdateApnsSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateApnsSandboxChannelResult updateApnsSandboxChannel(
            UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the APNs VoIP channel for an application or updates the status
     * and settings of the APNs VoIP channel for an application.
     * </p>
     * 
     * @param updateApnsVoipChannelRequest
     * @return updateApnsVoipChannelResult The response from the
     *         UpdateApnsVoipChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateApnsVoipChannelResult updateApnsVoipChannel(
            UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the APNs VoIP sandbox channel for an application or updates the
     * status and settings of the APNs VoIP sandbox channel for an application.
     * </p>
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @return updateApnsVoipSandboxChannelResult The response from the
     *         UpdateApnsVoipSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateApnsVoipSandboxChannelResult updateApnsVoipSandboxChannel(
            UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the settings for an application.
     * </p>
     * 
     * @param updateApplicationSettingsRequest
     * @return updateApplicationSettingsResult The response from the
     *         UpdateApplicationSettings service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Enables the Baidu channel for an application or updates the status and
     * settings of the Baidu channel for an application.
     * </p>
     * 
     * @param updateBaiduChannelRequest
     * @return updateBaiduChannelResult The response from the UpdateBaiduChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateBaiduChannelResult updateBaiduChannel(UpdateBaiduChannelRequest updateBaiduChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the settings for a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return updateCampaignResult The response from the UpdateCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Enables the email channel for an application or updates the status and
     * settings of the email channel for an application.
     * </p>
     * 
     * @param updateEmailChannelRequest
     * @return updateEmailChannelResult The response from the UpdateEmailChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateEmailChannelResult updateEmailChannel(UpdateEmailChannelRequest updateEmailChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through the email channel.
     * </p>
     * 
     * @param updateEmailTemplateRequest
     * @return updateEmailTemplateResult The response from the
     *         UpdateEmailTemplate service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateEmailTemplateResult updateEmailTemplate(
            UpdateEmailTemplateRequest updateEmailTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new endpoint for an application or updates the settings and
     * attributes of an existing endpoint for an application. You can also use
     * this operation to define custom attributes (Attributes, Metrics, and
     * UserAttributes properties) for an endpoint.
     * </p>
     * 
     * @param updateEndpointRequest
     * @return updateEndpointResult The response from the UpdateEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Creates a new batch of endpoints for an application or updates the
     * settings and attributes of a batch of existing endpoints for an
     * application. You can also use this operation to define custom attributes
     * (Attributes, Metrics, and UserAttributes properties) for a batch of
     * endpoints.
     * </p>
     * 
     * @param updateEndpointsBatchRequest
     * @return updateEndpointsBatchResult The response from the
     *         UpdateEndpointsBatch service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Enables the GCM channel for an application or updates the status and
     * settings of the GCM channel for an application.
     * </p>
     * 
     * @param updateGcmChannelRequest
     * @return updateGcmChannelResult The response from the UpdateGcmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through a push notification channel.
     * </p>
     * 
     * @param updatePushTemplateRequest
     * @return updatePushTemplateResult The response from the UpdatePushTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdatePushTemplateResult updatePushTemplate(UpdatePushTemplateRequest updatePushTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration,
     * dimension, and other settings for an existing segment that's associated
     * with an application.
     * </p>
     * 
     * @param updateSegmentRequest
     * @return updateSegmentResult The response from the UpdateSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
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
     * <p>
     * Enables the SMS channel for an application or updates the status and
     * settings of the SMS channel for an application.
     * </p>
     * 
     * @param updateSmsChannelRequest
     * @return updateSmsChannelResult The response from the UpdateSmsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateSmsChannelResult updateSmsChannel(UpdateSmsChannelRequest updateSmsChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through the SMS channel.
     * </p>
     * 
     * @param updateSmsTemplateRequest
     * @return updateSmsTemplateResult The response from the UpdateSmsTemplate
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateSmsTemplateResult updateSmsTemplate(UpdateSmsTemplateRequest updateSmsTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the voice channel for an application or updates the status and
     * settings of the voice channel for an application.
     * </p>
     * 
     * @param updateVoiceChannelRequest
     * @return updateVoiceChannelResult The response from the UpdateVoiceChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException <p>
     *             The request contains a syntax error (BadRequestException).
     *             </p>
     * @throws InternalServerErrorException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure (InternalServerErrorException).
     *             </p>
     * @throws ForbiddenException <p>
     *             The request was denied because access to the specified
     *             resource is forbidden (ForbiddenException).
     *             </p>
     * @throws NotFoundException <p>
     *             The request failed because the specified resource was not
     *             found (NotFoundException).
     *             </p>
     * @throws MethodNotAllowedException <p>
     *             The request failed because the method is not allowed for the
     *             specified resource (MethodNotAllowedException).
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The request failed because too many requests were sent during
     *             a certain amount of time (TooManyRequestsException).
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateVoiceChannelResult updateVoiceChannel(UpdateVoiceChannelRequest updateVoiceChannelRequest)
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
