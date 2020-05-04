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

package com.amazonaws.services.s3-control;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.s3-control.model.*;

/**
 * Interface for accessing AWS S3 Control
 *
 * <p> AWS S3 Control provides access to Amazon S3 control plane operations. </p>
 *
 **/
public interface AWSS3Control {

    /**
     * Overrides the default endpoint for this client ("https://s3-control.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "s3-control.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://s3-control.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "s3-control.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://s3-control.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSS3Control#setEndpoint(String)}, sets the
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
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>Creates an access point and associates it with the specified bucket.</p>
     * @param createAccessPointRequest 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    void createAccessPoint(CreateAccessPointRequest createAccessPointRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>You can use Amazon S3 Batch Operations to perform large-scale Batch Operations on Amazon S3 objects. Amazon S3 Batch Operations can execute a single operation or action on lists of Amazon S3 objects that you specify. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.</p> <p>Related actions include:</p> <ul> <li> <p> <a>DescribeJob</a> </p> </li> <li> <p> <a>ListJobs</a> </p> </li> <li> <p> <a>UpdateJobPriority</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
     * @param createJobRequest 
     * @return createJobResult The response from the CreateJob service method, as returned by AWS S3 Control.
     * @throws TooManyRequestsException 
     * @throws BadRequestException 
     * @throws IdempotencyException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Deletes the specified access point.</p>
     * @param deleteAccessPointRequest 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    void deleteAccessPoint(DeleteAccessPointRequest deleteAccessPointRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Deletes the access point policy for the specified access point.</p>
     * @param deleteAccessPointPolicyRequest 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    void deleteAccessPointPolicy(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Removes the entire tag set from the specified Amazon S3 Batch Operations job. To use this operation, you must have permission to perform the <code>s3:DeleteJobTagging</code> action. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job Tags</a> in the Amazon Simple Storage Service Developer Guide.</p> <p/> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>GetJobTagging</a> </p> </li> <li> <p> <a>PutJobTagging</a> </p> </li> </ul>
     * @param deleteJobTaggingRequest 
     * @return deleteJobTaggingResult The response from the DeleteJobTagging service method, as returned by AWS S3 Control.
     * @throws InternalServiceException 
     * @throws TooManyRequestsException 
     * @throws NotFoundException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DeleteJobTaggingResult deleteJobTagging(DeleteJobTaggingRequest deleteJobTaggingRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.</p>
     * @param deletePublicAccessBlockRequest 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    void deletePublicAccessBlock(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.</p> <p/> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>ListJobs</a> </p> </li> <li> <p> <a>UpdateJobPriority</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
     * @param describeJobRequest 
     * @return describeJobResult The response from the DescribeJob service method, as returned by AWS S3 Control.
     * @throws BadRequestException 
     * @throws TooManyRequestsException 
     * @throws NotFoundException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns configuration information about the specified access point.</p>
     * @param getAccessPointRequest 
     * @return getAccessPointResult The response from the GetAccessPoint service method, as returned by AWS S3 Control.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetAccessPointResult getAccessPoint(GetAccessPointRequest getAccessPointRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the access point policy associated with the specified access point.</p>
     * @param getAccessPointPolicyRequest 
     * @return getAccessPointPolicyResult The response from the GetAccessPointPolicy service method, as returned by AWS S3 Control.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetAccessPointPolicyResult getAccessPointPolicy(GetAccessPointPolicyRequest getAccessPointPolicyRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     * @param getAccessPointPolicyStatusRequest 
     * @return getAccessPointPolicyStatusResult The response from the GetAccessPointPolicyStatus service method, as returned by AWS S3 Control.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetAccessPointPolicyStatusResult getAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the tags on an Amazon S3 Batch Operations job. To use this operation, you must have permission to perform the <code>s3:GetJobTagging</code> action. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job Tags</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p> <p/> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>PutJobTagging</a> </p> </li> <li> <p> <a>DeleteJobTagging</a> </p> </li> </ul>
     * @param getJobTaggingRequest 
     * @return getJobTaggingResult The response from the GetJobTagging service method, as returned by AWS S3 Control.
     * @throws InternalServiceException 
     * @throws TooManyRequestsException 
     * @throws NotFoundException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetJobTaggingResult getJobTagging(GetJobTaggingRequest getJobTaggingRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.</p>
     * @param getPublicAccessBlockRequest 
     * @return getPublicAccessBlockResult The response from the GetPublicAccessBlock service method, as returned by AWS S3 Control.
     * @throws NoSuchPublicAccessBlockConfigurationException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetPublicAccessBlockResult getPublicAccessBlock(GetPublicAccessBlockRequest getPublicAccessBlockRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access points (or the number specified in <code>maxResults</code>, whichever is less), the response will include a continuation token that you can use to list the additional access points.</p>
     * @param listAccessPointsRequest 
     * @return listAccessPointsResult The response from the ListAccessPoints service method, as returned by AWS S3 Control.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListAccessPointsResult listAccessPoints(ListAccessPointsRequest listAccessPointsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Lists current Amazon S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS account making the request. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p> <p>Related actions include:</p> <p/> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>DescribeJob</a> </p> </li> <li> <p> <a>UpdateJobPriority</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
     * @param listJobsRequest 
     * @return listJobsResult The response from the ListJobs service method, as returned by AWS S3 Control.
     * @throws InvalidRequestException 
     * @throws InternalServiceException 
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.</p>
     * @param putAccessPointPolicyRequest 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    void putAccessPointPolicy(PutAccessPointPolicyRequest putAccessPointPolicyRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Set the supplied tag-set on an Amazon S3 Batch Operations job.</p> <p>A tag is a key-value pair. You can associate Amazon S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using <a>GetJobTagging</a>, modify that tag set, and use this API action to replace the tag set with the one you have modified.. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job Tags</a> in the Amazon Simple Storage Service Developer Guide. </p> <p/> <note> <ul> <li> <p>If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you will be charged for a Tier 1 Request (PUT). For more information, see <a href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.</p> </li> <li> <p>For deleting existing tags for your batch operations job, <a>DeleteJobTagging</a> request is preferred because it achieves the same result without incurring charges.</p> </li> <li> <p>A few things to consider about using tags:</p> <ul> <li> <p>Amazon S3 limits the maximum number of tags to 50 tags per job.</p> </li> <li> <p>You can associate up to 50 tags with a job as long as they have unique tag keys.</p> </li> <li> <p>A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.</p> </li> <li> <p>The key and values are case sensitive.</p> </li> <li> <p>For tagging-related restrictions related to characters and encodings, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined Tag Restrictions</a>.</p> </li> </ul> </li> </ul> </note> <p/> <p>To use this operation, you must have permission to perform the <code>s3:PutJobTagging</code> action.</p> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>GetJobTagging</a> </p> </li> <li> <p> <a>DeleteJobTagging</a> </p> </li> </ul>
     * @param putJobTaggingRequest 
     * @return putJobTaggingResult The response from the PutJobTagging service method, as returned by AWS S3 Control.
     * @throws InternalServiceException 
     * @throws TooManyRequestsException 
     * @throws NotFoundException 
     * @throws TooManyTagsException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    PutJobTaggingResult putJobTagging(PutJobTaggingRequest putJobTaggingRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.</p>
     * @param putPublicAccessBlockRequest 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    void putPublicAccessBlock(PutPublicAccessBlockRequest putPublicAccessBlockRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Updates an existing Amazon S3 Batch Operations job's priority. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.</p> <p/> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>ListJobs</a> </p> </li> <li> <p> <a>DescribeJob</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
     * @param updateJobPriorityRequest 
     * @return updateJobPriorityResult The response from the UpdateJobPriority service method, as returned by AWS S3 Control.
     * @throws BadRequestException 
     * @throws TooManyRequestsException 
     * @throws NotFoundException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    UpdateJobPriorityResult updateJobPriority(UpdateJobPriorityRequest updateJobPriorityRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.</p> <p/> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>ListJobs</a> </p> </li> <li> <p> <a>DescribeJob</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
     * @param updateJobStatusRequest 
     * @return updateJobStatusResult The response from the UpdateJobStatus service method, as returned by AWS S3 Control.
     * @throws BadRequestException 
     * @throws TooManyRequestsException 
     * @throws NotFoundException 
     * @throws JobStatusException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS S3 Control indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    UpdateJobStatusResult updateJobStatus(UpdateJobStatusRequest updateJobStatusRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
