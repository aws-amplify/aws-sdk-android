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

package com.amazonaws.services.compute-optimizer;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.compute-optimizer.model.*;

/**
 * Interface for accessing AWS Compute Optimizer
 *
 * <p>AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS resources, such as EC2 instances and Auto Scaling groups. It reports whether your resources are optimal, and generates optimization recommendations to reduce the cost and improve the performance of your workloads. Compute Optimizer also provides recent utilization metric data, as well as projected utilization metric data for the recommendations, which you can use to evaluate which recommendation provides the best price-performance trade-off. The analysis of your usage patterns can help you decide when to move or resize your running resources, and still meet your performance and capacity requirements. For more information about Compute Optimizer, including the required permissions to use the service, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.</p>
 *
 **/
public interface AWSComputeOptimizer {

    /**
     * Overrides the default endpoint for this client ("https://compute-optimizer.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "compute-optimizer.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://compute-optimizer.us-east-1.amazonaws.com"). If the
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
     *            The endpoint (ex: "compute-optimizer.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://compute-optimizer.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSComputeOptimizer#setEndpoint(String)}, sets the
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
     * <p>Describes recommendation export jobs created in the last seven days.</p> <p>Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code> action to view your export jobs.</p>
     * @param describeRecommendationExportJobsRequest 
     * @return describeRecommendationExportJobsResult The response from the DescribeRecommendationExportJobs service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeRecommendationExportJobsResult describeRecommendationExportJobs(DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Exports optimization recommendations for Auto Scaling groups.</p> <p>Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting Recommendations</a> in the <i>Compute Optimizer User Guide</i>.</p> <p>You can have only one Auto Scaling group export job in progress per AWS Region.</p>
     * @param exportAutoScalingGroupRecommendationsRequest 
     * @return exportAutoScalingGroupRecommendationsResult The response from the ExportAutoScalingGroupRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws LimitExceededException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ExportAutoScalingGroupRecommendationsResult exportAutoScalingGroupRecommendations(ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Exports optimization recommendations for Amazon EC2 instances.</p> <p>Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting Recommendations</a> in the <i>Compute Optimizer User Guide</i>.</p> <p>You can have only one Amazon EC2 instance export job in progress per AWS Region.</p>
     * @param exportEC2InstanceRecommendationsRequest 
     * @return exportEC2InstanceRecommendationsResult The response from the ExportEC2InstanceRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws LimitExceededException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendations(ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns Auto Scaling group recommendations.</p> <p>AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired, minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be of a fixed size. For more information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.</p>
     * @param getAutoScalingGroupRecommendationsRequest 
     * @return getAutoScalingGroupRecommendationsResult The response from the GetAutoScalingGroupRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetAutoScalingGroupRecommendationsResult getAutoScalingGroupRecommendations(GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns Amazon EC2 instance recommendations.</p> <p>AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.</p>
     * @param getEC2InstanceRecommendationsRequest 
     * @return getEC2InstanceRecommendationsResult The response from the GetEC2InstanceRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetEC2InstanceRecommendationsResult getEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the projected utilization metrics of Amazon EC2 instance recommendations.</p>
     * @param getEC2RecommendationProjectedMetricsRequest 
     * @return getEC2RecommendationProjectedMetricsResult The response from the GetEC2RecommendationProjectedMetrics service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetEC2RecommendationProjectedMetricsResult getEC2RecommendationProjectedMetrics(GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service.</p> <p>If the account is the master account of an organization, this action also confirms the enrollment status of member accounts within the organization.</p>
     * @param getEnrollmentStatusRequest 
     * @return getEnrollmentStatusResult The response from the GetEnrollmentStatus service method, as returned by AWS Compute Optimizer.
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetEnrollmentStatusResult getEnrollmentStatus(GetEnrollmentStatusRequest getEnrollmentStatusRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the optimization findings for an account.</p> <p>For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned, over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not optimized, or optimized.</p>
     * @param getRecommendationSummariesRequest 
     * @return getRecommendationSummariesResult The response from the GetRecommendationSummaries service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetRecommendationSummariesResult getRecommendationSummaries(GetRecommendationSummariesRequest getRecommendationSummariesRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service.</p> <p>If the account is a master account of an organization, this action can also be used to enroll member accounts within the organization.</p>
     * @param updateEnrollmentStatusRequest 
     * @return updateEnrollmentStatusResult The response from the UpdateEnrollmentStatus service method, as returned by AWS Compute Optimizer.
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest) throws AmazonClientException, AmazonServiceException;

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
