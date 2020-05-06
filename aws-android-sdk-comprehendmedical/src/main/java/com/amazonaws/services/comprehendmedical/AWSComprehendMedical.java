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

package com.amazonaws.services.comprehendmedical;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.comprehendmedical.model.*;

/**
 * Interface for accessing AWS Comprehend Medical
 * <p>
 * Amazon Comprehend Medical extracts structured information from unstructured
 * clinical text. Use these actions to gain insight in your documents.
 * </p>
 **/
public interface AWSComprehendMedical {

    /**
     * Overrides the default endpoint for this client
     * ("https://comprehendmedical.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "comprehendmedical.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://comprehendmedical.us-east-1.amazonaws.com"). If
     * the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is
     * HTTPS.
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
     *            "comprehendmedical.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://comprehendmedical.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSComprehendMedical#setEndpoint(String)}, sets
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
     * <p>
     * Gets the properties associated with a medical entities detection job. Use
     * this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionV2JobRequest
     * @return describeEntitiesDetectionV2JobResult The response from the
     *         DescribeEntitiesDetectionV2Job service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEntitiesDetectionV2JobResult describeEntitiesDetectionV2Job(
            DescribeEntitiesDetectionV2JobRequest describeEntitiesDetectionV2JobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the properties associated with an InferICD10CM job. Use this
     * operation to get the status of an inference job.
     * </p>
     * 
     * @param describeICD10CMInferenceJobRequest
     * @return describeICD10CMInferenceJobResult The response from the
     *         DescribeICD10CMInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeICD10CMInferenceJobResult describeICD10CMInferenceJob(
            DescribeICD10CMInferenceJobRequest describeICD10CMInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the properties associated with a protected health information (PHI)
     * detection job. Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describePHIDetectionJobRequest
     * @return describePHIDetectionJobResult The response from the
     *         DescribePHIDetectionJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribePHIDetectionJobResult describePHIDetectionJob(
            DescribePHIDetectionJobRequest describePHIDetectionJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the properties associated with an InferRxNorm job. Use this
     * operation to get the status of an inference job.
     * </p>
     * 
     * @param describeRxNormInferenceJobRequest
     * @return describeRxNormInferenceJobResult The response from the
     *         DescribeRxNormInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeRxNormInferenceJobResult describeRxNormInferenceJob(
            DescribeRxNormInferenceJobRequest describeRxNormInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The <code>DetectEntities</code> operation is deprecated. You should use
     * the <a>DetectEntitiesV2</a> operation instead.
     * </p>
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns
     * specific information about them such as entity category, location, and
     * confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return detectEntitiesResult The response from the DetectEntities service
     *         method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns
     * specific information about them such as entity category, location, and
     * confidence score on that information. Amazon Comprehend Medical only
     * detects medical entities in English language texts.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation replaces the
     * <a>DetectEntities</a> operation. This new action uses a different model
     * for determining the entities in your medical text and changes the way
     * that some entities are returned in the output. You should use the
     * <code>DetectEntitiesV2</code> operation in all new applications.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation returns the
     * <code>Acuity</code> and <code>Direction</code> entities as attributes
     * instead of types.
     * </p>
     * 
     * @param detectEntitiesV2Request
     * @return detectEntitiesV2Result The response from the DetectEntitiesV2
     *         service method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DetectEntitiesV2Result detectEntitiesV2(DetectEntitiesV2Request detectEntitiesV2Request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Inspects the clinical text for protected health information (PHI)
     * entities and returns the entity category, location, and confidence score
     * for each entity. Amazon Comprehend Medical only detects entities in
     * English language texts.
     * </p>
     * 
     * @param detectPHIRequest
     * @return detectPHIResult The response from the DetectPHI service method,
     *         as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DetectPHIResult detectPHI(DetectPHIRequest detectPHIRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * InferICD10CM detects medical conditions as entities listed in a patient
     * record and links those entities to normalized concept identifiers in the
     * ICD-10-CM knowledge base from the Centers for Disease Control. Amazon
     * Comprehend Medical only detects medical entities in English language
     * texts.
     * </p>
     * 
     * @param inferICD10CMRequest
     * @return inferICD10CMResult The response from the InferICD10CM service
     *         method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    InferICD10CMResult inferICD10CM(InferICD10CMRequest inferICD10CMRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * InferRxNorm detects medications as entities listed in a patient record
     * and links to the normalized concept identifiers in the RxNorm database
     * from the National Library of Medicine. Amazon Comprehend Medical only
     * detects medical entities in English language texts.
     * </p>
     * 
     * @param inferRxNormRequest
     * @return inferRxNormResult The response from the InferRxNorm service
     *         method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    InferRxNormResult inferRxNorm(InferRxNormRequest inferRxNormRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of medical entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionV2JobsRequest
     * @return listEntitiesDetectionV2JobsResult The response from the
     *         ListEntitiesDetectionV2Jobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2Jobs(
            ListEntitiesDetectionV2JobsRequest listEntitiesDetectionV2JobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of InferICD10CM jobs that you have submitted.
     * </p>
     * 
     * @param listICD10CMInferenceJobsRequest
     * @return listICD10CMInferenceJobsResult The response from the
     *         ListICD10CMInferenceJobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListICD10CMInferenceJobsResult listICD10CMInferenceJobs(
            ListICD10CMInferenceJobsRequest listICD10CMInferenceJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of protected health information (PHI) detection jobs that you
     * have submitted.
     * </p>
     * 
     * @param listPHIDetectionJobsRequest
     * @return listPHIDetectionJobsResult The response from the
     *         ListPHIDetectionJobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListPHIDetectionJobsResult listPHIDetectionJobs(
            ListPHIDetectionJobsRequest listPHIDetectionJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a list of InferRxNorm jobs that you have submitted.
     * </p>
     * 
     * @param listRxNormInferenceJobsRequest
     * @return listRxNormInferenceJobsResult The response from the
     *         ListRxNormInferenceJobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListRxNormInferenceJobsResult listRxNormInferenceJobs(
            ListRxNormInferenceJobsRequest listRxNormInferenceJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an asynchronous medical entity detection job for a collection of
     * documents. Use the <code>DescribeEntitiesDetectionV2Job</code> operation
     * to track the status of a job.
     * </p>
     * 
     * @param startEntitiesDetectionV2JobRequest
     * @return startEntitiesDetectionV2JobResult The response from the
     *         StartEntitiesDetectionV2Job service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StartEntitiesDetectionV2JobResult startEntitiesDetectionV2Job(
            StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an asynchronous job to detect medical conditions and link them to
     * the ICD-10-CM ontology. Use the <code>DescribeICD10CMInferenceJob</code>
     * operation to track the status of a job.
     * </p>
     * 
     * @param startICD10CMInferenceJobRequest
     * @return startICD10CMInferenceJobResult The response from the
     *         StartICD10CMInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StartICD10CMInferenceJobResult startICD10CMInferenceJob(
            StartICD10CMInferenceJobRequest startICD10CMInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an asynchronous job to detect protected health information (PHI).
     * Use the <code>DescribePHIDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startPHIDetectionJobRequest
     * @return startPHIDetectionJobResult The response from the
     *         StartPHIDetectionJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StartPHIDetectionJobResult startPHIDetectionJob(
            StartPHIDetectionJobRequest startPHIDetectionJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts an asynchronous job to detect medication entities and link them to
     * the RxNorm ontology. Use the <code>DescribeRxNormInferenceJob</code>
     * operation to track the status of a job.
     * </p>
     * 
     * @param startRxNormInferenceJobRequest
     * @return startRxNormInferenceJobResult The response from the
     *         StartRxNormInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StartRxNormInferenceJobResult startRxNormInferenceJob(
            StartRxNormInferenceJobRequest startRxNormInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a medical entities detection job in progress.
     * </p>
     * 
     * @param stopEntitiesDetectionV2JobRequest
     * @return stopEntitiesDetectionV2JobResult The response from the
     *         StopEntitiesDetectionV2Job service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2Job(
            StopEntitiesDetectionV2JobRequest stopEntitiesDetectionV2JobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops an InferICD10CM inference job in progress.
     * </p>
     * 
     * @param stopICD10CMInferenceJobRequest
     * @return stopICD10CMInferenceJobResult The response from the
     *         StopICD10CMInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StopICD10CMInferenceJobResult stopICD10CMInferenceJob(
            StopICD10CMInferenceJobRequest stopICD10CMInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a protected health information (PHI) detection job in progress.
     * </p>
     * 
     * @param stopPHIDetectionJobRequest
     * @return stopPHIDetectionJobResult The response from the
     *         StopPHIDetectionJob service method, as returned by AWS Comprehend
     *         Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StopPHIDetectionJobResult stopPHIDetectionJob(
            StopPHIDetectionJobRequest stopPHIDetectionJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops an InferRxNorm inference job in progress.
     * </p>
     * 
     * @param stopRxNormInferenceJobRequest
     * @return stopRxNormInferenceJobResult The response from the
     *         StopRxNormInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    StopRxNormInferenceJobResult stopRxNormInferenceJob(
            StopRxNormInferenceJobRequest stopRxNormInferenceJobRequest)
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
