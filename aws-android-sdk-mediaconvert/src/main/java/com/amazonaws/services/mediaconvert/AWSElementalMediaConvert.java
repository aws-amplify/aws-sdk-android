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

package com.amazonaws.services.mediaconvert;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.mediaconvert.model.*;

/**
 * Interface for accessing AWS Elemental MediaConvert AWS Elemental MediaConvert
 **/
public interface AWSElementalMediaConvert {

    /**
     * Overrides the default endpoint for this client
     * ("https://mediaconvert.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "mediaconvert.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://mediaconvert.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "mediaconvert.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://mediaconvert.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSElementalMediaConvert#setEndpoint(String)},
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
     * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN)
     * with AWS Elemental MediaConvert.
     * 
     * @param associateCertificateRequest
     * @return associateCertificateResult The response from the
     *         AssociateCertificate service method, as returned by AWS Elemental
     *         MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested does not exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service could not complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateCertificateResult associateCertificate(
            AssociateCertificateRequest associateCertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Permanently cancel a job. Once you have canceled a job, you can't start
     * it again.
     * 
     * @param cancelJobRequest
     * @return cancelJobResult The response from the CancelJob service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Create a new transcoding job. For information about jobs and job
     * settings, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobRequest
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Create a new job template. For information about job templates see the
     * User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobTemplateRequest
     * @return createJobTemplateResult The response from the CreateJobTemplate
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateJobTemplateResult createJobTemplate(CreateJobTemplateRequest createJobTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Create a new preset. For information about job templates see the User
     * Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createPresetRequest
     * @return createPresetResult The response from the CreatePreset service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreatePresetResult createPreset(CreatePresetRequest createPresetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Create a new transcoding queue. For information about queues, see Working
     * With Queues in the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/
     * latest/ug/working-with-queues.html
     * 
     * @param createQueueRequest
     * @return createQueueResult The response from the CreateQueue service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateQueueResult createQueue(CreateQueueRequest createQueueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Permanently delete a job template you have created.
     * 
     * @param deleteJobTemplateRequest
     * @return deleteJobTemplateResult The response from the DeleteJobTemplate
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteJobTemplateResult deleteJobTemplate(DeleteJobTemplateRequest deleteJobTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Permanently delete a preset you have created.
     * 
     * @param deletePresetRequest
     * @return deletePresetResult The response from the DeletePreset service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeletePresetResult deletePreset(DeletePresetRequest deletePresetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Permanently delete a queue you have created.
     * 
     * @param deleteQueueRequest
     * @return deleteQueueResult The response from the DeleteQueue service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Send an request with an empty body to the regional API endpoint to get
     * your account API endpoint.
     * 
     * @param describeEndpointsRequest DescribeEndpointsRequest
     * @return describeEndpointsResult The response from the DescribeEndpoints
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException BadRequestException
     * @throws InternalServerErrorException InternalServiceException
     * @throws ForbiddenException AccessDeniedException
     * @throws NotFoundException ResourceNotFoundException
     * @throws TooManyRequestsException LimitExceededException
     * @throws ConflictException ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Removes an association between the Amazon Resource Name (ARN) of an AWS
     * Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert
     * resource.
     * 
     * @param disassociateCertificateRequest
     * @return disassociateCertificateResult The response from the
     *         DisassociateCertificate service method, as returned by AWS
     *         Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested does not exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service could not complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateCertificateResult disassociateCertificate(
            DisassociateCertificateRequest disassociateCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieve the JSON for a specific completed transcoding job.
     * 
     * @param getJobRequest
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetJobResult getJob(GetJobRequest getJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Retrieve the JSON for a specific job template.
     * 
     * @param getJobTemplateRequest
     * @return getJobTemplateResult The response from the GetJobTemplate service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetJobTemplateResult getJobTemplate(GetJobTemplateRequest getJobTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieve the JSON for a specific preset.
     * 
     * @param getPresetRequest
     * @return getPresetResult The response from the GetPreset service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetPresetResult getPreset(GetPresetRequest getPresetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Retrieve the JSON for a specific queue.
     * 
     * @param getQueueRequest
     * @return getQueueResult The response from the GetQueue service method, as
     *         returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetQueueResult getQueue(GetQueueRequest getQueueRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Retrieve a JSON array of up to twenty of your job templates. This will
     * return the templates themselves, not just a list of them. To retrieve the
     * next twenty templates, use the nextToken string returned with the array
     * 
     * @param listJobTemplatesRequest
     * @return listJobTemplatesResult The response from the ListJobTemplates
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListJobTemplatesResult listJobTemplates(ListJobTemplatesRequest listJobTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieve a JSON array of up to twenty of your most recently created jobs.
     * This array includes in-process, completed, and errored jobs. This will
     * return the jobs themselves, not just a list of the jobs. To retrieve the
     * twenty next most recent jobs, use the nextToken string returned with the
     * array.
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Retrieve a JSON array of up to twenty of your presets. This will return
     * the presets themselves, not just a list of them. To retrieve the next
     * twenty presets, use the nextToken string returned with the array.
     * 
     * @param listPresetsRequest
     * @return listPresetsResult The response from the ListPresets service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieve a JSON array of up to twenty of your queues. This will return
     * the queues themselves, not just a list of them. To retrieve the next
     * twenty queues, use the nextToken string returned with the array.
     * 
     * @param listQueuesRequest
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Retrieve the tags for a MediaConvert resource.
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Elemental
     *         MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Add tags to a MediaConvert queue, preset, or job template. For
     * information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Remove tags from a MediaConvert queue, preset, or job template. For
     * information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Modify one of your existing job templates.
     * 
     * @param updateJobTemplateRequest
     * @return updateJobTemplateResult The response from the UpdateJobTemplate
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateJobTemplateResult updateJobTemplate(UpdateJobTemplateRequest updateJobTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Modify one of your existing presets.
     * 
     * @param updatePresetRequest
     * @return updatePresetResult The response from the UpdatePreset service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdatePresetResult updatePreset(UpdatePresetRequest updatePresetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Modify one of your existing queues.
     * 
     * @param updateQueueRequest
     * @return updateQueueResult The response from the UpdateQueue service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateQueueResult updateQueue(UpdateQueueRequest updateQueueRequest)
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
