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

package com.amazonaws.services.medialive;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.medialive.model.*;

/**
 * Interface for accessing AWS Elemental MediaLive API for AWS Elemental
 * MediaLive
 **/
public interface AWSElementalMediaLive {

    /**
     * Overrides the default endpoint for this client
     * ("https://medialive.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "medialive.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://medialive.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "medialive.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://medialive.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSElementalMediaLive#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest List of actions to create and list of
     *            actions to delete.
     * @return batchUpdateScheduleResult The response from the
     *         BatchUpdateSchedule service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException The update schedule request failed
     *             validation.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the
     *             channel schedule.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The specified channel id does not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on update
     *             schedule calls.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    BatchUpdateScheduleResult batchUpdateSchedule(
            BatchUpdateScheduleRequest batchUpdateScheduleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest A request to create a channel
     * @return createChannelResult The response from the CreateChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException The Channel failed validation and
     *             could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to create the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on create channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to create due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Create an input
     * 
     * @param createInputRequest The name of the input
     * @return createInputResult The response from the CreateInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateInputResult createInput(CreateInputRequest createInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest The IPv4 CIDRs to whitelist for
     *            this Input Security Group
     * @return createInputSecurityGroupResult The response from the
     *         CreateInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to create an Input Security Group
     *             was Invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             create an Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateInputSecurityGroupResult createInputSecurityGroup(
            CreateInputSecurityGroupRequest createInputSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest A request to create a multiplex.
     * @return createMultiplexResult The response from the CreateMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The Multiplex failed validation and
     *             could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to create the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on create
     *             multiplex calls to multiplex service.
     * @throws ConflictException The multiplex is unable to create due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateMultiplexResult createMultiplex(CreateMultiplexRequest createMultiplexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest A request to create a program in a
     *            multiplex.
     * @return createMultiplexProgramResult The response from the
     *         CreateMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The Multiplex program failed
     *             validation and could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to create a
     *             program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on create
     *             multiplex program calls to multiplex service.
     * @throws ConflictException The multiplex program is unable to create due
     *             to an issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateMultiplexProgramResult createMultiplexProgram(
            CreateMultiplexProgramRequest createMultiplexProgramRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest Placeholder documentation for CreateTagsRequest
     * @throws NotFoundException The arn was not found.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void createTags(CreateTagsRequest createTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest Placeholder documentation for
     *            DeleteChannelRequest
     * @return deleteChannelResult The response from the DeleteChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to delete the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to delete does
     *             not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on delete channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to delete due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest Placeholder documentation for
     *            DeleteInputRequest
     * @return deleteInputResult The response from the DeleteInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws ConflictException Resource conflict
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteInputResult deleteInput(DeleteInputRequest deleteInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest Placeholder documentation for
     *            DeleteInputSecurityGroupRequest
     * @return deleteInputSecurityGroupResult The response from the
     *         DeleteInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to delete the Input Security
     *             Group was Invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             delete this Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input Security Group not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteInputSecurityGroupResult deleteInputSecurityGroup(
            DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest Placeholder documentation for
     *            DeleteMultiplexRequest
     * @return deleteMultiplexResult The response from the DeleteMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to delete the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to delete
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             multiplex calls to multiplex service.
     * @throws ConflictException The multiplex is unable to delete due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteMultiplexResult deleteMultiplex(DeleteMultiplexRequest deleteMultiplexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest Placeholder documentation for
     *            DeleteMultiplexProgramRequest
     * @return deleteMultiplexProgramResult The response from the
     *         DeleteMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to delete the
     *             multiplex program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The program that you are trying to delete
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             multiplex program calls to multiplex service.
     * @throws ConflictException The multiplex program is unable to delete due
     *             to an issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteMultiplexProgramResult deleteMultiplexProgram(
            DeleteMultiplexProgramRequest deleteMultiplexProgramRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest Placeholder documentation for
     *            DeleteReservationRequest
     * @return deleteReservationResult The response from the DeleteReservation
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to delete
     *             reservation
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Reservation you're attempting to delete does
     *             not exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             reservation request
     * @throws ConflictException The reservation could not be deleted because it
     *             is currently active.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteReservationResult deleteReservation(DeleteReservationRequest deleteReservationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest Placeholder documentation for
     *            DeleteScheduleRequest
     * @return deleteScheduleResult The response from the DeleteSchedule service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request to delete the schedule on this
     *             channel was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to delete the
     *             channel schedule.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The specified channel does not exist to have
     *             its schedule deleted.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             schedule calls.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteScheduleResult deleteSchedule(DeleteScheduleRequest deleteScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest Placeholder documentation for DeleteTagsRequest
     * @throws NotFoundException The arn was not found.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteTags(DeleteTagsRequest deleteTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest Placeholder documentation for
     *            DescribeChannelRequest
     * @return describeChannelResult The response from the DescribeChannel
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to describe the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to describe does
     *             not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             channel calls to channel service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest Placeholder documentation for
     *            DescribeInputRequest
     * @return describeInputResult The response from the DescribeInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeInputResult describeInput(DescribeInputRequest describeInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Gets the details for the input device
     * 
     * @param describeInputDeviceRequest Placeholder documentation for
     *            DescribeInputDeviceRequest
     * @return describeInputDeviceResult The response from the
     *         DescribeInputDevice service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to describe the
     *             input device.
     * @throws BadGatewayException Bad gateway error.
     * @throws NotFoundException The input device you're requesting to describe
     *             does not exist. Check the ID.
     * @throws GatewayTimeoutException Gateway timeout error.
     * @throws TooManyRequestsException Request limit exceeded on describe calls
     *             to the input device service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeInputDeviceResult describeInputDevice(
            DescribeInputDeviceRequest describeInputDeviceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest Placeholder documentation for
     *            DescribeInputSecurityGroupRequest
     * @return describeInputSecurityGroupResult The response from the
     *         DescribeInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to describe an Input Security
     *             Group was Invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             describe this Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input Security Group not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeInputSecurityGroupResult describeInputSecurityGroup(
            DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest Placeholder documentation for
     *            DescribeMultiplexRequest
     * @return describeMultiplexResult The response from the DescribeMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to describe the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to describe
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             multiplex calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeMultiplexResult describeMultiplex(DescribeMultiplexRequest describeMultiplexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest Placeholder documentation for
     *            DescribeMultiplexProgramRequest
     * @return describeMultiplexProgramResult The response from the
     *         DescribeMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to describe the
     *             multiplex program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException MediaLive can't describe the program. The
     *             multiplex or the program that you specified doesn’t exist.
     *             Check the IDs and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             multiplex program calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeMultiplexProgramResult describeMultiplexProgram(
            DescribeMultiplexProgramRequest describeMultiplexProgramRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest Placeholder documentation for
     *            DescribeOfferingRequest
     * @return describeOfferingResult The response from the DescribeOffering
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to describe
     *             offering
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Offering you're attempting to describe does not
     *             exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             offering request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeOfferingResult describeOffering(DescribeOfferingRequest describeOfferingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest Placeholder documentation for
     *            DescribeReservationRequest
     * @return describeReservationResult The response from the
     *         DescribeReservation service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to describe
     *             reservation
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Reservation you're attempting to describe does
     *             not exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             reservation request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeReservationResult describeReservation(
            DescribeReservationRequest describeReservationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest Placeholder documentation for
     *            DescribeScheduleRequest
     * @return describeScheduleResult The response from the DescribeSchedule
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to describe the
     *             channel schedule.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting a schedule
     *             describe for does not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             schedule calls.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeScheduleResult describeSchedule(DescribeScheduleRequest describeScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest Placeholder documentation for
     *            ListChannelsRequest
     * @return listChannelsResult The response from the ListChannels service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to list channels.
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on list channel
     *             calls to channel service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * List input devices
     * 
     * @param listInputDevicesRequest Placeholder documentation for
     *            ListInputDevicesRequest
     * @return listInputDevicesResult The response from the ListInputDevices
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to list input
     *             devices.
     * @throws BadGatewayException Bad gateway error.
     * @throws GatewayTimeoutException Gateway timeout error.
     * @throws TooManyRequestsException Request limit exceeded on list devices
     *             calls to the input device service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListInputDevicesResult listInputDevices(ListInputDevicesRequest listInputDevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest Placeholder documentation for
     *            ListInputSecurityGroupsRequest
     * @return listInputSecurityGroupsResult The response from the
     *         ListInputSecurityGroups service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to list Input Security Groups was
     *             invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to call
     *             ListInputSecurityGroups
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListInputSecurityGroupsResult listInputSecurityGroups(
            ListInputSecurityGroupsRequest listInputSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest Placeholder documentation for ListInputsRequest
     * @return listInputsResult The response from the ListInputs service method,
     *         as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListInputsResult listInputs(ListInputsRequest listInputsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest Placeholder documentation for
     *            ListMultiplexProgramsRequest
     * @return listMultiplexProgramsResult The response from the
     *         ListMultiplexPrograms service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to list multiplex
     *             programs.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException MediaLive can't provide the list of programs.
     *             The multiplex that you specified doesn’t exist. Check the ID
     *             and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on list multiplex
     *             calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListMultiplexProgramsResult listMultiplexPrograms(
            ListMultiplexProgramsRequest listMultiplexProgramsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest Placeholder documentation for
     *            ListMultiplexesRequest
     * @return listMultiplexesResult The response from the ListMultiplexes
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to list multiplexes.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on list multiplex
     *             calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListMultiplexesResult listMultiplexes(ListMultiplexesRequest listMultiplexesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest Placeholder documentation for
     *            ListOfferingsRequest
     * @return listOfferingsResult The response from the ListOfferings service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to list offerings
     * @throws BadGatewayException Bad gateway error
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on list offerings
     *             request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListOfferingsResult listOfferings(ListOfferingsRequest listOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest Placeholder documentation for
     *            ListReservationsRequest
     * @return listReservationsResult The response from the ListReservations
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to list
     *             reservations
     * @throws BadGatewayException Bad gateway error
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on list
     *             reservations request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListReservationsResult listReservations(ListReservationsRequest listReservationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest Placeholder documentation for
     *            ListTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws NotFoundException The arn was not found
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest Placeholder documentation for
     *            PurchaseOfferingRequest
     * @return purchaseOfferingResult The response from the PurchaseOffering
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to purchase the
     *             offering
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Offering you're attempting to purchase does not
     *             exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on purchase
     *             offering request
     * @throws ConflictException Offering purchase prevented by service resource
     *             issue
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest Placeholder documentation for
     *            StartChannelRequest
     * @return startChannelResult The response from the StartChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to start the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to start does not
     *             exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on start channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to start due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StartChannelResult startChannel(StartChannelRequest startChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the
     * channels. You must explicitly start each channel.
     * 
     * @param startMultiplexRequest Placeholder documentation for
     *            StartMultiplexRequest
     * @return startMultiplexResult The response from the StartMultiplex service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to start the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to start
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on start
     *             multiplex calls to multiplex service.
     * @throws ConflictException The multiplex is unable to start due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StartMultiplexResult startMultiplex(StartMultiplexRequest startMultiplexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest Placeholder documentation for
     *            StopChannelRequest
     * @return stopChannelResult The response from the StopChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to stop the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to stop does not
     *             exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on stop channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to stop due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StopChannelResult stopChannel(StopChannelRequest stopChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action
     * has no effect.
     * 
     * @param stopMultiplexRequest Placeholder documentation for
     *            StopMultiplexRequest
     * @return stopMultiplexResult The response from the StopMultiplex service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to stop the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to stop
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on stop multiplex
     *             calls to multiplex service.
     * @throws ConflictException The multiplex is unable to stop due to an issue
     *             with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StopMultiplexResult stopMultiplex(StopMultiplexRequest stopMultiplexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest A request to update a channel.
     * @return updateChannelResult The response from the UpdateChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException The channel configuration failed
     *             validation and could not be updated.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws ConflictException The channel is unable to update due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest Channel class that the channel should be
     *            updated to.
     * @return updateChannelClassResult The response from the UpdateChannelClass
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request to update the channel class was
     *             invalid.
     * @throws UnprocessableEntityException The channel configuration failed
     *             validation when attempting to update the channel class.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the class
     *             of this channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're trying to update the class
     *             on does not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on update channel
     *             class calls.
     * @throws ConflictException The channel class cannot be updated due to an
     *             issue with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateChannelClassResult updateChannelClass(UpdateChannelClassRequest updateChannelClassRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Updates an input.
     * 
     * @param updateInputRequest A request to update an input.
     * @return updateInputResult The response from the UpdateInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request to update the input was invalid.
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException The requester does not have permission to
     *             update an input.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The input was not found.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws ConflictException The input was unable to be updated at this time
     *             due to an issue with input resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateInputResult updateInput(UpdateInputRequest updateInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Updates the parameters for the input device.
     * 
     * @param updateInputDeviceRequest A request to update an input device.
     * @return updateInputDeviceResult The response from the UpdateInputDevice
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException Input device failed validation and
     *             could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the input
     *             device.
     * @throws BadGatewayException Bad gateway error.
     * @throws NotFoundException The input device you're requesting to does not
     *             exist. Check the ID.
     * @throws GatewayTimeoutException Gateway timeout error.
     * @throws TooManyRequestsException Request limit exceeded on update calls
     *             to the input device service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateInputDeviceResult updateInputDevice(UpdateInputDeviceRequest updateInputDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest The request to update some
     *            combination of the Input Security Group name and the IPv4
     *            CIDRs the Input Security Group should allow.
     * @return updateInputSecurityGroupResult The response from the
     *         UpdateInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to update the Input Security
     *             Group was invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             update an Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The Input Security Group was not found.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws ConflictException The Input Security Group was unable to be
     *             updated due to an issue with input security group resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateInputSecurityGroupResult updateInputSecurityGroup(
            UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest A request to update a multiplex.
     * @return updateMultiplexResult The response from the UpdateMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The multiplex configuration failed
     *             validation and could not be updated.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to update the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to update
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws ConflictException The multiplex is unable to update due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateMultiplexResult updateMultiplex(UpdateMultiplexRequest updateMultiplexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest A request to update a program in a
     *            multiplex.
     * @return updateMultiplexProgramResult The response from the
     *         UpdateMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The multiplex program failed
     *             validation and could not be updated.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to update the
     *             multiplex program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException MediaLive can't update the program. The
     *             multiplex or the program that you specified doesn’t exist.
     *             Check the IDs and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws ConflictException The multiplex program is unable to update due
     *             to an issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateMultiplexProgramResult updateMultiplexProgram(
            UpdateMultiplexProgramRequest updateMultiplexProgramRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest Request to update a reservation
     * @return updateReservationResult The response from the UpdateReservation
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to update
     *             reservation
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Reservation not found
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded
     * @throws ConflictException The reservation could not be updated
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateReservationResult updateReservation(UpdateReservationRequest updateReservationRequest)
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
